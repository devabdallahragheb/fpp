package lab6.prog2;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Manipulation manipulation = new Manipulation();
            }
        });
    }
}
