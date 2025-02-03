package Frame;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import Classes.*;
import java.io.*;

public class FrameIntro extends JFrame implements MouseListener, ActionListener {
    JPanel panel;
    JLabel textLabel, userName, phoneNbb, pass, email, confirmPass, pic, back, passVisible, passHide, confirmPassVisible, confirmPassHide;
    ImageIcon image, backgroundPic, eyeOpen, eyeClosed;
    Color myColor, myColor2;
    JTextField nameField, phoneField, emailField;
    JPasswordField passField, confirmPassField;
    JButton SignUP, backButton;

    public FrameIntro() {
        super("SKILLPROS ACADEMY");
        this.setSize(1380, 720);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.WHITE);
        panel.addMouseListener(this);

        myColor = new Color(241, 241, 241);
        myColor2 = new Color(187, 3, 252);

        textLabel = new JLabel("Create your Account");
        textLabel.setBounds(815, 127, 210, 29);
        textLabel.setForeground(Color.BLACK);
        panel.add(textLabel);

        eyeOpen = new ImageIcon("Image/eyeOpen.png");
        eyeClosed = new ImageIcon("Image/eyeClosed.png");

        passVisible = new JLabel(eyeOpen);
        passVisible.setBounds(1053, 377, 20, 20);
        passVisible.addMouseListener(this);
        passVisible.setVisible(false);
        panel.add(passVisible);

        passHide = new JLabel(eyeClosed);
        passHide.setBounds(1053, 377, 20, 20);
        passHide.addMouseListener(this);
        panel.add(passHide);

        confirmPassVisible = new JLabel(eyeOpen);
        confirmPassVisible.setBounds(1053, 437, 20, 20);
        confirmPassVisible.addMouseListener(this);
        confirmPassVisible.setVisible(false);
        panel.add(confirmPassVisible);

        confirmPassHide = new JLabel(eyeClosed);
        confirmPassHide.setBounds(1053, 437, 20, 20);
        confirmPassHide.addMouseListener(this);
        panel.add(confirmPassHide);

        userName = new JLabel("User Name:");
        userName.setBounds(792, 169, 80, 19);
        userName.setForeground(Color.BLACK);
        panel.add(userName);

        phoneNbb = new JLabel("Phone Number:");
        phoneNbb.setBounds(792, 229, 108, 19);
        phoneNbb.setForeground(Color.BLACK);
        panel.add(phoneNbb);

        email = new JLabel("Email:");
        email.setBounds(792, 289, 42, 19);
        email.setForeground(Color.BLACK);
        panel.add(email);

        pass = new JLabel("Password:");
        pass.setBounds(792, 349, 73, 19);
        pass.setForeground(Color.BLACK);
        panel.add(pass);

        confirmPass = new JLabel("Confirm Password:");
        confirmPass.setBounds(792, 409, 148, 19);
        confirmPass.setForeground(Color.BLACK);
        panel.add(confirmPass);

        nameField = new JTextField();
        nameField.setBounds(788, 192, 263, 33);
        panel.add(nameField);

        phoneField = new JTextField();
        phoneField.setBounds(788, 252, 263, 33);
        panel.add(phoneField);

        emailField = new JTextField();
        emailField.setBounds(788, 312, 263, 33);
        panel.add(emailField);

        passField = new JPasswordField();
        passField.setBounds(788, 372, 263, 33);
        passField.setEchoChar('*');
        panel.add(passField);

        confirmPassField = new JPasswordField();
        confirmPassField.setBounds(788, 432, 263, 33);
        confirmPassField.setEchoChar('*');
        panel.add(confirmPassField);

        SignUP = new JButton("Sign Up");
        SignUP.setBounds(788, 478, 263, 47);
        SignUP.setForeground(Color.WHITE);
        SignUP.setBackground(new Color(45, 69, 255));
        SignUP.addActionListener(this);
        panel.add(SignUP);

        backButton = new JButton("Back to Login");
        backButton.setBounds(788, 530, 263, 30);
        backButton.setForeground(Color.BLUE);
        backButton.setContentAreaFilled(false);
        backButton.setBorderPainted(false);
        backButton.addActionListener(this);
        panel.add(backButton);

        image = new ImageIcon("Image/LogoMain.png");
        pic = new JLabel(image);
        pic.setBounds(266, 178, 284, 370);
        panel.add(pic);

        backgroundPic = new ImageIcon("Image/Back.png");
        back = new JLabel(backgroundPic);
        back.setBounds(730, 87, 375, 508);
        panel.add(back);

        this.add(panel);
    }

    public void mouseClicked(MouseEvent me) {
        if (me.getSource() == passHide) {
            passField.setEchoChar((char) 0);
            passVisible.setVisible(true);
            passHide.setVisible(false);
        } else if (me.getSource() == passVisible) {
            passField.setEchoChar('*');
            passHide.setVisible(true);
            passVisible.setVisible(false);
        } else if (me.getSource() == confirmPassHide) {
            confirmPassField.setEchoChar((char) 0);
            confirmPassVisible.setVisible(true);
            confirmPassHide.setVisible(false);
        } else if (me.getSource() == confirmPassVisible) {
            confirmPassField.setEchoChar('*');
            confirmPassHide.setVisible(true);
            confirmPassVisible.setVisible(false);
        }
    }

    public void mousePressed(MouseEvent me) {
    }

    public void mouseReleased(MouseEvent me) {
    }

    public void mouseEntered(MouseEvent me) {
    }

    public void mouseExited(MouseEvent me) {
    }

    public void actionPerformed(ActionEvent ae) {
        String s1 = nameField.getText();
        String s2 = new String(passField.getPassword());
        String s3 = phoneField.getText();
        String s4 = emailField.getText();
        String s5 = new String(confirmPassField.getPassword());

        if (ae.getSource() == backButton) {
            new LoginFrame().setVisible(true);
            this.setVisible(false);
        } else if (ae.getSource() == SignUP) {
            if (s1.isEmpty() || s2.isEmpty() || s3.isEmpty() || s4.isEmpty() || s5.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please fill up all the information");
            } else if (s3.length() != 11 || !s3.matches("[0-9]+")) {
                JOptionPane.showMessageDialog(this, "Please provide a valid 11-digit phone number");
            } else if (s2.length() < 4) {
                JOptionPane.showMessageDialog(this, "Password must be at least 4 characters");
            } else if (!s5.equals(s2)) {
                JOptionPane.showMessageDialog(this, "Passwords do not match");
            } else if (isEmailExist(s4)) {
                JOptionPane.showMessageDialog(this, "The Email is already exists");
            } else {
                Account acc = new Account(s1, s3, s4, s2, s5);
                acc.addAccount();
                JOptionPane.showMessageDialog(this, "Registration successful! Please login.");
                new LoginFrame().setVisible(true);
                this.setVisible(false);
            }
        }
    }

    private boolean isEmailExist(String email) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(".\\Datas\\Data.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] details = line.split("\t"); 
                for (String detail : details) {
                    if (detail.equals(email)) {
                        reader.close();
                        return true; 
                    }
                }
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false; 
    }
}
