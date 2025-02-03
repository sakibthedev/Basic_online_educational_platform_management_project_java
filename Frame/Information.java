package Frame;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class Information extends JFrame implements MouseListener,ActionListener
{
	JPanel panel;
	JLabel name,shape5, shape6, shape7, navigation;
	JButton sub, skills, about, USER, LOGO;
	JButton bCpp, bJava, bInt, bEng, bMSP, bIllustrator, bFigma, bPhotoshop, bWhatSkillPros, bOurMV, bWhyJoin;
	ImageIcon logo, user, picture, Navigation, purRecPic, greyRecPic, lightGreyRecPic;
	JLabel title, nameTag, pNumTag, emailTag, givenName, givenPNum, givenEmail,proInfo,courEnrol,certificates,payHistory, shape1, shape2, shape3, editLabel, logoutLabel, profilePic;
	JButton purRec, greyRec1,greyRec2,greyRec3, edit, logout;
	Font font1,font2,font3,font4,font5;
	Color c1,c2;
	public String dpName;
	
	public Information(String dpName)
	{
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
		font3 = new Font("Ariel", Font.BOLD, 24);
		font4 = new Font("Ariel", Font.BOLD, 44);
	
		c1 = new Color(46, 16, 243);
		c2 = new Color(246,246,246);
	
	
		logo = new ImageIcon("Image/Logo.png");
		user = new ImageIcon("Image/User.png");
		purRecPic = new ImageIcon("Image/purRecPic.png");
		greyRecPic = new ImageIcon("Image/greyRecPic.png");
		lightGreyRecPic = new ImageIcon("Image/lightGreyPic.png");
		picture = new ImageIcon("Image/UserLogo.png");
	
	
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
		
		
		
		purRec = new JButton(purRecPic);
		purRec.addActionListener(this);
		panel.add(purRec);
		
		/*courEnrol = new JLabel("Enrolled Courses");
		courEnrol.setBounds(57,310,250,60);
		courEnrol.setForeground(Color.BLACK);
		courEnrol.setFont(font3);
		panel.add(courEnrol);
		
		greyRec1= new JButton(greyRecPic);
		greyRec1.setBounds(30,310,250,70);
		greyRec1.setBackground(Color.WHITE);
		greyRec1.setBorderPainted(false);
		greyRec1.setContentAreaFilled(false);
		greyRec1.addActionListener(this);
		panel.add(greyRec1);

		
		certificates = new JLabel("Certificates");
		certificates.setBounds(90,402,240,50);
		certificates.setForeground(Color.BLACK);
		certificates.setFont(font3);
		panel.add(certificates);
		
		greyRec2= new JButton(greyRecPic);
		greyRec2.setBounds(30,400,250,70);
		greyRec2.setBackground(Color.WHITE);
		greyRec2.setBorderPainted(false);
		greyRec2.setContentAreaFilled(false);
		greyRec2.addActionListener(this);
		panel.add(greyRec2);
		
		payHistory = new JLabel("Payment History");
		payHistory.setBounds(60,488,250,60);
		payHistory.setForeground(Color.BLACK);
		payHistory.setFont(font3);
		panel.add(payHistory);
		
		greyRec3= new JButton(greyRecPic);
		greyRec3.setBounds(30,490,250,70);
		greyRec3.setBackground(Color.WHITE);
		greyRec3.setBorderPainted(false);
		greyRec3.setContentAreaFilled(false);
		greyRec3.addActionListener(this);
		panel.add(greyRec3);*/
		
		title = new JLabel("Profile Information");
		title.setBounds(350,130,450,80);
		title.setBackground(Color.WHITE);
		title.setForeground(c1);
		title.setFont(font4);
		panel.add(title);
		
		nameTag = new JLabel("Email");
		nameTag.setBounds(350,244 ,100,50);
		nameTag.setBackground(Color.WHITE);
		nameTag.setForeground(Color.BLACK);
		nameTag.setFont(font3);
		panel.add(nameTag);
		
		givenName = new JLabel(dpName);
		givenName.setBounds(350,277 +7,300,50);
		givenName.setForeground(Color.BLACK);
		givenName.setFont(new Font("Ariel", Font.BOLD, 17));
		panel.add(givenName);
		panel.add(givenName);
		
		/*pNumTag = new JLabel("Phone Number");
		pNumTag.setBounds(350,341 ,300,50);
		pNumTag.setBackground(Color.WHITE);
		pNumTag.setForeground(Color.BLACK);
		pNumTag.setFont(font3);
		panel.add(pNumTag);
		
		givenPNum = new JLabel("Phone Number");
		givenPNum.setBounds(350,374 +7,300,50);
		givenPNum.setForeground(Color.BLACK);
		givenPNum.setFont(new Font("Ariel", Font.BOLD, 17));
		panel.add(givenPNum);
		
		emailTag = new JLabel("Email");
		emailTag.setBounds(350,438,300,50);
		emailTag.setBackground(Color.WHITE);
		emailTag.setForeground(Color.BLACK);
		emailTag.setFont(font3);
		panel.add(emailTag);
		
		givenEmail = new JLabel("Email");
		givenEmail.setBounds(350,471 +7,300,50);
		givenEmail.setForeground(Color.BLACK);
		givenEmail.setFont(new Font("Ariel", Font.BOLD, 	17));
		panel.add(givenEmail);*/
		
		shape1 = new JLabel(lightGreyRecPic);
		shape1.setBounds(338,277,350,70);
		shape1.setBackground(Color.WHITE);
		shape1.setOpaque(true);
		panel.add(shape1);
		
		/*shape2 = new JLabel(lightGreyRecPic);
		shape2.setBounds(338,374,350,70);
		shape2.setBackground(Color.WHITE);
		shape2.setOpaque(true);
		panel.add(shape2);
		
		shape3 = new JLabel(lightGreyRecPic);
		shape3.setBounds(338,471,350,70);
		shape3.setBackground(Color.WHITE);
		shape3.setOpaque(true);
		panel.add(shape3);*/
		
		profilePic = new JLabel(picture);
		profilePic.setBounds(700 +100 ,200 -50,500,500);
		profilePic.setBackground(Color.WHITE);
		panel.add(profilePic);
		
		/*editLabel = new JLabel("Edit");
		editLabel.setBounds(398,547,150,70);
		editLabel.setForeground(Color.WHITE);
		editLabel.setFont(font3);
		panel.add(editLabel);
		
		edit = new JButton(purRecPic);
		edit.setBounds(348,550,150,70);
		edit.setBackground(Color.WHITE);
		edit.setBorderPainted(false);
		edit.setContentAreaFilled(false);
		edit.addActionListener(this);
		panel.add(edit);*/
		
		logoutLabel = new JLabel("Log Out");
		logoutLabel.setBounds(523,547,150,70);
		logoutLabel.setForeground(Color.WHITE);
		logoutLabel.setFont(font3);
		panel.add(logoutLabel);
		
		logout = new JButton(purRecPic);
		logout.setBounds(500,550,150,70);
		logout.setBackground(Color.WHITE);
		logout.setBorderPainted(false);
		logout.setContentAreaFilled(false);
		logout.addActionListener(this);
		panel.add(logout);
		
		
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
		else if(ae.getSource()==logout)
		{
			LoginFrame l1 = new LoginFrame();
			l1.setVisible(true);
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
	}
}