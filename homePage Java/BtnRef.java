import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class BtnRef extends JFrame implements ActionListener {

    
    JTextArea txtRef;
    JComboBox paymethod;
    JButton checkout, btnHomepage;
    JLabel lbl;

    BtnRef(int num1){

        setTitle("BuyNow");
        setSize(1240,1240);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);



        txtRef = new JTextArea();
        txtRef.setBounds(100, 200 , 350, 200);
        txtRef.setEditable(false);
        add(txtRef);

         lbl = new JLabel();
        lbl.setBounds(100, 420, 50, 30);
        add(lbl);


         String [] flip  = {"Cash On Delivery", "O-pay", "Maribank", "GCash", "VISA"};

         paymethod = new JComboBox<>(flip);
         paymethod.setBounds(100, 460, 100, 30);
         add(paymethod);

         checkout = new JButton("Checkout");
         checkout.setBounds(230, 460, 90, 25);
         checkout.addActionListener(this);
         add(checkout);

         btnHomepage = new JButton("Home");
        btnHomepage.setBounds(600, 750  , 100, 30);
        btnHomepage.addActionListener(this);
        add(btnHomepage);

       


         

       

    


       if(num1 > 0){
        txtRef.setText("Refridgerator\n" +
                        "Price: 60   x" + num1 + "\n\n" +
                        "Payment DeTails\n" +
                        "Merchandise Subtotal     90\n" +
                        "Shipping Subtotal     30\n" + 
                        "Shipping Discount Subtotal     0\n" +
                        "Total Payment     90\n"
        );
                     


        


       



    }

        
    }

    @Override
    public void actionPerformed(ActionEvent e) {


        if(e.getSource()==btnHomepage){
           dispose();

        Home h = new Home();
        h.setVisible(true);


      }if(e.getSource() == checkout){
            JOptionPane.showMessageDialog(null, "Thank you for Buying!!!");

        }
        
    }
}