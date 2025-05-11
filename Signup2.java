package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup2 extends JFrame implements ActionListener {
    JComboBox comboBox,comboBox2,comboBox3,comboBox4,comboBox5;
    JRadioButton r1,r2;
    JButton next;
    JTextField textPan,textAdhaar;
    String formno;
    Signup2(String formno){

        super("Application Form");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150,5,100,100);
        add(image);

        this.formno = formno;

        JLabel l1 = new JLabel("Page 2 :-");
        l1.setFont(new Font("Raleway",Font.BOLD,22));
        l1.setBounds(300,30,600,40);
        add(l1);

        JLabel l2 = new JLabel("Additional Details");
        l2.setFont(new Font("Raleway", Font.BOLD,22));
        l2.setBounds(300,60,600,40);
        add(l2);

        JLabel l3 = new JLabel("Religion :");
        l3.setFont(new Font("Raleway", Font.BOLD,18));
        l3.setBounds(100,120,100,30);
        add(l3);

        String religion[] = {"Hindu", "Muslim","Sikh","Christian","Other"};
        comboBox = new JComboBox(religion);
        comboBox.setBackground(new Color(252,208,76));
        comboBox.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox.setBounds(350,120,320,30);
        add(comboBox);

        JLabel l4 = new JLabel("Category :");
        l4.setFont(new Font("Raleway", Font.BOLD,18));
        l4.setBounds(100,170,100,30);
        add(l4);

        String category[] = {"General", "OBC","SC","ST","Other"};
        comboBox2 = new JComboBox(category);
        comboBox2.setBackground(new Color(252,208,76));
        comboBox2.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox2.setBounds(350,170,320,30);
        add(comboBox2);

        JLabel l5 = new JLabel("Income :");
        l5.setFont(new Font("Raleway", Font.BOLD,18));
        l5.setBounds(100,220,100,30);
        add(l5);

        String income[] = {"Null", "<1,50,000","<2,50,000","5,00,000","Upto 10,00,000","Above 10,00,000"};
        comboBox3 = new JComboBox(income);
        comboBox3.setBackground(new Color(252,208,76));
        comboBox3.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox3.setBounds(350,220,320,30);
        add(comboBox3);

        JLabel l6 = new JLabel("Qualification :");
        l6.setFont(new Font("Raleway", Font.BOLD,18));
        l6.setBounds(100,270,150,30);
        add(l6);

        String qualification[] = {"Non-Graduate", "Graduate","Post-Graduate","Doctrate","Other"};
        comboBox4 = new JComboBox(qualification);
        comboBox4.setBackground(new Color(252,208,76));
        comboBox4.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox4.setBounds(350,270,320,30);
        add(comboBox4);

        JLabel l7 = new JLabel("Occupation :");
        l7.setFont(new Font("Raleway", Font.BOLD,18));
        l7.setBounds(100,320,150,30);
        add(l7);

        String occupation[] = {"Salaried", "Self-Employed","Business","Student","Retired"};
        comboBox5 = new JComboBox(occupation);
        comboBox5.setBackground(new Color(252,208,76));
        comboBox5.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox5.setBounds(350,320,320,30);
        add(comboBox5);

        JLabel l8 = new JLabel("PAN Number :");
        l8.setFont(new Font("Raleway", Font.BOLD,18));
        l8.setBounds(100,370,150,30);
        add(l8);

        textPan = new JTextField();
        textPan.setBackground(new Color(252,208,76));
        textPan.setFont(new Font("Raleway", Font.BOLD,18));
        textPan.setBounds(350,370,320,30);
        add(textPan);

        JLabel l9 = new JLabel("Adhaar Number :");
        l9.setFont(new Font("Raleway", Font.BOLD,18));
        l9.setBounds(100,420,150,30);
        add(l9);

        textAdhaar = new JTextField();
        textAdhaar.setBackground(new Color(252,208,76));
        textAdhaar.setFont(new Font("Raleway", Font.BOLD,18));
        textAdhaar.setBounds(350,420,320,30);
        add(textAdhaar);

        JLabel l10 = new JLabel("Senior Citizen :");
        l10.setFont(new Font("Raleway", Font.BOLD,18));
        l10.setBounds(100,470,150,30);
        add(l10);

        r1 = new JRadioButton("YES");
        r1.setFont(new Font("Raleway", Font.BOLD,14));
        r1.setBackground(new Color(252,208,76));
        r1.setBounds(350,470,100,30);
        add(r1);

        r2 = new JRadioButton("NO");
        r2.setFont(new Font("Raleway", Font.BOLD,14));
        r2.setBackground(new Color(252,208,76));
        r2.setBounds(450,470,100,30);
        add(r2);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);



        JLabel l11 = new JLabel("Existing User :");
        l11.setFont(new Font("Raleway", Font.BOLD,18));
        l11.setBounds(100,520,150,30);
        add(l11);

        r1 = new JRadioButton("YES");
        r1.setFont(new Font("Raleway", Font.BOLD,14));
        r1.setBackground(new Color(252,208,76));
        r1.setBounds(350,520,100,30);
        add(r1);

        r2 = new JRadioButton("NO");
        r2.setFont(new Font("Raleway", Font.BOLD,14));
        r2.setBackground(new Color(252,208,76));
        r2.setBounds(450,520,100,30);
        add(r2);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(r1);
        buttonGroup1.add(r2);

        JLabel l12 = new JLabel("Form Number :");
        l12.setFont(new Font("Raleway", Font.BOLD,14));
        l12.setBounds(700,10,140,30);
        add(l12);

        JLabel l13 = new JLabel(formno);
        l13.setFont(new Font("Raleway", Font.BOLD,18));
        l13.setBounds(800,10,230,30);
        add(l13);

        next = new JButton("Next");
        next.setFont(new Font("Raleway", Font.BOLD,14));
        next.setBackground(Color.GRAY);
        next.setForeground(Color.BLACK);
        next.setBounds(570,640,100,30);
        next.addActionListener(this);
        add(next);







        setLayout(null);
        setSize(850,750);
        setLocation(450,80);
        getContentPane().setBackground(new Color(252,208,76));
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String rel = (String) comboBox.getSelectedItem();
        String cate = (String) comboBox2.getSelectedItem();
        String inc = (String) comboBox3.getSelectedItem();
        String edu = (String) comboBox4.getSelectedItem();
        String occ =(String) comboBox5.getSelectedItem();

        String pan = textPan.getText();
        String addhar = textAdhaar.getText();

        String scitizen = " ";
        if((r1.isSelected())){
            scitizen = "Yes";
        } else if (r2.isSelected()) {
           scitizen = "No";
        }

        String eAccount = " ";
        if((r1.isSelected())){
            eAccount = "Yes";
        } else if (r2.isSelected()) {
            eAccount = "No";
        }

        try{
            if(textPan.getText().equals("") || textAdhaar.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Fill all the fields");
            }else{
                con c1 = new con();
                String q = "insert into Signup2 values('"+formno+"','"+rel+"','"+cate+"','"+inc+"','"+edu+"','"+occ+"','"+pan+"','"+addhar+"','"+scitizen+"','"+eAccount+"')";
                c1.statement.executeUpdate(q);
                new Signup3(formno);
                setVisible(false);

            }
        }catch (Exception E){
            E.printStackTrace();
        }


    }

    public static void main(String[] args) {
        new Signup2("");
    }
}
