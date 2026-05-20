import java.awt.*;
import javax.swing.*;

public class adminDispatch extends JFrame {

    private DefaultListModel<String> toShipModel;
    private DefaultListModel<String> transitModel;
    private DefaultListModel<String> completedModel;
    
    private JList<String> adminToShipList;
    private JList<String> adminTransitList;

    public adminDispatch(DefaultListModel<String> toShip, 
                         DefaultListModel<String> transit, 
                         DefaultListModel<String> completed) {
        
        this.toShipModel = toShip;
        this.transitModel = transit;
        this.completedModel = completed;

        setTitle("Admin Operations Panel");
        setSize(350, 500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout());

        setupUI();
        setLocationRelativeTo(null);
    }

    private void setupUI() {
        JPanel panel = new JPanel(new BorderLayout(10, 10));
        panel.setBorder(BorderFactory.createTitledBorder("ADMIN DISPATCH"));
        
        adminToShipList = new JList<>(toShipModel);
        adminTransitList = new JList<>(transitModel);
        
        JPanel stack = new JPanel(new GridLayout(2, 1, 5, 5));
        stack.add(new JScrollPane(adminToShipList));
        stack.add(new JScrollPane(adminTransitList));

        JButton shipBtn = new JButton("Dispatch Selected");
        shipBtn.addActionListener(e -> {
            int idx = adminToShipList.getSelectedIndex();
            if(idx != -1) {
                transitModel.addElement(toShipModel.remove(idx));
            }
        });

        JButton deliverBtn = new JButton("Mark Delivered");
        deliverBtn.addActionListener(e -> {
            int idx = adminTransitList.getSelectedIndex();
            if(idx != -1) {
                completedModel.addElement(transitModel.remove(idx));
            } else if (transitModel.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Nothing in transit!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        panel.add(stack, BorderLayout.CENTER);
        
        JPanel btns = new JPanel(new GridLayout(2, 1, 2, 2));
        btns.add(shipBtn); 
        btns.add(deliverBtn);
        panel.add(btns, BorderLayout.SOUTH);

        add(panel, BorderLayout.CENTER);
    }
}

