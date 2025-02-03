package Frame;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;


public class BasicJava extends JFrame implements MouseListener,ActionListener{
	
	JPanel panel;
	JLabel name, txt1, txt2, txt3, txt4, txt5, txt6, txt7, txt8, txt9, txt10, txt11, txt12, txt13, txt14, txt15, txt16, txt17,
	box1, box2, box3, box4, box5, box6, box7, box8;
	ImageIcon logo, user , Navigation;
	JButton sub, skills, about, USER, LOGO, enroll;
	JLabel shape5, shape6, shape7, navigation;
	JButton bCpp, bJava, bInt, bEng, bMSP, bIllustrator, bFigma, bPhotoshop, bWhatSkillPros, bOurMV, bWhyJoin;
	Font font1, font2, font3, font4, font5;
	Color c1;
	public String dpName;
	
	public BasicJava(String dpName){
	
	super("Java");
	this.setSize(1380, 720);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setLocationRelativeTo(null);
	this.dpName = dpName;
	


	panel = new JPanel();
	panel.setLayout(null);
	panel.setBackground(Color.WHITE);
	panel.addMouseListener(this);
	
	font1 = new Font("Ariel", Font.BOLD, 24);
	font2 = new Font("Ariel", Font.PLAIN, 20);
	font3 = new Font("Ariel", Font.BOLD, 46);
	font4 = new Font("Ariel", Font.PLAIN, 31);
	font5 = new Font("Ariel", Font.PLAIN, 22);
	
	c1 = new Color(255, 0, 0);
	
	
	logo = new ImageIcon("Image/Logo.png");
	user = new ImageIcon("Image/User.png");
	
	
	
	
	name = new JLabel(dpName);
	name.setBounds(1148, 41, 109, 29);
	name.setFont(font2);
	name.setForeground(Color.BLACK);
	panel.add(name);

	
	
	LOGO = new JButton(logo);
	LOGO.setBounds(0, 20, 252, 78);
	LOGO.setContentAreaFilled(false);
	LOGO.setBorderPainted(false);
	LOGO.addActionListener(this);
	panel.add(LOGO);
	
	USER = new JButton(user);
	USER.setBounds(1265, 26, 60, 60);
	USER.setContentAreaFilled(false);
	USER.setBorderPainted(false);
	USER.addActionListener(this);
	panel.add(USER);
	
	sub = new JButton("Courses");
	sub.setBounds(307 + 20 , 63, 261, 50);
	sub.setFont(font1);
	sub.setOpaque(false);
	sub.setForeground(Color.BLACK);
	sub.setBackground(Color.WHITE);
	sub.addMouseListener(this);
	sub.setContentAreaFilled(false);
	sub.setBorderPainted(false);
	panel.add(sub);
	
	bJava = new JButton("Java");
	bJava.setBounds(307 + 20 , 116, 261, 50);
	bJava.setFont(font1);
	bJava.setOpaque(false);
	bJava.setForeground(Color.BLACK);
	bJava.setBackground(Color.WHITE);
	bJava.addActionListener(this);
	bJava.addMouseListener(this);
	bJava.setContentAreaFilled(false);
	bJava.setBorderPainted(false);
	bJava.setVisible(false);
	panel.add(bJava);
	
	bCpp = new JButton("C++");
	bCpp.setBounds(307 + 20,166, 261, 50);
	bCpp.setFont(font1);
	bCpp.setOpaque(false);
	bCpp.setForeground(Color.BLACK);
	bCpp.setBackground(Color.WHITE);
	bCpp.addActionListener(this);
	bCpp.addMouseListener(this);
	bCpp.setContentAreaFilled(false);
	bCpp.setBorderPainted(false);
	bCpp.setVisible(false);
	panel.add(bCpp);
	
	
	bEng = new JButton("English");
	bEng.setBounds(307 + 20, 216, 261, 50);
	bEng.setFont(font1);
	bEng.setOpaque(false);
	bEng.setForeground(Color.BLACK);
	bEng.setBackground(Color.WHITE);
	bEng.addActionListener(this);
	bEng.addMouseListener(this);
	bEng.setContentAreaFilled(false);
	bEng.setBorderPainted(false);
	bEng.setVisible(false);
	panel.add(bEng);
	
	bInt = new JButton("Integration");
	bInt.setBounds(307 + 20, 266, 261, 50);
	bInt.setFont(font1);
	bInt.setOpaque(false);
	bInt.setForeground(Color.BLACK);
	bInt.setBackground(Color.WHITE);
	bInt.addActionListener(this);
	bInt.addMouseListener(this);
	bInt.setContentAreaFilled(false);
	bInt.setBorderPainted(false);
	bInt.setVisible(false);
	panel.add(bInt);
	
	shape5 = new JLabel();
	shape5.setBounds(307 + 20, 116, 261, 204);
	shape5.setBackground( new Color(246, 246, 246));
	shape5.setOpaque(true);
	shape5.addMouseListener(this);
	shape5.setVisible(false);
	panel.add(shape5);
	
	skills = new JButton("Skills");
	skills.setBounds(594-40, 62, 104, 50);
	skills.setFont(font1);
	skills.setForeground(Color.BLACK);
	skills.setContentAreaFilled(false);
	skills.addMouseListener(this);
	skills.setBorderPainted(false);
	panel.add(skills);
	
	bMSP = new JButton("MS PowerPoint");
	bMSP.setBounds(530, 116, 261, 50);
	bMSP.setFont(font1);
	bMSP.setOpaque(false);
	bMSP.setForeground(Color.BLACK);
	bMSP.setBackground(Color.WHITE);
	bMSP.addMouseListener(this);
	bMSP.addActionListener(this);
	bMSP.setContentAreaFilled(false);
	bMSP.setBorderPainted(false);
	bMSP.setVisible(false);
	panel.add(bMSP);
	
	bIllustrator = new JButton("Illustrator");
	bIllustrator.setBounds(530, 166, 261, 50);
	bIllustrator.setFont(font1);
	bIllustrator.setOpaque(false);
	bIllustrator.setForeground(Color.BLACK);
	bIllustrator.setBackground(Color.WHITE);
	bIllustrator.addMouseListener(this);
	bIllustrator.addActionListener(this);
	bIllustrator.setContentAreaFilled(false);
	bIllustrator.setBorderPainted(false);
	bIllustrator.setVisible(false);
	panel.add(bIllustrator);
	
	bFigma = new JButton("Figma");
	bFigma.setBounds(530, 216, 261, 50);
	bFigma.setFont(font1);
	bFigma.setOpaque(false);
	bFigma.setForeground(Color.BLACK);
	bFigma.setBackground(Color.WHITE);
	bFigma.addMouseListener(this);
	bFigma.addActionListener(this);
	bFigma.setContentAreaFilled(false);
	bFigma.setBorderPainted(false);
	bFigma.setVisible(false);
	panel.add(bFigma);
	
	bPhotoshop = new JButton("Photoshop");
	bPhotoshop.setBounds(530, 266, 261, 50);
	bPhotoshop.setFont(font1);
	bPhotoshop.setOpaque(false);
	bPhotoshop.setForeground(Color.BLACK);
	bPhotoshop.setBackground(Color.WHITE);
	bPhotoshop.addMouseListener(this);
	bPhotoshop.addActionListener(this);
	bPhotoshop.setContentAreaFilled(false);
	bPhotoshop.setBorderPainted(false);
	bPhotoshop.setVisible(false);
	panel.add(bPhotoshop);
	
	shape6 = new JLabel();
	shape6.setBounds(530, 116, 261, 204);
	shape6.setBackground( new Color(246, 246, 246));
	shape6.setOpaque(true);
	shape6.addMouseListener(this);
	shape6.setVisible(false);
	panel.add(shape6);
	
	about = new JButton("About Us");
	about.setBounds(694, 62, 136 + 8, 51);
	about.setFont(font1);
	about.setForeground(Color.BLACK);
	about.setContentAreaFilled(false);
	about.addMouseListener(this);
	about.setBorderPainted(false);
	panel.add(about);
	
	bWhatSkillPros = new JButton("What is SkillPros");
	bWhatSkillPros.setBounds(640, 116, 293, 50);
	bWhatSkillPros.setFont(font1);
	bWhatSkillPros.setOpaque(false);
	bWhatSkillPros.setForeground(Color.BLACK);
	bWhatSkillPros.setBackground(Color.WHITE);
	bWhatSkillPros.addMouseListener(this);
	bWhatSkillPros.addActionListener(this);
	bWhatSkillPros.setContentAreaFilled(false);
	bWhatSkillPros.setBorderPainted(false);
	bWhatSkillPros.setVisible(false);
	panel.add(bWhatSkillPros);
	
	bOurMV = new JButton("Our Mission & Vision");
	bOurMV.setBounds(640, 166, 293, 50);
	bOurMV.setFont(font1);
	bOurMV.setOpaque(false);
	bOurMV.setForeground(Color.BLACK);
	bOurMV.setBackground(Color.WHITE);
	bOurMV.addMouseListener(this);
	bOurMV.addActionListener(this);
	bOurMV.setContentAreaFilled(false);
	bOurMV.setBorderPainted(false);
	bOurMV.setVisible(false);
	panel.add(bOurMV);
	
	bWhyJoin = new JButton("Why join with us?");
	bWhyJoin.setBounds(640, 216, 293, 50);
	bWhyJoin.setFont(font1);
	bWhyJoin.setOpaque(false);
	bWhyJoin.setForeground(Color.BLACK);
	bWhyJoin.setBackground(Color.WHITE);
	bWhyJoin.addMouseListener(this);
	bWhyJoin.addActionListener(this);
	bWhyJoin.setContentAreaFilled(false);
	bWhyJoin.setBorderPainted(false);
	bWhyJoin.setVisible(false);
	panel.add(bWhyJoin);
	
	shape7 = new JLabel();
	shape7.setBounds(640, 116, 293, 153);
	shape7.setBackground( new Color(246, 246, 246));
	shape7.setOpaque(true);
	shape7.addMouseListener(this);
	shape7.setVisible(false);
	panel.add(shape7);
	
	
	
	Navigation = new ImageIcon("Image/Navigation Bar.jpg");
	navigation = new JLabel(Navigation);
	navigation.setBounds(0, 0, 1380, 115);
	panel.add(navigation);
	
	
	
	txt1 = new JLabel("Java");
	txt1.setBounds(149, 214, 211+30, 61);
	txt1.setFont(font3);
	txt1.setForeground(new Color(255, 0, 0));
	panel.add(txt1);

	txt2 = new JLabel("Build your first program with java");
	txt2.setBounds(149, 275, 491, 43);
	txt2.setFont(font4);
	txt2.setForeground(Color.BLACK);
	panel.add(txt2);

	
	
	txt3 = new JLabel("Total Chapter");
	txt3.setBounds(172, 358, 147, 32);
	txt3.setFont(font5);
	txt3.setForeground(new Color(255, 0, 0));
	panel.add(txt3);

	txt4 = new JLabel("50");
	txt4.setBounds(223, 390, 32, 32);
	txt4.setFont(font5);
	txt4.setForeground(Color.BLACK);
	panel.add(txt4);

	box1 = new JLabel();
	box1.setBounds(148,344,183,84);
	box1.setOpaque(true);
	box1.setBackground (new Color(246,246,246));
	panel.add(box1);
 
	
	
	txt5 = new JLabel("Video Duration");
	txt5.setBounds(345+15, 358-20, 170, 72);
	txt5.setFont(font5);
	txt5.setForeground(new Color(255, 0, 0));
	panel.add(txt5);

	txt6 = new JLabel("50 hours");
	txt6.setBounds(379+10, 390, 102, 32);
	txt6.setFont(font5);
	txt6.setForeground(Color.BLACK);
	panel.add(txt6);

	box2 = new JLabel();
	box2.setBounds(338,344,183,84);
	box2.setOpaque(true);
	box2.setBackground (new Color(246,246,246));
	panel.add(box2);



	txt7 = new JLabel("Problem  Solve");
	txt7.setBounds(154+15,444,171,32);
	txt7.setFont(font5);
	txt7.setForeground(new Color(255, 0, 0));
	panel.add(txt7);

	txt8 = new JLabel("300");
	txt8.setBounds(214+10,481,51,32);
	txt8.setFont(font5);
	txt8.setForeground(Color.BLACK);
	panel.add(txt8);

	box3 = new JLabel();
	box3.setBounds(148,435,183,84);
	box3.setOpaque(true);
	box3.setBackground (new Color(246,246,246));
	panel.add(box3);



	txt9 = new JLabel("Live Class");
	txt9.setBounds(375,444,109,32);
	txt9.setFont(font5);
	txt9.setForeground(new Color(255, 0, 0));
	panel.add(txt9);

	txt10 = new JLabel("60");
	txt10.setBounds(413,481,31,32);
	txt10.setFont(font5);
	txt10.setForeground(Color.BLACK);
	panel.add(txt10);

	box4 = new JLabel();
	box4.setBounds(338,435,183,84);
	box4.setOpaque(true);
	box4.setBackground (new Color(246,246,246));
	panel.add(box4);



	txt11 = new JLabel("Contest");
	txt11.setBounds(196+5,535,87,32);
	txt11.setFont(font5);
	txt11.setForeground(new Color(255, 0, 0));
	panel.add(txt11);

	txt12 = new JLabel("10");
	txt12.setBounds(226,574,28,32);
	txt12.setFont(font5);
	txt12.setForeground(Color.BLACK);
	panel.add(txt12);

	box5 = new JLabel();
	box5.setBounds(148,526,183,84);
	box5.setOpaque(true);
	box5.setBackground (new Color(246,246,246));
	panel.add(box5);




	txt12 = new JLabel("Certificate");
	txt12.setBounds(375,535,116,32);
	txt12.setFont(font5);
	txt12.setForeground(new Color(255, 0, 0));
	panel.add(txt12);

	txt13 = new JLabel("Yes");
	txt13.setBounds(413-5,572,38,32);
	txt13.setFont(font5);
	txt13.setForeground(Color.BLACK);
	panel.add(txt13);

	box6 = new JLabel();
	box6.setBounds(338,526,183,84);
	box6.setOpaque(true);
	box6.setBackground (new Color(246,246,246));
	panel.add(box6);




	txt14 = new JLabel("Course Price");
	txt14.setBounds(972,401,184,43);
	txt14.setFont(font4);
	txt14.setForeground(new Color(255, 0, 0));
	panel.add(txt14);

	txt15 = new JLabel("8000/-");
	txt15.setBounds(1003+20,435,123,43);
	txt15.setFont(font4);
	txt15.setForeground(Color.BLACK);
	panel.add(txt15);

	box7 = new JLabel();
	box7.setBounds(928,398,275,86);
	box7.setOpaque(true);
	box7.setBackground (new Color(246,246,246));
	panel.add(box7);

	
	
	txt16 = new JLabel("Enrollment Start");
	txt16.setBounds(973+15,500,185,32);
	txt16.setFont(font5);
	txt16.setForeground(new Color(255, 0, 0));
	panel.add(txt16);

	txt17 = new JLabel("21 May, 2025");
	txt17.setBounds(985+15,529,161,32);
	txt17.setFont(font5);
	txt17.setForeground(Color.BLACK);
	panel.add(txt17);

	box8 = new JLabel();
	box8.setBounds(928,492,275,84);
	box8.setOpaque(true);
	box8.setBackground (new Color(246,246,246));
	panel.add(box8);



	
	enroll = new JButton("Enroll Now");
	enroll.setBounds(928, 584, 275, 52);
	enroll.setFont(font4);
	enroll.setForeground(Color.WHITE);
	enroll.setBackground(new Color(255, 0, 0));
	enroll.setContentAreaFilled(true);
	enroll.setBorderPainted(false);
	enroll.addActionListener(this);
	panel.add(enroll);


	ImageIcon customImage = new ImageIcon("Image/Java.png");
	JLabel imageLabel = new JLabel(customImage);
	imageLabel.setBounds(928, 224, 275, 166);
	imageLabel.setOpaque(false);
	panel.add(imageLabel);


	
	this.add(panel);
	}
	
