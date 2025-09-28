/*Q2) Write a simple currency converter, as shown in the figure. User can enter the amount of
"Singapore Dollars", "US Dollars", or "Euros", in floating-point number. The converted
values shall be displayed to 2 decimal places. Assume that 1 USD = 1.41 SGD,
1 USD = 0.92 Euro, 1 SGD = 0.65 Euro.
[*/


import javax.swing.*;


class currency_con extends JFrame {
    JLabel l1,l2,l3;
    JTextField t1,t2,t3;

    public currency_con()  {
        l1 = new JLabel("Singapore Dollers");
        l2 = new JLabel(" U S Dollers");
        l3 = new JLabel("Euros");

        t1 = new JTextField(20);
        t2 = new JTextField(10);
        t3 = new JTextField(10);

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);

    }   
    public  void actionPerformed()
    

    

}