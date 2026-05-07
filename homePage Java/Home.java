import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.*;

public class Home extends JFrame implements ActionListener {


    private JLabel title;
    private JButton searchBtn;
    private JButton btnElectronics, btnClothes, btnBag,  btnShoes,btnA;
    
    private JComboBox btnBox;



    Home(){

        setTitle("O:Shop");
        setSize(1240, 1240);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


         title = new JLabel("O:Shop");
        title.setBounds(400, 80, 200, 50);
        title.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 24));
        add(title);



        
String [] flip  = {"Electronics", "Clothes", "Bag", "Shoes", "accesories"};

         btnBox = new JComboBox<>(flip);
         btnBox.setBounds(550, 80, 300, 30);
         btnBox.addActionListener(this);
         add(btnBox);
         

      
       

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

        btnBag = new JButton("Bag");
        btnBag.setBounds(440, 150, 150, 40);
        btnBag.addActionListener(this);
        add(btnBag);


        btnShoes = new JButton("Shoes");
        btnShoes.setBounds(610, 150, 150, 40);
        btnShoes.addActionListener(this);
        add(btnShoes);

        btnA = new JButton("Accesories");
        btnA.setBounds(780, 150, 150, 40);
        btnA.addActionListener(this);
        add(btnA);

        






    }



    @Override
    public void actionPerformed(ActionEvent e) {

        dispose();
        if (e.getSource() == searchBtn) {
            String search = (String) btnBox.getSelectedItem();

        if (search.contains("Electronics")) {

            Electronics el = new Electronics();
             el.setVisible(true);
            

    }  else if(search.contains("Clothes")){

        Clothes c = new Clothes();
        c.setVisible(true);

    }  else if(search.contains("Bag")){

         Bag b = new Bag();
        b.setVisible(true);
    
    }else {
            NOthing n = new NOthing();
            n.setVisible(true);
        }

    }  if(e.getSource() == btnElectronics){

        Electronics el = new Electronics();
        el.setVisible(true);


    } if(e.getSource() == btnClothes){

        Clothes c = new Clothes();
        c.setVisible(true);


    } if(e.getSource() == btnBag){

        Bag b = new Bag();
        b.setVisible(true);


    } if(e.getSource() == btnA){

        Accesories a = new Accesories();
        a.setVisible(true);


    } if(e.getSource() == btnShoes){

        Shoes s = new Shoes();
        s.setVisible(true);


    }



       

    }
}


