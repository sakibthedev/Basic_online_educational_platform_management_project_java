package Frame;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class ManageAdmins extends JFrame implements ActionListener {
    private JTable adminTable;
    private DefaultTableModel tableModel;
    private JButton addAdminButton, removeAdminButton, updateAdminButton, backButton;
    private final String FILE_PATH = "./Datas/admins.txt";  

    public ManageAdmins() {
        super("Manage Admins");
        this.setSize(800, 600);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLayout(null);
        this.setLocationRelativeTo(null);

        Color titleColor = new Color(45, 69, 255);
        JLabel titleLabel = new JLabel("Manage Admins");
        titleLabel.setFont(new Font("Ariel", Font.BOLD, 30));
        titleLabel.setBounds(300, 20, 300, 50);
        titleLabel.setForeground(titleColor);
        this.add(titleLabel);

        Color columnColor = new Color(45, 69, 255);
        String[] columnNames = {"Admin ID", "Admin Name", "Email", "Password"};
        tableModel = new DefaultTableModel(columnNames, 0);
        adminTable = new JTable(tableModel);

        
        JTableHeader header = adminTable.getTableHeader();
        header.setBackground(columnColor);
        header.setForeground(Color.WHITE);
        header.setFont(new Font("Ariel", Font.BOLD, 14));

        JScrollPane scrollPane = new JScrollPane(adminTable);
        scrollPane.setBounds(50, 100, 700, 300);
        this.add(scrollPane);

        Color buttonColor = new Color(45, 69, 255);

        addAdminButton = new JButton("Add Admin");
        addAdminButton.setBounds(50, 420, 150, 30);
        addAdminButton.setBackground(buttonColor);
        addAdminButton.setForeground(Color.WHITE);
        addAdminButton.addActionListener(this);
        this.add(addAdminButton);

        removeAdminButton = new JButton("Remove Admin");
        removeAdminButton.setBounds(220, 420, 150, 30);
        removeAdminButton.setBackground(buttonColor);
        removeAdminButton.setForeground(Color.WHITE);
        removeAdminButton.addActionListener(this);
        this.add(removeAdminButton);

        updateAdminButton = new JButton("Update Admin");
        updateAdminButton.setBounds(390, 420, 150, 30);
        updateAdminButton.setBackground(buttonColor);
        updateAdminButton.setForeground(Color.WHITE);
        updateAdminButton.addActionListener(this);
        this.add(updateAdminButton);

        backButton = new JButton("Back");
        backButton.setBounds(560, 420, 150, 30);
        backButton.setBackground(buttonColor);
        backButton.setForeground(Color.WHITE);
        backButton.addActionListener(e -> this.dispose());
        this.add(backButton);

        loadAdminData();
        this.setVisible(true);
    }

    private void loadAdminData() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] adminDetails = line.split(",");
                if (adminDetails.length == 4) {
                    tableModel.addRow(adminDetails);
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error reading admin data from file: " + e.getMessage());
        }
    }

    private void saveAdminData() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH))) {
            for (int i = 0; i < tableModel.getRowCount(); i++) {
                String adminID = (String) tableModel.getValueAt(i, 0);
                String adminName = (String) tableModel.getValueAt(i, 1);
                String email = (String) tableModel.getValueAt(i, 2);
                String password = (String) tableModel.getValueAt(i, 3);
                writer.write(adminID + "," + adminName + "," + email + "," + password);
                writer.newLine();
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error saving admin data to file: " + e.getMessage());
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addAdminButton) {
            addAdmin();
        } else if (e.getSource() == removeAdminButton) {
            removeAdmin();
        } else if (e.getSource() == updateAdminButton) {
            updateAdmin();
        }
    }

    private void addAdmin() {
        String adminID = JOptionPane.showInputDialog(this, "Enter Admin ID:");
        String adminName = JOptionPane.showInputDialog(this, "Enter Admin Name:");
        String email = JOptionPane.showInputDialog(this, "Enter Admin Email:");
        String password = JOptionPane.showInputDialog(this, "Enter Admin Password:");

        if (adminID != null && adminName != null && email != null && password != null) {
            tableModel.addRow(new Object[]{adminID, adminName, email, password});
            saveAdminData();
        }
    }

    private void removeAdmin() {
        int selectedRow = adminTable.getSelectedRow();
        if (selectedRow != -1) {
            tableModel.removeRow(selectedRow);
            saveAdminData();
        } else {
            JOptionPane.showMessageDialog(this, "Please select an admin to remove.");
        }
    }

    private void updateAdmin() {
        int selectedRow = adminTable.getSelectedRow();
        if (selectedRow != -1) {
            String adminID = (String) tableModel.getValueAt(selectedRow, 0);
            String adminName = (String) tableModel.getValueAt(selectedRow, 1);
            String email = (String) tableModel.getValueAt(selectedRow, 2);
            String password = (String) tableModel.getValueAt(selectedRow, 3);

            adminID = JOptionPane.showInputDialog(this, "Enter Admin ID:", adminID);
            adminName = JOptionPane.showInputDialog(this, "Enter Admin Name:", adminName);
            email = JOptionPane.showInputDialog(this, "Enter Admin Email:", email);
            password = JOptionPane.showInputDialog(this, "Enter Admin Password:", password);

            if (adminID != null && adminName != null && email != null && password != null) {
                tableModel.setValueAt(adminID, selectedRow, 0);
                tableModel.setValueAt(adminName, selectedRow, 1);
                tableModel.setValueAt(email, selectedRow, 2);
                tableModel.setValueAt(password, selectedRow, 3);
                saveAdminData();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please select an admin to update.");
        }
    }

    public static void main(String[] args) {
        new ManageAdmins();
    }
}
