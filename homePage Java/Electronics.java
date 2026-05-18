
import javax.swing.*;
import java.awt.event.*;
public class Electronics extends JFrame implements ActionListener {

public JLabel lblRef, lblW, lblM,lblItem, lblrefPrice, lblwPRice, lblmPrice, lblrefQ, lblWQ, lblMQ;
private JButton btnHomepage, btnaddRef, btnminusRef, btnaddW, btnminusW, btnaddM,btnminusM,btnC,btnB,btnAddCart,btnOven,btnWM;
public int num1 = 0;
public int num2 = 0;
public int num3 = 0;
public JLabel name ;


Electronics(){
    setSize(1240,1240);
    setLayout(null);    
    setDefaultCloseOperation(EXIT_ON_CLOSE);

    lblItem = new JLabel("Items: ");
    lblItem.setBounds(50, 50, 100, 20);
    add(lblItem );


    //---------------------------------------------------------------------
    lblRef = new JLabel("Panasonic NR-BP242VS Inverter Type  Standard Refrigerator");
    lblRef.setBounds(50, 100, 300, 20);
    add(lblRef );

    lblrefPrice = new JLabel("18999");
    lblrefPrice.setBounds(50, 120, 100, 20);
    add(lblrefPrice );

    lblrefQ = new JLabel("Quantity " + 0);
    lblrefQ.setBounds(50, 140, 100, 20);
    add(lblrefQ );

    btnaddRef = new JButton(" + ");
    btnaddRef.setBounds(190, 140, 60, 20);
    btnaddRef.addActionListener(this);
    add(btnaddRef );

    btnminusRef = new JButton(" - ");
    btnminusRef.setBounds(260, 140, 60, 20);
    btnminusRef.addActionListener(this);
    add(btnminusRef );


    btnB = new JButton("Buy Now");
    btnB.setBounds(330, 140  , 90, 20);
    btnB.addActionListener(this);
    add(btnB);


    //---------------------------------------------------

    lblM = new JLabel("Asahi OT 612 Electric Oven Toaster 6L");
    lblM.setBounds(50, 230, 100, 20);
    add(lblM );

    lblmPrice = new JLabel("1170");
    lblmPrice.setBounds(50, 250, 100, 20);
    add(lblmPrice );


    lblMQ = new JLabel("Quantity " + 0);
    lblMQ.setBounds(50, 270, 100, 20);
    add(lblMQ );

    btnaddM = new JButton(" + ");
    btnaddM.setBounds(190, 270, 60, 20);
    btnaddM.addActionListener(this);
    add(btnaddM );

    btnminusM = new JButton(" - ");
    btnminusM.setBounds(260, 270, 60, 20);
    btnminusM.addActionListener(this);
    add(btnminusM );

    btnOven = new JButton("Buy Now");
    btnOven.setBounds(330, 270  , 90, 20);
    btnOven.addActionListener(this);
    add(btnOven);


    

//----------------------------------------------------------------------

    lblW = new JLabel("TCL Top Load Washing Machine F1 Series,6.5/7.5 Honeycomb Crystal Drum,");
    lblW.setBounds(50, 360, 100, 20);
    add(lblW );


    lblwPRice = new JLabel("8695");
    lblwPRice.setBounds(50, 380, 100, 20);
    add(lblwPRice );

    lblWQ = new JLabel("Quantity " + 0);
    lblWQ.setBounds(50, 400, 100, 20);
    add(lblWQ );

    btnaddW = new JButton(" + ");
    btnaddW.setBounds(190, 400, 60, 20);
    btnaddW.addActionListener(this);
    add(btnaddW );

    btnminusW = new JButton(" - ");
    btnminusW.setBounds(260, 400, 60, 20);
    btnminusW.addActionListener(this);
    add(btnminusW );


    btnWM = new JButton("Buy Now");
    btnWM.setBounds(330, 400  , 90, 20);
    btnWM.addActionListener(this);
    add(btnWM);

//---------------------------------------------------------------------------



    btnHomepage = new JButton("Home");
    btnHomepage.setBounds(600, 750  , 100, 30);
    btnHomepage.addActionListener(this);
    add(btnHomepage);

    

    btnC = new JButton("Clear All");
    btnC.setBounds(500, 750  , 100, 30);
    btnC.addActionListener(this);
    add(btnC);

    btnAddCart = new JButton("Add to Cart");
    btnAddCart.setBounds(400, 750  , 100, 30);
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


    