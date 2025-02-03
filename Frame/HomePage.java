package Frame;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import Classes.*;


public class HomePage extends JFrame implements MouseListener,ActionListener{
	
	JPanel panel;
	JLabel name, txt1, txt2, txt3, txt4, txt5, shape1, shape2, shape3, shape4, Illustration;
	ImageIcon logo, user, illustration, javap, cp, Englishp, Integrationp, Navigation;
	JButton sub, skills, about, USER, LOGO, java, c, English, Integration, jt, ct, et, it;
	JLabel shape5, shape6, shape7, navigation;
	JButton bCpp, bJava, bInt, bEng, bMSP, bIllustrator, bFigma, bPhotoshop, bWhatSkillPros, bOurMV, bWhyJoin, moreCourses;
	Font font1, font2, font3, font4, font5;
	Color c1;
	String dpName;
	
	LoginFrame lgn = new LoginFrame();
	
	
	public HomePage(String dpName){
		
	
	super("Homepage");
	this.setSize(1380, 720);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setLocationRelativeTo(null);
	this.dpName =  dpName;
	
	panel = new JPanel();
	panel.setLayout(null);
	panel.setBackground(Color.WHITE);
	panel.addMouseListener(this);
	
	c1 = new Color(45,69,255);
	
	font1 = new Font("Ariel", Font.BOLD, 24);
	font2 = new Font("Ariel", Font.PLAIN, 20);
	font3 = new Font("Ariel", Font.BOLD, 46);
	font4 = new Font("Ariel", Font.PLAIN, 22);
	font5 = new Font("Ariel", Font.BOLD, 20);
	
	logo = new ImageIcon("Image/Logo.png");
	user = new ImageIcon("Image/User.png");
	illustration = new ImageIcon("Image/Illustration.png");
	javap = new ImageIcon("Image/java.png");
	cp = new ImageIcon("Image/C++.png");
	Englishp = new ImageIcon("Image/English.png");
	Integrationp = new ImageIcon("Image/Integration.png");
	
	
	
	Illustration = new JLabel(illustration);
	Illustration.setBounds(881, 364, 453-40, 356-40);
	panel.add(Illustration);
	
	java = new JButton(javap);
	java.setBounds(52, 453, 222, 151);
	java.setContentAreaFilled(false);
	java.setBorderPainted(false);
	java.addActionListener(this);
	panel.add(java);
	
	English = new JButton(Englishp);
	English.setBounds(332, 482, 222, 151);
	English.setContentAreaFilled(false);
	English.setBorderPainted(false);
	English.addActionListener(this);
	panel.add(English);
	
	c = new JButton(cp);
	c.setBounds(52, 244, 222, 151);
	c.setContentAreaFilled(false);
	c.setBorderPainted(false);
	c.addActionListener(this);
	panel.add(c);
	
	jt = new JButton("Java");
	jt.setBounds(112 - 20, 614, 102 + 40, 29);
	jt.setFont(font5);
	jt.setForeground( new Color(0, 0, 0));
	jt.setOpaque(false);
	jt.setContentAreaFilled(false);
	jt.setBorderPainted(false);
	jt.addActionListener(this);
	panel.add(jt);
	
	ct = new JButton("C++");
	ct.setBounds(115 - 20, 405, 96 + 40, 29);
	ct.setFont(font5);
	ct.setForeground( new Color(0, 0, 0));
	ct.setOpaque(false);
	ct.setContentAreaFilled(false);
	ct.setBorderPainted(false);
	ct.addActionListener(this);
	panel.add(ct);
	
	et = new JButton("English");
	et.setBounds(375 - 20, 643, 134 + 30, 29);
	et.setFont(font5);
	et.setForeground( new Color(0, 0, 0));
	et.setOpaque(false);
	et.setContentAreaFilled(false);
	et.setBorderPainted(false);
	et.addActionListener(this);
	panel.add(et);
	
	it = new JButton("Integration");
	it.setBounds(385 - 20, 434, 113 + 30, 29);
	it.setFont(font5);
	it.setForeground( new Color(0, 0, 0));
	it.setOpaque(false);
	it.setContentAreaFilled(false);
	it.setBorderPainted(false);
	it.addActionListener(this);
	panel.add(it);
	
	name = new JLabel(dpName);
	name.setBounds(1100, 41, 180, 29);
	name.setFont(font2);
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
	
	moreCourses = new JButton("More Courses");
	moreCourses.setBounds(661, 600, 200, 50); 
	moreCourses.setFont(font1);
	moreCourses.setForeground(Color.WHITE);
	moreCourses.setBackground(new Color(45,69,255)); 
	moreCourses.setBorderPainted(false);
	moreCourses.addActionListener(this); 
	panel.add(moreCourses);
	
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
	
	
	
	txt3 = new JLabel("Offered Courses");
	txt3.setBounds(38, 164, 350 + 15, 61);
	txt3.setFont(font3);
	txt3.setForeground( new Color(45,69,255));
	txt3.setOpaque(false);
	panel.add(txt3);
	
	txt1 = new JLabel("On a journey to deliver");
	txt1.setBounds(661, 170, 546 + 15, 61);
	txt1.setFont(font3);
	txt1.setForeground( new Color(45,69,255));
	txt1.setOpaque(false);
	panel.add(txt1);
	
	txt2 = new JLabel("the light of learning to all");
	txt2.setBounds(661, 231 -10, 646 + 15, 61);
	txt2.setFont(font3);
	txt2.setForeground( new Color(45,69,255));
	txt2.setOpaque(false);
	panel.add(txt2);
	
	txt4 = new JLabel("We trust that one day, the people of Bangladesh");
	txt4.setBounds(667, 303 - 10, 592 + 15, 31);
	txt4.setFont(font4);
	txt4.setForeground( new Color(0, 0, 0));
	txt4.setOpaque(false);
	panel.add(txt4);
	 
	txt5 = new JLabel("will attain top-tier education.");
	txt5.setBounds(667, 332 -10, 447 + 15, 31);
	txt5.setFont(font4);
	txt5.setForeground( new Color(0, 0, 0));
	txt5.setOpaque(false);
	panel.add(txt5);
	
	Integration = new JButton(Integrationp);
	Integration.setBounds(331, 273, 222, 151);
	Integration.setContentAreaFilled(false);
	Integration.setBorderPainted(false);
	Integration.addActionListener(this);
	Integration.addMouseListener(this);
	panel.add(Integration);
	
	shape1 = new JLabel();
	shape1.setBounds(316, 264, 251, 170);
	shape1.setBackground( new Color(250, 243, 254));
	shape1.setOpaque(true);
	panel.add(shape1);
	
	shape2 = new JLabel();
	shape2.setBounds(316, 473, 251, 170);
	shape2.setBackground( new Color(250, 243, 254));
	shape2.setOpaque(true);
	panel.add(shape2);
	
	shape3 = new JLabel();
	shape3.setBounds(38, 235, 251, 170);
	shape3.setBackground( new Color(250, 243, 254));
	shape3.setOpaque(true);
	panel.add(shape3);
	
	shape4 = new JLabel();
	shape4.setBounds(38, 444, 251, 170);
	shape4.setBackground( new Color(250, 243, 254));
	shape4.setOpaque(true);
	panel.add(shape4);
	
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
		else if(ae.getSource()==java)
		{
			BasicJava j1 = new BasicJava(dpName);
			j1.setVisible(true);
			this.setVisible(false);
		}
		 else if(ae.getSource()==English)
		{
			BasicEnglish e1 = new BasicEnglish(dpName);
			e1.setVisible(true);
			this.setVisible(false);
		}
		else if(ae.getSource()==c)
		{
			BasicCPP cpp1 = new BasicCPP(dpName);
			cpp1.setVisible(true);
			this.setVisible(false);
			
		}
		else if(ae.getSource()==Integration)
		{
			BasicIntegration i1 = new BasicIntegration(dpName);
			i1.setVisible(true);
			this.setVisible(false);
		}
		else if(ae.getSource()==jt)
		{
			BasicJava j1 = new BasicJava(dpName);
			j1.setVisible(true);
			this.setVisible(false);
		}
		else if(ae.getSource()==et)
		{
			BasicEnglish e1 = new BasicEnglish(dpName);
			e1.setVisible(true);
			this.setVisible(false);
		}
		else if(ae.getSource()==ct)
		{
			BasicCPP cpp1 = new BasicCPP(dpName);
			cpp1.setVisible(true);
			this.setVisible(false);
		}
		else if(ae.getSource()==it)
		{
			BasicIntegration i1 = new BasicIntegration(dpName);
			i1.setVisible(true);
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
		else if (ae.getSource() == moreCourses) {
        InventoryPage invPage = new InventoryPage();
		invPage.setVisible(true);
		this.setVisible(false);
		}
		
	}
	
}