package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class addDriver extends JFrame implements ActionListener{

    JTextField nametext,agetext,ccompanytext,cnametext,locationtext,licensetext;
    JComboBox gendercomboBox, availablecomboBox;
    JButton add,back;

    addDriver(){

        JPanel panel=new JPanel();
        panel.setBounds(5,5,875,490);
        panel.setBackground(new Color(13, 99, 94));
        panel.setLayout(null);
        add(panel);


        JLabel label=new JLabel("ADD DRIVER");
        label.setForeground(new Color(243,211,6));
        label.setFont(new Font("Tahoma",Font.BOLD,24));
        label.setBounds(154,20,160,25);
        panel.add(label);


        JLabel name=new JLabel("Name                : ");
        name.setForeground(new Color(234, 203, 178));
        name.setFont(new Font("Tahoma",Font.BOLD,18));
        name.setBounds(64,90,152,22);
        panel.add(name);

        nametext=new JTextField();
        nametext.setBounds(230,90,156,22);
        nametext.setBackground(new Color(41, 207, 186));
        nametext.setFont(new Font("Tahoma", Font.PLAIN,16));
        nametext.setForeground(Color.BLACK);
        panel.add(nametext);


        JLabel age=new JLabel("Age                    : ");
        age.setForeground(new Color(234, 203, 178));
        age.setFont(new Font("Tahoma",Font.BOLD,18));
        age.setBounds(64,140,152,22);
        panel.add(age);

        agetext=new JTextField();
        agetext.setBounds(230,140,156,22);
        agetext.setBackground(new Color(41, 207, 186));
        agetext.setFont(new Font("Tahoma", Font.PLAIN,16));
        agetext.setForeground(Color.BLACK);
        panel.add(agetext);


        JLabel Gender=new JLabel("Gender              : ");
        Gender.setForeground(new Color(234, 203, 178));
        Gender.setFont(new Font("Tahoma",Font.BOLD,18));
        Gender.setBounds(64,190,152,22);
        panel.add(Gender);

        gendercomboBox=new JComboBox(new String[] {"Male","Female"});
        gendercomboBox.setBounds(230,190,156,22);
        gendercomboBox.setBackground(new Color(41, 207, 186));
        gendercomboBox.setFont(new Font("Tahoma", Font.PLAIN,16));
        gendercomboBox.setForeground(Color.BLACK);
        panel.add(gendercomboBox);


        JLabel carcompany=new JLabel("Car Company   : ");
        carcompany.setForeground(new Color(234, 203, 178));
        carcompany.setFont(new Font("Tahoma",Font.BOLD,18));
        carcompany.setBounds(64,240,152,22);
        panel.add(carcompany);

        ccompanytext=new JTextField();
        ccompanytext.setBounds(230,240,156,22);
        ccompanytext.setBackground(new Color(41, 207, 186));
        ccompanytext.setFont(new Font("Tahoma", Font.PLAIN,16));
        ccompanytext.setForeground(Color.BLACK);
        panel.add(ccompanytext);


        JLabel carname=new JLabel("Car Name         : ");
        carname.setForeground(new Color(234, 203, 178));
        carname.setFont(new Font("Tahoma",Font.BOLD,18));
        carname.setBounds(64,290,152,22);
        panel.add(carname);

        cnametext=new JTextField();
        cnametext.setBounds(230,290,156,22);
        cnametext.setBackground(new Color(41, 207, 186));
        cnametext.setFont(new Font("Tahoma", Font.PLAIN,16));
        cnametext.setForeground(Color.BLACK);
        panel.add(cnametext);


        JLabel Available=new JLabel("Available           : ");
        Available.setForeground(new Color(234, 203, 178));
        Available.setFont(new Font("Tahoma",Font.BOLD,18));
        Available.setBounds(64,340,152,22);
        panel.add(Available);

        availablecomboBox=new JComboBox(new String[] {"Yes","No"});
        availablecomboBox.setBounds(230,340,156,22);
        availablecomboBox.setBackground(new Color(41, 207, 186));
        availablecomboBox.setFont(new Font("Tahoma", Font.PLAIN,16));
        availablecomboBox.setForeground(Color.BLACK);
        panel.add(availablecomboBox);



        JLabel location=new JLabel("Location            : ");
        location.setForeground(new Color(234, 203, 178));
        location.setFont(new Font("Tahoma",Font.BOLD,18));
        location.setBounds(64,390,152,22);
        panel.add(location);

        locationtext=new JTextField();
        locationtext.setBounds(230,390,156,22);
        locationtext.setBackground(new Color(41, 207, 186));
        locationtext.setFont(new Font("Tahoma", Font.PLAIN,16));
        locationtext.setForeground(Color.BLACK);
        panel.add(locationtext);


        JLabel license=new JLabel("License              : ");
        license.setForeground(new Color(234, 203, 178));
        license.setFont(new Font("Tahoma",Font.BOLD,18));
        license.setBounds(64,440,152,22);
        panel.add(license);

        licensetext=new JTextField();
        licensetext.setBounds(230,440,156,22);
        licensetext.setBackground(new Color(41, 207, 186));
        licensetext.setFont(new Font("Tahoma", Font.PLAIN,16));
        licensetext.setForeground(Color.BLACK);
        panel.add(licensetext);


        ImageIcon im1=new ImageIcon(ClassLoader.getSystemResource("icon/liscense2.png"));
        Image i=im1.getImage().getScaledInstance(350,350,Image.SCALE_DEFAULT);
        ImageIcon im2=new ImageIcon(i);
        JLabel label2=new JLabel(im2);
        label2.setBounds(475,50,350,350);
        panel.add(label2);


        add=new JButton("ADD");
        add.setFont(new Font("Tahoma",Font.BOLD,18));
        add.setForeground(new Color(243,211,6));
        add.setBackground(Color.BLACK);
        add.setBounds(580,375,117,30);
        add.addActionListener(this);
        panel.add(add);


        back=new JButton("BACK");
        back.setFont(new Font("Tahoma",Font.BOLD,18));
        back.setForeground(new Color(243,211,6));
        back.setBackground(Color.BLACK);
        back.setBounds(580,420,117,30);
        back.addActionListener(this);
        panel.add(back);


        setUndecorated(true);
        setSize(885,500);
        setLayout(null);
        setLocation(27,130);
        setVisible(true);
    }


    public void actionPerformed(ActionEvent e){
        if(e.getSource()==add){
            try{
                String name=nametext.getText();
                String age=agetext.getText();
                String gender=(String) gendercomboBox.getSelectedItem();
                String company=ccompanytext.getText();
                String carname=cnametext.getText();
                String available=(String)availablecomboBox.getSelectedItem();
                String location=locationtext.getText();
                String license=licensetext.getText();

                database c=new database();
                String q="insert into driver values ( '"+name+"' , '"+age+"' , '"+gender+"' , '"+company+"' , '"+carname+"' , '"+available+"' , '"+location+"' , '"+license+"')" ;
                c.statement.executeUpdate(q);
                JOptionPane.showMessageDialog(null,"Driver Added");
                setVisible(false);
            }
            catch(Exception E){E.printStackTrace();}
        }
        else{
            setVisible(false);
        }
    }


    public static void main(String ars[]){
        new addDriver();
    }
}
