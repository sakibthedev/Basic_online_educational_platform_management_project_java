package Frame;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class PaymentIntegration extends JFrame implements MouseListener,ActionListener{
	
	JPanel panel;
	ImageIcon logo, bigBlockPic, smallBlockPic, visaPic, mcPic, courPic;
	JLabel bigBlock, smallBlock, visa, mastercard, title, weAccept, cDetails, cName, cNum, cvv, validOn, total, couP, pVal, gBox, picture;
	JTextField cNameF, cNumF, cvvF, validOnF;
	JButton LOGO, pay, back;
	Color col;
	Font font1, font2;
	public String dpName;
	
	public PaymentIntegration(String dpName){
	
	super("Payment");
	this.setSize(1380, 720);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setLocationRelativeTo(null);
	this.dpName = dpName;
	
	panel = new JPanel();
	panel.setLayout(null);
	panel.setBackground(Color.WHITE);
	
	font1 = new Font("Ariel", Font.BOLD, 24);
	font2 = new Font("Ariel", Font.BOLD, 12);
	
	col = new Color(45,69,255);
	
	logo = new ImageIcon("Image/Logo.png");
	bigBlockPic = new ImageIcon("Image/bigBlock.png");
	smallBlockPic = new ImageIcon("Image/smallBlock.png");
	visaPic = new ImageIcon("Image/visa.png");
	mcPic = new ImageIcon("Image/mastercard.png");
	courPic = new ImageIcon("Image/Basic Integration.png");
	
	title = new JLabel("Complete Your Payment");
	title.setBounds(114,132,527,61);
	title.setForeground(col);
	title.setFont(new Font("Ariel", Font.BOLD, 42));
	panel.add(title);
	
	weAccept = new JLabel("We Accept Only:");
	weAccept.setBounds(114,228,201,34);
	weAccept.setFont(font1);
	panel.add(weAccept);
	
	visa = new JLabel(visaPic);
	visa.setBounds(114,272,113,72);
	visa.setBackground(Color.WHITE);
	panel.add(visa);
	
	mastercard = new JLabel(mcPic);
	mastercard.setBounds(243,272,113,68);
	mastercard.setBackground(Color.WHITE);
	panel.add(mastercard);
	
	cDetails = new JLabel("Card Details");
	cDetails.setBounds(513,251,201,34);
	cDetails.setForeground(col);
	cDetails.setFont(font1);
	panel.add(cDetails);
	
	cName = new JLabel("*Name on Card:");
	cName.setBounds(459,295,105,19);
	cName.setFont(font2);
	panel.add(cName);
	
	cNum = new JLabel("*Card Number:");
	cNum.setBounds(459,355,120,19);
	cNum.setFont(font2);
	panel.add(cNum);
	
	cvv = new JLabel("*CVV Code:");
	cvv.setBounds(459,415,90,19);
	cvv.setFont(font2);
	panel.add(cvv);
	
	validOn = new JLabel("*Valid On:");
	validOn.setBounds(459,475,90,19);
	validOn.setFont(font2);
	panel.add(validOn);
	
	cNameF = new JTextField();
	cNameF.setBounds(455,318,263,33);
	cNameF.setBackground(Color.WHITE);
	panel.add(cNameF);
	
	cNumF = new JTextField();
	cNumF.setBounds(455,378,263,33);
	cNumF.setBackground(Color.WHITE);
	panel.add(cNumF);
	
	cvvF = new JTextField();
	cvvF.setBounds(455,438,263,33);
	cvvF.setBackground(Color.WHITE);
	panel.add(cvvF);
	
	validOnF = new JTextField();
	validOnF.setBounds(455,498,263,33);
	validOnF.setBackground(Color.WHITE);
	panel.add(validOnF);
	
	LOGO = new JButton(logo);
	LOGO.setBounds(0, 20, 252, 78);
	LOGO.setContentAreaFilled(false);
	LOGO.setBorderPainted(false);
	panel.add(LOGO);
	
	pay = new JButton("Pay");
	pay.setBounds(455,558,263,47);
	pay.setBackground(col);
	pay.setForeground(Color.WHITE);
	pay.setFont(new Font("Ariel",Font.BOLD,20));
	pay.setBorderPainted(false);
	pay.addActionListener(this);
	panel.add(pay);
	
	smallBlock = new JLabel(smallBlockPic);
	smallBlock.setBounds(417,228,339,415);
	smallBlock.setBackground(Color.WHITE);
	smallBlock.setOpaque(true);
	panel.add(smallBlock);
	
	total = new JLabel("Total Payment");
	total.setBounds(991,227,263,51);
	total.setForeground(col);
	total.setFont(new Font("Ariel",Font.BOLD,32));
	panel.add(total);
	
	couP = new JLabel("Course Price");
	couP.setBounds(1020,480,184,43);
	couP.setForeground(col);
	couP.setFont(new Font("Ariel",Font.BOLD,28));
	panel.add(couP);
	
	pVal = new JLabel("7000/-");
	pVal.setBounds(1062,517,120,43);
	pVal.setFont(new Font("Ariel",Font.BOLD,28));
	panel.add(pVal);
	
	picture = new JLabel(courPic);
	picture.setBounds(965,307,275,166);
	panel.add(picture);
	
	
	gBox = new JLabel();
	gBox.setBounds(869,0,511,720);
	gBox.setBackground(new Color(246,246,246));
	gBox.setOpaque(true);
	panel.add(gBox);
	
	bigBlock = new JLabel(bigBlockPic);
	bigBlock.setBounds(869,0,511,720);
	bigBlock.setBackground(Color.WHITE);
	panel.add(bigBlock);
	
	back = new JButton("Back");
	back.setBounds(154,600,150,47);
	back.setBackground(col);
	back.setForeground(Color.WHITE);
	back.setBorderPainted(false);
	back.setFont(new Font("Ariel",Font.BOLD,20));
	back.addActionListener(this);
	panel.add(back);
	
	this.add(panel);
	}
	
	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me){}
	public void mouseExited(MouseEvent me){}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==back)
		{
			BasicIntegration course1 = new BasicIntegration(dpName);
			course1.setVisible(true);
			this.setVisible(false);
		}
		else if(ae.getSource()==pay)
		{
			String courseName = "Course Name: Integration"; 
			String amount = "7000/-"; 
			String cardNumber = cNumF.getText();

			if (cardNumber.matches("\\d{1,5}")) {
                
                JOptionPane.showMessageDialog(this, "Payment Successful!");
                
                writePaymentDetailsToFile(cardNumber, courseName, amount);
                PaymentHistory.addPayment(courseName, amount); 

                SwingUtilities.invokeLater(() -> {
                    new PaymentHistory(dpName, PaymentHistory.getPaymentHistory()).setVisible(true);
                });

                this.setVisible(false);
            } else {
                
                JOptionPane.showMessageDialog(this, "Invalid Card Number! Please enter only numbers (0-9) up to 5 digits.");
            }
		}
	}
	
	private void writePaymentDetailsToFile(String cardNumber, String courseName, String amount) {
    String filePath = ".\\Datas\\Courses.txt";
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
        
        writer.write(cardNumber + "," + courseName + "," + amount);
        writer.newLine(); 
    } catch (IOException e) {
        e.printStackTrace(); 
        JOptionPane.showMessageDialog(this, "Error writing to file: " + e.getMessage());
    }
	}
}