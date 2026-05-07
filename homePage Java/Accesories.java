
import javax.swing.*;
import java.awt.event.*;
public class Accesories extends JFrame implements ActionListener {

private JLabel lblRef, lblW, lblM,lblItem, lblrefPrice, lblwPRice, lblmPrice;
private JButton btnHomepage;


Accesories(){
    setSize(1240,1240);
    setLayout(null);    
    setDefaultCloseOperation(EXIT_ON_CLOSE);

    lblItem = new JLabel("Items: ");
    lblItem.setBounds(40, 50, 100, 20);
    add(lblItem );

    lblRef = new JLabel("Ref:");
    lblRef.setBounds(40, 80, 100, 20);
    add(lblRef );

    lblrefPrice = new JLabel("Price: 50");
    lblrefPrice.setBounds(40, 110, 100, 20);
    add(lblrefPrice );

    lblW = new JLabel("Oven");
    lblW.setBounds(40, 110, 100, 20);
    add(lblW );

    lblwPRice = new JLabel("Price: 60");
    lblwPRice.setBounds(40, 110, 100, 20);
    add(lblwPRice );

    

    lblM = new JLabel("Washing Machine");
    lblM.setBounds(40, 140, 100, 20);
    add(lblM );


    lblmPrice = new JLabel("Price: 70");
    lblmPrice.setBounds(40, 110, 100, 20);
    add(lblmPrice );

    btnHomepage = new JButton("Home");
    btnHomepage.setBounds(150, 150, 100, 30);
    btnHomepage.addActionListener(this);
    add(btnHomepage);

 


}
@Override
public void actionPerformed(ActionEvent e) {
    dispose();
    if(e.getSource()==btnHomepage){
        Home h  = new Home();
        h.setVisible(true); 
    }
    




}

}
