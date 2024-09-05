package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class admin extends JFrame implements ActionListener{

    JButton add_employee,add_room,add_driver,logout,back;

    admin(){

        super("HOTEL MANAGEMENT SYSTEM - ADMIN LOGIN ");

        add_employee=new JButton("ADD EMPLOYEE");
        add_employee.setBounds(300,170,200,40);
        add_employee.setBackground(Color.BLACK);
        add_employee.setForeground(new Color(243, 211, 6));
        add_employee.setFont(new Font("Tahoma",Font.BOLD,17));
        add_employee.addActionListener((this));
        add(add_employee);

        add_room=new JButton("ADD ROOM");
        add_room.setBounds(300,320,200,40);
        add_room.setBackground(Color.BLACK);
        add_room.setForeground(new Color(243,211,6));
        add_room.setFont(new Font("Tahoma",Font.BOLD,17));
        add_room.addActionListener(this);
        add(add_room);

        add_driver=new JButton("ADD DRIVER");
        add_driver.setBounds(300,480,200,40);
        add_driver.setBackground((Color.BLACK));
        add_driver.setForeground((new Color(243,211,6)));
        add_driver.setFont(new Font("Tahoma",Font.BOLD,17));
        add_driver.addActionListener(this);
        add(add_driver);

        logout=new JButton("LOGOUT");
        logout.setBounds(500,630,200,40);
        logout.setBackground(Color.BLACK);
        logout.setForeground(Color.RED);
        logout.setFont(new Font("Tahoma",Font.BOLD,17));
        logout.addActionListener(this);
        add(logout);

        back=new JButton("BACK");
        back.setBounds(720,630,200,40);
        back.setBackground(Color.BLACK);
        back.setForeground(new Color(243,211,6));
        back.setFont(new Font("Tahoma",Font.BOLD,17));
        back.addActionListener(this);
        add(back);

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/addemployee.png"));
        Image i=i1.getImage().getScaledInstance(120,120,Image.SCALE_DEFAULT);
        ImageIcon i2=new ImageIcon(i);
        JLabel label=new JLabel(i2);
        label.setBounds(150,125,120,120);
        add(label);

        ImageIcon i11=new ImageIcon(ClassLoader.getSystemResource("icon/ROOM1.PNG"));
        Image ii=i11.getImage().getScaledInstance(120,120,Image.SCALE_DEFAULT);
        ImageIcon i22=new ImageIcon(ii);
        JLabel label1=new JLabel(i22);
        label1.setBounds(150,280,120,120);
        add(label1);

        ImageIcon i111=new ImageIcon(ClassLoader.getSystemResource("icon/DRIVER1.PNG"));
        Image iii=i111.getImage().getScaledInstance(120,120,Image.SCALE_DEFAULT);
        ImageIcon i222=new ImageIcon(iii);
        JLabel label2=new JLabel(i222);
        label2.setBounds(150,440,120,120);
        add(label2);

        ImageIcon i1111=new ImageIcon(ClassLoader.getSystemResource("icon/ADMIN2.gif"));
        Image iiii=i1111.getImage().getScaledInstance(350,350,Image.SCALE_DEFAULT);
        ImageIcon i2222=new ImageIcon(iiii);
        JLabel label3=new JLabel(i2222);
        label3.setBounds(800,35,630,630);
        add(label3);



        getContentPane().setBackground(new Color(13, 99, 94));
        setLayout(null);
        setSize(1370,730);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){

        if(e.getSource()==add_employee){
            new AddEmployee();
        }
        else if(e.getSource()==add_driver){
            new addDriver();
        }
        else if (e.getSource()==add_room){
            new AddRoom();
        }
        else if(e.getSource()==logout){
            System.exit(007);
        }
        else{
            new Dashboard();
            setVisible(false);
        }
    }

    public static void main(String ars[]){
        new admin();
    }
}
