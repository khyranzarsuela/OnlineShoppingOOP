import javax.swing.*;

public class BuyNow extends JFrame {

    JTextArea area;

    BuyNow(int num1, int num2, int num3){

        setSize(400,400);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        area = new JTextArea();
        area.setBounds(50,50,300,250);
        add(area);

        String output = "";
        int total = 0;

        if(num1 > 0){
            int sub = num1 * 50;
            output += "Ref x" + num1 + " = " + sub + "\n";
            total += sub;
        }

        if(num2 > 0){
            int sub = num2 * 60;
            output += "Oven x" + num2 + " = " + sub + "\n";
            total += sub;
        }

        if(num3 > 0){
            int sub = num3 * 70;
            output += "Washing Machine x" + num3 + " = " + sub + "\n";
            total += sub;
        }

        output += "\nTotal = " + total;

        area.setText(output);
    }
}