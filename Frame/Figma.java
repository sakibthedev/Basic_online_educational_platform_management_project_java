package Frame;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;


public class Figma extends JFrame implements MouseListener,ActionListener{
	
	JPanel panel;
	JLabel name,title, line1, line2, box1, box2, box3, box4, box5, box6, box7, box8, PICTURE;
	JLabel chapter, video, project, live, quiz, certificate, price, enStart, txt1, txt2, txt3, txt4, txt5, txt6, txt7, txt8;
	ImageIcon logo, user, picture , Navigation;
	JButton sub, skills, about, USER, LOGO, enroll;
	JLabel shape5, shape6, shape7, navigation;
	JButton bCpp, bJava, bInt, bEng, bMSP, bIllustrator, bFigma, bPhotoshop, bWhatSkillPros, bOurMV, bWhyJoin;
	Font font1, font2, font3, font4;
	Color color1, color2, color3;
	public String dpName;
	
	public Figma(String dpName){
	
	super("Figma");
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
	font3 = new Font("Ariel", Font.PLAIN, 23);
	font4 = new Font("Ariel", Font.PLAIN, 28);
	
	color1 = new Color(246, 246, 246);
	color2 = new Color(46, 16, 243);
	color3 = new Color(46, 16, 243);
	
	
	logo = new ImageIcon("Image/Logo.png");
	user = new ImageIcon("Image/User.png");
	picture = new ImageIcon("Image/Figma.png");
	
	
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
	
	title = new JLabel("Figma");
	title.setBounds(149,214,332,61);
	title.setForeground(color2);
	title.setFont(new Font("Ariel",Font.BOLD,40));
	panel.add(title);
	
	line1 = new JLabel("Enhance Your UI/UX Design With Figma");
	line1.setBounds(149, 275, 550, 33);
	line1.setForeground(Color.BLACK);
	line1.setFont(font4);
	panel.add(line1);
	
	chapter = new JLabel("Total Chapter");
	chapter.setBounds(172, 393, 147, 32);
	chapter.setForeground(color2);
	chapter.setFont(font3);
	panel.add(chapter);
	
	txt1 = new JLabel("12");
	txt1.setBounds(223, 425, 28, 32);
	txt1.setForeground(Color.BLACK);
	txt1.setFont(font3);
	panel.add(txt1);
	
	box1 = new JLabel();
	box1.setBounds(148, 379, 183, 84);
	box1.setBackground(color1);
	box1.setOpaque(true);
	panel.add(box1);
	
	video = new JLabel("Video Duration");
	video.setBounds(352, 393, 170, 32);
	video.setForeground(color2);
	video.setFont(font3);
	panel.add(video);
	
	txt2 = new JLabel("8 hours");
	txt2.setBounds(379 +6, 425, 97, 32);
	txt2.setForeground(Color.BLACK);
	txt2.setFont(font3);
	panel.add(txt2);
	
	box2 = new JLabel();
	box2.setBounds(338, 379, 183, 84);
	box2.setBackground(color1);
	box2.setOpaque(true);
	panel.add(box2);
	
	project = new JLabel("Total Project");
	project.setBounds(173, 479, 142, 32);
	project.setForeground(color2);
	project.setFont(font3);
	panel.add(project);
	
	txt3 = new JLabel("3");
	txt3.setBounds(226, 516, 28, 32);
	txt3.setForeground(Color.BLACK);
	txt3.setFont(font3);
	panel.add(txt3);

	box3 = new JLabel();
	box3.setBounds(148, 470, 183, 84);
	box3.setBackground(color1);
	box3.setOpaque(true);
	panel.add(box3);
	
	live = new JLabel("Live Class");
	live.setBounds(375, 480, 109, 32);
	live.setForeground(color2);
	live.setFont(font3);
	panel.add(live);
	
	txt4 = new JLabel("2");
	txt4.setBounds(417, 517, 28, 32);
	txt4.setForeground(Color.BLACK);
	txt4.setFont(font3);
	panel.add(txt4);

	box4 = new JLabel();
	box4.setBounds(338, 470, 183, 84);
	box4.setBackground(color1);
	box4.setOpaque(true);
	panel.add(box4);
	
	quiz = new JLabel("Quiz");
	quiz.setBounds(212, 568, 53, 32);
	quiz.setForeground(color2);
	quiz.setFont(font3);
	panel.add(quiz);
	
	txt5 = new JLabel("4");
	txt5.setBounds(226, 609, 28, 32);
	txt5.setForeground(Color.BLACK);
	txt5.setFont(font3);
	panel.add(txt5);

	box5 = new JLabel();
	box5.setBounds(148, 561, 183, 84);
	box5.setBackground(color1);
	box5.setOpaque(true);
	panel.add(box5);
	
	certificate = new JLabel("Certificate");
	certificate.setBounds(380, 568, 116, 32);
	certificate.setForeground(color2);
	certificate.setFont(font3);
	panel.add(certificate);
	
	txt6 = new JLabel("Yes");
	txt6.setBounds(413 -5, 609, 116, 32);
	txt6.setForeground(Color.BLACK);
	txt6.setFont(font3);
	panel.add(txt6);

	box6 = new JLabel();
	box6.setBounds(338, 561, 183, 84);
	box6.setBackground(color1);
	box6.setOpaque(true);
	panel.add(box6);
	
	enroll = new JButton("Enroll Now");
	enroll.setBounds(928, 584, 275, 52);
	enroll.setBackground(color2);
	enroll.setForeground(Color.WHITE);
	enroll.setFont(new Font("Ariel",Font.BOLD,28));
	enroll.addActionListener(this);
	panel.add(enroll);
	
	price = new JLabel("Course Price");
	price.setBounds(990, 401, 184, 43);
	price.setForeground(color2);
	price.setFont(font4);
	panel.add(price);
	
	txt7 = new JLabel("3000/-");
	txt7.setBounds(1030, 435, 120, 43);
	txt7.setForeground(Color.BLACK);
	txt7.setFont(font4);
	panel.add(txt7);

	box7 = new JLabel();
	box7.setBounds(928, 398, 275, 86);
	box7.setBackground(color1);
	box7.setOpaque(true);
	panel.add(box7);
	
	enStart = new JLabel("Enrollment Start");
	enStart.setBounds(990, 500, 185, 32);
	enStart.setForeground(color2);
	enStart.setFont(font3);
	panel.add(enStart);
	
	txt8 = new JLabel("10 May, 2025");
	txt8.setBounds(1000, 529, 161, 32);
	txt8.setForeground(Color.BLACK);
	txt8.setFont(font3);
	panel.add(txt8);

	box8 = new JLabel();
	box8.setBounds(928, 492, 275, 86);
	box8.setBackground(color1);
	box8.setOpaque(true);
	panel.add(box8);	
	
	PICTURE = new JLabel(picture);
	PICTURE.setBounds(928, 224, 275, 166);
	panel.add(PICTURE);
	
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
			sub.setForeground(color3);
		}
		else if(me.getSource()==skills)
		{
			skills.setForeground(color3);
		}
		else if(me.getSource()==about)
		{
			about.setForeground(color3);
		}
		else if(me.getSource()==bJava)
		{
			bJava.setForeground(color3);
		}
		else if(me.getSource()==bCpp)
		{
			bCpp.setForeground(color3);
		}
		else if(me.getSource()==bEng)
		{
			bEng.setForeground(color3);
		}
		else if(me.getSource()==bInt)
		{
			bInt.setForeground(color3);
		}
		else if(me.getSource()==bMSP)
		{
			bMSP.setForeground(color3);
		}
		else if(me.getSource()==bIllustrator)
		{
			bIllustrator.setForeground(color3);
		}
		else if(me.getSource()==bFigma)
		{
			bFigma.setForeground(color3);
		}
		else if(me.getSource()==bPhotoshop)
		{
			bPhotoshop.setForeground(color3);
		}
		else if(me.getSource()==bWhatSkillPros)
		{
			bWhatSkillPros.setForeground(color3);
		}
		else if(me.getSource()==bOurMV)
		{
			bOurMV.setForeground(color3);
		}
		else if(me.getSource()==bWhyJoin)
		{
			bWhyJoin.setForeground(color3);
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
				PaymentFigma p1 = new PaymentFigma(dpName);
				p1.setVisible(true);
				this.setVisible(false);
			}
		}
	}
}