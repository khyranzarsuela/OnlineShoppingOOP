import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;

public class Home extends JFrame implements ActionListener {


    private JLabel title, categories;
    private JButton searchBtn;
    private JButton btnElectronics, btnClothes, btnBag,  btnMShoes,btnA,btnSignUp,btnLogIn,btnCamera,btnLaptops,btnSports,btnMakeup,btnMobiles,btnBabies,btnHomeliving,btntoys,btnWShoes;
    private JPanel color;
    private JComboBox btnBox;



    Home(){

        setTitle("ShopBee");
        setSize(1240, 1240);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        color = new JPanel();
        color.setLayout(null);
        color.setBackground(new Color(255,191,0)); 
        color.setBounds(0, 0, 1700, 150);
        add(color);


        title = new JLabel("ShopBee");
        title.setBounds(70, 80, 400, 30);
        title.setForeground(Color.BLACK);
        title.setFont(new Font("Arial", Font.BOLD, 35));
        color.add(title);

       



        
String [] flip  = {"Electronics", 
                    "Clothes", 
                    "Bag", 
                    "Men Shoes", 
                    "accesories",
                    "Camera",
                    "Laptops",
                    "Sports",
                    "Makeup",
                    "Mobiles",
                    "Babies Needs",
                    "Home&Living",
                    "Toys",
                    "Women Shoes"};

         btnBox = new JComboBox<>(flip);
         btnBox.setBounds(230, 80, 800, 40);
         btnBox.addActionListener(this);
         color.add(btnBox);
         

      
       

        searchBtn = new JButton("Search");
        searchBtn.setBounds(1040, 80, 100, 40);
        searchBtn.addActionListener(this);
        color.add(searchBtn);
        


        categories = new JLabel("Categories");
        categories.setBounds(170, 170, 150, 50);
        categories.setFont(new Font("Arial", Font.BOLD, 24));
        categories.setBackground(Color.BLACK);
        add(categories);

       

        
        btnElectronics = new JButton("Electronics");
        btnElectronics.setBounds(170, 240, 150, 60);
        btnElectronics.setBackground(new Color(255,191,0));
        btnElectronics.addActionListener(this);
        add(btnElectronics);

        btnCamera = new JButton("Cameras");
        btnCamera.setBounds(170, 320, 150, 60);
        btnCamera.setBackground(new Color(255,191,0));
        btnCamera.addActionListener(this);
        add(btnCamera);

        btnClothes = new JButton("Clothes");
        btnClothes.setBounds(340, 240, 150, 60);
        btnClothes.setBackground(new Color(255,191,0));
        btnClothes.addActionListener(this);
        add(btnClothes);

        btnLaptops = new JButton("Laptops");
        btnLaptops.setBounds(340, 320, 150, 60);
        btnLaptops.setBackground(new Color(255,191,0));
        btnLaptops.addActionListener(this);
        add(btnLaptops);

        btnBag = new JButton("Bag");
        btnBag.setBounds(510, 240, 150, 60);
        btnBag.setBackground(new Color(255,191,0));
        btnBag.addActionListener(this);
        add(btnBag);

        btnSports = new JButton("Sports");
        btnSports.setBounds(510, 320, 150, 60);
        btnSports.setBackground(new Color(255,191,0));
        btnSports.addActionListener(this);
        add(btnSports);


        btnMShoes = new JButton("Men Shoes");
        btnMShoes.setBounds(680, 240, 150, 60);
        btnMShoes.setBackground(new Color(255,191,0));
        btnMShoes.addActionListener(this);
        add(btnMShoes);

        btnWShoes = new JButton("Women Shoes");
        btnWShoes.setBounds(680, 320, 150, 60);
        btnWShoes.setBackground(new Color(255,191,0));
        btnWShoes.addActionListener(this);
        add(btnWShoes);

        btnA = new JButton("Accesories");
        btnA.setBounds(850, 240, 150, 60);
        btnA.setBackground(new Color(255,191,0));
        btnA.addActionListener(this);
        add(btnA);

        btnMakeup = new JButton("Makeup");
        btnMakeup.setBounds(850, 320, 150, 60);
        btnMakeup.setBackground(new Color(255,191,0));
        btnMakeup.addActionListener(this);
        add(btnMakeup);

        btnMobiles = new JButton("Mobiles");
        btnMobiles.setBounds(1020, 240, 150, 60);
        btnMobiles.setBackground(new Color(255,191,0));
        btnMobiles.addActionListener(this);
        add(btnMobiles);

        btnBabies = new JButton("Babies Needs");
        btnBabies.setBounds(1020, 320, 150, 60);
        btnBabies.setBackground(new Color(255,191,0));
        btnBabies.addActionListener(this);
        add(btnBabies);

        btnHomeliving = new JButton("Home Living");
        btnHomeliving.setBounds(1190, 240, 150, 60);
        btnHomeliving.setBackground(new Color(255,191,0));
        btnHomeliving.addActionListener(this);
        add(btnHomeliving);

        btntoys = new JButton("Toys");
        btntoys.setBounds(1190, 320, 150, 60);
        btntoys.setBackground(new Color(255,191,0));
        btntoys.addActionListener(this);
        add(btntoys);

        btnSignUp = new JButton("Sign Up");
        btnSignUp.setBounds(1000, 20, 120, 25);
        btnSignUp.addActionListener(this);
        color.add(btnSignUp);
        

        btnLogIn = new JButton("Log In");
        btnLogIn.setBounds(1120, 20, 120, 25);
        btnLogIn.addActionListener(this);
        color.add(btnLogIn);

        btnLogIn = new JButton("Cart");
        btnLogIn.setBounds(1240, 20, 120, 25);
        btnLogIn.addActionListener(this);
        color.add(btnLogIn);
        

        

        






    }



