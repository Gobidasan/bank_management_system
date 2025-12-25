package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class singuptwo extends JFrame implements ActionListener{
    
    JTextField pan,aadar;
    JButton next;
    
    JRadioButton syes,sno,eyes,eno;
    JComboBox religion,category,income,education,occupation;
    String formno;
    singuptwo(String formno){
        this.formno=formno;
        setLayout(null);
        setTitle("New Account Application Form-Page2");
       
        
        
        JLabel additionalDetails=new JLabel("page 2: Additional Details");
        additionalDetails.setFont(new Font("Raleway",Font.BOLD,22));
        additionalDetails.setBounds(290,80,400,30);
        add(additionalDetails);
        
        JLabel name=new JLabel("Religion :");
        name.setFont(new Font("Raleway",Font.BOLD,20));
        name.setBounds(100,140,100,30);
        add(name);
        
        String[] valReligion={"Hindu","musilim","cristin"};
        religion =new JComboBox(valReligion);
        religion.setBackground(Color.WHITE);
        religion.setBounds(300,140,400,30);
        add(religion);
        
        JLabel fname=new JLabel("category :");
        fname.setFont(new Font("Raleway",Font.BOLD,20));
        fname.setBounds(100,190,200,30);
        add(fname);
        
        String[] valcategory={"mbc","bc","oc","sc","st"};
        category =new JComboBox(valcategory);
        category.setBackground(Color.WHITE);
        category.setBounds(300,190,400,30);
        add(category);

        JLabel dob=new JLabel("Income :");
        dob.setFont(new Font("Raleway",Font.BOLD,20));
        dob.setBounds(100,240,200,30);
        add(dob);
        
        String[] valincome={"null","<100000","<500000","<1000000",">1000000"};
        income =new JComboBox(valincome);
        income.setBackground(Color.WHITE);
        income.setBounds(300,240,300,30);
        add(income);
        

        
        JLabel gender=new JLabel("Education");
        gender.setFont(new Font("Raleway",Font.BOLD,20));
        gender.setBounds(100,290,200,30);
        add(gender);
        
        JLabel email=new JLabel("Quatification :");
        email.setFont(new Font("Raleway",Font.BOLD,20));
        email.setBounds(100,315,200,30);
        add(email);
        
        String[] valeducation={"non-graduate","graduate","post-graduate","phd",};
        education =new JComboBox(valeducation);
        education.setBackground(Color.WHITE);
        education.setBounds(300,315,400,30);
        add(education);

        
        
        JLabel marital=new JLabel("Occupation :");
        marital.setFont(new Font("Raleway",Font.BOLD,20));
        marital.setBounds(100,390,200,30);
        add(marital);
        
        String[] valoccupation={"salaried","self-employee","business","student",};
        occupation =new JComboBox(valoccupation);
        occupation.setBackground(Color.WHITE);
        occupation.setBounds(300,390,400,30);
        add(occupation);
        
        JLabel adress=new JLabel("Pan Number :");
        adress.setFont(new Font("Raleway",Font.BOLD,20));
        adress.setBounds(100,440,200,30);
        add(adress);
        
        pan=new JTextField();
        pan.setFont(new Font("Raleway",Font.BOLD,14));
        pan.setBounds(300,440,400,30);
        add(pan);
        
        JLabel city=new JLabel("Aadhar number :");
        city.setFont(new Font("Raleway",Font.BOLD,20));
        city.setBounds(100,490,200,30);
        add(city);
        
        aadar=new JTextField();
        aadar.setFont(new Font("Raleway",Font.BOLD,14));
        aadar.setBounds(300,490,200,30);
        add(aadar);
        
        JLabel states=new JLabel("Senior citizen :");
        states.setFont(new Font("Raleway",Font.BOLD,20));
        states.setBounds(100,540,200,30);
        add(states);
        
        syes=new JRadioButton("yes");
        syes.setBounds(300,540,100,30);
        syes.setBackground(Color.WHITE);
        add(syes);
        
        sno=new JRadioButton("no");
        sno.setBounds(450,540,100,30);
        sno.setBackground(Color.WHITE);
        add(sno);
        
        ButtonGroup sen=new ButtonGroup();
        sen.add(syes);
        sen.add(sno);
        
        JLabel pincode=new JLabel("Exiting Account :");
        pincode.setFont(new Font("Raleway",Font.BOLD,20));
        pincode.setBounds(100,590,200,30);
        add(pincode);
        
        eyes=new JRadioButton("yes");
        eyes.setBounds(300,590,100,30);
        eyes.setBackground(Color.WHITE);
        add(eyes);
        
        eno=new JRadioButton("no");
        eno.setBounds(450,590,100,30);
        eno.setBackground(Color.WHITE);
        add(eno);
        
        ButtonGroup en=new ButtonGroup();
        en.add(eyes);
        en.add(eno);
       
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
       
        String sreligion= (String)religion.getSelectedItem();
        String scategory=(String)category.getSelectedItem();
        String sincome = (String) income.getSelectedItem();
        String seducation = (String) education.getSelectedItem();
        String soccupation = (String) occupation.getSelectedItem();
        
        String sen=null;
        if(syes.isSelected()){
            sen="yes";
        }
        else if(sno.isSelected()){
            sen="No";
        }
        
        String en=null;
        if(eyes.isSelected()){
            en="yes";
        }else if(eno.isSelected()){
            en="no";
        }
        
        String span=pan.getText();
        String saadar=aadar.getText();
        
        
        try{
                conn c=new conn();
                String query="Insert into singuptwo values('"+formno+"','"+sreligion+"','"+scategory+"','"+sincome+"','"+seducation+"','"+soccupation+"','"+span+"','"+saadar+"','"+sen+"','"+en+"')";
                c.s.executeUpdate(query);
           //object 3
        }catch (Exception e){
            System.out.println(e);
        }
    }
    public static void main(String args[]){
    new singuptwo("");
    }
}
