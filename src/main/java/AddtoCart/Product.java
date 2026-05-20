package AddtoCart;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Khyran Zarsuela
 */
import javax.swing.*;
import java.awt.event.*;

public class Product extends JPanel implements ActionListener {

    private JButton addBag, addFruit, openCart;
    private AddToCart cartGUI;

    public Product(AddToCart cartGUI) {
        this.cartGUI = cartGUI;
        setSize(400,300);
        setLayout(null);


        addBag = new JButton("Add Bag ni Luffy");
        addBag.setBounds(50,50,200,30);
        add(addBag);

        addFruit = new JButton("Add Devil Fruit");
        addFruit.setBounds(50,100,200,30);
        add(addFruit);

        addBag.addActionListener(this);
        addFruit.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == addBag){
            cartGUI.addItem("Bag ni Luffy");
        }
        else if(e.getSource() == addFruit){
            cartGUI.addItem("Luffy's Devil Fruit Original");
        }
    }
}
