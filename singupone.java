package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;
public class singupone extends JFrame implements ActionListener{
    long random;
    JTextField nameTextField,fnameTextField,emaila,addresstextfield,citytextfield,statetextfield,pintextfield;
    JButton next;
    JDateChooser datechooser;
    JRadioButton male,female,married,nomarried;
    
    singupone(){
        setLayout(null);
        
        Random ran=new Random();    
        random=Math.abs(ran.nextLong()%900l)+1000l;
        JLabel formno=new JLabel("Applictaion Form No. "+random);
        formno.setFont(new Font("Raleway",Font.BOLD,38));
        formno.setBounds(140,20,600,40);
        add(formno);
        
        JLabel personalDetails=new JLabel("page 1: Personal Details");
        personalDetails.setFont(new Font("Raleway",Font.BOLD,22));
        personalDetails.setBounds(290,80,400,30);
        add(personalDetails);
        
        JLabel name=new JLabel("Name :");
        name.setFont(new Font("Raleway",Font.BOLD,20));
        name.setBounds(100,140,100,30);
        add(name);
        
         nameTextField=new JTextField();
        nameTextField.setFont(new Font("Raleway",Font.BOLD,14));
        nameTextField.setBounds(300,140,400,30);
        add(nameTextField);
        
        JLabel fname=new JLabel("Father'sName :");
        fname.setFont(new Font("Raleway",Font.BOLD,20));
        fname.setBounds(100,190,200,30);
        add(fname);
        
         fnameTextField=new JTextField();
        fnameTextField.setFont(new Font("Raleway",Font.BOLD,14));
        fnameTextField.setBounds(300,190,400,30);
        add(fnameTextField);
        
        JLabel dob=new JLabel("Date of Birth :");
        dob.setFont(new Font("Raleway",Font.BOLD,20));
        dob.setBounds(100,240,200,30);
        add(dob);
        
         datechooser=new JDateChooser();
         
        datechooser.setBounds(300,240,300,30);
        datechooser.setForeground(new Color(105,105,105));
        add(datechooser);
        
        JLabel gender=new JLabel("gender :");
        gender.setFont(new Font("Raleway",Font.BOLD,20));
        gender.setBounds(100,290,200,30);
        add(gender);
        
         male=new JRadioButton("Male");
        male.setBounds(300,290,60,30);
        male.setBackground(Color.WHITE);
        add(male);
        
         female=new JRadioButton("FeMale");
        female.setBounds(450,290,120,30);
        female.setBackground(Color.WHITE);
        add(female);
        
        ButtonGroup gendergroup=new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);
        
        JLabel email=new JLabel("Email :");
        email.setFont(new Font("Raleway",Font.BOLD,20));
        email.setBounds(100,340,200,30);
        add(email);
        
         emaila=new JTextField();
        emaila.setFont(new Font("Raleway",Font.BOLD,14));
        emaila.setBounds(300,340,400,30);
        add(emaila);
        
        
        JLabel marital=new JLabel("Marital Status :");
        marital.setFont(new Font("Raleway",Font.BOLD,20));
        marital.setBounds(100,390,200,30);
        add(marital);
        
         married=new JRadioButton("Married");
        married.setBounds(300,390,100,30);
        married.setBackground(Color.WHITE);
        add(married);
        
         nomarried=new JRadioButton("unmarried");
        nomarried.setBounds(450,390,120,30);
        nomarried.setBackground(Color.WHITE);
        add(nomarried);
        
        ButtonGroup marriedgroup=new ButtonGroup();
        marriedgroup.add(married);
        marriedgroup.add(nomarried);
        
        
        JLabel adress=new JLabel("Address :");
        adress.setFont(new Font("Raleway",Font.BOLD,20));
        adress.setBounds(100,440,200,30);
        add(adress);
        
         addresstextfield=new JTextField();
        addresstextfield.setFont(new Font("Raleway",Font.BOLD,14));
        addresstextfield.setBounds(300,440,400,30);
        add(addresstextfield);
        
        JLabel city=new JLabel("City :");
        city.setFont(new Font("Raleway",Font.BOLD,20));
        city.setBounds(100,490,200,30);
        add(city);
        
         citytextfield=new JTextField();
        citytextfield.setFont(new Font("Raleway",Font.BOLD,14));
        citytextfield.setBounds(300,490,200,30);
        add(citytextfield);
        
        JLabel states=new JLabel("states :");
        states.setFont(new Font("Raleway",Font.BOLD,20));
        states.setBounds(100,540,200,30);
        add(states);
        
         statetextfield=new JTextField();
        statetextfield.setFont(new Font("Raleway",Font.BOLD,14));
        statetextfield.setBounds(300,540,200,30);
        add(statetextfield);
        
        JLabel pincode=new JLabel("Pincode :");
        pincode.setFont(new Font("Raleway",Font.BOLD,20));
        pincode.setBounds(100,590,200,30);
        add(pincode);
        
          pintextfield=new JTextField();
        pintextfield.setFont(new Font("Raleway",Font.BOLD,14));
        pintextfield.setBounds(300,590,200,30);
        add(pintextfield);
        
         next=new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBounds(620,660,80,30);
        next.addActionListener(this);
        add(next);
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
       String formno=""+random;
        String name=nameTextField.getText();
        String fname=fnameTextField.getText();
        String dob = ((JTextField) datechooser.getDateEditor().getUiComponent()).getText();
        String gender=null;
        if(male.isSelected()){
            gender="Male";
        }
        else if(female.isSelected()){
            gender="FeMale";
        }
        String email=emaila.getText();
        String marital=null;
        if(married.isSelected()){
            marital="Married";
        }else if(nomarried.isSelected()){
            marital="unmarried";
        }
        String address=addresstextfield.getText();
        String city=citytextfield.getText();
        String states=statetextfield.getText();
        String pincode=pintextfield.getText();
        
        try{
            if(name.equals("")){
                JOptionPane.showMessageDialog(null, "name is Required");
            }else{
                conn c=new conn();
                String query="Insert into singup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+states+"','"+pincode+"')";
                c.s.executeUpdate(query);
            }
        }catch (Exception e){
            System.out.println(e);
        }
        
    }
    
    public static void main(String args[]){
    new singupone();
    }

}
