package ImgCmd;

import javax.swing.*;
import java.awt.*;

public class Main{
    public static void main(String[] args) {
        JFrame fr = new JFrame("Image");
        MyPanel pan = new MyPanel(args[0]);
        fr.setSize(800,600);
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pan.setBounds(0,0,800,600);
        fr.add(pan);
    }
}

class MyPanel extends JPanel{
    private Image img;
    public MyPanel(String args){
        img = new ImageIcon(args).getImage();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(img, 0, 0, null);
    }
}
