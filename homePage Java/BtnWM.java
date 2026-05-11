import javax.swing.*;

public class BtnWM extends JFrame {

    
    JTextField txtRef;

    BtnWM(int num3){

        setTitle("BuyNow");
        setSize(1240,1240);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);



        txtRef = new JTextField();
        txtRef.setBounds(100, 200 , 350, 400);
        txtRef.setEditable(false);
        add(txtRef);


       

    


       if(num3 > 0){
        txtRef.setText("Refridgerator\n" +
                        "Price: x" + num3
        );
                     


        


       



    }

        
    }
}