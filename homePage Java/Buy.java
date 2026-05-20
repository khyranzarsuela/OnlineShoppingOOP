import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Buy extends JFrame implements ActionListener {

    
    JTextArea txtRef;
    JComboBox paymethod;
    JButton checkout, btnHomepage;
    JLabel lbl,title;
    JPanel color;
    int shipping = 30;
    int total;
    

    Buy(String lblS, int quantity, int price ){

        setTitle("BuyNow");
        setSize(850,850);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        color = new JPanel();
        color.setLayout(null);
        color.setBackground(new Color(255,191,0)); 
        color.setBounds(0, 0, 1700, 150);
        add(color);

        title = new JLabel("ShopBee");
        title.setBounds(70, 80, 400, 30);
        title.setForeground(Color.BLACK);
        title.setFont(new Font("Arial", Font.BOLD, 35));
        color.add(title);



        txtRef = new JTextArea();
        txtRef.setBounds(100, 300 , 450, 300);
        txtRef.setEditable(false);
        add(txtRef);

        lbl = new JLabel("Payment Method");
        lbl.setBounds(100, 610, 100, 40);
        add(lbl);


         String [] flip  = {"Cash On Delivery",  "GCash"};

         paymethod = new JComboBox<>(flip);
         paymethod.setBounds(100, 660, 100, 30);
         add(paymethod);

         checkout = new JButton("Checkout");
         checkout.setBounds(220, 660, 90, 25);
         checkout.setBackground(new Color(255,191,0));
         checkout.addActionListener(this);
         add(checkout);

         

       
       total = (quantity*price + shipping);
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

            String pm = paymethod.getSelectedItem().toString();

            if(pm.equals("GCash")){

               


                

                String Gnumber = JOptionPane.showInputDialog(null,"Enter your GCash Number");

                 try{

                    int gpay = Integer.parseInt(Gnumber);



                } catch(NumberFormatException ex){

                    JOptionPane.showMessageDialog(null,"Please enter numbers only!");


                }


                try{
                String payment = JOptionPane.showInputDialog(null,"Total Payment: " + total + "\nEnter your GCash payment here");

                

                if(payment != null){
                    
                    int pay = Integer.parseInt(payment);

                    if(pay > total){

                    JOptionPane.showMessageDialog(null, "Enter Exact amount Only!!");

                

                } else if (pay == total){

                    JOptionPane.showMessageDialog(null, "Payment Succesful\nThankyou For Buying!!");

                    dispose();

                    Home h = new Home();
                    h.setVisible(true);


            
                }else{

                JOptionPane.showMessageDialog(null, "Insufficient  Payment", "Warning", JOptionPane.WARNING_MESSAGE);
            
            }
                }


                 }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null,"Please enter numbers only!");
                }

                

        } else {

        JOptionPane.showMessageDialog(null, "Thankyou For Buying!!");

                    dispose();

                    Home h = new Home();
                    h.setVisible(true);


    }
        

}
}

}

