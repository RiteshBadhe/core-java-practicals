import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.*;

class Tracing extends JFrame implements MouseListener,MouseMotionListener{

    JLabel l1,l2;
    JTextField t1,t2;

    public Tracing()  {
        l1 = new JLabel("mouse Moving at :");
        add(l1);
        l2 = new JLabel("mouse clicked at :");
        t1 = new JTextField(10);
        add(t1);
        add(new JSeparator());
        add(l2);
        t2 = new JTextField(10);
        add(t2);
        setBackground(Color.pink);
        
        setLayout(new GridLayout(2,2,5,5));
        setTitle("Mose Tracing is on");
        setSize(400,350);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addMouseListener(this);
        addMouseMotionListener(this);

    }
    public void mouseMoved(MouseEvent e){
        t2.setText("x = "+e.getX()+" y = "+e.getY());
    }
    public void mouseClicked(MouseEvent e){
        t1.setText("x ="+e.getX()+"y ="+e.getY());
    }
    public void mouseDragged(MouseEvent e) {}
    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
    public static void main(String[] args) {
        new Tracing();
    }
    

}

