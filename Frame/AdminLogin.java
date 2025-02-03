package Frame;

import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AdminLogin extends JFrame implements MouseListener, ActionListener {
    JPanel panel;
    JLabel header, pls, emailLabel, pass, passVisible, passHide, BG, backLabel;
    JTextField emailF;
    JPasswordField passF;
    JButton login;
    ImageIcon eyeOpen, eyeClosed, bg;

    public AdminLogin() {
        super("Admin Login");
        this.setSize(1380, 720);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.WHITE);

        bg = new ImageIcon("Image/LoginBG.png");
        eyeOpen = new ImageIcon("Image/eyeOpen.png");
        eyeClosed = new ImageIcon("Image/eyeClosed.png");
		
		header = new JLabel(new ImageIcon("Image/SKILLPR.png"));
        header.setBounds(461, -20, 452, 255); 
        panel.add(header);

        passVisible = new JLabel(eyeOpen);
        passVisible.setBounds(823, 365, 20, 20);
        passVisible.addMouseListener(this);
        passVisible.setVisible(false);
        panel.add(passVisible);

        passHide = new JLabel(eyeClosed);
        passHide.setBounds(823, 365, 20, 20);
        passHide.addMouseListener(this);
        panel.add(passHide);

        pls = new JLabel("Admin Login");
        pls.setBounds(650, 244, 130, 29);
        pls.setForeground(Color.BLACK);
        panel.add(pls);

        emailLabel = new JLabel("Email:");
        emailLabel.setBounds(562, 277, 108, 19);
        emailLabel.setForeground(Color.BLACK);
        panel.add(emailLabel);

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
        login.setBackground(new Color(46, 16, 243));
        login.setForeground(Color.WHITE);
        login.setBorderPainted(false);
        login.setActionCommand("LOGIN");
        login.addActionListener(this);
        panel.add(login);

        backLabel = new JLabel("Back to Login");
        backLabel.setBounds(558, 480, 263, 20);
        backLabel.setForeground(Color.BLUE);
        backLabel.setHorizontalAlignment(SwingConstants.CENTER);
        backLabel.setCursor(new Cursor(Cursor.HAND_CURSOR));
        backLabel.addMouseListener(this);
        panel.add(backLabel);

        BG = new JLabel(bg);
        BG.setBounds(502, 204, 369, 341);
        panel.add(BG);
        this.add(panel);
    }

    public void actionPerformed(ActionEvent ae) {
        if ("LOGIN".equals(ae.getActionCommand())) {
            String email = emailF.getText().trim();
            String password = new String(passF.getPassword()).trim();

            if (email.isEmpty() || password.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please fill all fields");
                return;
            }

            if (isValidAdminCredentials(email, password)) {
                new AdminDashboard();
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Invalid admin credentials");
            }
        }
    }

    private boolean isValidAdminCredentials(String email, String password) {
        try (BufferedReader br = new BufferedReader(new FileReader("Datas/admins.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] credentials = line.split(",");
                if (credentials.length == 4 && email.equals(credentials[2]) && password.equals(credentials[3])) {
                    return true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
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
        } else if (me.getSource() == backLabel) {
            new LoginFrame().setVisible(true);
            this.dispose();
        }
    }

    public void mousePressed(MouseEvent me) {}
    public void mouseReleased(MouseEvent me) {}
    public void mouseEntered(MouseEvent me) {
        if (me.getSource() == backLabel) {
            backLabel.setForeground(new Color(0, 0, 200));
        }
    }
    public void mouseExited(MouseEvent me) {
        if (me.getSource() == backLabel) {
            backLabel.setForeground(Color.BLUE);
        }
    }

    public static void main(String[] args) {
        new AdminLogin().setVisible(true);
    }
}
