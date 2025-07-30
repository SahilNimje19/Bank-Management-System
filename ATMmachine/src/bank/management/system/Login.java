package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class Login extends JFrame implements ActionListener {
    JButton login, Signup, Clear;
    JTextField cardTextField;
    JPasswordField pinTextField;
    Login(){
        setTitle("AUTOMATIC TELLER MACHINE");

        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);

        JLabel label = new JLabel(i3);
        label.setBounds(70,10,100,100);
        add(label);

        JLabel text = new JLabel("Welcome to ATM");
        text.setFont(new Font("Osward", Font.BOLD, 38));
        text.setBounds(200, 40, 400,40);
        add(text);

        JLabel cardnumber = new JLabel("Card no:");
        cardnumber.setFont(new Font("Raleway", Font.BOLD, 28));
        cardnumber.setBounds(120, 150, 150,30);
        add(cardnumber);

        cardTextField = new JTextField();
        cardTextField.setBounds(300,150,230,30);
        cardTextField.setFont(new Font("Arial", Font.BOLD,14));
        add(cardTextField);

        JLabel pin = new JLabel("PIN :");
        pin.setFont(new Font("Raleway", Font.BOLD, 28));
        pin.setBounds(120, 220, 230,40);
        add(pin);

        pinTextField = new JPasswordField();
        pinTextField.setBounds(300,220,230,30);
        pinTextField.setFont(new Font("Arial", Font.BOLD,14));
        add(pinTextField);

        login = new JButton("SIGN IN");
        login.setBounds(300,300,100,30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);

        Clear = new JButton("Clear");
        Clear.setBounds(430,300,100,30);
        Clear.setBackground(Color.BLACK);
        Clear.setForeground(Color.WHITE);
        Clear.addActionListener(this);
        add(Clear);

        Signup = new JButton("Signup");
        Signup.setBounds(300,350,230,30);
        Signup.setBackground(Color.BLACK);
        Signup.setForeground(Color.WHITE);
        Signup.addActionListener(this);
        add(Signup);


        getContentPane().setBackground(Color.white);

        setSize(800,480);
        setVisible(true);
        setLocation(350,200);

    }
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == Clear){
            cardTextField.setText("");
            pinTextField.setText("");
        } else if (ae.getSource() == login) {
            Conn conn = new Conn();
            String cardnumber = cardTextField.getText();
            String pinnumber = pinTextField.getText();
            String query = "select * from login where cardnumber = '"+cardnumber+"' and pin = '"+pinnumber+"'";
            try{
               ResultSet rs = conn.s.executeQuery(query);
               if(rs.next()){
                   setVisible(false);
                   new Transactions(pinnumber).setVisible(true);
               } else{
                   JOptionPane.showMessageDialog(null, "Incorrect Card Number or Pin");
               }
            } catch(Exception e){
                System.out.println(e);
            }
        } else if (ae.getSource() == Signup) {
            setVisible(false);
            new SignupOne("").setVisible(true);
        }
    }
    public static void main(String[] args) {
        Login l = new Login();
    }

}
