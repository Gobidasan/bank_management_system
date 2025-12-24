
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{
    JButton login,singup,clear;
    JTextField cardTextField;
    JPasswordField pinTextField;
    
    Login(){
        setTitle("Automated Teller Machine");//title
        
        setLayout(null);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/logo.png.jpg"));
        Image i2=i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel label=new JLabel(i3);
        label.setBounds(70, 10, 100, 100);
        add(label);
        
        JLabel text=new JLabel("Welcome To Canara Atm");
        text.setFont(new Font("Osward", Font.BOLD,38));
        text.setBounds(200, 40, 500, 40);
        add(text);
        
        JLabel cardno=new JLabel("card no:");
        cardno.setFont(new Font("Raleway", Font.BOLD,28));
        cardno.setBounds(120, 150, 150, 30);
        add(cardno);
        
        cardTextField=new JTextField();
        cardTextField.setBounds(300,150,230,30);
        cardTextField.setFont(new Font("Arial",Font.BOLD,14));
        add(cardTextField);
        
        JLabel pin=new JLabel("PIN:");
        pin.setFont(new Font("Raleway", Font.BOLD,28));
        pin.setBounds(120, 220, 230, 30);
        add(pin);
        
        pinTextField=new JPasswordField();
        pinTextField.setBounds(300,220,230,30);
        pinTextField.setFont(new Font("Arial",Font.BOLD,14));
        add(pinTextField);
        
         login=new JButton("SING IN");
        login.setBounds(300,300,100,30);
        login.addActionListener(this);
        add(login);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        
         clear=new JButton("CLEAR");
        clear.setBounds(430,300,100,30);
        clear.addActionListener(this);
        add(clear);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        
         singup=new JButton("SING UP");
        singup.setBounds(300,350,230,30);
        singup.addActionListener(this);
        add(singup);
        singup.setBackground(Color.BLACK);
        singup.setForeground(Color.WHITE);
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(800, 480);//length,breath
        setVisible(true);//visibility
        setLocation(350, 200);//location where to open ui
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==clear){
            cardTextField.setText("");
            pinTextField.setText("");
        }else if(ae.getSource()==login){
            
            
        }else if(ae.getSource()==singup){
            setVisible(false);
            new singupone().setVisible(true);
        }
    }
    public static void main(String[] args){
        new Login();
    }
}
