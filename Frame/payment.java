package Frame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class payment extends JFrame implements ActionListener {
    private JPanel panel;
    private JLabel title, weAccept, cDetails, cName, cNum, cvv, validOn, total, couP, pVal;
    private JTextField cNameF, cNumF, cvvF, validOnF;
    private JButton pay, back;
    private Color col;
    private Font font1, font2;
    private String dpName;
    private String courseAmount;
    private static final String FILE_PATH = ".\\Datas\\Courses.txt"; 

    public payment(String dpName, String courseAmount) {
        super("Payment");
        this.setSize(1380, 720);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.dpName = dpName;
        this.courseAmount = courseAmount;

        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.WHITE);
        
        font1 = new Font("Ariel", Font.BOLD, 14);
        font2 = new Font("Ariel", Font.BOLD, 12);
        
        col = new Color(45, 69, 255);
        
        title = new JLabel("Complete Your Payment");
        title.setBounds(114, 132, 527, 61);
        title.setForeground(col);
        title.setFont(new Font("Ariel", Font.BOLD, 42));
        panel.add(title);
        
        weAccept = new JLabel("We Accept Only:");
        weAccept.setBounds(114, 228, 201, 34);
        weAccept.setFont(font1);
        panel.add(weAccept);
        
        
        JLabel visa = new JLabel(new ImageIcon("Image/visa.png"));
        visa.setBounds(114, 272, 113, 72);
        panel.add(visa);
        
        JLabel mastercard = new JLabel(new ImageIcon("Image/mastercard.png"));
        mastercard.setBounds(243, 272, 113, 68);
        panel.add(mastercard);
        
        cDetails = new JLabel("Card Details");
        cDetails.setBounds(513, 251, 201, 34);
        cDetails.setForeground(col);
        cDetails.setFont(font1);
        panel.add(cDetails);
        
        cName = new JLabel("*Name on Card:");
        cName.setBounds(459, 295, 150, 19);
        cName.setFont(font2);
        panel.add(cName);
        
        cNum = new JLabel("*Card Number:");
        cNum.setBounds(459, 355, 150, 19);
        cNum.setFont(font2);
        panel.add(cNum);
        
        cvv = new JLabel("*CVV Code:");
        cvv.setBounds(459, 415, 90, 19);
        cvv.setFont(font2);
        panel.add(cvv);
        
        validOn = new JLabel("*Valid On:");
        validOn.setBounds(459, 475, 90, 19);
        validOn.setFont(font2);
        panel.add(validOn);
        
        cNameF = new JTextField();
        cNameF.setBounds(455, 318, 263, 33);
        panel.add(cNameF);
        
        cNumF = new JTextField();
        cNumF.setBounds(455, 378, 263, 33);
        panel.add(cNumF);
        
        cvvF = new JTextField();
        cvvF.setBounds(455, 438, 263, 33);
        panel.add(cvvF);
        
        validOnF = new JTextField();
        validOnF.setBounds(455, 498, 263, 33);
        panel.add(validOnF);
        
        pay = new JButton("Pay");
        pay.setBounds(455, 558, 263, 47);
        pay.setBackground(col);
        pay.setForeground(Color.WHITE);
        pay.setFont(new Font("Ariel", Font.BOLD, 20));
        pay.setBorderPainted(false);
        pay.addActionListener(this);
        panel.add(pay);
        
        total = new JLabel("Total Payment");
        total.setBounds(991, 227, 263, 51);
        total.setForeground(col);
        total.setFont(new Font("Ariel", Font.BOLD, 32));
        panel.add(total);
        
        couP = new JLabel("Course Price");
        couP.setBounds(1020, 480, 184, 43);
        couP.setForeground(col);
        couP.setFont(new Font("Ariel", Font.BOLD, 28));
        panel.add(couP);
        
        pVal = new JLabel(courseAmount + "/-");
        pVal.setBounds(1062, 517, 120, 43);
        pVal.setFont(new Font("Ariel", Font.BOLD, 28));
        panel.add(pVal);
        
        back = new JButton("Back");
        back.setBounds(154, 600, 150, 47);
        back.setBackground(col);
        back.setForeground(Color.WHITE);
        back.setBorderPainted(false);
        back.setFont(new Font("Ariel", Font.BOLD, 20));
        back.addActionListener(this);
        panel.add(back);
        
        this.add(panel);
    }
    
    private void savePaymentToFile(String cardNumber, String courseName, String amount) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH, true))) {
            writer.write(cardNumber + "," + courseName + "," + amount);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == back) {
            
            this.dispose(); 
            SwingUtilities.invokeLater(() -> new InventoryPage().setVisible(true)); 
        } else if (ae.getSource() == pay) {
            String courseName = dpName;  
            String amount = courseAmount + "/-";  
            String cardNumber = cNumF.getText(); 
            
            
            if (cardNumber.matches("\\d{5}")) {  
                JOptionPane.showMessageDialog(this, "Payment Successful!");
                
                savePaymentToFile(cardNumber, courseName, amount); 
                PaymentHistory.addPayment(courseName, amount); 
                SwingUtilities.invokeLater(() -> {
                    new PaymentHistory(dpName, PaymentHistory.getPaymentHistory()).setVisible(true);
                });

                this.setVisible(false);  
            } else {
                JOptionPane.showMessageDialog(this, "Invalid Card Number! Please enter exactly 16 digits.");
            }
        }
    }
}