	public void mouseClicked(MouseEvent me)
	{
		if(me.getSource()==sub)
		{
			bCpp.setVisible(true);
			bJava.setVisible(true);
			bInt.setVisible(true);
			bEng.setVisible(true);
			shape5.setVisible(true);
			bMSP.setVisible(false);
			bIllustrator.setVisible(false);
			bFigma.setVisible(false);
			bPhotoshop.setVisible(false);
			shape6.setVisible(false);
			bWhatSkillPros.setVisible(false);
			bOurMV.setVisible(false);
			bWhyJoin.setVisible(false);
			shape7.setVisible(false);
			
		}
		else if(me.getSource()==panel)
		{
			bCpp.setVisible(false);
			bJava.setVisible(false);
			bInt.setVisible(false);
			bEng.setVisible(false);
			shape5.setVisible(false);
			bMSP.setVisible(false);
			bIllustrator.setVisible(false);
			bFigma.setVisible(false);
			bPhotoshop.setVisible(false);
			shape6.setVisible(false);
			bWhatSkillPros.setVisible(false);
			bOurMV.setVisible(false);
			bWhyJoin.setVisible(false);
			shape7.setVisible(false);
		}
		else if(me.getSource()==skills)
		{
			bMSP.setVisible(true);
			bIllustrator.setVisible(true);
			bFigma.setVisible(true);
			bPhotoshop.setVisible(true);
			shape6.setVisible(true);
			bCpp.setVisible(false);
			bJava.setVisible(false);
			bInt.setVisible(false);
			bEng.setVisible(false);
			shape5.setVisible(false);
			bWhatSkillPros.setVisible(false);
			bOurMV.setVisible(false);
			bWhyJoin.setVisible(false);
			shape7.setVisible(false);
			
		}
		else if(me.getSource()==about)
		{
			bWhatSkillPros.setVisible(true);
			bOurMV.setVisible(true);
			bWhyJoin.setVisible(true);
			shape7.setVisible(true);
			bCpp.setVisible(false);
			bJava.setVisible(false);
			bInt.setVisible(false);
			bEng.setVisible(false);
			shape5.setVisible(false);
			bMSP.setVisible(false);
			bIllustrator.setVisible(false);
			bFigma.setVisible(false);
			bPhotoshop.setVisible(false);
			shape6.setVisible(false);
		}
		
	}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me)
	{
		if(me.getSource()==sub)
		{
			sub.setForeground(c1);
		}
		else if(me.getSource()==skills)
		{
			skills.setForeground(c1);
		}
		else if(me.getSource()==about)
		{
			about.setForeground(c1);
		}
		else if(me.getSource()==bJava)
		{
			bJava.setForeground(c1);
		}
		else if(me.getSource()==bCpp)
		{
			bCpp.setForeground(c1);
		}
		else if(me.getSource()==bEng)
		{
			bEng.setForeground(c1);
		}
		else if(me.getSource()==bInt)
		{
			bInt.setForeground(c1);
		}
		else if(me.getSource()==bMSP)
		{
			bMSP.setForeground(c1);
		}
		else if(me.getSource()==bIllustrator)
		{
			bIllustrator.setForeground(c1);
		}
		else if(me.getSource()==bFigma)
		{
			bFigma.setForeground(c1);
		}
		else if(me.getSource()==bPhotoshop)
		{
			bPhotoshop.setForeground(c1);
		}
		else if(me.getSource()==bWhatSkillPros)
		{
			bWhatSkillPros.setForeground(c1);
		}
		else if(me.getSource()==bOurMV)
		{
			bOurMV.setForeground(c1);
		}
		else if(me.getSource()==bWhyJoin)
		{
			bWhyJoin.setForeground(c1);
		}
	}
	public void mouseExited(MouseEvent me)
	{
			if(me.getSource()==sub)
		{
			sub.setForeground(Color.BLACK);
		}
		else if(me.getSource()==skills)
		{
			skills.setForeground(Color.BLACK);
		}
		else if(me.getSource()==about)
		{
			about.setForeground(Color.BLACK);
		}
		else if(me.getSource()==bJava)
		{
			bJava.setForeground(Color.BLACK);
		}
		else if(me.getSource()==bCpp)
		{
			bCpp.setForeground(Color.BLACK);
		}
		else if(me.getSource()==bEng)
		{
			bEng.setForeground(Color.BLACK);
		}
		else if(me.getSource()==bInt)
		{
			bInt.setForeground(Color.BLACK);
		}
		else if(me.getSource()==bMSP)
		{
			bMSP.setForeground(Color.BLACK);
		}
		else if(me.getSource()==bIllustrator)
		{
			bIllustrator.setForeground(Color.BLACK);
		}
		else if(me.getSource()==bFigma)
		{
			bFigma.setForeground(Color.BLACK);
		}
		else if(me.getSource()==bPhotoshop)
		{
			bPhotoshop.setForeground(Color.BLACK);
		}
		else if(me.getSource()==bWhatSkillPros)
		{
			bWhatSkillPros.setForeground(Color.BLACK);
		}
		else if(me.getSource()==bOurMV)
		{
			bOurMV.setForeground(Color.BLACK);
		}
		else if(me.getSource()==bWhyJoin)
		{
			bWhyJoin.setForeground(Color.BLACK);
		}
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==LOGO)
		{
			HomePage h1 = new HomePage(dpName);
			h1.setVisible(true);
			this.setVisible(false);
		}
		else if(ae.getSource()==USER)
		{
			Information info1 = new Information(dpName);
			info1.setVisible(true);
			this.setVisible(false);
		}
		else if(ae.getSource()==bJava)
		{
			BasicJava j1 = new BasicJava(dpName);
			j1.setVisible(true);
			this.setVisible(false);
		}
		else if(ae.getSource()==bEng)
		{
			BasicEnglish e1 = new BasicEnglish(dpName);
			e1.setVisible(true);
			this.setVisible(false);
		}
		else if(ae.getSource()==bCpp)
		{
			BasicCPP cpp1 = new BasicCPP(dpName);
			cpp1.setVisible(true);
			this.setVisible(false);
		}
		else if(ae.getSource()==bInt)
		{
			BasicIntegration i1 = new BasicIntegration(dpName);
			i1.setVisible(true);
			this.setVisible(false);
		}
		else if(ae.getSource()==bMSP)
		{
			MSPowerPoint p1 = new MSPowerPoint(dpName);
			p1.setVisible(true);
			this.setVisible(false);
		}
		else if(ae.getSource()==bIllustrator)
		{
			Illustrator ill1 = new Illustrator(dpName);
			ill1.setVisible(true);
			this.setVisible(false);
		}
		else if(ae.getSource()==bFigma)
		{
			Figma f1 = new Figma(dpName);
			f1.setVisible(true);
			this.setVisible(false);
		}
		else if(ae.getSource()==bPhotoshop)
		{
			Photoshop ps1 = new Photoshop(dpName);
			ps1.setVisible(true);
			this.setVisible(false);
		}
		else if(ae.getSource()==bWhatSkillPros)
		{
			WhatIsSkillPros wie1 = new WhatIsSkillPros(dpName);
			wie1.setVisible(true);
			this.setVisible(false);
		}
		else if(ae.getSource()==bOurMV)
		{
			MissionVission mv1 = new MissionVission(dpName);
			mv1.setVisible(true);
			this.setVisible(false);
		}
		else if(ae.getSource()==bWhyJoin)
		{
			JoinWithUs jwu1 = new JoinWithUs(dpName);
			jwu1.setVisible(true);
			this.setVisible(false);
		}
		else if(ae.getSource()==enroll)
		{
			int choice = JOptionPane.showConfirmDialog(this, "Are your sure you want to buy this course?", "Confirmation", JOptionPane.YES_NO_OPTION);
			
			if(choice==0)
			{
				PaymentJava p1 = new PaymentJava(dpName);
				p1.setVisible(true);
				this.setVisible(false);
			}
		}
	}
}