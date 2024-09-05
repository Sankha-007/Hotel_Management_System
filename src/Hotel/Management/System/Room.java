package Hotel.Management.System;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import javax.xml.transform.Result;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Room extends JFrame{

    JTable table;
    JButton back;

    Room(){

        JPanel panel=new JPanel();
        panel.setBounds(5,5,890,590);
        panel.setBackground(new Color(13, 99, 94));
        panel.setLayout(null);
        add(panel);

        ImageIcon im1=new ImageIcon(ClassLoader.getSystemResource("icon/ROOM2.png"));
        Image i=im1.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT);
        ImageIcon im2=new ImageIcon(i);
        JLabel label1=new JLabel(im2);
        label1.setBounds(550,200,321,216);
        panel.add(label1);

        table=new JTable();
        table.setBounds(10,40,500,400);
        table.setBackground(new Color(13, 99, 94));
        table.setForeground(new Color(234, 203, 178));
        panel.add(table);

        try{
            database c=new database();
            String roominfo = "select * from room";
            ResultSet resultset=c.statement.executeQuery(roominfo);
            table.setModel(DbUtils.resultSetToTableModel(resultset));
        }
        catch(Exception e){e.printStackTrace();}

        back=new JButton("Back");
        back.setBounds(660,450,120,30);
        back.setBackground(Color.BLACK);
        back.setForeground(new Color(243,211,6));
        back.setFont(new Font("Tahoma",Font.BOLD,20));
        panel.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });


        JLabel rno=new JLabel("Room No.");
        rno.setBounds(12,15,80,19);
        rno.setForeground(new Color(234, 203, 178));
        rno.setFont(new Font("Tahoma",Font.BOLD,13));
        panel.add(rno);

        JLabel availability=new JLabel("Availability");
        availability.setBounds(119,15,80,19);
        availability.setForeground(new Color(234, 203, 178));
        availability.setFont(new Font("Tahoma",Font.BOLD,13));
        panel.add(availability);

        JLabel Cleaning=new JLabel("Clean Status");
        Cleaning.setBounds(216,15,150,19);
        Cleaning.setForeground(new Color(234, 203, 178));
        Cleaning.setFont(new Font("Tahoma",Font.BOLD,13));
        panel.add(Cleaning);

        JLabel Price=new JLabel("Price");
        Price.setBounds(330,15,80,19);
        Price.setForeground(new Color(234, 203, 178));
        Price.setFont(new Font("Tahoma",Font.BOLD,13));
        panel.add(Price);

        JLabel Bed=new JLabel("Bed Type");
        Bed.setBounds(417,15,80,19);
        Bed.setForeground(new Color(234, 203, 178));
        Bed.setFont(new Font("Tahoma",Font.BOLD,13));
        panel.add(Bed);




        setUndecorated(true);
        setSize(900,600);
        setLayout(null);
        setLocation(400,75);
        setVisible(true);
    }


    public static void main(String ars[]){
        new Room();
    }
}
