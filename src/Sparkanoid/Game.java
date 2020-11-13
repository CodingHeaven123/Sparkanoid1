package Sparkanoid;

import javax.swing.JFrame;

public class Game {
    public static void main(String[] args)
    {
        JFrame obj = new JFrame();
        Gameplay gameplay = new Gameplay();
        obj.setBounds(10, 10, 1000, 600);
        obj.setTitle("Sparkanoid");
        obj.setResizable(true);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.add(gameplay);

    }
}