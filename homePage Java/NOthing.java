import javax.swing.*;
import java.awt.event.*;

public class NOthing extends JFrame implements ActionListener {

    private JLabel lblw;
    private JButton btnHomepage;

    NOthing() {
        setTitle("Nothing Found");
        setSize(1240, 1240); 
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        

        lblw = new JLabel("Nothing Found");
        lblw.setBounds(420, 400, 400, 50); 
        lblw.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 30));
        add(lblw);

        btnHomepage = new JButton("Go back");
        btnHomepage.setBounds(550, 500, 100, 40); 
        btnHomepage.addActionListener(this);
        add(btnHomepage);

        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        dispose();
        if (e.getSource() == btnHomepage) {
            dispose();
            Home h = new Home();
            h.setVisible(true);
        }
    }

    
}