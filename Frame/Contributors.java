package Frame;

import javax.swing.*;
import java.awt.*;

public class Contributors extends JFrame {
    public Contributors() {
        super("Contributors");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(600, 700); 
        this.setLocationRelativeTo(null);
        this.setLayout(null); 
        this.getContentPane().setBackground(new Color(240, 240, 240)); 

        
        JPanel panel = new JPanel();
        panel.setLayout(null); 
        panel.setBackground(new Color(240, 240, 240)); 
        panel.setBounds(0, 0, 600, 700); 

        
        JLabel header = new JLabel("MEET THE TEAM", SwingConstants.CENTER);
        header.setFont(new Font("Times New Roman", Font.BOLD, 24));
        header.setForeground(new Color(45, 69, 255));
        header.setBounds(130, 20, 300, 30); 
        panel.add(header);

        
        JLabel supervisorLabel = new JLabel("SUPERVISOR", SwingConstants.CENTER);
        supervisorLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
        supervisorLabel.setForeground(new Color(45, 69, 255));
        supervisorLabel.setBounds(180, 70, 200, 30); 
        panel.add(supervisorLabel);
        
        JLabel supervisorName = new JLabel("Mazid-Ul Haque");
        JLabel supervisorPosition = new JLabel("Assistant Professor, Computer Science Department");
        JLabel supervisorUniversity = new JLabel("American International University-Bangladesh");
        
        supervisorName.setFont(new Font("Arial", Font.BOLD, 16));
        supervisorName.setForeground(Color.BLACK); 
        supervisorPosition.setFont(new Font("Arial", Font.PLAIN, 14));
        supervisorPosition.setForeground(Color.BLACK); 
        supervisorUniversity.setFont(new Font("Arial", Font.PLAIN, 14));
        supervisorUniversity.setForeground(Color.BLACK); 
        
        supervisorName.setBounds(215, 110, 200, 30); 
        supervisorPosition.setBounds(150-30, 140, 500, 30); 
        supervisorUniversity.setBounds(140, 170, 300, 30); 
        
        panel.add(supervisorName);
        panel.add(supervisorPosition);
        panel.add(supervisorUniversity);

        
        String[][] contributors = {
            {"Atiqul Islam Sakib (Team Leader)", "Student, Computer Science and Engineering Department", "American International University-Bangladesh"},
            {"Jalish Mahmud Shad", "Student, Computer Science and Engineering Department", "American International University-Bangladesh"},
            {"Muntasir Mahmud Turzo", "Student, Computer Science and Engineering Department", "American International University-Bangladesh"},
            {"Tahmina Era", "Student, Computer Science and Engineering Department", "American International University-Bangladesh"}
        };

        
        int yPosition = 220; 

        
        for (int i = 0; i < contributors.length; i++) {
            JLabel nameLabel = new JLabel(contributors[i][0]);
            JLabel positionLabel = new JLabel(contributors[i][1]);
            JLabel uniLabel = new JLabel(contributors[i][2]);

            
            nameLabel.setFont(new Font("Arial", Font.BOLD, 16));
            nameLabel.setForeground(Color.BLACK); // Set name color to black
            positionLabel.setFont(new Font("Arial", Font.PLAIN, 14));
            positionLabel.setForeground(Color.BLACK); // Set position color to black
            uniLabel.setFont(new Font("Arial", Font.PLAIN, 14));
            uniLabel.setForeground(Color.BLACK); // Set university color to black

            
            nameLabel.setBounds(50, yPosition, 500, 30); 
            positionLabel.setBounds(50, yPosition + 30, 500, 30); 
            uniLabel.setBounds(50, yPosition + 60, 500, 30); 

            
            panel.add(nameLabel);
            panel.add(positionLabel);
            panel.add(uniLabel);

            
            yPosition += 100; 
        }

        
        this.add(panel);
        this.setVisible(true); 
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Contributors());
    }
}