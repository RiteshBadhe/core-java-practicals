import java.awt.BorderLayout;
import javax.swing.*;

class borderlayout extends  JFrame{
    JButton b1,b2,b3,b4,b5;

    borderlayout(){
        b1 = new JButton("North");
        b2 = new JButton("south");
        b3 = new JButton("east");
        b4 = new JButton("west");
        b5 = new JButton("center");

        add(b1,BorderLayout.NORTH);
        add(b2,BorderLayout.SOUTH);
        add(b3,BorderLayout.EAST);
        add(b4,BorderLayout.WEST);
        add(b5,BorderLayout.CENTER);
        setSize(300,400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new borderlayout();
    }
    
}
