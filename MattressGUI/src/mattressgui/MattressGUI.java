import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class MattressGUI extends JFrame {
    private JTextField txtCustomerName, txtPrice;
    private JComboBox<String> productCombo;
    private JButton btnProcess;

    public MattressGUI() {
        setTitle("Product App");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);

        
        JMenuBar menuBar = new JMenuBar();
        
        JMenu fileMenu = new JMenu("File");
        JMenuItem exitItem = new JMenuItem("Exit");
        exitItem.addActionListener(e -> System.exit(0));
        fileMenu.add(exitItem);
        
        JMenu editMenu = new JMenu("Edit");
        JMenuItem processItem = new JMenuItem("Process");
        JMenuItem clearItem = new JMenuItem("Clear");
        editMenu.add(processItem);
        editMenu.add(clearItem);
        
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        setJMenuBar(menuBar);

        
  JLabel lblName = new JLabel("Customer Name:");
        lblName.setBounds(30, 30, 120, 25);
        add(lblName);

        txtCustomerName = new JTextField();
        txtCustomerName.setBounds(150, 30, 200, 25);
        add(txtCustomerName);

JLabel lblProduct = new JLabel("Select Product:");
        lblProduct.setBounds(30, 80, 120, 25);
        add(lblProduct);

 String[] products = {"Cozy Nights Monarch", "Restonic Barbados", "Sealy Phuket"};
        productCombo = new JComboBox<>(products);
        productCombo.setBounds(150, 80, 200, 25);
        add(productCombo);

  JLabel lblPrice = new JLabel("Enter Price:");
    lblPrice.setBounds(30, 130, 120, 25);
   add(lblPrice);

        txtPrice = new JTextField();
        txtPrice.setBounds(150, 130, 200, 25);
        add(txtPrice);

  btnProcess = new JButton("PROCESS");
        btnProcess.setBounds(150, 180, 200, 30);
        add(btnProcess);


 btnProcess.addActionListener(e -> processSale());
        processItem.addActionListener(e -> processSale()); 
        
        
 clearItem.addActionListener(e -> {
            txtCustomerName.setText("");
            txtPrice.setText("");
            productCombo.setSelectedIndex(0); 
        });
    }

    
    private void processSale() {
        try {
 String customer = txtCustomerName.getText();
            String product = (String) productCombo.getSelectedItem();
            double price = Double.parseDouble(txtPrice.getText());
ProductCalculations calc = new ProductCalculations(price);
            double vat = calc.GetVat();
            double commission = calc.GetCommission();
            double total = calc.GetTotal();

            
String message = "Customer Name: " + customer + "\n" +
 "VAT: R " + vat + "\n" +
 "COMMISSION: R " + commission + "\n" +
 "TOTAL: R " + total;

           
JOptionPane.showMessageDialog(this, message, "Message", JOptionPane.INFORMATION_MESSAGE);

            
            saveToFile(message);

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter a valid price.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void saveToFile(String data) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("data.txt"))) {
            writer.write("DATA LOG\n");
            writer.write("************************\n");
            writer.write(data + "\n");
            writer.write("************************\n");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error saving data.txt: " + ex.getMessage());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MattressGUI().setVisible(true));
    }
}