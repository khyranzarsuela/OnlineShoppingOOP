
import javax.swing.*;
import java.awt.event.*;
public class SignUp extends JFrame implements ActionListener {

private JLabel lblw;
private JButton btnHomepage;
SignUp(){
    setSize(1240,1240);
    setLayout(null);    
    setDefaultCloseOperation(EXIT_ON_CLOSE);

    lblw = new JLabel("SignUp");
    lblw.setBounds(90, 100, 100, 20);
    add(lblw);

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
