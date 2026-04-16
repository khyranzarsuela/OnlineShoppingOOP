
import javax.swing.*;
import java.awt.event.*;
public class Login extends JFrame implements ActionListener {

private JLabel lblw;
private JButton btnHomepage;
Login(){
    setSize(1240,1240);
    setLayout(null);    
    setDefaultCloseOperation(EXIT_ON_CLOSE);

    lblw = new JLabel("logginginaka");
    lblw.setBounds(90, 100, 100, 20);
    add(lblw);

    btnHomepage = new JButton("buray");
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
