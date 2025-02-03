package Frame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AdminDashboard extends JFrame implements ActionListener {
    private JLabel titleLabel;
    private JButton adminPageButton, manageAdminsButton, manageUsersButton, manageCoursesButton, logoutButton;

    public AdminDashboard() {
        super("Admin Dashboard");
        this.setSize(1380, 720);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setLocationRelativeTo(null);

        titleLabel = new JLabel("Admin Dashboard");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 30));
        titleLabel.setForeground(new Color(45, 69, 255));
        titleLabel.setBounds(540, 50, 300, 50);
        titleLabel.setForeground(Color.BLACK);
        this.add(titleLabel);

        adminPageButton = new JButton("Manage Users");
        adminPageButton.setBounds(500, 200, 350, 50);
        adminPageButton.setFont(new Font("Arial", Font.PLAIN, 18));
        adminPageButton.setBackground(new Color(46, 16, 243));
        adminPageButton.setForeground(Color.WHITE);
        adminPageButton.addActionListener(this);
        this.add(adminPageButton);

        manageAdminsButton = new JButton("Manage Admins");
        manageAdminsButton.setBounds(500, 300, 350, 50);
        manageAdminsButton.setFont(new Font("Arial", Font.PLAIN, 18));
        manageAdminsButton.setBackground(new Color(46, 16, 243));
        manageAdminsButton.setForeground(Color.WHITE);
        manageAdminsButton.addActionListener(this);
        this.add(manageAdminsButton);
        
        manageUsersButton = new JButton("Manage Payment History");
        manageUsersButton.setBounds(500, 400, 350, 50);
        manageUsersButton.setFont(new Font("Arial", Font.PLAIN, 18));
        manageUsersButton.setBackground(new Color(46, 16, 243));
        manageUsersButton.setForeground(Color.WHITE);
        manageUsersButton.addActionListener(this);
        this.add(manageUsersButton);

        // New "Manage Courses" Button
        manageCoursesButton = new JButton("Manage Courses");
        manageCoursesButton.setBounds(500, 500, 350, 50);
        manageCoursesButton.setFont(new Font("Arial", Font.PLAIN, 18));
        manageCoursesButton.setBackground(new Color(46, 16, 243));
        manageCoursesButton.setForeground(Color.WHITE);
        manageCoursesButton.addActionListener(this);
        this.add(manageCoursesButton);

        logoutButton = new JButton("Logout");
        logoutButton.setBounds(500, 600, 350, 50);
        logoutButton.setFont(new Font("Arial", Font.PLAIN, 18));
        logoutButton.setBackground(Color.RED);
        logoutButton.setForeground(Color.WHITE);
        logoutButton.addActionListener(this);
        this.add(logoutButton);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton source = (JButton) e.getSource();

        if (source == adminPageButton) {
            new AdminPage().setVisible(true);
        } else if (source == manageAdminsButton) {
            System.out.println("Manage Admins button clicked"); // Debugging
            new ManageAdmins().setVisible(true); 
        } else if (source == manageUsersButton) {
            new paymenthistoryy().setVisible(true);
        } else if (source == manageCoursesButton) { // Opens ManageCoursesData
            new ManageCoursesData().setVisible(true);
        } else if (source == logoutButton) {
            int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to logout?", 
                                                        "Logout Confirmation", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                this.dispose(); 
                new LoginFrame().setVisible(true);
            }
        }
    }

    public static void main(String[] args) {
        new AdminDashboard();
    }
}
