import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class subjectLIst extends JFrame implements ActionListener{
    JComboBox<String>combo;
    JTextField result;

    public subjectLIst()  {
        String subject[] = {"java", "Python","C", "C++", "OS"};
        combo = new  JComboBox<>(subject);
        result = new JTextField(20); 
        add(combo);
        add(result);

        combo.addActionListener(this);
        setLayout(new FlowLayout());
        setSize(300,400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e){
        String selectedString = (String) combo.getSelectedItem();
        result.setText(selectedString);
    }
    public static void main(String[] args) {
        new subjectLIst ();
    }

}