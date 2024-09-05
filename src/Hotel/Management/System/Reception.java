package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Reception extends JFrame{

    Reception(){

        super("HOTEL MANAGEMENT SYSTEM - RECEPTION");

        JPanel panel=new JPanel();
        panel.setLayout(null);
        panel.setBounds(280,5,1069,682);
        panel.setBackground(new Color(13, 99, 94));
        add(panel);

        JPanel panel1=new JPanel();
        panel1.setLayout(null);
        panel1.setBounds(5,5,270,682);
        panel1.setBackground(new Color(13, 99, 94));
        add(panel1);

        ImageIcon im1=new ImageIcon(ClassLoader.getSystemResource("icon/AJsq.gif"));
        Image i=im1.getImage().getScaledInstance(800,400, Image.SCALE_DEFAULT);
        ImageIcon im2=new ImageIcon(i);
        JLabel label1=new JLabel(im2);
        label1.setBounds(200,120,800,400);
        panel.add(label1);

        ImageIcon im11=new ImageIcon(ClassLoader.getSystemResource("icon/reception1.gif"));
        Image ii=im11.getImage().getScaledInstance(230,230,Image.SCALE_DEFAULT);
        ImageIcon im22=new ImageIcon(ii);
        JLabel label2=new JLabel(im22);
        label2.setBounds(20,470,230,200);
        panel1.add(label2);

        ImageIcon im111=new ImageIcon(ClassLoader.getSystemResource("icon/reception2.gif"));
        Image iii=im111.getImage().getScaledInstance(800,50,Image.SCALE_DEFAULT);
        ImageIcon im222=new ImageIcon(iii);
        JLabel label3=new JLabel(im222);
        label3.setBounds(200,550,800,50);
        panel.add(label3);

        JButton btnLOGOUT = new JButton("LOGOUT");
        btnLOGOUT.setBounds(500,630,210,30);
        btnLOGOUT.setBackground(Color.BLACK);
        btnLOGOUT.setForeground(Color.RED);
        btnLOGOUT.setFont(new Font("Tahoma",Font.BOLD,16));
        panel.add(btnLOGOUT);
        btnLOGOUT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    setVisible(false);
                    new Dashboard();
                }
                catch(Exception E){E.printStackTrace();};
            }
        });

        JButton btnCNF = new JButton("New Customer Form");
        btnCNF.setBounds(30,30,210,30);
        btnCNF.setBackground(Color.BLACK);
        btnCNF.setForeground(new Color(243, 211, 6));
        btnCNF.setFont(new Font("Tahoma",Font.BOLD,16));
        panel1.add(btnCNF);
        btnCNF.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    new NewCustomer();
                }
                catch(Exception E){E.printStackTrace();};
            }
        });

        JButton btnRoom=new JButton("Room");
        btnRoom.setBounds(30,65,210,30);
        btnRoom.setBackground(Color.BLACK);
        btnRoom.setForeground(new Color(243, 211, 6));
        btnRoom.setFont(new Font("Tahoma",Font.BOLD,16));
        panel1.add(btnRoom);
        btnRoom.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    new Room();
                }
                catch(Exception E){E.printStackTrace();}
            }
        });

        JButton btnDepartment=new JButton("Department");
        btnDepartment.setBounds(30,100,210,30);
        btnDepartment.setBackground(Color.BLACK);
        btnDepartment.setFont(new Font("Tahoma",Font.BOLD,16));
        btnDepartment.setForeground(new Color(243,211,6));
        panel1.add(btnDepartment);
        btnDepartment.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    new Department();
                }
                catch(Exception E){E.printStackTrace();}
            }
        });

        JButton btnAEI=new JButton("All Employee Info");
        btnAEI.setBounds(30,135,210,30);
        btnAEI.setBackground(Color.BLACK);
        btnAEI.setForeground(new Color(243,211,6));
        btnAEI.setFont(new Font("Tahoma",Font.BOLD,16));
        panel1.add(btnAEI);
        btnAEI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    new Employee();
                }
                catch(Exception E){E.printStackTrace();}
            }
        });

        JButton btnCI=new JButton("Customer Info");
        btnCI.setBounds(30,170,210,30);
        btnCI.setForeground(new Color(243,211,6));
        btnCI.setBackground(Color.BLACK);
        btnCI.setFont(new Font("Tahoma",Font.BOLD,16));
        panel1.add(btnCI);
        btnCI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    new CustomerInfo();
                }
                catch(Exception E){E.printStackTrace();}
            }
        });

        JButton btnMI=new JButton("Manager Info");
        btnMI.setBounds(30,205,210,30);
        btnMI.setForeground(new Color(243,211,6));
        btnMI.setBackground(Color.BLACK);
        btnMI.setFont(new Font("Tahoma",Font.BOLD,16));
        panel1.add(btnMI);
        btnMI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    new ManagerInfo();
                }
                catch(Exception E){E.printStackTrace();}
            }
        });

        JButton btnCO=new JButton("CheckOut");
        btnCO.setBounds(30,240,210,30);
        btnCO.setForeground(new Color(243,211,6));
        btnCO.setBackground(Color.BLACK);
        btnCO.setFont(new Font("Tahoma",Font.BOLD,16));
        panel1.add(btnCO);
        btnCO.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    new CheckOut();
                }
                catch(Exception E){E.printStackTrace();}
            }
        });

        JButton btnUC=new JButton("Update Check-in");
        btnUC.setBounds(30,275,210,30);
        btnUC.setForeground(new Color(243,211,6));
        btnUC.setBackground(Color.BLACK);
        btnUC.setFont(new Font("Tahoma",Font.BOLD,16));
        panel1.add(btnUC);
        btnUC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    new UpdateCheck();
                }
                catch(Exception E){E.printStackTrace();}
            }
        });

        JButton btnURS=new JButton("Update Room Status");
        btnURS.setBounds(30,310,210,30);
        btnURS.setForeground(new Color(243,211,6));
        btnURS.setBackground(Color.BLACK);
        btnURS.setFont(new Font("Tahoma",Font.BOLD,16));
        panel1.add(btnURS);
        btnURS.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    new UpdateRoom();
                }
                catch(Exception E){E.printStackTrace();}
            }
        });

        JButton btnPUS=new JButton("Pick Up Service");
        btnPUS.setBounds(30,345,210,30);
        btnPUS.setForeground(new Color(243,211,6));
        btnPUS.setBackground(Color.BLACK);
        btnPUS.setFont(new Font("Tahoma",Font.BOLD,16));
        panel1.add(btnPUS);
        btnPUS.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    new PickUp();
                }
                catch(Exception E){E.printStackTrace();}
            }
        });

        JButton btnSR=new JButton("Search Room");
        btnSR.setBounds(30,380,210,30);
        btnSR.setForeground(new Color(243,211,6));
        btnSR.setBackground(Color.BLACK);
        btnSR.setFont(new Font("Tahoma",Font.BOLD,16));
        panel1.add(btnSR);
        btnSR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    new SearchRoom();
                }
                catch(Exception E){E.printStackTrace();}
            }
        });

        JButton back=new JButton("Back");
        back.setBounds(30,415,210,30);
        back.setForeground(new Color(243,211,6));
        back.setBackground(Color.BLACK);
        back.setFont(new Font("Tahoma",Font.BOLD,16));
        panel1.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    new Dashboard();
                    setVisible(false);
                }
                catch(Exception E){E.printStackTrace();}
            }
        });


        getContentPane().setBackground(new Color(166, 156, 156));
        setLayout(null);
        setSize(1370,730);
        setVisible(true);
    }

    public static void main(String ars[]){
        new Reception();
    }
}
