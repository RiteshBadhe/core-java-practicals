/*Q2) Write a program to design a screen using Awt that will 
take a user name and password. If the user name and password 
are not same, raise an Exception with appropriate message.
User can have 3 login chances only. Use clear button to clear the TextFields. */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class name_pass extends JFrame implements ActionListener{
    JLabel l1,l2;
    JTextField t1 ,t3;
    JPasswordField t2;
    JButton clear,login;

    public name_pass() throws HeadlessException {
        l1 = new JLabel("enter Your Name : ");
        l2 = new JLabel("Enter Password : ");
        t1 = new JTextField(10);
        t2 = new JPasswordField(10);
        t3 = new JTextField(10);
        clear = new JButton("clear");
        login = new JButton("login");
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(t3);
        add(login);
        add(clear);

        clear.addActionListener(this);
        login.addActionListener(this);
      
        setTitle("Login Form");
        /* 
        addWindowListener(new WindowAdapter()){
            public void WindowClosing(WindowEvent e){
                dispose();
                System.exit(0);
            }
        }   */
        setSize(400,350);
        setLayout(new FlowLayout());
        setVisible(true);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
    }

    public void actionPerformed(ActionEvent e){
        String name  = t1.getText();
        String pass =new String( t2.getPassword());

        if(name.equals(pass)){
            t3.setText("Match successfully");
        }
        else if(e.getSource() == clear){
            t1.setText("");
            t2.setText("");
            t3.setText("");
        }

    
    }      
    public static void main(String[] args) {
    new name_pass();

}
}