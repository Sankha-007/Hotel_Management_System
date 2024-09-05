package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class NewCustomer extends JFrame implements ActionListener{

    JTextField numtext,nametext,countrytext,deposittext;
    JComboBox idcomboBox;
    JRadioButton M,F;
    Choice c1;
    JLabel date;
    JButton add,back;

    NewCustomer(){

        JPanel panel=new JPanel();
        panel.setBounds(5,5,890,590);
        panel.setBackground(new Color(13, 99, 94));
        panel.setLayout(null);
        add(panel);

        ImageIcon im1=new ImageIcon(ClassLoader.getSystemResource("icon/customer.png"));
        Image i=im1.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT);
        ImageIcon im2=new ImageIcon(i);
        JLabel label1=new JLabel(im2);
        label1.setBounds(450,90,500,340);
        panel.add(label1);

        JLabel label2=new JLabel("NEW CUSTOMER FORM");
        label2.setForeground(new Color(243,211,6));
        label2.setFont(new Font("Tahoma",Font.BOLD,24));
        label2.setBounds(100,11,320,53);
        panel.add(label2);

        JLabel id=new JLabel("ID                                  :");
        id.setForeground(new Color(234, 203, 178));
        id.setBounds(45,85,200,20);
        id.setFont(new Font("Tahoma",Font.BOLD,18));
        panel.add(id);

        idcomboBox=new JComboBox(new String[] {"Voter ID","Aadhar Card","PAN Card","Driving License","Passport"});
        idcomboBox.setForeground(Color.BLACK);
        idcomboBox.setBackground(new Color(41, 207, 186));
        idcomboBox.setBounds(270,85,150,20);
        idcomboBox.setFont(new Font("Tahoma",Font.PLAIN,15));
        panel.add(idcomboBox);


        JLabel number=new JLabel("NUMBER                      :");
        number.setForeground(new Color(234, 203, 178));
        number.setBounds(45,145,200,20);
        number.setFont(new Font("Tahoma",Font.BOLD,18));
        panel.add(number);

        numtext=new JTextField();
        numtext.setForeground(Color.BLACK);
        numtext.setBackground(new Color(41, 207, 186));
        numtext.setBounds(270,145,150,20);
        numtext.setFont(new Font("Tahoma",Font.PLAIN,15));
        panel.add(numtext);


        JLabel name=new JLabel("NAME                            :");
        name.setForeground(new Color(234, 203, 178));
        name.setBounds(45,205,200,20);
        name.setFont(new Font("Tahoma",Font.BOLD,18));
        panel.add(name);

        nametext=new JTextField();
        nametext.setForeground(Color.BLACK);
        nametext.setBackground(new Color(41, 207, 186));
        nametext.setBounds(270,205,150,20);
        nametext.setFont(new Font("Tahoma",Font.PLAIN,15));
        panel.add(nametext);


        JLabel gender=new JLabel("GENDER                       :");
        gender.setForeground(new Color(234, 203, 178));
        gender.setBounds(45,265,200,20);
        gender.setFont(new Font("Tahoma",Font.BOLD,18));
        panel.add(gender);

        M=new JRadioButton("Male");
        M.setForeground(Color.WHITE);
        M.setFont(new Font("Tahoma",Font.PLAIN,15));
        M.setBackground(new Color(13, 99, 94));
        M.setBounds(270,265,75,20);
        panel.add(M);
        F=new JRadioButton("Female");
        F.setForeground(Color.WHITE);
        F.setFont(new Font("Tahoma",Font.PLAIN,15));
        F.setBackground(new Color(13, 99, 94));
        F.setBounds(350,265,75,20);
        panel.add(F);


        JLabel country=new JLabel("COUNTRY                    :");
        country.setForeground(new Color(234, 203, 178));
        country.setBounds(45,325,200,20);
        country.setFont(new Font("Tahoma",Font.BOLD,18));
        panel.add(country);

        countrytext=new JTextField();
        countrytext.setForeground(Color.BLACK);
        countrytext.setBackground(new Color(41, 207, 186));
        countrytext.setBounds(270,325,150,20);
        countrytext.setFont(new Font("Tahoma",Font.PLAIN,15));
        panel.add(countrytext);


        JLabel room=new JLabel("ALLOCATED ROOM     :");
        room.setForeground(new Color(234, 203, 178));
        room.setBounds(45,385,200,20);
        room.setFont(new Font("Tahoma",Font.BOLD,18));
        panel.add(room);

        c1=new Choice();
        try{
            database c=new database();
            String q="select * from room";
            ResultSet res=c.statement.executeQuery(q);
            while(res.next()){
                c1.add(res.getString("roomnumber"));
            }
        }
        catch(Exception e){e.printStackTrace();}
        c1.setBounds(270,385,150,20);
        c1.setBackground(new Color(41, 207, 186));
        c1.setFont(new Font("Tahoma",Font.PLAIN,15));
        c1.setForeground(Color.BLACK);
        panel.add(c1);


        JLabel cis=new JLabel("CHECKED-IN               :");
        cis.setForeground(new Color(234, 203, 178));
        cis.setBounds(45,445,200,20);
        cis.setFont(new Font("Tahoma",Font.BOLD,18));
        panel.add(cis);

        Date date1=new Date();
        date=new JLabel(""+date1);
        date.setBounds(270,445,250,20);
        date.setBackground(new Color(41, 207, 186));
        date.setFont(new Font("Tahoma",Font.PLAIN,15));
        date.setForeground(Color.WHITE);
        panel.add(date);


        JLabel deposit=new JLabel("DEPOSIT                      :");
        deposit.setForeground(new Color(234, 203, 178));
        deposit.setBounds(45,505,200,20);
        deposit.setFont(new Font("Tahoma",Font.BOLD,18));
        panel.add(deposit);

        deposittext=new JTextField();
        deposittext.setForeground(Color.BLACK);
        deposittext.setBackground(new Color(41, 207, 186));
        deposittext.setBounds(270,505,150,20);
        deposittext.setFont(new Font("Tahoma",Font.PLAIN,15));
        panel.add(deposittext);


        add=new JButton("ADD");
        add.setBounds(640,430,120,30);
        add.setBackground(Color.BLACK);
        add.setForeground(new Color(243,211,6));
        add.setFont(new Font("Tahoma",Font.BOLD,20));
        add.addActionListener(this);
        panel.add(add);


        back=new JButton("BACK");
        back.setBounds(640,480,120,30);
        back.setBackground(Color.BLACK);
        back.setForeground(new Color(243,211,6));
        back.setFont(new Font("Tahoma",Font.BOLD,20));
        back.addActionListener(this);
        panel.add(back);




        setUndecorated(true);
        setSize(900,600);
        setLayout(null);
        setLocation(400,75);
        setVisible(true);
    }


    public void actionPerformed(ActionEvent e){
        if(e.getSource()==add){
            try{
                database c=new database();

                String radioBtn=null;
                if(M.isSelected()){
                    radioBtn="Male";
                }
                else if(F.isSelected()){
                    radioBtn="Female";
                }

                String doc=(String)idcomboBox.getSelectedItem();
                String number=numtext.getText();
                String name=nametext.getText();
                String gender=radioBtn;
                String Country=countrytext.getText();
                String room=(String)c1.getSelectedItem();
                String checkin=date.getText();
                String deposit=deposittext.getText();

                String q= " insert into customer values ( '"+doc+"' , '"+number+"' , '"+name+"' , '"+gender+"' , '"+Country+"' , '"+room+"' , '"+checkin+"' , '"+deposit+"' ) " ;
                String q1= "update room set availability='Occupied' where roomnumber="+room;
                c.statement.executeUpdate(q);
                c.statement.executeUpdate(q1);

                JOptionPane.showMessageDialog(null,"Room alloted successfully");
                setVisible(false);
            }
            catch(Exception E){E.printStackTrace();}
        }
        else{
            setVisible(false);
        }
    }


    public static void main(String ars[]){
        new NewCustomer();
    }
}
