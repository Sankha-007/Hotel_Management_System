package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddEmployee extends JFrame implements ActionListener{

    JTextField nametext,agetext,salarytext,phonetext,aadhartext,emailtext;
    JRadioButton radioButtonM,radioButtonF;
    JComboBox comboBox;
    JButton add,back;

    AddEmployee(){

        super("HOTEL MANAGEMENT SYSTEM - ADD EMPLOYEE");

        JPanel panel=new JPanel();
        panel.setBounds(5,5,875,490);
        panel.setBackground(new Color(13, 99, 94));
        panel.setLayout(null);
        add(panel);

        JLabel name=new JLabel("Name             : ");
        name.setBounds(60,40,150,27);
        name.setFont(new Font("Tahoma",Font.BOLD,18));
        name.setForeground(new Color(234, 203, 178));
        panel.add(name);

        nametext=new JTextField();
        nametext.setBounds(200,40,150,27);
        nametext.setBackground(new Color(41, 207, 186));
        nametext.setForeground(Color.BLACK);
        nametext.setFont(new Font("Tahoma",Font.PLAIN,16));
        panel.add(nametext);


        JLabel age=new JLabel("Age                 : ");
        age.setBounds(60,100,150,27);
        age.setForeground(new Color(234, 203, 178));
        age.setFont(new Font("Tahoma",Font.BOLD,18));
        panel.add(age);

        agetext=new JTextField();
        agetext.setBounds(200,100,150,27);
        agetext.setForeground(Color.BLACK);
        agetext.setBackground(new Color(41,207,186));
        agetext.setFont(new Font("Tahoma",Font.PLAIN,16));
        panel.add(agetext);


        JLabel gender=new JLabel("Gender           : ");
        gender.setBounds(60,150,150,27);
        gender.setForeground(new Color(234, 203, 178));
        gender.setFont(new Font("Tahoma",Font.BOLD,18));
        panel.add(gender);

        radioButtonM = new JRadioButton("Male");
        radioButtonM.setBounds(200,150,70,27);
        radioButtonM.setBackground(new Color(13, 99, 94));
        radioButtonM.setFont(new Font("Tahoma",Font.BOLD,17));
        radioButtonM.setForeground(Color.BLACK);
        panel.add(radioButtonM);

        radioButtonF = new JRadioButton("Female");
        radioButtonF.setBounds(280,150,110,27);
        radioButtonF.setBackground(new Color(13, 99, 94));
        radioButtonF.setFont(new Font("Tahoma",Font.BOLD,17));
        radioButtonF.setForeground(Color.BLACK);
        panel.add(radioButtonF);

        JLabel job=new JLabel("Job                  : ");
        job.setBounds(60,200,150,27);
        job.setForeground(new Color(234, 203, 178));
        job.setFont(new Font("Tahoma",Font.BOLD,18));
        panel.add(job);

        comboBox=new JComboBox(new String [] {"Front Desk","House Keeping","Kitchen Staff","Room Service","Manager","Chef","Accountant"});
        comboBox.setBackground(new Color(41,207,186));
        comboBox.setFont(new Font("Tahoma",Font.PLAIN,16));
        comboBox.setBounds(200,200,150,30);
        comboBox.setForeground(Color.BLACK);
        panel.add(comboBox);


        JLabel salary=new JLabel("Salary             :");
        salary.setBounds(60,250,150,27);
        salary.setForeground(new Color(234,203,178));
        salary.setFont(new Font("Tahoma",Font.BOLD,18));
        panel.add(salary);

        salarytext=new JTextField();
        salarytext.setBackground(new Color(41,207,186));
        salarytext.setForeground(Color.BLACK);
        salarytext.setFont(new Font("Tahoma",Font.PLAIN,16));
        salarytext.setBounds(200,250,150,27);
        panel.add(salarytext);


        JLabel phone=new JLabel("Phone             : ");
        phone.setBounds(60,300,150,27);
        phone.setForeground(new Color(234,203,178));
        phone.setFont(new Font("Tahoma",Font.BOLD,18));
        panel.add(phone);

        phonetext=new JTextField();
        phonetext.setBounds(200,300,150,27);
        phonetext.setBackground(new Color(41,207,186));
        phonetext.setForeground(Color.BLACK);
        phonetext.setFont(new Font("Tahoma",Font.PLAIN,16));
        panel.add(phonetext);


        JLabel aadhar=new JLabel("Aadhar No.    : ");
        aadhar.setBounds(60,350,150,27);
        aadhar.setForeground(new Color(234,203,178));
        aadhar.setFont(new Font("Tahoma",Font.BOLD,18));
        panel.add(aadhar);

        aadhartext=new JTextField();
        aadhartext.setBounds(200,350,150,27);
        aadhartext.setBackground(new Color(41,207,186));
        aadhartext.setForeground(Color.BLACK);
        aadhartext.setFont(new Font("Tahoma",Font.PLAIN,16));
        panel.add(aadhartext);


        JLabel email=new JLabel("Email ID         : ");
        email.setBounds(60,400,150,27);
        email.setForeground(new Color(234,203,178));
        email.setFont(new Font("Tahoma",Font.BOLD,18));
        panel.add(email);

        emailtext=new JTextField();
        emailtext.setBounds(200,400,150,27);
        emailtext.setBackground(new Color(41,207,186));
        emailtext.setForeground(Color.BLACK);
        emailtext.setFont(new Font("Tahoma",Font.PLAIN,16));
        panel.add(emailtext);


        JLabel  label=new JLabel("ADD EMPLOYEE DETAILS");
        label.setForeground(new Color(243,211,6));
        label.setFont(new Font("Tahoma",Font.BOLD,30));
        label.setBounds(430,50,445,35);
        panel.add(label);


        ImageIcon im1=new ImageIcon(ClassLoader.getSystemResource("icon/EMPLOYEES1.png"));
        Image i=im1.getImage().getScaledInstance(250,250,Image.SCALE_DEFAULT);
        ImageIcon im2=new ImageIcon(i);
        JLabel label2=new JLabel(im2);
        label2.setBounds(500,115,250,250);
        panel.add(label2);


        add=new JButton("ADD");
        add.setBounds(550,380,117,30);
        add.setForeground(new Color(243,211,6));
        add.setBackground(Color.BLACK);
        add.setFont(new Font("Tahoma",Font.BOLD,17));
        add.addActionListener(this);
        panel.add(add);

        back=new JButton("BACK");
        back.setBounds(550,430,117,30);
        back.setForeground(new Color(243,211,6));
        back.setBackground(Color.BLACK);
        back.setFont(new Font("Tahoma",Font.BOLD,17));
        back.addActionListener(this);
        panel.add(back);


        setUndecorated(true);
        setLayout(null);
        setSize(885,500);
        setLocation(27,130);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource()==add){
            try{
                String name=nametext.getText();
                String age=agetext.getText();
                String salary=salarytext.getText();
                String phone=phonetext.getText();
                String email=emailtext.getText();
                String aadhar=aadhartext.getText();
                String job= (String) comboBox.getSelectedItem();
                String gender=null;
                if(radioButtonM.isSelected()){
                    gender="Male";
                }
                else if(radioButtonF.isSelected()){
                    gender="Female";
                }

                database c=new database();
                String q="insert into employee values ( '"+name+"' , '"+age+"' , '"+gender+"' , '"+job+"' , '"+salary+"' , '"+phone+"' , '"+email+"' , '"+aadhar+"') ";
                c.statement.executeUpdate(q);

                JOptionPane.showMessageDialog(null,"Employee Added");
                setVisible(false);
            }
            catch(Exception E){E.printStackTrace();}
        }
        else{
            setVisible(false);
        }
    }

    public static void main(String ars[]){
        new AddEmployee();
    }
}
