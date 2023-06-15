import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class GameFrame extends JFrame {

    GamePanel panel = new GamePanel();

    GameFrame() {
        panel = new GamePanel();

        this.add(panel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Pong Game");
        this.setBackground(Color.black);
        this.setResizable(false);
        this.pack();
        this.setLocationRelativeTo(null);

        this.setVisible(true);

    }

}
