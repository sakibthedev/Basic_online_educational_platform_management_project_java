package Frame;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class paymenthistoryy extends JFrame implements ActionListener {
    private JTable courseTable;
    private DefaultTableModel tableModel;
    private JButton addCourseButton, removeCourseButton, updateCourseButton, backButton;
    private final String FILE_PATH = ".\\Datas\\Courses.txt";  
    public paymenthistoryy() {
        super("Manage Payment");
        this.setSize(800, 600);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLayout(null);
        this.setLocationRelativeTo(null);

        Color titleColor = new Color(45, 69, 255);
        JLabel titleLabel = new JLabel("Manage Payment");
        titleLabel.setFont(new Font("Ariel", Font.BOLD, 30));
        titleLabel.setBounds(270, 20, 300, 50);
        titleLabel.setForeground(titleColor);
        this.add(titleLabel);

        Color columnColor = new Color(45, 69, 255);
        String[] columnNames = {"Card Number", "Name", "Amount"};
        tableModel = new DefaultTableModel(columnNames, 0);
        courseTable = new JTable(tableModel);

        JTableHeader header = courseTable.getTableHeader();
        header.setBackground(columnColor);
        header.setForeground(Color.WHITE);
        header.setFont(new Font("Ariel", Font.BOLD, 14));

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

        removeCourseButton = new JButton("Remove Course");
        removeCourseButton.setBounds(220, 420, 150, 30);
        removeCourseButton.setBackground(buttonColor);
        removeCourseButton.setForeground(Color.WHITE);
        removeCourseButton.addActionListener(this);
        this.add(removeCourseButton);

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
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] courseDetails = line.split(",");
                if (courseDetails.length == 3) {
                    tableModel.addRow(courseDetails);
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error reading course data from file: " + e.getMessage());
        }
    }

    private void saveCourseData() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH))) {
            for (int i = 0; i < tableModel.getRowCount(); i++) {
                String cardNumber = (String) tableModel.getValueAt(i, 0);
                String name = (String) tableModel.getValueAt(i, 1);
                String amount = (String) tableModel.getValueAt(i, 2);
                writer.write(cardNumber + "," + name + "," + amount);
                writer.newLine();
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error saving course data to file: " + e.getMessage());
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addCourseButton) {
            addCourse();
        } else if (e.getSource() == removeCourseButton) {
            removeCourse();
        } else if (e.getSource() == updateCourseButton) {
            updateCourse();
        }
    }

    private void addCourse() {
        String cardNumber = JOptionPane.showInputDialog(this, "Enter Card Number:");
        String name = JOptionPane.showInputDialog(this, "Enter Name:");
        String amount = JOptionPane.showInputDialog(this, "Enter Amount:");

        if (cardNumber != null && name != null && amount != null) {
            tableModel.addRow(new Object[]{cardNumber, name, amount});
            saveCourseData();
        }
    }

    private void removeCourse() {
        int selectedRow = courseTable.getSelectedRow();
        if (selectedRow != -1) {
            tableModel.removeRow(selectedRow);
            saveCourseData();
        } else {
            JOptionPane.showMessageDialog(this, "Please select a course to remove.");
        }
    }

    private void updateCourse() {
        int selectedRow = courseTable.getSelectedRow();
        if (selectedRow != -1) {
            String cardNumber = (String) tableModel.getValueAt(selectedRow, 0);
            String name = (String) tableModel.getValueAt(selectedRow, 1);
            String amount = (String) tableModel.getValueAt(selectedRow, 2);

            cardNumber = JOptionPane.showInputDialog(this, "Enter Card Number:", cardNumber);
            name = JOptionPane.showInputDialog(this, "Enter Name:", name);
            amount = JOptionPane.showInputDialog(this, "Enter Amount:", amount);

            if (cardNumber != null && name != null && amount != null) {
                tableModel.setValueAt(cardNumber, selectedRow, 0);
                tableModel.setValueAt(name, selectedRow, 1);
                tableModel.setValueAt(amount, selectedRow, 2);
                saveCourseData();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please select a course to update.");
        }
    }

    public static void main(String[] args) {
        new paymenthistoryy();
    }
}
