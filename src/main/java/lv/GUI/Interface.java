package lv.GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Interface implements ActionListener {
    JButton button;
    JFrame frame = new JFrame();
    public static void main(String[] args) {
        Interface gui = new Interface();
        gui.go();


    }
    public void go(){

        button = new JButton("Click me");
        button.addActionListener(this);
        frame.getContentPane().add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.setVisible(true);
    }
    public void actionPerformed(ActionEvent event){
        button.setText("Ive been clicked");
        frame.dispose(); //close form
    }


}
