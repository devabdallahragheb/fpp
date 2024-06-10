package lab6.prog2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Manipulation extends JFrame{
    private JButton countLettersButton;
    private JButton removeDuplicatesButton;
    private JButton reverseLettersButton;
    private JTextArea inputTextArea;
    private JTextArea outputTextArea;
    private JPanel jPanel;

    public Manipulation(){
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("String Utility");
        setSize(700, 500);
        setLocationRelativeTo(null);
        setResizable(false);
        setContentPane(jPanel);
        countLettersButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int count = CountLetters(inputTextArea.getText());
                outputTextArea.setText(String.valueOf(count));
            }
        });
        removeDuplicatesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                outputTextArea.setText(RemoveDuplicate(inputTextArea.getText()));
            }
        });
        reverseLettersButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                outputTextArea.setText(ReverseString(inputTextArea.getText()));
            }
        });
    }
    private String ReverseString(String str){
        if (str == null || str.equals("")) {
            return str;
        } else {
            return ReverseString(str.substring(1)) + str.charAt(0);
        }
    }
    private String RemoveDuplicate(String str){
        char[] temp = new char[str.length()];
        char[] input = str.toCharArray();
        int index = 0;
        for (int i = 0; i < input.length; i++){
            boolean contain = false;
            for (int j = 0; j < temp.length; j++){
                if (input[i] ==temp[j]){
                    contain = true;
                }
            }
            if (!contain){
                temp[index] = input[i];
                index++;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0 ; i < index ; i++){
            stringBuilder.append(temp[i]);
        }
        return stringBuilder.toString();
    }
    private int CountLetters(String str){
        int count = 0;
        for (char c : str.toCharArray()){
            if (Character.isLetter(c)){
                count++;
            }
        }
        return count;
    }
}
