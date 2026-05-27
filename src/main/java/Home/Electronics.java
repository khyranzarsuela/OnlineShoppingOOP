package Home;

import javax.swing.*;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
public class Electronics extends JFrame implements ActionListener {

public JLabel lblRef, lblW, lblM,lblItem, lblrefPrice, lblwPRice, lblmPrice, lblrefQ, lblWQ, lblMQ;
private JButton btnHomepage, btnaddRef, btnminusRef, btnaddW, btnminusW, btnaddM,btnminusM,btnC,btnB,btnAddCart,btnOven,btnWM;
public int num1 = 0;
public int num2 = 0;
public int num3 = 0;
public JLabel name;



Electronics(){
    setSize(1240,1240);
    setLayout(null);    
    setDefaultCloseOperation(EXIT_ON_CLOSE);

    

    lblItem = new JLabel("Items: ");
    lblItem.setBounds(50, 50, 100, 20);
    add(lblItem );


    //---------------------------------------------------------------------
    lblRef = new JLabel("Refridgerator");
    lblRef.setBounds(50, 100, 600, 20);
    lblRef.setFont(new Font("Arial", Font.BOLD, 15));
    add(lblRef );

    lblrefPrice = new JLabel("600");
    lblrefPrice.setBounds(60, 130, 100, 20);
    add(lblrefPrice );

    lblrefQ = new JLabel("Quantity " + 0);
    lblrefQ.setBounds(50, 150, 100, 20);
    add(lblrefQ );

    btnaddRef = new JButton(" + ");
    btnaddRef.setBounds(190, 150, 60, 20);
    btnaddRef.setBackground(new Color(255,191,0));
    btnaddRef.addActionListener(this);
    add(btnaddRef );

    btnminusRef = new JButton(" - ");
    btnminusRef.setBounds(260, 150, 60, 20);
    btnminusRef.setBackground(new Color(255,191,0));
    btnminusRef.addActionListener(this);
    add(btnminusRef );


    btnB = new JButton("Buy Now");
    btnB.setBounds(330, 150  , 90, 20);
    btnB.setBackground(new Color(255,191,0));
    btnB.addActionListener(this);
    add(btnB);


    //---------------------------------------------------

     lblM = new JLabel("Microwave Oven");
    lblM.setBounds(50, 240, 600, 20);
    lblM.setFont(new Font("Arial", Font.BOLD, 15));
    add(lblM );

    lblmPrice = new JLabel("570");
    lblmPrice.setBounds(60, 260, 100, 20);
    add(lblmPrice );


    lblMQ = new JLabel("Quantity " + 0);
    lblMQ.setBounds(50, 280, 100, 20);
    add(lblMQ );

    btnaddM = new JButton(" + ");
    btnaddM.setBounds(190, 280, 60, 20);
    btnaddM.setBackground(new Color(255,191,0));
    btnaddM.addActionListener(this);
    add(btnaddM );

    btnminusM = new JButton(" - ");
    btnminusM.setBounds(260, 280, 60, 20);
    btnminusM.setBackground(new Color(255,191,0));
    btnminusM.addActionListener(this);
    add(btnminusM );

    btnOven = new JButton("Buy Now");
    btnOven.setBounds(330, 280  , 90, 20);
    btnOven.setBackground(new Color(255,191,0));
    btnOven.addActionListener(this);
    add(btnOven);


    

//----------------------------------------------------------------------

   lblW = new JLabel("Washing Machine");
    lblW.setBounds(50, 370, 600, 20);
    lblW.setFont(new Font("Arial", Font.BOLD, 15));
    add(lblW );


    lblwPRice = new JLabel("350");
    lblwPRice.setBounds(60, 390, 100, 20);
    add(lblwPRice );

    lblWQ  = new JLabel("Quantity " + 0);
    lblWQ .setBounds(50, 410, 100, 20);
    add(lblWQ );

    btnaddW = new JButton(" + ");
    btnaddW.setBounds(190, 410, 60, 20);
    btnaddW.setBackground(new Color(255,191,0));
    btnaddW.addActionListener(this);
    add(btnaddW );

    btnminusW = new JButton(" - ");
    btnminusW.setBounds(260, 410, 60, 20);
    btnminusW.setBackground(new Color(255,191,0));
    btnminusW.addActionListener(this);
    add(btnminusW );


    btnWM = new JButton("Buy Now");
    btnWM.setBounds(330, 410  , 90, 20);
    btnWM.setBackground(new Color(255,191,0));
    btnWM.addActionListener(this);
    add(btnWM);

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


    }if(e.getSource()==btnaddRef){
        num1++;
        lblrefQ.setText("Quantity: " + num1);


    } else if(e.getSource()==btnminusRef){
        if(num1 > 0){
            num1--;
            lblrefQ.setText("Quantity: " + num1);
        }

//----------------------------------------------------------

    } if(e.getSource()==btnaddW){
        num2++;
        lblWQ.setText("Quantity: " + num2);


    }else if(e.getSource()==btnminusW){
        if(num2 > 0){
            num2--;
            lblWQ.setText("Quantity: " + num2);
        }

//---------------------------------------------------------------

    }  if(e.getSource()==btnaddM){
        num3++;
        lblMQ.setText("Quantity: " + num3);


    } else if(e.getSource()==btnminusM){
        if(num3 > 0){
            num3--;
            lblMQ.setText("Quantity: " + num3);
        }
    }




//-----------------------------------------------------------

    if(e.getSource() == btnC){

        
         num1 = 0;
         num2 = 0;
         num3 = 0;

        lblrefQ.setText("Quantity: " + num1);
        lblWQ.setText("Quantity: " + num2);
        lblMQ.setText("Quantity: " + num3);



        
    } if (e.getSource() == btnB){
   dispose();

   if(num1 > 0){

     String lbl = lblrefPrice.getText();
    int price = Integer.parseInt(lbl);

    String lblS = lblRef.getText();
    Buy b = new Buy(lblS,num1,price);
        b.setVisible(true);

   }



} if(e.getSource() == btnOven){
    


if(num3 > 0){
dispose();
        String lbl = lblmPrice.getText();
        int price = Integer.parseInt(lbl);

        String lblS = lblM.getText();
        Buy b = new Buy(lblS,num3,price);
        b.setVisible(true);

   }

} if(e.getSource() == btnWM){

    if(num2 > 0){
        dispose();
        String lbl = lblwPRice.getText();
        int price = Integer.parseInt(lbl);

        String lblS = lblW.getText();
        Buy b = new Buy(lblS,num2,price);
        b.setVisible(true);


    }


    
}







}
}


    