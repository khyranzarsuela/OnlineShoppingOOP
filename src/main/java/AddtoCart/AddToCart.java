package AddtoCart;
import java.awt.Color;
import static java.awt.Color.*;
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
public class AddToCart extends JPanel implements ActionListener{
    
    private JButton checkOut, quan,min,quan2,min2,delete;
    private JPanel order1, order2, pic,pic2,check,checkPanel,header,leftPanel;
    public JLabel title, desc,desc2,quantity,prize,prize2,quantity2,totallb,totaltxt,lb,lblb,overall,oprice;
   private int count1 = 0;
private int count2 = 0;
private JLabel emptyLabel;
public double total,total1,total2;
    
     public AddToCart(){
        setSize(1000,500);
        setLayout(null);
        
        title = new JLabel("Your Items");
        title.setBounds(20,10,150,30);
        add(title);
        
        header = new JPanel();
        header.setBounds(0,0,1000,50);
        header.setBackground(white);
        add(header);
        
        emptyLabel = new JLabel("No products in cart");
        emptyLabel.setBounds(200, 200, 200, 30);
        add(emptyLabel);
        
         desc = new JLabel("Bag ni Luffy");
        desc.setBounds(100,60,150,30);
       add(desc);
        
        pic = new JPanel();
        pic.setBounds(10,70,60,60);
        pic.setBackground(Color.red);
        add(pic);
        
        min = new JButton("-");
        min.setBounds(100,90,50,30);
        add(min);
        
        quantity = new JLabel("0");
        quantity.setBounds(160,100,20,10);
        add(quantity);
        
          quan = new JButton("+");
        quan.setBounds(180,90,50,30);
        add(quan);
        
          desc2 = new JLabel("Luffy's Devil Fruit Original");
        desc2.setBounds(100,135,200,100);
        add(desc2);
        
        pic2 = new JPanel();
        pic2.setBounds(10,180,60,60);
        pic2.setBackground(Color.red);
        add(pic2);
        
          min2 = new JButton("-");
        min2.setBounds(100,200,50,30);
        add(min2);
        
        quantity2 = new JLabel("0");
        quantity2.setBounds(160,210,20,10);
        add(quantity2);
        
          quan2 = new JButton("+");
        quan2.setBounds(180,200,50,30);
        add(quan2);
        
        prize = new JLabel("P 1,499");
        prize.setBounds(500,30,100,100);
        add(prize);
        
          prize2 = new JLabel("P 25,000");
        prize2.setBounds(500,140,100,100);
        add(prize2);
        
        order1 = new JPanel();
        order1.setBounds(0,50,600,100);
        order1.setBackground(Color.decode("#E0E0E0"));
        order1.setBorder(BorderFactory.createLineBorder(Color.black,2,true));
        add(order1);
        
        order2 = new JPanel();
        order2.setBounds(0,160,600,100);
        order2.setBackground(Color.decode("#E0E0E0"));
        order2.setBorder(BorderFactory.createLineBorder(Color.black,2,true));
        add(order2);
       
        totallb = new JLabel("Total of Items:");
        totallb.setBounds(620,60,150,100);
        totallb.setForeground(white);
        add(totallb);
        
        lb = new JLabel("Discounted Voucher:");
        lb.setForeground(white);
        lb.setBounds(620,80,150,100);
        add(lb);
        
          totaltxt = new JLabel("0");
        totaltxt.setBounds(900,60,100,100);
        totaltxt.setForeground(white);
        add(totaltxt);
        
         lblb = new JLabel("10%");
        lblb.setBounds(900,80,100,100);
        lblb.setForeground(white);
        add(lblb);
        
          overall = new JLabel("Total");
        overall.setBounds(620,325,100,100);
        overall.setForeground(white);
        add(overall);
        
          oprice = new JLabel("0");
        oprice.setBounds(900,325,100,100);
        oprice.setForeground(white);
        add(oprice);
        
          checkOut = new JButton("Checkout");
        checkOut.setBounds(800,420,170,30);
        checkOut.setBackground(white);
        checkOut.setForeground(black);
        add(checkOut);
        
         delete = new JButton("Delete");
        delete.setBounds(625,420,170,30);
         delete.setBackground(red);
        delete.setForeground(white);
        add(delete);
        
        
        leftPanel = new JPanel();
        leftPanel.setBounds(0,50,610,450);
        leftPanel.setBackground(white);
        add(leftPanel);
        
        checkPanel = new JPanel();
        checkPanel.setBounds(610,350,450,150);
        checkPanel.setBackground(Color.decode("#1A585B"));
        add(checkPanel);
       
      
        check = new JPanel();
        check.setBounds(610,50,400,450);
        check.setBackground(Color.decode("#23777B"));
        add(check);
        
        
        quan.addActionListener(this);
         quan2.addActionListener(this);
        min.addActionListener(this);
         min2.addActionListener(this);
        checkOut.addActionListener(this);
        delete.addActionListener(this);
        
        order1.setVisible(false);
    order2.setVisible(false);
     desc.setVisible(false);
      pic.setVisible(false);
       min.setVisible(false);
        quan.setVisible(false);
         quantity.setVisible(false);
         prize.setVisible(false);
                 
         desc2.setVisible(false);
      pic2.setVisible(false);
       min2.setVisible(false);
        quan2.setVisible(false);
         quantity2.setVisible(false);
          prize2.setVisible(false);
    }
    
    
    public void addItem(String productName) {
       
    if (productName.equals("Bag ni Luffy")) {
        count1++;
        quantity.setText("" + count1);
         updateCartVisibility();
        
    } 
    else if (productName.equals("Luffy's Devil Fruit Original")) {
        count2++;
        quantity2.setText("" + count2);
         updateCartVisibility();
    }


    double product1 = 1499;
    double product2 = 25000;
    double dis = 0.90;

     total1 = count1 * product1;
     total2 = count2 * product2;
     total = total1 + total2;
    double distotal = total * dis;

    totaltxt.setText("" + total);
    oprice.setText("" + distotal);
}
    public void updateCartVisibility() {

    if (count1 == 0 && count2 == 0) {
        emptyLabel.setVisible(true);

        order1.setVisible(false);
        order2.setVisible(false);
          desc.setVisible(false);
      pic.setVisible(false);
       min.setVisible(false);
        quan.setVisible(false);
         quantity.setVisible(false);
         prize.setVisible(false);
                 
         desc2.setVisible(false);
      pic2.setVisible(false);
       min2.setVisible(false);
        quan2.setVisible(false);
         quantity2.setVisible(false);
          prize2.setVisible(false);
    } else {
        emptyLabel.setVisible(false);

        order1.setVisible(count1 > 0);
        order2.setVisible(count2 > 0);
        
          desc.setVisible(count1 > 0);
      pic.setVisible(count1 > 0);
       min.setVisible(count1 > 0);
        quan.setVisible(count1 > 0);
         quantity.setVisible(count1 > 0);
         prize.setVisible(count1 > 0);
         
            desc2.setVisible(count2 > 0);
      pic2.setVisible(count2 > 0);
       min2.setVisible(count2 > 0);
        quan2.setVisible(count2 > 0);
         quantity2.setVisible(count2 > 0);
          prize2.setVisible(count2 > 0);
    }
}
  
