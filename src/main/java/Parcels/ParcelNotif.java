import java.awt.*;
import javax.swing.*;

public class ParcelNotif extends JFrame {

    private final Color AMBER = new Color(255, 191, 0);
    private final Color SOFT_BG = new Color(255, 251, 240);

    private DefaultListModel<String> toShipModel;
    private DefaultListModel<String> transitModel;
    private DefaultListModel<String> completedModel;

    public ParcelNotif(DefaultListModel<String> toShip, 
                       DefaultListModel<String> transit, 
                       DefaultListModel<String> completed) {
        
        this.toShipModel = toShip;
        this.transitModel = transit;
        this.completedModel = completed;

        setTitle("Order Tracking System - Customer Display");
        setSize(700, 500); 
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout());

        setupUI();
        setLocationRelativeTo(null);
    }

    private void setupUI() {
        JPanel userPanel = new JPanel(new GridLayout(1, 3, 10, 10));
        userPanel.setBackground(SOFT_BG);
        
        userPanel.add(createListScrollPanel("Awaiting", new JList<>(toShipModel), AMBER));
        userPanel.add(createListScrollPanel("In Transit", new JList<>(transitModel), AMBER));
        userPanel.add(createListScrollPanel("Completed", new JList<>(completedModel), AMBER));

        add(userPanel, BorderLayout.CENTER);
    }

    private JPanel createListScrollPanel(String title, JList<String> list, Color color) {
        JPanel p = new JPanel(new BorderLayout());
        p.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(color, 2), title));
        p.add(new JScrollPane(list));
        return p;
    }
}



