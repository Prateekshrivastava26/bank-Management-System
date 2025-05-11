package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup extends JFrame implements ActionListener {
    JRadioButton r1,r2,r3;
    JButton next;

    JTextField textName, textFName ,textEmail  , textState,textPIN ,textAd ,textCity;
    JDateChooser dateChooser;
    Random ran = new Random();
    long first4  = (ran.nextLong() % 9000L)+1000L;
    String  first = " "+Math.abs(first4);
    Signup(){
        super("Application Form");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25,10,100,100);
        add(image);

        JLabel label1 = new JLabel("Application Form No."+first);
        label1.setBounds(160,20,600,40);
        label1.setFont(new Font("Raleway",Font.BOLD,38));
        add(label1);

        JLabel label2 = new JLabel("Page 1");
        label2.setFont(new Font("Raleway",Font.BOLD,22));
        label2.setBounds(330,70,600,30);
        add(label2);

        JLabel label3 = new JLabel("Personal Detail");
        label3.setFont(new Font("Raleway",Font.BOLD,22));
        label3.setBounds(290,90,600,30);
        add(label3);

        JLabel labelName = new JLabel("Name :");
        labelName.setFont(new Font("Raleway",Font.BOLD,20));
        labelName.setBounds(100,190,100,30);
        add(labelName);

        textName = new JTextField();
        textName.setFont(new Font("Raleway",Font.BOLD,14));
        textName.setBounds(300,190,400,30);
        add(textName);



        JLabel labelfName = new JLabel("Father's Name :");
        labelfName.setFont(new Font("Raleway",Font.BOLD,20));
        labelfName.setBounds(100,240,200,30);
        add(labelfName);

        textFName = new JTextField();
        textFName.setFont(new Font("Raleway",Font.BOLD,14));
        textFName.setBounds(300,240,400,30);
        add(textFName);


        JLabel DOB = new JLabel("Date Of Birth :");
        DOB.setFont(new Font("Raleway",Font.BOLD,20));
        DOB.setBounds(100,340,200,30);
        add(DOB);


        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(300,340,400,30);
        add(dateChooser);



        JLabel labelG = new JLabel("Gender");
        labelG.setFont(new Font("Raleway",Font.BOLD,20));
        labelG.setBounds(100,290,200,30);
        add(labelG);

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Raleway",Font.BOLD,20));
        r1.setBackground(new Color(222,255,228));
        r1.setBounds(300,290,90,30);
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Raleway",Font.BOLD,20));
        r2.setBackground(new Color(222,255,228));
        r2.setBounds(450,290,120,30);
        add(r2);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);

        JLabel email = new JLabel("Email Address :");
        email.setFont(new Font("Raleway",Font.BOLD,20));
        email.setBounds(100,390,200,30);
        add(email);

        textEmail = new JTextField();
        textEmail.setFont(new Font("Raleway",Font.BOLD,14));
        textEmail.setBounds(300,390,400,30);
        add(textEmail);

        JLabel marridStatus = new JLabel("Marital Status :");
        marridStatus.setFont(new Font("Raleway",Font.BOLD,20));
        marridStatus.setBounds(100,440,200,30);
        add(marridStatus);


        r1 = new JRadioButton("Married");
        r1.setFont(new Font("Raleway",Font.BOLD,20));
        r1.setBackground(new Color(222,255,228));
        r1.setBounds(300,440,100,30);
        add(r1);

        r2 = new JRadioButton("Unmarried");
        r2.setFont(new Font("Raleway",Font.BOLD,20));
        r2.setBackground(new Color(222,255,228));
        r2.setBounds(420,440,150,30);
        add(r2);

        r3 = new JRadioButton("Other");
        r3.setFont(new Font("Raleway",Font.BOLD,20));
        r3.setBackground(new Color(222,255,228));
        r3.setBounds(570,440,220,30);
        add(r3);

        ButtonGroup buttonGroup2 = new ButtonGroup();
        buttonGroup2.add(r1);
        buttonGroup2.add(r2);
        buttonGroup2.add(r3);



        JLabel address = new JLabel("Address :");
        address.setFont(new Font("Raleway",Font.BOLD,20));
        address.setBounds(100,490,200,30);
        add(address);

        textAd = new JTextField();
        textAd.setFont(new Font("Raleway",Font.BOLD,14));
        textAd.setBounds(300,490,400,30);
        add(textAd);


        JLabel city = new JLabel("City :");
        city.setFont(new Font("Raleway",Font.BOLD,20));
        city.setBounds(100,540,200,30);
        add(city);

        textCity = new JTextField();
        textCity.setFont(new Font("Raleway",Font.BOLD,14));
        textCity.setBounds(300,540,400,30);
        add(textCity);

        JLabel PIN = new JLabel("PIN Code :");
        PIN.setFont(new Font("Raleway",Font.BOLD,20));
        PIN.setBounds(100,590,200,30);
        add(PIN);

        textPIN = new JTextField();
        textPIN.setFont(new Font("Raleway",Font.BOLD,14));
        textPIN.setBounds(300,590,400,30);
        add(textPIN);


        JLabel state = new JLabel("State :");
        state.setFont(new Font("Raleway",Font.BOLD,20));
        state.setBounds(100,640,200,30);
        add(state);

        textState = new JTextField();
        textState.setFont(new Font("Raleway",Font.BOLD,14));
        textState.setBounds(300,640,400,30);
        add(textState);

        next = new JButton("next");
        next.setFont(new Font("Raleway",Font.BOLD,20));
        next.setBackground(Color.GRAY);
        next.setForeground(Color.BLACK);
        next.setBounds(600,690,80,30);
        next.addActionListener(this);
        add(next);




        getContentPane().setBackground(new Color(222,255,228));
        setLayout(null);
        setSize(850,800);
        setLocation(360,40);
        setVisible(true);



    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String formno = first;
        String name = textName.getText();
        String fname = textFName.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(r1.isSelected()){
            gender = "Male";
        }else if(r2.isSelected()){
            gender = "Female";
        }
        String email = textEmail.getText();
        String marital = null;
        if(r1.isSelected()){
            marital = "Married";
        } else if (r2.isSelected()) {
            marital = "Unmarried";
        } else if (r3.isSelected()) {
            marital="Other";
        }
        String address = textAd.getText();
        String city = textCity.getText();
        String pin = textPIN.getText();
        String state = textState.getText();

        try{
            if(textName.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Fill all the fields");
            }else{
                con con1 = new con();
                String q = "insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pin+"','"+state+"')";
                con1.statement.executeUpdate(q);
                new Signup2(formno);
                setVisible(false);
            }
        }catch (Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Signup();
    }
}