      @Override
        public void actionPerformed(ActionEvent e) {
           double product1 = 1499;
        double product2 = 25000;
        double dis = 0.90;

        if(e.getSource() == quan){
            count1++;
            quantity.setText("" + count1);
        }
        else if(e.getSource() == min){
            if(count1 > 0) count1--;
            quantity.setText("" + count1);
        }
        else if(e.getSource() == quan2){
            count2++;
            quantity2.setText("" + count2);
        }
        else if(e.getSource() == min2){
            if(count2 > 0) count2--;
            quantity2.setText("" + count2);
        }
        else if (e.getSource() == delete){
               count1 = 0;
               count2 = 0;
                quantity.setText("" + count1);
                quantity2.setText("" + count2);
                 totaltxt.setText("" + count2);
                  oprice.setText("" + count2);

        }
        else if (e.getSource() == checkOut){
            if(count1 > 0 || count2 > 0){
            checkout c = new checkout();
            c.setVisible(true);
           c.totalx(total);
            }
            else{
                JOptionPane.showMessageDialog(null,"Please checkout first");
            }

        }
        updateCartVisibility();

        total1 = count1 * product1;
        total2 = count2 * product2;
       total = total1 + total2;
       double distotal = total * dis;

       totaltxt.setText("" + total);
       oprice.setText("" + distotal);
       }     

}
    
