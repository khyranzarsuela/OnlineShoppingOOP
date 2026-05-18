import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Buy extends JFrame implements ActionListener {

    
    JTextArea txtRef;
    JComboBox paymethod;
    JButton checkout, btnHomepage;
    JLabel lbl;
    int shipping = 30;
    

    Buy(String lblS, int quantity, int price ){

        setTitle("BuyNow");
        setSize(850,850);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);



        txtRef = new JTextArea();
        txtRef.setBounds(100, 100 , 450, 300);
        txtRef.setEditable(false);
        add(txtRef);

        lbl = new JLabel("Payment Method");
        lbl.setBounds(100, 410, 100, 40);
        add(lbl);


         String [] flip  = {"Cash On Delivery", "O-pay", "Maribank", "GCash", "VISA"};

         paymethod = new JComboBox<>(flip);
         paymethod.setBounds(100, 460, 100, 30);
         add(paymethod);

         checkout = new JButton("Checkout");
         checkout.setBounds(220, 460, 90, 25);
         checkout.addActionListener(this);
         add(checkout);

         

       
       int total = (quantity*price + shipping);
        txtRef.setText(lblS + "\n" +
                        "Price: " + price + " x " + quantity + "\n\n" +
                        "Payment DeTails\n" +
                        "Merchandise Subtotal                  " + (quantity * price) + "\n" +
                        "Shipping Subtotal                        " +  shipping + "\n" +  
                        "Shipping Discount Subtotal        0" + "\n" +
                        "Total Payment                            ₱" + total 
        );
                     


        


       



    

        
    }

    @Override
    public void actionPerformed(ActionEvent e) {


       if(e.getSource() == checkout){
            JOptionPane.showMessageDialog(null, "Thank you for Buying!!!");

            dispose();

             Home h = new Home();
             h.setVisible(true);

        }
        
    }
}