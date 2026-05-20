
import javax.swing.*;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
public class Clothes extends JFrame implements ActionListener {

public JLabel lbl1, lbl2, lbl3,lblItem, lbl1Price, lbl2PRice, lbl3Price, lbl1Q, lbl2Q, lbl3Q,lblPeso,lblPeso2,lblPeso3;
private JButton btnHomepage, btnadd1, btnminus1, btnadd2, btnminus2, btnadd3,btnminus3,btnC,btn1,btnAddCart,btn3,btn2;
public int num1 = 0;
public int num2 = 0;
public int num3 = 0;
public JLabel name;


Clothes(){
    setSize(1240,1240);
    setLayout(null);    
    setDefaultCloseOperation(EXIT_ON_CLOSE);

    

    lblItem = new JLabel("Items: ");
    lblItem.setBounds(50, 50, 100, 20);
    lblItem.setFont(new Font("Arial", Font.BOLD, 20));
    add(lblItem );

    lblPeso = new JLabel("₱");
    lblPeso.setBounds(50, 130, 10, 20);
    add(lblPeso);

    lblPeso2 = new JLabel("₱");
    lblPeso2.setBounds(50, 390, 10, 20);
    add(lblPeso2);

    lblPeso3 = new JLabel("₱");
    lblPeso3.setBounds(50, 260, 10, 20);
    add(lblPeso3);


    //---------------------------------------------------------------------
    lbl1 = new JLabel("LINEN CROPTOP SHIRT SET Sleeveless MIX KOREAN STYLE SUPER WIDE-TUBE HIGH-WAIST TROUSERS");
    lbl1.setBounds(50, 100, 600, 20);
    lbl1.setFont(new Font("Arial", Font.BOLD, 15));
    add(lbl1 );

    lbl1Price = new JLabel("600");
    lbl1Price.setBounds(60, 130, 100, 20);
    add(lbl1Price );

    lbl1Q = new JLabel("Quantity " + 0);
    lbl1Q.setBounds(50, 150, 100, 20);
    add(lbl1Q );

    btnadd1 = new JButton(" + ");
    btnadd1.setBounds(190, 150, 60, 20);
    btnadd1.setBackground(new Color(255,191,0));
    btnadd1.addActionListener(this);
    add(btnadd1 );

    btnminus1 = new JButton(" - ");
    btnminus1.setBounds(260, 150, 60, 20);
    btnminus1.setBackground(new Color(255,191,0));
    btnminus1.addActionListener(this);
    add(btnminus1 );


    btn1 = new JButton("Buy Now");
    btn1.setBounds(330, 150  , 90, 20);
    btn1.setBackground(new Color(255,191,0));
    btn1.addActionListener(this);
    add(btn1);


    //---------------------------------------------------

    lbl3 = new JLabel("Men's Long-Sleeved Linen Clothing Set for Cafe Includes Ruffled Linen Shirt");
    lbl3.setBounds(50, 240, 600, 20);
    lbl3.setFont(new Font("Arial", Font.BOLD, 15));
    add(lbl3 );

    lbl3Price = new JLabel("570");
    lbl3Price.setBounds(60, 260, 100, 20);
    add(lbl3Price );


    lbl3Q = new JLabel("Quantity " + 0);
    lbl3Q.setBounds(50, 280, 100, 20);
    add(lbl3Q );

    btnadd3 = new JButton(" + ");
    btnadd3.setBounds(190, 280, 60, 20);
    btnadd3.setBackground(new Color(255,191,0));
    btnadd3.addActionListener(this);
    add(btnadd3 );

    btnminus3 = new JButton(" - ");
    btnminus3.setBounds(260, 280, 60, 20);
    btnminus3.setBackground(new Color(255,191,0));
    btnminus3.addActionListener(this);
    add(btnminus3 );

    btn3 = new JButton("Buy Now");
    btn3.setBounds(330, 280  , 90, 20);
    btn3.setBackground(new Color(255,191,0));
    btn3.addActionListener(this);
    add(btn3);


    

//----------------------------------------------------------------------

    lbl2 = new JLabel("Palermo Top -- Ocha Wear | Trendy Halter Top | Elegant Top");
    lbl2.setBounds(50, 370, 600, 20);
    lbl2.setFont(new Font("Arial", Font.BOLD, 15));
    add(lbl2 );


    lbl2PRice = new JLabel("350");
    lbl2PRice.setBounds(60, 390, 100, 20);
    add(lbl2PRice );

    lbl2Q = new JLabel("Quantity " + 0);
    lbl2Q.setBounds(50, 410, 100, 20);
    add(lbl2Q );

    btnadd2 = new JButton(" + ");
    btnadd2.setBounds(190, 410, 60, 20);
    btnadd2.setBackground(new Color(255,191,0));
    btnadd2.addActionListener(this);
    add(btnadd2 );

    btnminus2 = new JButton(" - ");
    btnminus2.setBounds(260, 410, 60, 20);
    btnminus2.setBackground(new Color(255,191,0));
    btnminus2.addActionListener(this);
    add(btnminus2 );


    btn2 = new JButton("Buy Now");
    btn2.setBounds(330, 410  , 90, 20);
    btn2.setBackground(new Color(255,191,0));
    btn2.addActionListener(this);
    add(btn2);

//---------------------------------------------------------------------------



    btnHomepage = new JButton("Home");
    btnHomepage.setBounds(600, 750  , 100, 30);
    btnHomepage.setBackground(new Color(255,191,0));
    btnHomepage.addActionListener(this);
    add(btnHomepage);

    

    btnC = new JButton("Clear All");
    btnC.setBounds(500, 750  , 100, 30);
    btnC.setBackground(new Color(255,191,0));
    btnC.addActionListener(this);
    add(btnC);

    btnAddCart = new JButton("Add to Cart");
    btnAddCart.setBounds(400, 750  , 100, 30);
    btnAddCart.setBackground(new Color(255,191,0));
    btnAddCart.addActionListener(this);
    add(btnAddCart);




    

 


}
@Override
public void actionPerformed(ActionEvent e) {
     if(e.getSource()==btnHomepage){
           dispose();

        Home h = new Home();
        h.setVisible(true);


    }if(e.getSource()==btnadd1){
        num1++;
        lbl1Q.setText("Quantity: " + num1);


    } else if(e.getSource()==btnminus1){
        if(num1 > 0){
            num1--;
            lbl1Q.setText("Quantity: " + num1);
        }

//----------------------------------------------------------

    } if(e.getSource()==btnadd2){
        num2++;
        lbl2Q.setText("Quantity: " + num2);


    }else if(e.getSource()==btnminus2){
        if(num2 > 0){
            num2--;
            lbl2Q.setText("Quantity: " + num2);
        }

//---------------------------------------------------------------

    }  if(e.getSource()==btnadd3){
        num3++;
        lbl3Q.setText("Quantity: " + num3);


    } else if(e.getSource()==btnminus3){
        if(num3 > 0){
            num3--;
            lbl3Q.setText("Quantity: " + num3);
        }
    }




//-----------------------------------------------------------

    if(e.getSource() == btnC){

        
         num1 = 0;
         num2 = 0;
         num3 = 0;

        lbl1Q.setText("Quantity: " + num1);
        lbl2Q.setText("Quantity: " + num2);
        lbl3Q.setText("Quantity: " + num3);



        
    } if (e.getSource() == btn1){
   dispose();

   if(num1 > 0){

     String lbl = lbl1Price.getText();
    int price = Integer.parseInt(lbl);

    String lblS = lbl1.getText();
    Buy b = new Buy(lblS,num1,price);
        b.setVisible(true);

   }



} if(e.getSource() == btn3){
    


if(num3 > 0){
dispose();
        String lbl = lbl3Price.getText();
        int price = Integer.parseInt(lbl);

        String lblS = lbl3.getText();
        Buy b = new Buy(lblS,num3,price);
        b.setVisible(true);

   }

} if(e.getSource() == btn2){

    if(num2 > 0){
        dispose();
        String lbl = lbl2PRice.getText();
        int price = Integer.parseInt(lbl);

        String lblS = lbl2.getText();
        Buy b = new Buy(lblS,num2,price);
        b.setVisible(true);


    }


    
}







}
}


    