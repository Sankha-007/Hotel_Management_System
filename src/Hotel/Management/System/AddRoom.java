package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddRoom extends JFrame implements ActionListener {

    JTextField t2,t4;
    JComboBox t3,t5,t6;
    JButton b1,b2;

    AddRoom(){
        super("HOTEL MANAGEMENT SYSTEM - ADD ROOM");

        JPanel panel=new JPanel();
        panel.setBounds(5,5,875,490);
        panel.setBackground(new Color(13, 99, 94));
        panel.setLayout(null);
        add(panel);

        JLabel l1=new JLabel("ADD ROOMS");
        l1.setBounds(154,20,160,25);
        l1.setFont(new Font("Tahoma",Font.BOLD,24));
        l1.setForeground(new Color(243,211,6));
        panel.add(l1);

        JLabel l2=new JLabel("Room Number   : ");
        l2.setBounds(64,90,152,22);
        l2.setForeground(new Color(234, 203, 178));
        l2.setFont(new Font("Tahoma",Font.BOLD,17));
        panel.add(l2);

        t2=new JTextField();
        t2.setBounds(230,90,156,22);
        t2.setForeground(Color.BLACK);
        t2.setFont(new Font("Tahoma",Font.PLAIN,15));
        t2.setBackground(new Color(41, 207, 186));
        panel.add(t2);


        JLabel l3=new JLabel("Availability         : ");
        l3.setBounds(64,130,152,22);
        l3.setForeground(new Color(234, 203, 178));
        l3.setFont(new Font("Tahoma",Font.BOLD,17));
        panel.add(l3);

        t3=new JComboBox(new String[] {"Available","Occupied"});
        t3.setBounds(230,130,156,22);
        t3.setForeground(Color.BLACK);
        t3.setFont(new Font("Tahoma",Font.PLAIN,15));
        t3.setBackground(new Color(41, 207, 186));
        panel.add(t3);


        JLabel l4=new JLabel("Price                   : ");
        l4.setBounds(64,170,152,22);
        l4.setForeground(new Color(234, 203, 178));
        l4.setFont(new Font("Tahoma",Font.BOLD,17));
        panel.add(l4);

        t4=new JTextField();
        t4.setBounds(230,170,156,22);
        t4.setForeground(Color.BLACK);
        t4.setFont(new Font("Tahoma",Font.PLAIN,15));
        t4.setBackground(new Color(41, 207, 186));
        panel.add(t4);


        JLabel l5=new JLabel("Cleaning Status : ");
        l5.setBounds(64,210,152,22);
        l5.setForeground(new Color(234, 203, 178));
        l5.setFont(new Font("Tahoma",Font.BOLD,17));
        panel.add(l5);

        t5=new JComboBox(new String[] {"Clean","Dirty"});
        t5.setBounds(230,210,156,22);
        t5.setForeground(Color.BLACK);
        t5.setFont(new Font("Tahoma",Font.PLAIN,15));
        t5.setBackground(new Color(41, 207, 186));
        panel.add(t5);


        JLabel l6=new JLabel("Room Type        : ");
        l6.setBounds(64,250,152,22);
        l6.setForeground(new Color(234, 203, 178));
        l6.setFont(new Font("Tahoma",Font.BOLD,17));
        panel.add(l6);

        t6=new JComboBox(new String[] {"Single Bed","Double Bed"});
        t6.setBounds(230,250,156,22);
        t6.setForeground(Color.BLACK);
        t6.setFont(new Font("Tahoma",Font.PLAIN,15));
        t6.setBackground(new Color(41, 207, 186));
        panel.add(t6);


        b1=new JButton("ADD");
        b1.setBounds(94,341,117,30);
        b1.setForeground(new Color(243,211,6));
        b1.setBackground(Color.BLACK);
        b1.setFont(new Font("Tahoma",Font.BOLD,17));
        b1.addActionListener(this);
        panel.add(b1);

        b2=new JButton("BACK");
        b2.setBounds(228,341,117,30);
        b2.setForeground(new Color(243,211,6));
        b2.setBackground(Color.BLACK);
        b2.setFont(new Font("Tahoma",Font.BOLD,17));
        b2.addActionListener(this);
        panel.add(b2);

        ImageIcon im1=new ImageIcon(ClassLoader.getSystemResource("Icon/ADDROOM.PNG"));
        Image i=im1.getImage().getScaledInstance(250,250,Image.SCALE_DEFAULT);
        ImageIcon im2=new ImageIcon(i);
        JLabel label2=new JLabel(im2);
        label2.setBounds(450,25,400,400);
        panel.add(label2);



        setUndecorated(true);
        setLocation(27,130);
        setLayout(null);
        setSize(885,500);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b1){
            try{
                database c=new database();

                String room=t2.getText();
                String ava=(String)t3.getSelectedItem();
                String status=(String)t5.getSelectedItem();
                String price=t4.getText();
                String type=(String)t6.getSelectedItem();

                String q="insert into room values ( '"+room+"' , '"+ava+"' , '"+status+"' , '"+price+"' , '"+type+"' )";
                c.statement.executeUpdate(q); //TO INSERT DATA INTO TABLE.    executeQuery(q) = TO FETCH DATA FROM TABLE

                JOptionPane.showMessageDialog(null,"ROOM SUCCESSFULLY ADDED");
                setVisible(false);

            }
            catch(Exception E){E.printStackTrace();}

            }
            else {
                setVisible(false);
            }
        }

    public static void main (String ars[]){
        new AddRoom();
    }
}


