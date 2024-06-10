package lab6.prog2.container;

import javax.swing.*;
import java.awt.*;

public class StringUtilityPanel extends JPanel {

    private ActionPanel actionPanel;
    private DataPanel dataPanel;

    public StringUtilityPanel() {
        initComponents();
        this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        this.setPreferredSize(new Dimension(540, 320));
        this.add(Box.createRigidArea(new Dimension(40, 0)));
        this.add(actionPanel);
        this.add(Box.createRigidArea(new Dimension(40, 0)));
        this.add(dataPanel);
    }

    private void initComponents() {
        dataPanel = new DataPanel();
        actionPanel = new ActionPanel(dataPanel);

    }
}
