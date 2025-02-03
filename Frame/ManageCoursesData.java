package Frame;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class ManageCoursesData extends JFrame implements ActionListener {
    private static final String FILE_PATH = ".\\Datas\\coursedata.txt";
    private JTable courseTable;
    private DefaultTableModel tableModel;
    private JButton addCourseButton, deleteCourseButton, updateCourseButton, backButton;

    public ManageCoursesData() {
        super("Manage Courses Data");
        this.setSize(800, 600);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLayout(null);
        this.setLocationRelativeTo(null);

        Color titleColor = new Color(45, 69, 255);
        JLabel titleLabel = new JLabel("Manage Courses Data");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        titleLabel.setBounds(230, 20, 300, 50);
        titleLabel.setForeground(titleColor);
        this.add(titleLabel);

        String[] columnNames = {"Course Code", "Course Name", "Amount", "Image Path"};
        tableModel = new DefaultTableModel(columnNames, 0);
        courseTable = new JTable(tableModel);

        JTableHeader header = courseTable.getTableHeader();
        header.setBackground(titleColor);
        header.setForeground(Color.WHITE);
        header.setFont(new Font("Arial", Font.BOLD, 14));

        JScrollPane scrollPane = new JScrollPane(courseTable);
        scrollPane.setBounds(50, 100, 700, 300);
        this.add(scrollPane);

        Color buttonColor = new Color(45, 69, 255);

        addCourseButton = new JButton("Add Course");
        addCourseButton.setBounds(50, 420, 150, 30);
        addCourseButton.setBackground(buttonColor);
        addCourseButton.setForeground(Color.WHITE);
        addCourseButton.addActionListener(this);
        this.add(addCourseButton);

        deleteCourseButton = new JButton("Delete Course");
        deleteCourseButton.setBounds(220, 420, 150, 30);
        deleteCourseButton.setBackground(buttonColor);
        deleteCourseButton.setForeground(Color.WHITE);
        deleteCourseButton.addActionListener(this);
        this.add(deleteCourseButton);

        updateCourseButton = new JButton("Update Course");
        updateCourseButton.setBounds(390, 420, 150, 30);
        updateCourseButton.setBackground(buttonColor);
        updateCourseButton.setForeground(Color.WHITE);
        updateCourseButton.addActionListener(this);
        this.add(updateCourseButton);

        backButton = new JButton("Back");
        backButton.setBounds(560, 420, 150, 30);
        backButton.setBackground(buttonColor);
        backButton.setForeground(Color.WHITE);
        backButton.addActionListener(e -> this.dispose());
        this.add(backButton);

        loadCourseData();
        this.setVisible(true);
    }

    private void loadCourseData() {
        File file = new File(FILE_PATH);
        if (!file.exists()) {
            return;
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] courseDetails = line.split(",");
                if (courseDetails.length == 4) {
                    tableModel.addRow(courseDetails);
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error reading course data: " + e.getMessage());
        }
    }

    private void saveCourseData() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH))) {
            for (int i = 0; i < tableModel.getRowCount(); i++) {
                writer.write(tableModel.getValueAt(i, 0) + "," +
                        tableModel.getValueAt(i, 1) + "," +
                        tableModel.getValueAt(i, 2) + "," +
                        tableModel.getValueAt(i, 3));
                writer.newLine();
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error saving course data: " + e.getMessage());
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addCourseButton) {
            addCourse();
        } else if (e.getSource() == deleteCourseButton) {
            deleteCourse();
        } else if (e.getSource() == updateCourseButton) {
            updateCourse();
        }
    }

    private void addCourse() {
        String courseCode = JOptionPane.showInputDialog(this, "Enter Course Code:");
        String courseName = JOptionPane.showInputDialog(this, "Enter Course Name:");
        String amount = JOptionPane.showInputDialog(this, "Enter Amount:");
        String imagePath = JOptionPane.showInputDialog(this, "Enter Image Path:");

        if (courseCode != null && courseName != null && amount != null && imagePath != null 
                && !courseCode.trim().isEmpty() && !courseName.trim().isEmpty()
                && !amount.trim().isEmpty() && !imagePath.trim().isEmpty()) {
            tableModel.addRow(new Object[]{courseCode, courseName, amount, imagePath});
            saveCourseData();
        } else {
            JOptionPane.showMessageDialog(this, "All fields must be filled.");
        }
    }

    private void deleteCourse() {
        int selectedRow = courseTable.getSelectedRow();
        if (selectedRow != -1) {
            tableModel.removeRow(selectedRow);
            saveCourseData();
        } else {
            JOptionPane.showMessageDialog(this, "Please select a course to delete.");
        }
    }

    private void updateCourse() {
        int selectedRow = courseTable.getSelectedRow();
        if (selectedRow != -1) {
            String courseCode = (String) tableModel.getValueAt(selectedRow, 0);
            String courseName = (String) tableModel.getValueAt(selectedRow, 1);
            String amount = (String) tableModel.getValueAt(selectedRow, 2);
            String imagePath = (String) tableModel.getValueAt(selectedRow, 3);

            courseCode = JOptionPane.showInputDialog(this, "Enter Course Code:", courseCode);
            courseName = JOptionPane.showInputDialog(this, "Enter Course Name:", courseName);
            amount = JOptionPane.showInputDialog(this, "Enter Amount:", amount);
            imagePath = JOptionPane.showInputDialog(this, "Enter Image Path:", imagePath);

            if (courseCode != null && courseName != null && amount != null && imagePath != null 
                    && !courseCode.trim().isEmpty() && !courseName.trim().isEmpty()
                    && !amount.trim().isEmpty() && !imagePath.trim().isEmpty()) {
                tableModel.setValueAt(courseCode, selectedRow, 0);
                tableModel.setValueAt(courseName, selectedRow, 1);
                tableModel.setValueAt(amount, selectedRow, 2);
                tableModel.setValueAt(imagePath, selectedRow, 3);
                saveCourseData();
            } else {
                JOptionPane.showMessageDialog(this, "All fields must be filled.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please select a course to update.");
        }
    }

    public static void main(String[] args) {
        new ManageCoursesData();
    }
}
