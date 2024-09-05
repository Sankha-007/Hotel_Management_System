package Hotel.Management.System;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Employee extends JFrame{

    Employee(){

        JPanel panel=new JPanel();
        panel.setBounds(5,5,890,590);
        panel.setBackground(new Color(13, 99, 94));
        panel.setLayout(null);
        add(panel);

        JTable table=new JTable();
        table.setBounds(10,34,880,450);
        table.setForeground(new Color(234, 203, 178));
        table.setBackground(new Color(13, 99, 94));
        panel.add(table);

        try{
            database c=new database();
            String employee="select * from employee";
            ResultSet res=c.statement.executeQuery(employee);
            table.setModel(DbUtils.resultSetToTableModel(res));
        }
        catch(Exception e){e.printStackTrace();}


        JButton back=new JButton("Back");
        back.setBounds(350,500,120,30);
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

        JLabel name=new JLabel("NAME");
        name.setForeground(new Color(216, 146, 90));
        name.setBounds(41,11,70,19);
        name.setFont(new Font("Tahoma",Font.BOLD,15));
        panel.add(name);

        JLabel age=new JLabel("AGE");
        age.setForeground(new Color(216, 146, 90));
        age.setFont(new Font("Tahoma",Font.BOLD,15));
        age.setBounds(159,11,70,19);
        panel.add(age);

        JLabel gender=new JLabel("GENDER");
        gender.setFont(new Font("Tahoma",Font.BOLD,15));
        gender.setForeground(new Color(216, 146, 90));
        gender.setBounds(247,11,70,19);
        panel.add(gender);

        JLabel job=new JLabel("JOB");
        job.setFont(new Font("Tahoma",Font.BOLD,15));
        job.setForeground(new Color(216, 146, 90));
        job.setBounds(376,11,70,19);
        panel.add(job);

        JLabel sal=new JLabel("SALARY");
        sal.setForeground(new Color(216, 146, 90));
        sal.setBounds(470,11,70,19);
        sal.setFont(new Font("Tahoma",Font.BOLD,15));
        panel.add(sal);

        JLabel phn=new JLabel("PHONE");
        phn.setForeground(new Color(216, 146, 90));
        phn.setFont(new Font("Tahoma",Font.BOLD,15));
        phn.setBounds(580,11,70,19);
        panel.add(phn);

        JLabel mail=new JLabel("E-MAIL");
        mail.setFont(new Font("Tahoma",Font.BOLD,15));
        mail.setForeground(new Color(216, 146, 90));
        mail.setBounds(690,11,70,19);
        panel.add(mail);

        JLabel aadhar=new JLabel("AADHAR");
        aadhar.setFont(new Font("Tahoma",Font.BOLD,15));
        aadhar.setForeground(new Color(216, 146, 90));
        aadhar.setBounds(800,11,70,19);
        panel.add(aadhar);


        setUndecorated(true);
        setSize(900,600);
        setLayout(null);
        setLocation(400,75);
        setVisible(true);
    }


    public static void main(String ars[]){
        new Employee();
    }
}
