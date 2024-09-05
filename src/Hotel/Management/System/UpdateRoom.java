package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class UpdateRoom extends JFrame implements ActionListener{

    Choice c2;
    JTextField rtext,availtext,cleantext;
    JButton update,check,back;

    UpdateRoom(){

        JPanel panel=new JPanel();
        panel.setBounds(5,5,890,590);
        panel.setBackground(new Color(13,99,94));
        panel.setLayout(null);
        add(panel);


        JLabel label1=new JLabel("UPDATE ROOM STATUS");
        label1.setForeground(new Color(243,211,6));
        label1.setFont(new Font("Tahoma",Font.BOLD,24));
        label1.setBounds(330,45,380,53);
        panel.add(label1);


        ImageIcon im1=new ImageIcon(ClassLoader.getSystemResource("icon/updated2.png"));
        Image i=im1.getImage().getScaledInstance(250,250,Image.SCALE_DEFAULT);
        ImageIcon im2=new ImageIcon(i);
        JLabel lbl=new JLabel(im2);
        lbl.setBounds(570,150,250,250);
        panel.add(lbl);


        JLabel id=new JLabel("ID");
        id.setForeground(new Color(234,203,178));
        id.setFont(new Font("Tahoma",Font.BOLD,18));
        id.setBounds(40,170,50,25);
        panel.add(id);


        c2=new Choice();
        try{
            database con1=new database();
            String q1="select * from customer";
            ResultSet res1=con1.statement.executeQuery(q1);
            while(res1.next()){
                c2.add(res1.getString("number"));
            }
        }
        catch(Exception e){e.printStackTrace();}
        c2.setBounds(295,170,180,25);
        c2.setForeground(Color.BLACK);
        c2.setBackground(new Color(41, 207, 186));
        c2.setFont(new Font("Tahoma",Font.PLAIN,15));
        panel.add(c2);


        JLabel room=new JLabel("ROOM NO.");
        room.setForeground(new Color(234,203,178));
        room.setFont(new Font("Tahoma",Font.BOLD,18));
        room.setBounds(40,230,100,25);
        panel.add(room);

        rtext=new JTextField();
        rtext.setBounds(295,230,180,25);
        rtext.setForeground(Color.BLACK);
        rtext.setBackground(new Color(41, 207, 186));
        rtext.setFont(new Font("Tahoma",Font.PLAIN,15));
        panel.add(rtext);



        JLabel avail=new JLabel("AVAILABILITY");
        avail.setForeground(new Color(234,203,178));
        avail.setFont(new Font("Tahoma",Font.BOLD,18));
        avail.setBounds(40,290,150,25);
        panel.add(avail);

        availtext=new JTextField();
        availtext.setBounds(295,290,180,25);
        availtext.setForeground(Color.BLACK);
        availtext.setBackground(new Color(41, 207, 186));
        availtext.setFont(new Font("Tahoma",Font.PLAIN,15));
        panel.add(availtext);


        JLabel clean=new JLabel("CLEANING STATUS");
        clean.setForeground(new Color(234,203,178));
        clean.setFont(new Font("Tahoma",Font.BOLD,18));
        clean.setBounds(40,350,180,25);
        panel.add(clean);

        cleantext=new JTextField();
        cleantext.setBounds(295,350,180,25);
        cleantext.setForeground(Color.BLACK);
        cleantext.setBackground(new Color(41, 207, 186));
        cleantext.setFont(new Font("Tahoma",Font.PLAIN,15));
        panel.add(cleantext);


        update=new JButton("UPDATE");
        update.setBounds(100,500,200,30);
        update.setBackground(Color.BLACK);
        update.setForeground(new Color(243,211,6));
        update.setFont(new Font("Tahoma",Font.BOLD,18));
        update.addActionListener(this);
        panel.add(update);

        check=new JButton("CHECK");
        check.setBounds(350,500,200,30);
        check.setBackground(Color.BLACK);
        check.setForeground(new Color(243,211,6));
        check.setFont(new Font("Tahoma",Font.BOLD,18));
        check.addActionListener(this);
        panel.add(check);

        back=new JButton("BACK");
        back.setBounds(600,500,200,30);
        back.setBackground(Color.BLACK);
        back.setForeground(new Color(243,211,6));
        back.setFont(new Font("Tahoma",Font.BOLD,18));
        back.addActionListener(this);
        panel.add(back);


        setUndecorated(true);
        setSize(900,600);
        setLocation(400,75);
        setLayout(null);
        setVisible(true);
    }


    public void actionPerformed(ActionEvent E1){
        if(E1.getSource()==back){
            setVisible(false);
        }
        else if(E1.getSource()==check){
            try{
                String id=c2.getSelectedItem();
                String q2=" select * from customer where number = '"+id+"' ";

                database con2=new database();
                ResultSet res2=con2.statement.executeQuery(q2);
                while(res2.next()){
                    rtext.setText(res2.getString("room"));
                }
                ResultSet res3=con2.statement.executeQuery("select * from room where roomnumber= '"+rtext.getText()+"' ");
                while(res3.next()){
                    availtext.setText(res3.getString("availability"));
                    cleantext.setText(res3.getString("cleaning_status"));
                }
            }
            catch(Exception e1){e1.printStackTrace();}
        }
        else if(E1.getSource()==update){
            try{
                database con3=new database();
                String status=cleantext.getText();
                con3.statement.executeUpdate("update room set cleaning_status = '"+status+"' where roomnumber = "+rtext.getText());
                JOptionPane.showMessageDialog(null,"UPDATED SUCCESSFULLY");
                setVisible(false);
            }
            catch(Exception e2){e2.printStackTrace();}
        }
    }


    public static void main(String ars[]){
        new UpdateRoom();
    }
}
