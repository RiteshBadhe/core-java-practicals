/*Q2) Create the following GUI screen using appropriate layout manager. Accept the name, class,
hobbies from the user and display the selected options in a textbox.
*/
import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.*;

class Stud_form extends JFrame implements ActionListener{
    JLabel l1,l2,l3;
    JTextField t1,t2,t3;
    JCheckBox h1,h2,h3;
    JButton submit;


    Stud_form(){
        l1 = new JLabel("Your Name");
        t1 = new JTextField(20);
        l2 = new JLabel("Your Class");
        l3 = new JLabel("Your hobbies");
        t2 = new JTextField(20);
        h1 = new JCheckBox("MUSIC");
        h2 = new JCheckBox("DANCE");
        h3 = new JCheckBox("SPORTS");
        t3 = new JTextField(20);
        submit = new JButton("submit");
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(h1);
        add(h2);
        add(h3);   
        add(t3);
        add(submit);
        //setLayout(new FlowLayout());
        setLayout(new GridLayout(3,3,5,5));
        setSize(500,400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        submit.addActionListener(this);

       
    }
    public void actionPerformed(ActionEvent e){
        String hobbies="";
        String name="";
        String Class ="";


        if(h1.isSelected()) hobbies = "MUSIC";
        if(h2.isSelected()) hobbies = "DANCE";
        if(h3.isSelected()) hobbies = "SPORTS";

        name = t1.getText();
        Class  = t2.getText();

        t3.setText("Name = "+name+""+"Class ="+Class+""+"Hobbies ="+hobbies);

    }
    public static void main(String[] args) {
        new Stud_form();
    }
}
