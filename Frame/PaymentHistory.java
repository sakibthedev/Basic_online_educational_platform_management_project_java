package Frame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class PaymentHistory extends JFrame {
    private JPanel panel;
    private JLabel title, totalAmountLabel;
    private JButton back, clearButton, deleteButton; 
    private JTextField courseField, amountField;
    private JList<String> historyList;
    private DefaultListModel<String> listModel;
    private String dpName;
    private static ArrayList<String> paymentHistory = new ArrayList<>();
    private int totalAmount = 0;

    public PaymentHistory(String dpName, ArrayList<String> history) {
        super("Payment History");
        this.setSize(800, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
        this.dpName = dpName;

        
        paymentHistory = history;

        panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.setBackground(Color.LIGHT_GRAY); 

        title = new JLabel("Payment History", SwingConstants.CENTER);
        title.setFont(new Font("Ariel", Font.BOLD, 24));
        panel.add(title, BorderLayout.NORTH);

        
        listModel = new DefaultListModel<>();
        historyList = new JList<>(listModel);
        historyList.setFont(new Font("Monospaced", Font.PLAIN, 16));
        historyList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        updateListModel();

        JScrollPane scrollPane = new JScrollPane(historyList);
        panel.add(scrollPane, BorderLayout.CENTER);

        
        totalAmountLabel = new JLabel("Total Paid: " + totalAmount + "/-");
        totalAmountLabel.setFont(new Font("Ariel", Font.BOLD, 20));

        
        JPanel infoPanel = new JPanel();
        infoPanel.setLayout(new GridLayout(1, 1));
        infoPanel.add(totalAmountLabel);

        panel.add(infoPanel, BorderLayout.EAST); 

        
        courseField = new JTextField(15);
        amountField = new JTextField(15);
        JPanel inputPanel = new JPanel();
        inputPanel.add(new JLabel("Course Name:"));
        inputPanel.add(courseField);
        inputPanel.add(new JLabel("Amount:"));
        inputPanel.add(amountField);
        panel.add(inputPanel, BorderLayout.SOUTH);

       
        back = new JButton("Back");
        back.setFont(new Font("Ariel", Font.BOLD, 16));
        back.setBackground(Color.BLUE); 
        back.setForeground(Color.WHITE); 
        back.addActionListener(e -> {
            new HomePage(dpName).setVisible(true); 
            this.setVisible(false); 
        });

        
        clearButton = new JButton("Clear");
        clearButton.setFont(new Font("Ariel", Font.BOLD, 16));
        clearButton.setBackground(Color.RED); 
        clearButton.setForeground(Color.WHITE); 
        clearButton.addActionListener(e -> {
            paymentHistory.clear(); 
            totalAmount = 0; 
            listModel.clear(); 
            totalAmountLabel.setText("Total Paid: " + totalAmount + "/-"); 
        });

        
        deleteButton = new JButton("Delete");
        deleteButton.setFont(new Font("Ariel", Font.BOLD, 16));
        deleteButton.setBackground(Color.BLUE); 
        deleteButton.setForeground(Color.WHITE); 
        deleteButton.addActionListener(e -> {
            int selectedIndex = historyList.getSelectedIndex();
            if (selectedIndex != -1) {
                paymentHistory.remove(selectedIndex);
                updateListModel();
                totalAmountLabel.setText("Total Paid: " + totalAmount + "/-"); 
            } else {
                JOptionPane.showMessageDialog(this, "Please select a payment to delete.");
            }
        });

        
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());
        buttonPanel.add(back);
        buttonPanel.add(clearButton);
        buttonPanel.add(deleteButton); 
        panel.add(buttonPanel, BorderLayout.SOUTH);

        this.add(panel); 
    }

    public static void addPayment(String courseName, String amount) {
        paymentHistory.add(courseName + " - " + amount);
    }

    public static ArrayList<String> getPaymentHistory() {
        return paymentHistory;
    }

    private void updateListModel() {
        listModel.clear();
        totalAmount = 0; 
        for (String record : paymentHistory) {
            listModel.addElement(record);
            
            String[] parts = record.split(" - ");
            if (parts.length == 2) {
                try {
                    totalAmount += Integer.parseInt(parts[1].replace("/-", ""));
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        
        ArrayList<String> history = new ArrayList<>();
        history.add("Course1");
        history.add("Course2");
        PaymentHistory paymentHistoryFrame = new PaymentHistory("Name", history);
        paymentHistoryFrame.setVisible(true);
    }
}