  @Override
public void actionPerformed(ActionEvent e) {

    if (e.getSource() == searchBtn) {

        String search = (String) btnBox.getSelectedItem();

        if (search.contains("Electronics")) {

            dispose();

            Electronics el = new Electronics();
            el.setVisible(true);

        } else if(search.contains("Clothes")) {

            dispose();

            Clothes c = new Clothes();
            c.setVisible(true);

        } else if(search.contains("Bag")) {

            dispose();

            Bag b = new Bag();
            b.setVisible(true);

        } else if (search.contains("Accesories")) {

            dispose();

           Accesories a = new Accesories();
        a.setVisible(true);

        } else if (search.contains("Camera")) {

            dispose();

           Camera c = new Camera();
           c.setVisible(true);

        } else if (search.contains("Laptops")) {

            dispose();

           Laptops l = new Laptops();
           l.setVisible(true);

        } else if (search.contains("Sports")) {

            dispose();

           Sports s = new Sports();
           s.setVisible(true);

        } else if (search.contains("Makeup")) {

            dispose();

           Makeup m = new Makeup();
           m.setVisible(true);

        } else if (search.contains("Mobiles")) {

            dispose();

           Mobiles m = new Mobiles();
           m.setVisible(true);

        } else if (search.contains("Babies Needs")) {

            dispose();

           Babies b = new Babies();
           b.setVisible(true);

        } else if (search.contains("Home&Living")) {

            dispose();

           HomeLiving h = new HomeLiving();
           h.setVisible(true);

        } else if (search.contains("Toys")) {

            dispose();

           Toys t = new Toys();
           t.setVisible(true);

        } else   {

            dispose();

           WomenS w = new WomenS();
           w.setVisible(true);

        } 



    }
    

    else if(e.getSource() == btnElectronics){

        dispose();

        Electronics el = new Electronics();
        el.setVisible(true);

    }

    else if(e.getSource() == btnClothes){

        dispose();

        Clothes c = new Clothes();
        c.setVisible(true);

    }

    else if(e.getSource() == btnBag){

        dispose();

        Bag b = new Bag();
        b.setVisible(true);

    }

    else if(e.getSource() == btnA){

        dispose();

        Accesories a = new Accesories();
        a.setVisible(true);

    }

    else if(e.getSource() == btnMShoes){

        dispose();

        Shoes s = new Shoes();
        s.setVisible(true);

    } else if(e.getSource() == btnCamera){

        dispose();

        Camera c = new Camera();
        c.setVisible(true);


    } else if(e.getSource() == btnLaptops){

        dispose();

        Laptops l = new Laptops();
        l.setVisible(true);

    } else if(e.getSource() == btnSports){

        dispose();

        Sports s = new Sports();
        s.setVisible(true);

    } else if(e.getSource() == btnMakeup){

        dispose();

        Makeup m = new Makeup();
        m.setVisible(true);

    } else if(e.getSource() == btnMobiles){

        dispose();

        Mobiles m = new Mobiles();
        m.setVisible(true);

    } else if(e.getSource() == btnBabies){

        dispose();

        Babies b = new Babies();
        b.setVisible(true);

    } else if(e.getSource() == btnHomeliving){

        dispose();

        HomeLiving h = new HomeLiving();
        h.setVisible(true);

    } else if(e.getSource() == btntoys){

        dispose();

        Toys t = new Toys();
        t.setVisible(true);

    } else if(e.getSource() == btnWShoes){

        dispose();

        WomenS w = new WomenS();
        w.setVisible(true);

    } 



}
}


