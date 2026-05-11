import javax.swing.*;

public class BtnOven extends JFrame {

    
    JTextField txtRef;

    BtnOven(int num2){

        setTitle("BuyNow");
        setSize(1240,1240);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);



        txtRef = new JTextField();
        txtRef.setBounds(100, 200 , 350, 400);
        txtRef.setEditable(false);
        add(txtRef);


       

    


       if(num2 > 0){
        txtRef.setText("Refridgerator\n" +
                        "Price: x" + num2
        );
                     


        


       



    }

        
    }
}