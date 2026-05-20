package AddtoCart;


import AddtoCart.AddToCart;
import java.awt.Color;
import static java.awt.Color.white;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Khyran Zarsuela
 */
public class checkout extends JFrame implements ActionListener{
    private JLabel Ordersum,Subto,op,pd,ss,total,paymentm,cod,Address,cashG;
    private JLabel ns,nop,npd,nss,ntotal;
    private JButton addC,placeO,address;
    private JPanel orderp, paymentp,header;
    private JRadioButton option1,option2,option3;
    private JPanel codPanel, cardPanel, gcashPanel;
    private JTextField addtxt;
     AddToCart c = new AddToCart();
   
    checkout(){   
    //    addtocart = new AddToCart();
    setSize(1000,500);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   
        
        Ordersum = new JLabel("OrderSummary");
        Ordersum.setBounds(40,10,100,20);
        add(Ordersum);
        
        header = new JPanel();
        header.setBounds(0,0,1000,40);
        header.setBackground(white);
        add(header);
        
        Subto = new JLabel("Subtotal"); 
        Subto.setBounds(40,50,100,20);
        Subto.setForeground(white);
        add(Subto);
        
         op = new JLabel("Original Price"); 
        op.setBounds(40,80,100,20);
         op.setForeground(white);
        add(op);
        
        pd = new JLabel("Price Discount"); 
        pd.setBounds(40,110,100,20);
        pd.setForeground(white);
        add(pd);
        
        ss = new JLabel("Shipping Subtotal"); 
        ss.setBounds(40,140,150,20);
        ss.setForeground(white);
        add(ss);
        
        total = new JLabel("Total"); 
        total.setBounds(40,170,100,20);
        total.setForeground(white);
        add(total);
        
        
          ns = new JLabel("0"); 
        ns.setBounds(300,50,500,20);
        ns.setForeground(white);
        add(ns);
        
         nop = new JLabel("0"); 
        nop.setBounds(300,80,100,20);
        nop.setForeground(white);
        add(nop);
        
       npd  = new JLabel("0"); 
        npd.setBounds(300,110,100,20);
         npd.setForeground(white);
        add(npd);
        
        nss = new JLabel("0"); 
        nss.setBounds(300,140,150,20);
         nss.setForeground(white);
        add(nss);
        
        ntotal = new JLabel("0"); 
        ntotal.setBounds(300,170,100,20);
        ntotal.setForeground(white);
        add(ntotal);
        
          orderp = new JPanel();
        orderp.setBounds(0,40,500,350);
        orderp.setBackground(Color.decode("#23777B"));
        add(orderp);
        
        paymentm = new JLabel("Payment Method");
         paymentm.setBounds(650,10,100,20);
        add(paymentm);
        
          cod = new JLabel("Cash on Delivery (COD)"); 
        cod.setBounds(650,50,150,20);
        add(cod);
        
          addC = new JButton("+ Add Credit/Debit Card"); 
        addC.setBounds(650,80,200,25);
     //   addC.setEnabled(false);
        add(addC);
        
        cashG = new JLabel("GCash"); 
        cashG.setBounds(650,110,100,20);
        add(cashG);
        
        Address = new JLabel("Address"); 
        Address.setBounds(650,140,100,20);
        add(Address);
        
          address = new JButton("+ Add Address"); 
        address.setBounds(650,170,200,25);
        add(address);
        
        addtxt = new JTextField("");
        addtxt.setBounds(650,200,300,20);
        addtxt.setVisible(false);
        add(addtxt);
        
        
        option1 = new JRadioButton();
         option1.setBounds(890,50,20,20);
        add(option1);
        
         option2 = new JRadioButton();
        option2.setBounds(890,80,20,25);
        add(option2);
        
        option3 = new JRadioButton();
        option3.setBounds(890,110,20,20);
        add(option3);
        
        placeO = new JButton("Place Order");
         placeO.setBounds(700,400,100,30);
        add(placeO);
        
         
        codPanel = new JPanel();
        codPanel.setBounds(650, 300, 250, 100);
        codPanel.add(new JLabel("Pay when item arrives"));
        add(codPanel);

      
        cardPanel = new JPanel();
        cardPanel.setBounds(650, 300, 250, 100);
        cardPanel.add(new JLabel("Enter Card Details"));
        cardPanel.add(new JTextField(10));
        add(cardPanel);

       
        gcashPanel = new JPanel();
        gcashPanel.setBounds(650, 300, 250, 100);
        gcashPanel.add(new JLabel("Enter GCash Number"));
        gcashPanel.add(new JTextField(10));
        add(gcashPanel);
        
          paymentp = new JPanel();
        paymentp.setBounds(500,40,500,350);
        paymentp.setBackground(Color.white);
        add(paymentp);
        
        
        
        
        ButtonGroup paymentGroup = new ButtonGroup();
        paymentGroup.add(option1);
        paymentGroup.add(option2);
        paymentGroup.add(option3);
        
    
       
     option2.setEnabled(false);
       addC.addActionListener(a -> {
            option2.setEnabled(true);
});
    

        
        codPanel.setVisible(false);
        cardPanel.setVisible(false);
        gcashPanel.setVisible(false);
        
        option1.addActionListener(e -> updatePaymentUI());
        option2.addActionListener(e -> updatePaymentUI());
        option3.addActionListener(e -> updatePaymentUI());
        
        address.addActionListener(this);
        placeO.addActionListener(this);
    }
    
    public void totalx(double subtotal){
    double discount = subtotal * 0.10;
    double shipping = 100;
    double finalTotal = subtotal - discount + shipping;

    ns.setText("P " + subtotal);        
    nop.setText("P " + subtotal);       
    npd.setText("P -" + discount);      
    nss.setText("P " + shipping);       
    ntotal.setText("P " + finalTotal);  
}
    public String getSelectedPayment(){
    if(option1.isSelected()){
        return "Cash on Delivery";
    }
    else if(option2.isSelected()){
        return "Card";
        
    }
    else if(option3.isSelected()){
        return "GCash";
    }
    else{
        return "None";
    }
}
    public String getAddress(){
     String a = addtxt.getText();
     return a;
    }
    public void updatePaymentUI(){

    codPanel.setVisible(option1.isSelected());
    cardPanel.setVisible(option2.isSelected());
    gcashPanel.setVisible(option3.isSelected());

}
    

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource() == address){
      addtxt.setVisible(true);
       }
       else if(e.getSource() == placeO){
         String payment = getSelectedPayment();
         String location = getAddress();
         
          if(payment.equals("None")){
        JOptionPane.showMessageDialog(null, "Please select a payment method");   
        }   
          else {
          JOptionPane.showMessageDialog(null, "Thank You for Shopping!!");
          dispose();
          }
       } 
    }
}


