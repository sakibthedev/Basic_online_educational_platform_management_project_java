package Frame;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class WhyUseJava extends JFrame implements MouseListener,ActionListener{
	
	JPanel panel;
	
	ImageIcon logo, user,jpic1,jpic2, Navigation;
	JButton sub, skills, about, USER, LOGO;
	JLabel name,shape5, shape6, shape7,C1,line1,line2,line3,line4,line5,line6,line7,line8,line9,line10,line11,line12,line13,line14,line15,box,navigation;
	JButton bCpp, bJava, bInt, bEng, bMSP, bIllustrator, bFigma, bPhotoshop, bWhatSkillPros, bOurMV, bWhyJoin,bNext,b1,b2,b3,b4,b5,b6,b7,b8;
	Font font1, font2, font3, font4, font5;
	Color c1;
	public String dpName;
	
	public WhyUseJava(String dpName){
	
	super("Why Use Java?");
	this.setSize(1380, 720);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setLocationRelativeTo(null);
	this.dpName= dpName;
	
	panel = new JPanel();
	panel.setLayout(null);
	panel.setBackground(Color.WHITE);
	panel.addMouseListener(this);
	font1 = new Font("Ariel", Font.BOLD, 24);
	font2 = new Font("Ariel", Font.PLAIN, 20);
	font3 = new Font("Ariel", Font.BOLD, 46);
	font4 = new Font("Ariel", Font.PLAIN, 22);
	font5 = new Font("Ariel", Font.BOLD, 20);
	
	logo = new ImageIcon("Image/Logo.png");
	user = new ImageIcon("Image/User.png");
	jpic1 = new ImageIcon("Image/JavaButton1.png");
	jpic2 = new ImageIcon("Image/JavaButton2.png");
	
	name = new JLabel("Your Name");
	name.setBounds(1148, 41, 109, 29);
	name.setFont(font2);
	
	c1 = new Color(45,69,255);
	
	name.setForeground(Color.BLACK);
	panel.add(name);
	
	LOGO = new JButton(logo);
	LOGO.setBounds(0, 20, 252, 78);
	LOGO.setContentAreaFilled(false);
	LOGO.setBorderPainted(false);
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
	
	
	C1 = new JLabel("Why Use Java?");
	C1.setBounds(419,259,316,61);
	C1.setForeground(c1);
	C1.setFont(new Font("Ariel",Font.BOLD,40));
	panel.add(C1);
	
	
	line1=new JLabel("  1.Java Works on different platforms(Winows,Mac,Linux,etc)");
	line1.setBounds(419,320,660,50);
	line1.setFont(new Font("Ariel",Font.PLAIN,22));
	line1.setForeground(Color.BLACK);
	panel.add(line1);
	
	line2=new JLabel("  2.It is one of the most popular programming languages in the world.");
	line2.setBounds(419,350,660,50);
	line2.setFont(new Font("Ariel",Font.PLAIN,22));
	line2.setForeground(Color.BLACK);
	panel.add(line2);
	
	line3=new JLabel("  3.It has a large demand in the current job market");
	line3.setBounds(419,380,660,50);
	line3.setFont(new Font("Ariel",Font.PLAIN,22));
	line3.setForeground(Color.BLACK);
	panel.add(line3);
	
	
	line4=new JLabel("  4.It is easy to learn and simple to use");
	line4.setBounds(419,410,660,50);
	line4.setFont(new Font("Ariel",Font.PLAIN,22));
	line4.setForeground(Color.BLACK);
	panel.add(line4);
	
	line5=new JLabel("  5.It is open-source and free");
	line5.setBounds(419,440,660,50);
	line5.setFont(new Font("Ariel",Font.PLAIN,22));
	line5.setForeground(Color.BLACK);
	panel.add(line5);
	
	line6=new JLabel("  6.It is secure, fast and powerful");
	line6.setBounds(419,470,660,50);
	line6.setFont(new Font("Ariel",Font.PLAIN,22));
	line6.setForeground(Color.BLACK);
	panel.add(line6);
	
	
	line7=new JLabel("  7.It has huge community support (tens of millions of developers)");
	line7.setBounds(419,500,660,50);
	line7.setFont(new Font("Ariel",Font.PLAIN,22));
	line7.setForeground(Color.BLACK);
	panel.add(line7);
	

	
	
	bNext=new JButton("Next");
	bNext.setBounds(1177,590,137,50);
	bNext.setBackground(c1);
	bNext.setForeground(Color.WHITE);
	bNext.setFont(new Font("Ariel",Font.PLAIN,26));
	bNext.addActionListener(this);
	panel.add(bNext);
	
	line8=new JLabel("What is Java?");
	line8.setBounds(101,232,227,41);
	line8.setFont(new Font("Ariel",Font.BOLD,22));
	line8.setForeground(Color.BLACK);
	panel.add(line8);
	
	b1=new JButton(jpic1);
	b1.setBounds(89,232,227,41);
	b1.setContentAreaFilled(false);
	b1.setBorderPainted(false);
	b1.addActionListener(this);
	panel.add(b1);
	
	line9=new JLabel("Why Use Java?");
	line9.setBounds(101,283,227,41);
	line9.setFont(new Font("Ariel",Font.BOLD,22));
	line9.setForeground(Color.WHITE);
	panel.add(line9);
	
	b2=new JButton(jpic2);
	b2.setBounds(89,283,227,41);
	b2.setContentAreaFilled(false);
	b2.setBorderPainted(false);
	b2.addActionListener(this);
	panel.add(b2);
	
	
	line10=new JLabel("Basic Java Syntax");
	line10.setBounds(101,333,227,41);
	line10.setFont(new Font("Ariel",Font.BOLD,22));
	line10.setForeground(Color.BLACK);
	panel.add(line10);
	
	b3=new JButton(jpic1);
	b3.setBounds(89,333,227,41);
	b3.setContentAreaFilled(false);
	b3.setBorderPainted(false);
	b3.addActionListener(this);
	panel.add(b3);
	
	line11=new JLabel("Java Output");
	line11.setBounds(101,383,227,41);
	line11.setFont(new Font("Ariel",Font.BOLD,22));
	line11.setForeground(Color.BLACK);
	panel.add(line11);
	
	b4=new JButton(jpic1);
	b4.setBounds(89,383,227,41);
	b4.setContentAreaFilled(false);
	b4.setBorderPainted(false);
	b4.addActionListener(this);
	panel.add(b4);
	
	line12=new JLabel("Java Comments");
	line12.setBounds(101,433,227,41);
	line12.setFont(new Font("Ariel",Font.BOLD,22));
	line12.setForeground(Color.BLACK);
	panel.add(line12);
	
	b5=new JButton(jpic1);
	b5.setBounds(89,433,227,41);
	b5.setContentAreaFilled(false);
	b5.setBorderPainted(false);
	b5.addActionListener(this);
	panel.add(b5);
	
	line13=new JLabel("Java Variables");
	line13.setBounds(101,483,227,41);
	line13.setFont(new Font("Ariel",Font.BOLD,22));
	line13.setForeground(Color.BLACK);
	panel.add(line13);
	
	b6=new JButton(jpic1);
	b6.setBounds(89,483,227,41);
	b6.setContentAreaFilled(false);
	b6.setBorderPainted(false);
	b6.addActionListener(this);
	panel.add(b6);
	
	line14=new JLabel("Java Data Types");
	line14.setBounds(101,533,227,41);
	line14.setFont(new Font("Ariel",Font.BOLD,22));
	line14.setForeground(Color.BLACK);
	panel.add(line14);
	
	b7=new JButton(jpic1);
	b7.setBounds(89,533,227,41);
	b7.setContentAreaFilled(false);
	b7.setBorderPainted(false);
	b7.addActionListener(this);
	panel.add(b7);
	
	line15=new JLabel("Java Type Casting");
	line15.setBounds(101,583,227,41);
	line15.setFont(new Font("Ariel",Font.BOLD,22));
	line15.setForeground(Color.BLACK);
	panel.add(line15);
	
	b8=new JButton(jpic1);
	b8.setBounds(89,583,227,41);
	b8.setContentAreaFilled(false);
	b8.setBorderPainted(false);
	b8.addActionListener(this);
	panel.add(b8);
	
	
	Navigation = new ImageIcon("Image/Navigation Bar.jpg");
	navigation = new JLabel(Navigation);
	navigation.setBounds(0, 0, 1380, 115);
	panel.add(navigation);
	
	
	
	
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
		
		if(ae.getSource()==b1)
		{
			WhatisJava wij = new WhatisJava(dpName);
			wij.setVisible(true);
			this.setVisible (false);
		}
		else if(ae.getSource()==b2)
		{
			WhyUseJava wuj = new WhyUseJava(dpName);
			wuj.setVisible(true);
			this.setVisible(false);
		}
		else if(ae.getSource()==b3)
		{
			BasicjavaSyntax bjs = new BasicjavaSyntax(dpName);
			bjs.setVisible(true);
			this.setVisible(false);
		}
		else if(ae.getSource()==b4)
		{
			JavaOutput jo = new JavaOutput(dpName);
			jo.setVisible(true);
			this.setVisible(false);
		}
		else if(ae.getSource()==b5)
		{
			JavaComments jc = new JavaComments(dpName);
			jc.setVisible(true);
			this.setVisible(false);
		}
		else if(ae.getSource()==b6)
		{
			JavaVariables jv = new JavaVariables(dpName);
			jv.setVisible(true);
			this.setVisible(false);
		}
		else if(ae.getSource()==b7)
		{
			JavaDataTypes jdt = new JavaDataTypes(dpName);
			jdt.setVisible(true);
			this.setVisible(false);
		}
		else if(ae.getSource()==b8)
		{
			JavaTypeCasting jtc = new JavaTypeCasting(dpName);
			jtc.setVisible(true);
			this.setVisible(false);
		}
		else if(ae.getSource()==bNext)
		{
			BasicjavaSyntax bs = new BasicjavaSyntax(dpName);
			bs.setVisible(true);
			this.setVisible(false);
		}
		
		
	}
	
}
