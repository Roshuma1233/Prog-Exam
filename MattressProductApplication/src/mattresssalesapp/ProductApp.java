package mattresssalesapp;

import java.awt.GridLayout;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class ProductApp extends JFrame {

    private JTextField txtCustomer;
    private JTextField txtPrice;
    private JComboBox<String> cmbProduct;
    private JButton btnProcess;

    public ProductApp() {

        setTitle("Product App");
        setSize(550, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create form panel
        JPanel panel = new JPanel(new GridLayout(4, 2, 10, 20));

        panel.setBorder(
            BorderFactory.createEmptyBorder(30, 30, 30, 30)
        );

        // Customer Name
        panel.add(new JLabel("Customer Name:"));

        txtCustomer = new JTextField();
        panel.add(txtCustomer);

        // Product selection
        panel.add(new JLabel("Select Product:"));

        String[] products = {
            "Cozy Nights Monarch",
            "Restonic Barbados",
            "Sealy Phuket"
        };

        cmbProduct = new JComboBox<>(products);
        panel.add(cmbProduct);

        // Price
        panel.add(new JLabel("Enter Price:"));

        txtPrice = new JTextField();
        panel.add(txtPrice);

        // Process button
        panel.add(new JLabel(""));

        btnProcess = new JButton("PROCESS");
        panel.add(btnProcess);

        // Add panel to window
        add(panel);
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {

            ProductApp app = new ProductApp();

            app.setVisible(true);
        });
    }
}