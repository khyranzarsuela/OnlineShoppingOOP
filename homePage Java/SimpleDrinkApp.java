import javax.swing.*;
import java.awt.*;

public class SimpleDrinkApp extends JFrame {

    int waterQty = 0;
    int wineQty = 0;
    int juiceQty = 0;

    JLabel waterLabel, wineLabel, juiceLabel;
    JTextArea output;

    public SimpleDrinkApp() {
        setTitle("Drink Menu");
        setSize(400, 400);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Labels (LIVE DISPLAY)
        waterLabel = new JLabel("Water: 0");
        wineLabel = new JLabel("Wine: 0");
        juiceLabel = new JLabel("Juice: 0");

        // Buttons
        JButton addWater = new JButton("+ Water");
        JButton minusWater = new JButton("- Water");

        JButton addWine = new JButton("+ Wine");
        JButton minusWine = new JButton("- Wine");

        JButton addJuice = new JButton("+ Juice");
        JButton minusJuice = new JButton("- Juice");

        JButton totalBtn = new JButton("Total");
        JButton cancelBtn = new JButton("Cancel");

        output = new JTextArea(10, 30);
        output.setEditable(false);

        // WATER
        addWater.addActionListener(e -> {
            waterQty++;
            waterLabel.setText("Water: " + waterQty);
        });

        minusWater.addActionListener(e -> {
            if (waterQty > 0) waterQty--;
            waterLabel.setText("Water: " + waterQty);
        });

        // WINE
        addWine.addActionListener(e -> {
            wineQty++;
            wineLabel.setText("Wine: " + wineQty);
        });

        minusWine.addActionListener(e -> {
            if (wineQty > 0) wineQty--;
            wineLabel.setText("Wine: " + wineQty);
        });

        // JUICE
        addJuice.addActionListener(e -> {
            juiceQty++;
            juiceLabel.setText("Juice: " + juiceQty);
        });

        minusJuice.addActionListener(e -> {
            if (juiceQty > 0) juiceQty--;
            juiceLabel.setText("Juice: " + juiceQty);
        });

        // TOTAL
        totalBtn.addActionListener(e -> {
            int total =
                    (waterQty * 5) +
                    (wineQty * 10) +
                    (juiceQty * 15);

            output.setText(
                    "ORDER SUMMARY\n\n" +
                    "Water: " + waterQty + " x 5 = " + (waterQty * 5) + "\n" +
                    "Wine: " + wineQty + " x 10 = " + (wineQty * 10) + "\n" +
                    "Juice: " + juiceQty + " x 15 = " + (juiceQty * 15) + "\n\n" +
                    "TOTAL: " + total
            );
        });

        // CANCEL
        cancelBtn.addActionListener(e -> {
            waterQty = wineQty = juiceQty = 0;

            waterLabel.setText("Water: 0");
            wineLabel.setText("Wine: 0");
            juiceLabel.setText("Juice: 0");

            output.setText("");
        });

        // ADD TO FRAME
        add(waterLabel);
        add(addWater);
        add(minusWater);

        add(wineLabel);
        add(addWine);
        add(minusWine);

        add(juiceLabel);
        add(addJuice);
        add(minusJuice);

        add(totalBtn);
        add(cancelBtn);

        add(output);

        setVisible(true);
    }

    public static void main(String[] args) {
        new SimpleDrinkApp();
    }
}

    