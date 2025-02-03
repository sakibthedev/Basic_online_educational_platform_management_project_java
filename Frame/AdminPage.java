package Frame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.DefaultTableModel;
import java.util.*;
import java.io.*;



public class AdminPage extends JFrame implements MouseListener,ActionListener
{
	JPanel panel;
	JLabel title, addT, updateT, deleteT, clearT, printT, backT, name, phoneNum, email, pass, decor, bgl, info;
	JTextField nameF, phoneNumF, emailF, passF;
	JButton add, update, delete, clear, print, back;
	ImageIcon blackButton, greyButton, greyBox, bg;
	Font f1,f2;
		
	JTable table;
	JScrollPane scroll;
	DefaultTableModel  model;
	
	private String[] columns = {"Name", "Phone Number", "Email", "Password"};
	private String[] rows = new String[4];
	
	public AdminPage()
	{
		super("Admin Management");
		this.setSize(1380,720);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		f1 = new Font("Ariel",Font.BOLD,24);
		f2 = new Font("Ariel",Font.BOLD,20);
		
		blackButton = new ImageIcon("image/blackAdminButton.png");
		greyButton = new ImageIcon("image/greyAdminButton.png");
		greyBox = new ImageIcon("image/greyAdminBox.png");
		bg = new ImageIcon("image/bglogo.png");
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		panel.setOpaque(true);

		
		title = new JLabel("Admin Management");
		title.setBounds(104,81,437,61);
		title.setFont(new Font("Ariel",Font.BOLD,40));
		title.setForeground(new Color(46, 16, 243));
		panel.add(title);
		
		addT = new JLabel("Add");
		addT.setBounds(1134,197-4,53,36);
		addT.setFont(f1);
		addT.setForeground(new Color(46, 16, 243));
		panel.add(addT);
		
		updateT = new JLabel("Update");
		updateT.setBounds(1111+4,269-4,96,36);
		updateT.setFont(f1);
		updateT.setForeground(new Color(46, 16, 243));
		panel.add(updateT);
		
		deleteT = new JLabel("Delete");
		deleteT.setBounds(1120,340-4,86,36);
		deleteT.setFont(f1);
		deleteT.setForeground(new Color(46, 16, 243));
		panel.add(deleteT);
		
		clearT = new JLabel("Clear");
		clearT.setBounds(1130,411-4,67,36);
		clearT.setFont(f1);
		clearT.setForeground(new Color(46, 16, 243));
		panel.add(clearT);
		
		
		backT = new JLabel("Back");
		backT.setBounds(1130,485-3,62,36);
		backT.setFont(f1);
		backT.setForeground(Color.WHITE);
		panel.add(backT);
		
		add = new JButton(greyButton);
		add.setBounds(1054,181,209,58);
		add.setBorderPainted(false);
		add.setContentAreaFilled(false);
		add.setBackground(Color.WHITE);
		add.addActionListener(this);
		panel.add(add);
		
		update = new JButton(greyButton);
		update.setBounds(1054,253,209,58);
		update.setBorderPainted(false);
		update.setContentAreaFilled(false);
		update.setBackground(Color.WHITE);
		update.addActionListener(this);
		panel.add(update);
		
		delete = new JButton(greyButton);
		delete.setBounds(1054,325,209,58);
		delete.setBorderPainted(false);
		delete.setContentAreaFilled(false);
		delete.setBackground(Color.WHITE);
		delete.addActionListener(this);
		panel.add(delete);
		
		clear = new JButton(greyButton);
		clear.setBounds(1054,397,209,58);
		clear.setBorderPainted(false);
		clear.setContentAreaFilled(false);
		clear.setBackground(Color.WHITE);
		clear.addActionListener(this);
		panel.add(clear);
		
		
		back = new JButton(blackButton);
		back.setBounds(1054,469,209,58);
		back.setBorderPainted(false);
		back.setContentAreaFilled(false);
		back.setBackground(Color.WHITE);
		back.addActionListener(this);
		panel.add(back);


		info = new JLabel("Edit Information");
		info.setBounds(711,276 - 30 - 15, 85 + 500, 36);
		info.setFont(new Font("Ariel", Font.BOLD, 30));
		info.setForeground(new Color(46, 16, 243));
		panel.add(info);
		
		name = new JLabel("Name:");
		name.setBounds(711,276,85,36);
		name.setFont(f2);
		panel.add(name);
		
		phoneNum = new JLabel("Phone Number:");
		phoneNum.setBounds(711,348,203,36);
		phoneNum.setFont(f2);
		panel.add(phoneNum);
		
		email = new JLabel("Email:");
		email.setBounds(711,420,190,36);
		email.setFont(f2);
		panel.add(email);
		
		pass = new JLabel("Password:");
		pass.setBounds(711,492,130,36);
		pass.setFont(f2);
		panel.add(pass);
		
		nameF = new JTextField();
		nameF.setBounds(711,315,226,33);
		nameF.setBackground(Color.WHITE);
		panel.add(nameF);
		
		phoneNumF = new JTextField();
		phoneNumF.setBounds(711,387,226,33);
		phoneNumF.setBackground(Color.WHITE);
		panel.add(phoneNumF);
		
		emailF = new JTextField();
		emailF.setBounds(711,459,226,33);
		emailF.setBackground(Color.WHITE);
		panel.add(emailF);
		
		passF = new JTextField();
		passF.setBounds(711,531,226,33);
		passF.setBackground(Color.WHITE);
		panel.add(passF);
		
		decor = new JLabel(greyBox);
		decor.setBounds(673 -30,181 -25,370, 418 +50);
		decor.setBackground(Color.WHITE);
		panel.add(decor);
		
		
		table = new JTable();
		
		model = new DefaultTableModel();
		model.setColumnIdentifiers(columns);
		table.setModel(model);
		table.setFont(new Font("Ariel",Font.PLAIN,14));
		table.setSelectionBackground(new Color(246, 246, 246));
		table.setBackground(Color.WHITE);
		table.setRowHeight(30);
		
		table.addMouseListener(this);
		
		scroll = new JScrollPane(table);
		scroll.setBounds(94, 181, 470, 418);
		panel.add(scroll);
		

		
		bgl = new JLabel(bg);
		bgl.setBounds(628, 0, 755, 720);
		panel.add(bgl);

		loadInformation();
		
		this.add(panel);
	}
	
