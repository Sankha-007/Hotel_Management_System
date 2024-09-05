package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class login2 extends JFrame implements ActionListener{

    JTextField textfield1;
    JPasswordField passwordfield1;
    JButton b1,b2;

    login2(){

        super("HOTEL MANAGEMENT SYSTEM - ADMIN LOGIN");
        JLabel label1=new JLabel("User Name");
        label1.setBounds(40,65,100,30);  //setBounds() places the label w.r.t frame boundary & not w.r.t window screen boundary
        label1.setFont(new Font("Tahoma",Font.BOLD,18));
        label1.setForeground(new Color(1,1,1));
        add(label1);

        JLabel label2=new JLabel("Password");
        label2.setBounds(40,140,100,30);  //setBounds() places the label w.r.t frame boundary & not w.r.t window screen boundary
        label2.setFont(new Font("Tahoma",Font.BOLD,18));
        label2.setForeground(new Color(1,1,1));
        add(label2);

        textfield1=new JTextField();
        textfield1.setBounds(160,65,150,30);
        textfield1.setForeground(Color.BLACK);
        setFont(new Font("Tahoma",Font.PLAIN,16));
        textfield1.setBackground(new Color(41, 207, 186));
        add(textfield1);

        passwordfield1=new JPasswordField();
        passwordfield1.setBounds(160,140,150,30);
        passwordfield1.setForeground(Color.BLACK);
        passwordfield1.setBackground(new Color(41, 207, 186));
        add(passwordfield1);

        ImageIcon imageicon=new ImageIcon(ClassLoader.getSystemResource("icon/download.gif"));
        Image i1=imageicon.getImage().getScaledInstance(200,263,Image.SCALE_DEFAULT);
        JLabel label=new JLabel(imageicon);
        label.setBounds(350,20,200,263);
        add(label);

        b1=new JButton("LOGIN");
        b1.setBounds(40,230,120,30);
        b1.setFont(new Font("serif",Font.BOLD,17));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);

        b2=new JButton("CANCEL");
        b2.setBounds(180,230,120,30);
        b2.setFont(new Font("serif",Font.BOLD,17));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);

        getContentPane().setBackground(new Color(13, 99, 94));  //TO SET BACKGROUND COLOR OF FRAME
        setLayout(null);
        setLocation(400,270);
        setSize(600,350);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b1){
            try{
                database c=new database();
                String user=textfield1.getText();
                String pass=passwordfield1.getText();

                String q="select * from login2 where user_name = '"+user+"' and password='"+pass+"'";
                ResultSet resultset=c.statement.executeQuery(q);

                if(resultset.next()){
                    new admin();
                    setVisible(false);
                }
                else{
                    JOptionPane.showMessageDialog(null,"INVALID");
                }
            }
            catch(Exception E){E.printStackTrace();}
        }
        else{
            new Dashboard();
            setVisible(false);
        }
    }

    public static void main(String ars[]){
        new login2();
    }
}
