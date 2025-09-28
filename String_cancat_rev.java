/*Q2) Write Java program to design three text boxes and two buttons using swing. Enter different
strings in first and second textbox. On clicking the First command button, concatenation of
two strings should be displayed in third text box and on clicking second command button,
reverse of string should display in third text box
*/
import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

class String_cancat_rev extends JFrame implements ActionListener{
    JTextField t1,t2,t3;
    JButton b1,b2;

    public String_cancat_rev() {
        t1 = new JTextField(10);
        t2 = new JTextField(10);
        add(t1);
        add(t2);
        t3 = new JTextField(10);
        add(t3);
        
        b1 = new JButton("Concat");
        b2 = new JButton("Reverse");
        add(b1);
        add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this);
        setLayout(new FlowLayout());
        setSize(400,350);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == b1){
            t3.setText(t1.getText() + t2.getText());
        }else if(e.getSource() == b2){
            String name = t1.getText();
            StringBuilder newstr = new StringBuilder(name);
            t3.setText(newstr.reverse().toString());
        }
    }   
    public static void main(String[] args) {
        new String_cancat_rev();
}
    
}