	public void mouseClicked(MouseEvent me)
	{
		if(me.getSource() == table)
		{
		int numberOfRow = table.getSelectedRow();
		
		String getName = model.getValueAt(numberOfRow, 0).toString();
		String getPhone = model.getValueAt(numberOfRow, 1).toString();
		String getEmail = model.getValueAt(numberOfRow, 2).toString();
		String getPass = model.getValueAt(numberOfRow, 3).toString();
		
		nameF.setText(getName);
		phoneNumF.setText(getPhone);
		emailF.setText(getEmail);
		passF.setText(getPass);
		}
	}
	


		Scanner sc;
		File file = new File(".\\Datas\\Data.txt");

		public void loadInformation()
		{	
			
			try
			{		
					sc = new Scanner(file);
					
					while (sc.hasNextLine()) {
						String line = sc.nextLine();
						String[] value = line.split("\t");
						model.addRow(value);
					}
			}
			catch(IOException ioe)
			{
				ioe.printStackTrace();
			}
			
		}





	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me){}
	public void mouseExited(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	
	
	public void actionPerformed(ActionEvent ae)
	{
		
		if(ae.getSource() == add )
		{
			String nameValue = nameF.getText();
			String phoneValue = phoneNumF.getText();
			String emailValue = emailF.getText();
			String passValue = passF.getText();
			
			
			rows[0] = nameValue;
			rows[1] = phoneValue;
			rows[2] = emailValue;
			rows[3] = passValue;
			model.addRow(rows);

			writeToFile();
		}
		
		else if(ae.getSource() == clear)
		{
			nameF.setText("");
			phoneNumF.setText("");
			emailF.setText("");
			passF.setText("");

			writeToFile();
		}
		
		else if(ae.getSource() == delete)
		{
			int NumberOfRow = table.getSelectedRow();

			if(NumberOfRow>0)
			{
				model.removeRow(NumberOfRow);
			}

			else{
				JOptionPane.showMessageDialog(this, "No row has been selected!");
			}
			writeToFile();
		}
		
		else if(ae.getSource() == update)
		{
			int numberOfRow = table.getSelectedRow();
			
			String nameValue = nameF.getText();
			String phoneValue = phoneNumF.getText();
			String emailValue = emailF.getText();
			String passValue = passF.getText();
			
			model.setValueAt(nameValue, numberOfRow, 0 );
			model.setValueAt(phoneValue, numberOfRow, 1 );
			model.setValueAt(emailValue, numberOfRow, 2 );
			model.setValueAt(passValue, numberOfRow,  3);

			writeToFile();
		}

		else if(ae.getSource()==back)
		{
			AdminDashboard aD = new AdminDashboard();
			aD.setVisible(true);
			this.setVisible(false);
		}
	}

	FileWriter fwrite;
	public void writeToFile()
	{	
		
		try(FileWriter fwrite = new FileWriter(".\\Datas\\Data.txt"))
		{
			for(int i=0; i<model.getRowCount(); i++)
			{
				for(int j=0; j<model.getColumnCount(); j++)
				{
						fwrite.write(model.getValueAt(i, j).toString());
						if(j != model.getColumnCount()-1)
						{
							fwrite.write("\t");
						}
						
				}
				fwrite.write("\n");
			}
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
	}
}