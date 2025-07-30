package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JTextField;

public class SignupTwo extends JFrame implements ActionListener {
    JTextField pan, aadhar;
    JButton next;
    JRadioButton eyes, eno, syes,sno;
    JComboBox religion, category, occupation, education, income;
    String formno;

    SignupTwo(String formno ){
        this.formno = formno;
        setLayout(null);
        setTitle("New account Application Form - page 2");

        JLabel aditionalDetails = new JLabel("Page 2: Aditional Details ");
        aditionalDetails.setFont(new Font("Raleway", Font.BOLD,22));
        aditionalDetails.setBounds(290,80,400,40);
        add(aditionalDetails);

        JLabel name = new JLabel("Religion:");
        name.setFont(new Font("Raleway", Font.BOLD,22));
        name.setBounds(100,140,100,30);
        add(name);

        String valReligion[] = {"Hindu","Muslim","Sikh","Christain","Other"};
        religion = new JComboBox(valReligion);
        religion.setBounds(300,140,400,30);
        religion.setBackground(Color.WHITE);
        add(religion);


        JLabel fname = new JLabel("Category ");
        fname.setFont(new Font("Raleway", Font.BOLD,22));
        fname.setBounds(100,190,200,30);
        add(fname);

        String valcategory[] ={"Open","OBC","SC","ST","Other"};
        category = new JComboBox(valcategory);
        category.setBounds(300,190,400,30);
        category.setBackground(Color.WHITE);
        add(category);



        JLabel dob = new JLabel("Income");
        dob.setFont(new Font("Raleway", Font.BOLD,22));
        dob.setBounds(100,240,200,30);
        add(dob);

        String incomecategory[] ={"null","<1,50,000","<2,50,000","<5,00,000","upto 10,00,000"};
        income = new JComboBox(incomecategory);
        income.setBounds(300,240,400,30);
        income.setBackground(Color.WHITE);
        add(income);


        JLabel gender  = new JLabel("Educational :");
        gender.setFont(new Font("Raleway", Font.BOLD,22));
        gender.setBounds(100,290,200,30);
        add(gender);

        String educatinalValues[] ={"none Graduation","Graduation","Post-Graduation","Doctrate","Others"};
        education = new JComboBox(educatinalValues);
        education.setBounds(300,315,400,30);
        education.setBackground(Color.WHITE);
        add(education);



        JLabel email  = new JLabel("Qualification");
        email.setFont(new Font("Raleway", Font.BOLD,22));
        email.setBounds(100,315,200,30);
        add(email);


        JLabel Marital  = new JLabel("Occupation");
        Marital.setFont(new Font("Raleway", Font.BOLD,22));
        Marital.setBounds(100,390,200,30);
        add(Marital);

        String occupationalvalues[] ={"Salaried","Self employed","Bussiness","Student","Retired","Other"};
        occupation = new JComboBox(occupationalvalues);
        occupation.setBounds(300,390,400,30);
        occupation.setBackground(Color.WHITE);
        add(occupation);


        eyes = new JRadioButton("Yes");
        eyes.setBounds(300,390,100,30);
        eyes.setBackground(Color.WHITE);
        add(eyes);

        eno = new JRadioButton("No");
        eno.setBounds(450,390,100,30);
        eno.setBackground(Color.WHITE);
        add(eno);

        ButtonGroup materialgroup = new ButtonGroup();
        materialgroup.add(eyes);
        materialgroup.add(eno);


        JLabel panno  = new JLabel("Pan no :");
        panno.setFont(new Font("Raleway", Font.BOLD,22));
        panno.setBounds(100,440,200,30);
        add(panno);

        pan = new JTextField();
        pan.setFont(new Font("Raleway",Font.BOLD,14));
        pan.setBounds(300,440,400,30);
        add(pan);

        JLabel Address  = new JLabel("Aaddhar No: ");
        Address.setFont(new Font("Raleway", Font.BOLD,22));
        Address.setBounds(100,490,200,30);
        add(Address);


        JLabel city  = new JLabel("Senior citizer:");
        city.setFont(new Font("Raleway", Font.BOLD,22));
        city.setBounds(100,540,200,30);
        add(city);

        syes = new JRadioButton("Yes");
        syes.setBounds(300,540,100,30);
        syes.setBackground(Color.WHITE);
        add(syes);

        sno = new JRadioButton("No");
        sno.setBounds(450,540,100,30);
        sno.setBackground(Color.WHITE);
        add(sno);


        aadhar = new JTextField();
        aadhar.setFont(new Font("Raleway",Font.BOLD,14));
        aadhar.setBounds(300,490,400,30);
        add(aadhar);

        JLabel pincode  = new JLabel("Exisiting Account:");
        pincode.setFont(new Font("Raleway", Font.BOLD,22));
        pincode.setBounds(100,590,200,30);
        add(pincode);

        syes = new JRadioButton("Yes");
        syes.setBounds(300,590,100,30);
        syes.setBackground(Color.WHITE);
        add(syes);

        sno = new JRadioButton("No");
        sno.setBounds(450,590,100,30);
        sno.setBackground(Color.WHITE);
        add(sno);

        ButtonGroup ematerialgroup = new ButtonGroup();
        ematerialgroup.add(syes);
        ematerialgroup.add(sno);


        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBounds(620,660,80,30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(Color.WHITE);
        setSize(850,800);
        setLocation(250,10);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        String sreligion = (String)religion.getSelectedItem();
        String scategory = (String) category.getSelectedItem();
        String sincome = (String) income.getSelectedItem();
        String seducation = (String) education.getSelectedItem();
        String soccupation = (String) occupation.getSelectedItem();
        String seniorcitizen = null;


        if(syes.isSelected()){
            seniorcitizen = "Yes";
        } else if (sno.isSelected()){
            seniorcitizen = "No";
        }

        String exisitingaccount = null;
        if(eyes.isSelected()){
            exisitingaccount = "Yes";
        } else if(eno.isSelected()){
            exisitingaccount = "No";
        }

        String span = pan.getText();
        String saadhar = aadhar.getText();


        try{
                Conn c = new Conn();
                String Query = "insert into signuptwo values('"+formno+"', '"+sreligion+"','"+scategory+"','"+sincome+"','"+seducation+"','"+soccupation+"','"+span+"','"+saadhar+"','"+seniorcitizen+"','"+exisitingaccount+"')";
                c.s.executeUpdate(Query);

                // sign up three Object
                setVisible(false);
                new SignupThree(formno).setVisible(true);
        }catch(Exception e){
            System.out.println(e);
        }

    }
    public static void main(String[] args) {
        new SignupTwo("");
    }
}


