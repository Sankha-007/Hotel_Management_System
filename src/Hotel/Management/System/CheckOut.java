package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class CheckOut extends JFrame{

    Choice c1;

    CheckOut(){

        JPanel panel=new JPanel();
        panel.setBounds(5,5,890,590);
        panel.setBackground(new Color(13,99,94));
        panel.setLayout(null);
        add(panel);


        JLabel label1=new JLabel("GUEST CHECKOUT");
        label1.setForeground(new Color(243,211,6));
        label1.setFont(new Font("Tahoma",Font.BOLD,24));
        label1.setBounds(350,45,380,53);
        panel.add(label1);


        JLabel id=new JLabel("CUSTOMER ID");
        id.setForeground(new Color(234,203,178));
        id.setFont(new Font("Tahoma",Font.BOLD,18));
        id.setBounds(40,170,150,25);
        panel.add(id);

        c1=new Choice();
        try{
            database con1=new database();
            String q1="select * from customer";
            ResultSet res1=con1.statement.executeQuery(q1);
            while(res1.next()){
                c1.add(res1.getString("number"));
            }
        }
        catch(Exception e){e.printStackTrace();}
        c1.setBounds(295,170,250,25);
        c1.setForeground(Color.BLACK);
        c1.setBackground(new Color(41, 207, 186));
        c1.setFont(new Font("Tahoma",Font.PLAIN,15));
        panel.add(c1);


        JLabel room=new JLabel("ROOM NO.");
        room.setForeground(new Color(234,203,178));
        room.setFont(new Font("Tahoma",Font.BOLD,18));
        room.setBounds(40,250,100,25);
        panel.add(room);

        JLabel roomlabel=new JLabel();
        roomlabel.setForeground(new Color(234,203,178));
        roomlabel.setFont(new Font("Tahoma",Font.BOLD,18));
        roomlabel.setBounds(295,250,250,25);
        panel.add(roomlabel);


        JLabel cin=new JLabel("CHECK-IN TIME");
        cin.setForeground(new Color(234,203,178));
        cin.setFont(new Font("Tahoma",Font.BOLD,18));
        cin.setBounds(40,330,180,25);
        panel.add(cin);

        JLabel cinlabel=new JLabel();
        cinlabel.setForeground(new Color(234,203,178));
        cinlabel.setFont(new Font("Tahoma",Font.BOLD,18));
        cinlabel.setBounds(295,330,300,25);
        panel.add(cinlabel);


        JLabel cout=new JLabel("CHECK-OUT TIME");
        cout.setForeground(new Color(234,203,178));
        cout.setFont(new Font("Tahoma",Font.BOLD,18));
        cout.setBounds(40,410,180,25);
        panel.add(cout);

        Date date=new Date();

        JLabel coutlabel=new JLabel(""+date);
        coutlabel.setForeground(new Color(234,203,178));
        coutlabel.setFont(new Font("Tahoma",Font.BOLD,18));
        coutlabel.setBounds(295,410,300,25);
        panel.add(coutlabel);


        JButton checkout=new JButton("CHECKOUT");
        checkout.setBounds(100,520,200,30);
        checkout.setBackground(Color.BLACK);
        checkout.setForeground(new Color(243,211,6));
        checkout.setFont(new Font("Tahoma",Font.BOLD,18));
        panel.add(checkout);
        checkout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    database c2=new database();
                    c2.statement.executeUpdate("delete from customer where number = '"+c1.getSelectedItem()+"'");
                    c2.statement.executeUpdate("update room set availability= 'Available' where roomnumber= '"+roomlabel.getText()+"'");
                    JOptionPane.showMessageDialog(null,"CHECKOUT SUCCESSFUL");
                    setVisible(false);
                }
                catch(Exception E){E.printStackTrace();}
            }
        });

        JButton check=new JButton("CHECK");
        check.setBounds(350,520,200,30);
        check.setBackground(Color.BLACK);
        check.setForeground(new Color(243,211,6));
        check.setFont(new Font("Tahoma",Font.BOLD,18));
        panel.add(check);
        check.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                database c=new database();
                try{
                    ResultSet res=c.statement.executeQuery("select * from customer where number = '"+c1.getSelectedItem()+"'");
                    while(res.next()){
                        roomlabel.setText(res.getString("room"));
                        cinlabel.setText(res.getString("checkin"));
                    }
                }
                catch(Exception E){E.printStackTrace();}
            }
        });

        JButton back=new JButton("BACK");
        back.setBounds(600,520,200,30);
        back.setBackground(Color.BLACK);
        back.setForeground(new Color(243,211,6));
        back.setFont(new Font("Tahoma",Font.BOLD,18));
        panel.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });


        setUndecorated(true);
        setSize(900,600);
        setLocation(400,75);
        setLayout(null);
        setVisible(true);
    }


    public static void main(String ars[]){

        new CheckOut();
    }
}
