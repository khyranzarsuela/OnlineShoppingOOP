import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.event.*;

public class Home extends JFrame implements ActionListener {


    private JLabel title;
    private JButton searchBtn;
    private JButton btnElectronics, btnClothes, btnFood, btnSignup, btnLogin;
    private JTextField txtSearch;



    Home(){

        setTitle("O:Shop");
        setSize(1240, 1240);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


         title = new JLabel("O:Shop");
        title.setBounds(400, 80, 200, 50);
        title.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 24));
        add(title);

        txtSearch = new JTextField();
        txtSearch.setBounds(550, 80, 300, 30);
        add(txtSearch);

      
       

        searchBtn = new JButton("Search");
        searchBtn.setBounds(900, 80, 100, 30);
        searchBtn.addActionListener(this);
        add(searchBtn);

        
        btnElectronics = new JButton("Electronics");
        btnElectronics.setBounds(100, 150, 150, 40);
        btnElectronics.addActionListener(this);
        add(btnElectronics);

        btnClothes = new JButton("Clothes");
        btnClothes.setBounds(270, 150, 150, 40);
        btnClothes.addActionListener(this);
        add(btnClothes);

        btnFood = new JButton("Food");
        btnFood.setBounds(440, 150, 150, 40);
        btnFood.addActionListener(this);
        add(btnFood);

        btnSignup = new JButton("SignUp");
        btnSignup.setBounds(1070, 20, 80, 30);
        btnSignup.addActionListener(this);
        add(btnSignup);

        btnLogin = new JButton("Log In");
        btnLogin.setBounds(1150, 20, 80, 30);
        btnLogin.addActionListener(this);
        add(btnLogin);






    }



    @Override
    public void actionPerformed(ActionEvent e) {


        if (e.getSource() == searchBtn) {
            String search = txtSearch.getText().toLowerCase();

        if (search.contains("phone")) {
            SignUp s = new SignUp();
            s.setVisible(true);
            dispose();

    }  else {
            NOthing n = new NOthing();
            n.setVisible(true);
        }
    }

    
    if (e.getSource() == btnSignup) {
        SignUp s = new SignUp();
        s.setVisible(true);
    }


      




       

    }
}


