package Hotel.Management.System;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class SearchRoom extends JFrame implements ActionListener{

    JCheckBox checkbox;
    Choice c1;
    JTable table;
    JButton APPLY,BACK;

    SearchRoom(){

        JPanel panel=new JPanel();
        panel.setBounds(5,5,890,590);
        panel.setBackground(new Color(13, 99, 94));
        panel.setLayout(null);
        add(panel);

        JLabel searchforroom=new JLabel("SEARCH FOR ROOM");
        searchforroom.setForeground(new Color(243,211,6));
        searchforroom.setFont(new Font("Tahoma",Font.BOLD,24));
        searchforroom.setBounds(350,11,320,53);
        panel.add(searchforroom);


        checkbox=new JCheckBox("Only Display Available");
        checkbox.setBounds(630,125,225,30);
        checkbox.setForeground(new Color(234, 203, 178));
        checkbox.setBackground(new Color(13, 99, 94));
        checkbox.setFont(new Font("Tahoma",Font.BOLD,18));
        panel.add(checkbox);


        c1=new Choice();
        c1.add("Single Bed");
        c1.add("Double Bed");
        c1.setBounds(155,125,150,30);
        c1.setBackground(new Color(41, 207, 186));
        c1.setForeground(Color.BLACK);
        c1.setFont(new Font("Tahoma",Font.PLAIN,18));
        panel.add(c1);

        JLabel roomtype=new JLabel("Room Type : ");
        roomtype.setBackground(new Color(41, 207, 186));
        roomtype.setForeground(new Color(234, 203, 178));
        roomtype.setBounds(35,125,120,30);
        roomtype.setFont(new Font("Tahoma",Font.BOLD,18));
        panel.add(roomtype);


        table=new JTable();
        table.setBounds(10,240,870,260);
        table.setBackground(new Color(13, 99, 94));
        table.setForeground(new Color(234, 203, 178));
        table.setFont(new Font("Tahoma",Font.BOLD,15));
        panel.add(table);

        try{
            database c=new database();

            String q="select * from room";
            ResultSet res=c.statement.executeQuery(q);
            table.setModel(DbUtils.resultSetToTableModel(res));
        }
        catch(Exception e){e.printStackTrace();}


        JLabel room=new JLabel("ROOM NO.");
        room.setForeground(new Color(216, 146, 90));
        room.setBackground(new Color(13, 99, 94));
        room.setFont(new Font("Tahoma",Font.BOLD,15));
        room.setBounds(55,210,100,20);
        panel.add(room);

        JLabel ava=new JLabel("AVAILABILITY");
        ava.setForeground(new Color(216, 146, 90));
        ava.setBackground(new Color(13, 99, 94));
        ava.setFont(new Font("Tahoma",Font.BOLD,15));
        ava.setBounds(215,210,130,20);
        panel.add(ava);

        JLabel status=new JLabel("ROOM STATUS");
        status.setForeground(new Color(216, 146, 90));
        status.setBackground(new Color(13, 99, 94));
        status.setFont(new Font("Tahoma",Font.BOLD,15));
        status.setBounds(395,210,130,20);
        panel.add(status);

        JLabel rent=new JLabel("PRICE");
        rent.setForeground(new Color(216, 146, 90));
        rent.setBackground(new Color(13, 99, 94));
        rent.setFont(new Font("Tahoma",Font.BOLD,15));
        rent.setBounds(605,210,130,20);
        panel.add(rent);

        JLabel type=new JLabel("ROOM TYPE");
        type.setForeground(new Color(216, 146, 90));
        type.setBackground(new Color(13, 99, 94));
        type.setFont(new Font("Tahoma",Font.BOLD,15));
        type.setBounds(740,210,130,20);
        panel.add(type);

        APPLY=new JButton("APPLY FILTER");
        APPLY.setBounds(200,530,200,30);
        APPLY.setBackground(Color.BLACK);
        APPLY.setForeground(new Color(243,211,6));
        APPLY.setFont(new Font("Tahoma",Font.BOLD,18));
        APPLY.addActionListener(this);
        panel.add(APPLY);

        BACK=new JButton("BACK");
        BACK.setBounds(450,530,200,30);
        BACK.setBackground(Color.BLACK);
        BACK.setForeground(new Color(243,211,6));
        BACK.setFont(new Font("Tahoma",Font.BOLD,18));
        BACK.addActionListener(this);
        panel.add(BACK);



        setUndecorated(true);
        setSize(900,600);
        setLayout(null);
        setLocation(400,75);
        setVisible(true);
    }


    public void actionPerformed(ActionEvent e){
        if(e.getSource()==APPLY){
            try{
                String q= "select * from room where roomtype = '"+c1.getSelectedItem()+"' ";
                String q1="select * from room where availability = 'Available' and roomtype= '"+c1.getSelectedItem()+"' ";
                database c=new database();
                ResultSet res=c.statement.executeQuery(q);
                table.setModel(DbUtils.resultSetToTableModel(res));

                if(checkbox.isSelected()){
                    ResultSet res1=c.statement.executeQuery(q1);
                    table.setModel(DbUtils.resultSetToTableModel(res1));
                }
            }
            catch(Exception E){E.printStackTrace();}
        }
        else{
            setVisible(false);
        }
    }


    public static void main(String ars[]){
        new SearchRoom();
    }
}
