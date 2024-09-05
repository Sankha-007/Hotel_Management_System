package Hotel.Management.System;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import java.sql.ResultSet;

public class Department extends JFrame{

    Department(){

        JPanel panel=new JPanel();
        panel.setBounds(5,5,890,590);
        panel.setBackground(new Color(13, 99, 94));
        panel.setLayout(null);
        add(panel);

        JTable table=new JTable();
        table.setBounds(100,140,700,250);
        table.setBackground(new Color(13, 99, 94));
        table.setForeground(new Color(234, 203, 178));
        table.setFont(new Font("serif",Font.PLAIN,15));
        panel.add(table);

        JLabel lbl1=new JLabel("Department");
        lbl1.setBounds(195,111,105,20);
        lbl1.setForeground(new Color(216, 146, 90));
        lbl1.setFont(new Font("Tahoma",Font.BOLD,16));
        panel.add(lbl1);

        JLabel lbl2=new JLabel("Budget");
        lbl2.setBounds(570,111,105,20);
        lbl2.setForeground(new Color(216, 146, 90));
        lbl2.setFont(new Font("Tahoma",Font.BOLD,16));
        panel.add(lbl2);



        try{
            database c=new database();
            String deptinfo="select * from department";
            ResultSet resultset=c.statement.executeQuery(deptinfo);
            table.setModel(DbUtils.resultSetToTableModel(resultset));
        }
        catch(Exception e){e.printStackTrace();}

        JButton back=new JButton("Back");
        back.setBounds(400,470,120,30);
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

        setUndecorated(true);
        setSize(900,600);
        setLayout(null);
        setLocation(400,75);
        setVisible(true);
    }


    public static void main(String ars[]){

        new Department();
    }
}
