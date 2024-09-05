package Hotel.Management.System;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class PickUp extends JFrame implements ActionListener{

    JButton APPLY,BACK;
    Choice c1;
    JTable table;

    PickUp(){


        JPanel panel=new JPanel();
        panel.setBounds(5,5,890,590);
        panel.setBackground(new Color(13,99,94));
        panel.setLayout(null);
        add(panel);

        JLabel label1=new JLabel("PICK-UP SERVICE");
        label1.setForeground(new Color(243,211,6));
        label1.setFont(new Font("Tahoma",Font.BOLD,24));
        label1.setBounds(350,15,380,53);
        panel.add(label1);

        JLabel toc=new JLabel("Type of car   :");
        toc.setForeground(new Color(234,203,178));
        toc.setFont(new Font("Tahoma",Font.BOLD,20));
        toc.setBounds(32,97,160,25);
        panel.add(toc);

        c1=new Choice();
        try{
            database con=new database();
            String q= "select * from driver";
            ResultSet res=con.statement.executeQuery(q);
            while(res.next()){
                c1.add(res.getString("company"));
            }
        }
        catch(Exception e){e.printStackTrace();}
        c1.setBounds(193,97,150,25);
        c1.setForeground(Color.BLACK);
        c1.setBackground(new Color(41, 207, 186));
        c1.setFont(new Font("Tahoma",Font.PLAIN,15));
        panel.add(c1);


        table=new JTable();
        table.setBackground(new Color(13,99,94));
        table.setForeground(new Color(234, 203, 178));
        table.setBounds(10,230,870,200);
        table.setFont(new Font("Tahoma",Font.BOLD,15));
        panel.add(table);

        try{
            database con1=new database();
            String q1="select * from driver";
            ResultSet res1=con1.statement.executeQuery(q1);
            table.setModel(DbUtils.resultSetToTableModel(res1));
        }
        catch(Exception e1){e1.printStackTrace();}

        JLabel name=new JLabel("NAME");
        name.setForeground(new Color(216, 146, 90));
        name.setBackground(new Color(13, 99, 94));
        name.setFont(new Font("Tahoma",Font.BOLD,15));
        name.setBounds(45,205,100,20);
        panel.add(name);

        JLabel age=new JLabel("AGE");
        age.setForeground(new Color(216, 146, 90));
        age.setBackground(new Color(13, 99, 94));
        age.setFont(new Font("Tahoma",Font.BOLD,15));
        age.setBounds(155,205,100,20);
        panel.add(age);

        JLabel gender=new JLabel("GENDER");
        gender.setForeground(new Color(216, 146, 90));
        gender.setBackground(new Color(13, 99, 94));
        gender.setFont(new Font("Tahoma",Font.BOLD,15));
        gender.setBounds(250,205,100,20);
        panel.add(gender);

        JLabel com=new JLabel("COMPANY");
        com.setForeground(new Color(216, 146, 90));
        com.setBackground(new Color(13, 99, 94));
        com.setFont(new Font("Tahoma",Font.BOLD,15));
        com.setBounds(350,205,100,20);
        panel.add(com);

        JLabel cname=new JLabel("CAR NAME");
        cname.setForeground(new Color(216, 146, 90));
        cname.setBackground(new Color(13, 99, 94));
        cname.setFont(new Font("Tahoma",Font.BOLD,15));
        cname.setBounds(460,205,100,20);
        panel.add(cname);

        JLabel ava=new JLabel("AVAILABLE");
        ava.setForeground(new Color(216, 146, 90));
        ava.setBackground(new Color(13, 99, 94));
        ava.setFont(new Font("Tahoma",Font.BOLD,15));
        ava.setBounds(567,205,130,20);
        panel.add(ava);

        JLabel loc=new JLabel("LOCATION");
        loc.setForeground(new Color(216, 146, 90));
        loc.setBackground(new Color(13, 99, 94));
        loc.setFont(new Font("Tahoma",Font.BOLD,15));
        loc.setBounds(675,205,130,20);
        panel.add(loc);

        JLabel lic=new JLabel("LICENSE");
        lic.setForeground(new Color(216, 146, 90));
        lic.setBackground(new Color(13, 99, 94));
        lic.setFont(new Font("Tahoma",Font.BOLD,15));
        lic.setBounds(780,205,130,20);
        panel.add(lic);


        APPLY=new JButton("APPLY FILTER");
        APPLY.setBounds(200,500,200,30);
        APPLY.setBackground(Color.BLACK);
        APPLY.setForeground(new Color(243,211,6));
        APPLY.setFont(new Font("Tahoma",Font.BOLD,18));
        APPLY.addActionListener(this);
        panel.add(APPLY);

        BACK=new JButton("BACK");
        BACK.setBounds(450,500,200,30);
        BACK.setBackground(Color.BLACK);
        BACK.setForeground(new Color(243,211,6));
        BACK.setFont(new Font("Tahoma",Font.BOLD,18));
        BACK.addActionListener(this);
        panel.add(BACK);


        setUndecorated(true);
        setSize(900,600);
        setLocation(400,75);
        setLayout(null);
        setVisible(true);
    }


    public void actionPerformed(ActionEvent e3){
        if(e3.getSource()==APPLY){
            try{
                database con3=new database();
                String q3="select * from driver where company = '"+c1.getSelectedItem()+"' ";
                ResultSet res3=con3.statement.executeQuery(q3);
                table.setModel(DbUtils.resultSetToTableModel(res3));
            }
            catch(Exception e4){e4.printStackTrace();}
        }
        else{
            setVisible(false);
        }
    }


    public static void main(String ars[]){
        new PickUp();
    }
}
