package lab6.prog2.container;

import lab6.prog2.component.StringUtilityButton;

import javax.swing.*;
import java.awt.*;

public class ActionPanel extends JPanel {

    private StringUtilityButton btnCountLetters;
    private StringUtilityButton btnReverseLetters;
    private StringUtilityButton btnRemoveDuplicates;

    DataPanel dataPanel;

    public ActionPanel(DataPanel dataPanel) {
        this.dataPanel = dataPanel;
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        initComponents();
        addListeners();
    }

    public void initComponents() {
        btnCountLetters = new StringUtilityButton("Count Letters");
        btnReverseLetters = new StringUtilityButton("Reverse Letters");
        btnRemoveDuplicates = new StringUtilityButton("Remove Duplicates");

        add(btnCountLetters);
        add(btnReverseLetters);
        add(btnRemoveDuplicates);
    }

    private void addListeners() {
        btnCountLetters.addActionListener(_ -> onBtnCountClicked());
        btnReverseLetters.addActionListener(_ -> onBtnReverseClicked());
        btnRemoveDuplicates.addActionListener(e -> onBtnRemoveDuplicatesClicked());
    }

    public void onBtnReverseClicked() {
        dataPanel.performReverse();
    }

    private void onBtnRemoveDuplicatesClicked() {
        dataPanel.performRemoveDuplicates();
    }

    private void onBtnCountClicked() {
        dataPanel.performCount();
    }

}
