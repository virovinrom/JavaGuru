package lv.GUI;

import javax.swing.*;
import java.awt.*;

public class MyDrawPanel extends JPanel {
    public void paintComponent(Graphics g){
        g.setColor(Color.orange);
        g.fillRect(20,50,50,50);

    }

    public static void main(String[] args) {

    }
}
