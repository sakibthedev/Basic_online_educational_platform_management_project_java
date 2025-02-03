package Frame;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class InventoryPage extends JFrame {

    private static final String FILE_PATH = ".\\Datas\\coursedata.txt";
    private String dpName = "User   123";

    public InventoryPage() {
        setTitle("Inventory Page");
        setSize(1380, 720);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        writeInitialCourseData();

        JPanel containerPanel = new JPanel(new BorderLayout());

        JLabel headerLabel = new JLabel("Offered Courses", SwingConstants.CENTER);
        headerLabel.setFont(new Font("Arial", Font.BOLD, 24));
        headerLabel.setForeground(new Color(45, 69, 255));
        containerPanel.add(headerLabel, BorderLayout.NORTH);

        JPanel mainPanel = new JPanel(new GridLayout(0, 4, 20, 20));

        List<String[]> products = readProductsFromFile();

        for (String[] product : products) {
            JPanel productPanel = new JPanel(new BorderLayout());

            String imagePath = product[3].replace("\"", ""); // Remove any quotes if present
            ImageIcon icon = new ImageIcon(imagePath);
            
            // Debugging output
            File imgFile = new File(imagePath);
            if (!imgFile.exists()) {
                System.out.println("Image not found at: " + imagePath);
                // Set a default image if the specified image cannot be found
                icon = new ImageIcon("path/to/default/image.png"); // Replace with your default image path
            }

            Image img = icon.getImage();
            int height = 150;
            int width = (int) (img.getWidth(null) * ((double) height / img.getHeight(null)));
            img = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);

            JLabel imageLabel = new JLabel(new ImageIcon(img));

            JLabel idAndNameLabel = new JLabel("ID: " + product[0] + " - " + product[1], SwingConstants.CENTER);
            idAndNameLabel.setFont(new Font("Arial", Font.BOLD, 14));

            JLabel amountLabel = new JLabel("Amount: " + product[2], SwingConstants.CENTER);

            productPanel.add(imageLabel, BorderLayout.CENTER);
            productPanel.add(idAndNameLabel, BorderLayout.NORTH);
            productPanel.add(amountLabel, BorderLayout.SOUTH);
            productPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));

            mainPanel.add(productPanel);
        }

        JScrollPane scrollPane = new JScrollPane(mainPanel);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        containerPanel.add(scrollPane, BorderLayout.CENTER);

        JPanel footerPanel = new JPanel();
        JButton backButton = new JButton("Back");
        backButton.setBackground(Color.RED);
        backButton.setForeground(Color.WHITE);
        backButton.addActionListener(e -> {
            HomePage h1 = new HomePage(dpName);
            h1.setVisible(true);
            this.dispose();
        });

        JButton buyButton = new JButton("Buy");
        buyButton.setBackground(new Color(45, 69, 255));
        buyButton.setForeground(Color.WHITE);
        buyButton.addActionListener(e -> handleBuyAction(products)); // Pass products list to the method

        footerPanel.add(backButton);
        footerPanel.add(buyButton);

        containerPanel.add(footerPanel, BorderLayout.SOUTH);

        containerPanel.setBackground(Color.WHITE);
        add(containerPanel);
    }

    private void handleBuyAction(List<String[]> products) {
        String courseId = JOptionPane.showInputDialog(this, "Enter Course ID:", "Buy Course", JOptionPane.QUESTION_MESSAGE);

        if (courseId != null && !courseId.trim().isEmpty()) {
            for (String[] product : products) {
                if (product[0].equals(courseId)) {
                    String courseName = product[1];
                    String courseAmount = product[2]; // Get the course amount
                    JOptionPane.showMessageDialog(this, "Redirecting to Payment for " + courseName, "Proceeding", JOptionPane.INFORMATION_MESSAGE);
                    new payment(courseName, courseAmount).setVisible(true); 
                    dispose();
                    return;
                }
            }
            JOptionPane.showMessageDialog(this, "Invalid Course ID. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void writeInitialCourseData() {
        File file = new File(FILE_PATH);
        if (!file.exists()) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                writer.write("101,Java,8000/-,C:\\Users\\Lenovo\\OneDrive\\Desktop\\JavaProject\\Image\\Basic Java.png\n");
                writer.write("102,Python,7000/-,C:\\Users\\Lenovo\\OneDrive\\Desktop\\JavaProject\\Image\\python.jpg\n");
                writer.write("103,Photoshop,5000/-,C:\\Users\\Lenovo\\OneDrive\\Desktop\\JavaProject\\Image\\Photoshop.png\n");
                writer.write("104,Integration,8000/-,C:\\Users\\Lenovo\\OneDrive\\Desktop\\JavaProject\\Image\\Integration.png\n");
                writer.write("105,C++,7500/-,C:\\Users\\Lenovo\\OneDrive\\Desktop\\JavaTest\\c++.jpg\n");
                writer.write("106,Data Science,10000/-,C:\\Users\\Lenovo\\OneDrive\\Desktop\\JavaProject\\Image\\data science.png\n");
                writer.write("107,ReactJS,9500/-,C:\\Users\\Lenovo\\OneDrive\\Desktop\\JavaProject\\Image\\reactjs.png\n");
                writer.write("108,Cybersecurity,4300/-,C:\\Users\\Lenovo\\OneDrive\\Desktop\\JavaProject\\Image\\cybersecurity.jpg\n");
                writer.write("109,Machine Learning,8000/-,C:\\Users\\Lenovo\\OneDrive\\Desktop\\JavaProject\\Image\\png-clipart-fourth-industrial-revolution-artificial-intelligence-machine-learning-robot-deceuninck-electric-blue-ai-artificial-intelligence-thumbnail.png\n");
                writer.write("110,Ethical Hacking,2500/-,C:\\Users\\Lenovo\\OneDrive\\Desktop\\JavaProject\\Image\\ethical.png\n");
                writer.write("111,AI,50000/-,C:\\Users\\Lenovo\\OneDrive\\Desktop\\JavaProject\\Image\\ai.jpg\n");
                writer.write("112,Blockchain,21000/-,C:\\Users\\Lenovo\\OneDrive\\Desktop\\JavaProject\\Image\\blockchain-vector-transparent-image-png-image_6560354.png\n");
                writer.write("113,Financing,11000/-,C:\\Users\\Lenovo\\OneDrive\\Desktop\\JavaProject\\Image\\financing.png\n");
                writer.write("IDE,IDE,50000/-,C:\\Users\\Lenovo\\OneDrive\\Desktop\\JavaProject\\Image\\financing.png\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private List<String[]> readProductsFromFile() {
        List<String[]> products = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] productData = line.split(",");
                if (productData.length == 4) {
                    products.add(productData);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return products;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new InventoryPage().setVisible(true));
    }
}