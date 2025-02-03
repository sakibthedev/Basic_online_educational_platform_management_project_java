package Frame;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import Classes.*;

public class LoginFrame extends JFrame implements MouseListener, ActionListener {
    JPanel panel;
    JLabel header, pls, email, pass, passVisible, passHide, BG;
    JTextField emailF;
    JPasswordField passF;
    JButton login, register, adminLogin, contributorF;
    ImageIcon eyeOpen, eyeClosed, bg;

    public LoginFrame() {
        super("Login");
        this.setSize(1380, 720);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.WHITE);

        bg = new ImageIcon("Image/LoginBG.png");

        
        header = new JLabel(new ImageIcon("Image/SKILLPR.png"));
        header.setBounds(461, -20, 452, 255); 
        panel.add(header);

        pls = new JLabel("Please Login");
        pls.setBounds(650, 244, 130, 29);
        pls.setForeground(Color.BLACK);
        panel.add(pls);

        eyeOpen = new ImageIcon("Image/eyeOpen.png");
        eyeClosed = new ImageIcon("Image/eyeClosed.png");

        passVisible = new JLabel(eyeOpen);
        passVisible.setBounds(823, 365, 20, 20);
        passVisible.addMouseListener(this);
        passVisible.setVisible(false);
        panel.add(passVisible);

        passHide = new JLabel(eyeClosed);
        passHide.setBounds(823, 365, 20, 20);
        passHide.addMouseListener(this);
        panel.add(passHide);

        email = new JLabel("Email:");
        email.setBounds(562, 277, 108, 19);
        email.setForeground(Color.BLACK);
        panel.add(email);

        pass = new JLabel("Password:");
        pass.setBounds(562, 337, 75, 19);
        pass.setForeground(Color.BLACK);
        panel.add(pass);

        emailF = new JTextField();
        emailF.setBounds(558, 300, 263, 33);
        panel.add(emailF);

        passF = new JPasswordField();
        passF.setEchoChar('*');
        passF.setBounds(558, 360, 263, 33);
        panel.add(passF);

        login = new JButton("Login");
        login.setBounds(558, 420, 263, 47);
        login.setBackground(new Color(45, 69, 255));
        login.setForeground(Color.WHITE);
        login.setBorderPainted(false);
        login.addActionListener(this);
        panel.add(login);

        contributorF = new JButton("Meet The Team");
        contributorF.setBounds(620, 585, 140, 35);
        contributorF.setForeground(Color.WHITE);
        contributorF.setBackground(new Color(45, 69, 255));
        contributorF.setBorderPainted(false);
        contributorF.addActionListener(this);
        panel.add(contributorF);

        register = new JButton("Register");
        register.setBounds(700, 480, 120, 29);
        register.setBackground(new Color(45, 69, 255));
        register.setForeground(Color.WHITE);
        register.setBorderPainted(false);
        register.addActionListener(this);
        panel.add(register);

        adminLogin = new JButton("Admin Login");
        adminLogin.setBounds(558, 480, 120, 29);
        adminLogin.setBackground(new Color(45, 69, 255));
        adminLogin.setForeground(Color.WHITE);
        adminLogin.setBorderPainted(false);
        adminLogin.addActionListener(this);
        panel.add(adminLogin);

        BG = new JLabel(bg);
        BG.setBounds(502, 204, 369, 341);
        panel.add(BG);

        this.add(panel);
    }

    public void mouseClicked(MouseEvent me) {
        if (me.getSource() == passHide) {
            passF.setEchoChar((char) 0);
            passVisible.setVisible(true);
            passHide.setVisible(false);
        } else if (me.getSource() == passVisible) {
            passF.setEchoChar('*');
            passHide.setVisible(true);
            passVisible.setVisible(false);
        }
    }

    public void mousePressed(MouseEvent me) {}
    public void mouseReleased(MouseEvent me) {}
    public void mouseEntered(MouseEvent me) {}
    public void mouseExited(MouseEvent me) {}

    public void actionPerformed(ActionEvent ae) {
        String email = emailF.getText();
        String password = new String(passF.getPassword());
        Account acc = new Account();

        if (ae.getSource() == register) {
            try {
                new FrameIntro().setVisible(true);
				this.setVisible(false);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error opening Login frame: " + e.getMessage());
            }
        } else if (ae.getSource() == adminLogin) {
            try {
                new AdminLogin().setVisible(true);
                this.setVisible(false);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error opening Admin Login frame: " + e.getMessage());
            }
        } else if (ae.getSource() == contributorF) {
            Contributors con1 = new Contributors();
            con1.setVisible(true); 
            this.setVisible(true); 
        } else if (ae.getSource() == login) {
            if (email.isEmpty() || password.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please fill up all the information");
            } else if (acc.checkAccount(email, password)) {
                JOptionPane.showMessageDialog(this, "Welcome to SkillPros Academy!");
                new HomePage(email).setVisible(true);
                this.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(this, "Incorrect Email/Password");
            }
        }
    }
}
