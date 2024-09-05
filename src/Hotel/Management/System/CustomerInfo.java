package Hotel.Management.System;

import com.mysql.cj.protocol.Resultset;
import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class CustomerInfo extends JFrame implements ActionListener{

    Choice c1;
    JTable table;
    JTextField searchname;
    JButton APPLY,BACK;
    JCheckBox checkbox;

    CustomerInfo(){

        JPanel panel=new JPanel();
        panel.setBounds(5,5,890,590);
        panel.setBackground(new Color(13,99,94));
        panel.setLayout(null);
        add(panel);

        JLabel label1=new JLabel("CUSTOMER INFORMATION");
        label1.setForeground(new Color(243,211,6));
        label1.setFont(new Font("Tahoma",Font.BOLD,24));
        label1.setBounds(300,15,380,53);
        panel.add(label1);


        JLabel label2=new JLabel("Search by Room No. :");
        label2.setForeground(new Color(234,203,178));
        label2.setFont(new Font("Tahoma",Font.BOLD,18));
        label2.setBounds(30,125,200,25);
        panel.add(label2);

        c1=new Choice();
        try{
            database c=new database();
            String q= "select * from room";
            ResultSet res=c.statement.executeQuery(q);
            while(res.next()){
                c1.add(res.getString("roomnumber"));
            }
        }
        catch(Exception e){e.printStackTrace();}
        c1.setBounds(240,125,100,25);
        c1.setForeground(Color.BLACK);
        c1.setFont(new Font("Tahoma",Font.PLAIN,15));
        c1.setBackground(new Color(41, 207, 186));
        panel.add(c1);


        JLabel label3=new JLabel("Search by Name :");
        label3.setForeground(new Color(234,203,178));
        label3.setFont(new Font("Tahoma",Font.BOLD,18));
        label3.setBounds(480,125,200,25);
        panel.add(label3);

        checkbox=new JCheckBox("Enable Search by Name");
        checkbox.setBounds(476,160,250,30);
        checkbox.setForeground(new Color(234, 203, 178));
        checkbox.setBackground(new Color(13, 99, 94));
        checkbox.setFont(new Font("Tahoma",Font.BOLD,18));
        panel.add(checkbox);

        searchname=new JTextField();
        searchname.setForeground(Color.BLACK);
        searchname.setBackground(new Color(41,207,186));
        searchname.setFont(new Font("Tahoma",Font.PLAIN,15));
        searchname.setBounds(650,125,200,25);
        panel.add(searchname);



        table=new JTable();
        table.setBounds(10,250,870,180);
        table.setBackground(new Color(13,99,94));
        table.setForeground(new Color(234, 203, 178));
        table.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(table);


        try{
            database c=new database();
            String q= "select * from customer";
            ResultSet res=c.statement.executeQuery(q);
            table.setModel(DbUtils.resultSetToTableModel(res));
        }
        catch(Exception e){e.printStackTrace();}


        JLabel doc = new JLabel("DOCUMENT");
        doc.setForeground(new Color(216, 146, 90));
        doc.setBackground(new Color(13,99,94));
        doc.setFont(new Font("Tahoma",Font.BOLD,16));
        doc.setBounds(15,220,100,20);
        panel.add(doc);

        JLabel num = new JLabel("NUMBER");
        num.setForeground(new Color(216, 146, 90));
        num.setBackground(new Color(13,99,94));
        num.setFont(new Font("Tahoma",Font.BOLD,16));
        num.setBounds(132,220,100,20);
        panel.add(num);

        JLabel name = new JLabel("NAME");
        name.setForeground(new Color(216, 146, 90));
        name.setBackground(new Color(13,99,94));
        name.setFont(new Font("Tahoma",Font.BOLD,16));
        name.setBounds(252,220,100,20);
        panel.add(name);

        JLabel sex = new JLabel("GENDER");
        sex.setForeground(new Color(216, 146, 90));
        sex.setBackground(new Color(13,99,94));
        sex.setFont(new Font("Tahoma",Font.BOLD,16));
        sex.setBounds(352,220,100,20);
        panel.add(sex);

        JLabel con = new JLabel("COUNTRY");
        con.setForeground(new Color(216, 146, 90));
        con.setBackground(new Color(13,99,94));
        con.setFont(new Font("Tahoma",Font.BOLD,16));
        con.setBounds(455,220,100,20);
        panel.add(con);

        JLabel rno = new JLabel("ROOM NO.");
        rno.setForeground(new Color(216, 146, 90));
        rno.setBackground(new Color(13,99,94));
        rno.setFont(new Font("Tahoma",Font.BOLD,16));
        rno.setBounds(565,220,100,20);
        panel.add(rno);

        JLabel cin = new JLabel("CHECK-IN");
        cin.setForeground(new Color(216, 146, 90));
        cin.setBackground(new Color(13,99,94));
        cin.setFont(new Font("Tahoma",Font.BOLD,16));
        cin.setBounds(675,220,100,20);
        panel.add(cin);

        JLabel depo = new JLabel("DEPOSIT");
        depo.setForeground(new Color(216, 146, 90));
        depo.setBackground(new Color(13,99,94));
        depo.setFont(new Font("Tahoma",Font.BOLD,16));
        depo.setBounds(790,220,100,20);
        panel.add(depo);


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


    public void actionPerformed(ActionEvent e1){
        if(e1.getSource()==APPLY){
            try{
                String a="select * from customer where room= '"+c1.getSelectedItem()+"' ";
                String b="select * from customer where name= '"+searchname.getText()+"' ";
                String c="select * from customer where room= '"+c1.getSelectedItem()+"' and name= '"+searchname.getText()+"'";

                database c1=new database();
                ResultSet res1=c1.statement.executeQuery(a);
                table.setModel(DbUtils.resultSetToTableModel(res1));

                if(checkbox.isSelected()){
                    ResultSet res2=c1.statement.executeQuery(b);
                    table.setModel(DbUtils.resultSetToTableModel(res2));
                }

            }
            catch(Exception E1){E1.printStackTrace();}
        }
        else{
            setVisible(false);
        }
    }


    public static void main(String ars[]){
        new CustomerInfo();
    }
}
