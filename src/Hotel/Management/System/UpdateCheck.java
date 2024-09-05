package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class UpdateCheck extends JFrame implements ActionListener{

    Choice c1;
    JTextField roomtext,nametext,checkintext,a_paidtext,a_pendingtext;
    JButton UPDATE,CHECK,BACK;

    UpdateCheck(){

        JPanel panel=new JPanel();
        panel.setBounds(5,5,890,590);
        panel.setBackground(new Color(13,99,94));
        panel.setLayout(null);
        add(panel);

        JLabel label1=new JLabel("UPDATE CHECK-IN DETAILS");
        label1.setForeground(new Color(243,211,6));
        label1.setFont(new Font("Tahoma",Font.BOLD,24));
        label1.setBounds(300,45,380,53);
        panel.add(label1);

        ImageIcon im1=new ImageIcon(ClassLoader.getSystemResource("icon/updated1.png"));
        Image i=im1.getImage().getScaledInstance(250,250,Image.SCALE_DEFAULT);
        ImageIcon im2=new ImageIcon(i);
        JLabel lbl=new JLabel(im2);
        lbl.setBounds(570,180,250,250);
        panel.add(lbl);

        JLabel id=new JLabel("ID");
        id.setForeground(new Color(234,203,178));
        id.setFont(new Font("Tahoma",Font.BOLD,18));
        id.setBounds(40,170,50,25);
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
        c1.setBounds(295,170,180,25);
        c1.setForeground(Color.BLACK);
        c1.setBackground(new Color(41, 207, 186));
        c1.setFont(new Font("Tahoma",Font.PLAIN,15));
        panel.add(c1);


        JLabel room=new JLabel("ROOM NO.");
        room.setForeground(new Color(234,203,178));
        room.setFont(new Font("Tahoma",Font.BOLD,18));
        room.setBounds(40,220,100,25);
        panel.add(room);

        roomtext=new JTextField();
        roomtext.setBounds(295,220,180,25);
        roomtext.setForeground(Color.BLACK);
        roomtext.setBackground(new Color(41, 207, 186));
        roomtext.setFont(new Font("Tahoma",Font.PLAIN,15));
        panel.add(roomtext);



        JLabel name=new JLabel("NAME");
        name.setForeground(new Color(234,203,178));
        name.setFont(new Font("Tahoma",Font.BOLD,18));
        name.setBounds(40,270,100,25);
        panel.add(name);

        nametext=new JTextField();
        nametext.setBounds(295,270,180,25);
        nametext.setForeground(Color.BLACK);
        nametext.setBackground(new Color(41, 207, 186));
        nametext.setFont(new Font("Tahoma",Font.PLAIN,15));
        panel.add(nametext);


        JLabel cin=new JLabel("CHECK-IN TIME");
        cin.setForeground(new Color(234,203,178));
        cin.setFont(new Font("Tahoma",Font.BOLD,18));
        cin.setBounds(40,320,180,25);
        panel.add(cin);

        checkintext=new JTextField();
        checkintext.setBounds(295,320,180,25);
        checkintext.setForeground(Color.BLACK);
        checkintext.setBackground(new Color(41, 207, 186));
        checkintext.setFont(new Font("Tahoma",Font.PLAIN,15));
        panel.add(checkintext);


        JLabel a_paid=new JLabel("AMOUNT PAID(Rs)");
        a_paid.setForeground(new Color(234,203,178));
        a_paid.setFont(new Font("Tahoma",Font.BOLD,18));
        a_paid.setBounds(40,370,180,25);
        panel.add(a_paid);

        a_paidtext=new JTextField();
        a_paidtext.setBounds(295,370,180,25);
        a_paidtext.setForeground(Color.BLACK);
        a_paidtext.setBackground(new Color(41, 207, 186));
        a_paidtext.setFont(new Font("Tahoma",Font.PLAIN,15));
        panel.add(a_paidtext);


        JLabel a_pending=new JLabel("AMOUNT PENDING(Rs)");
        a_pending.setForeground(new Color(234,203,178));
        a_pending.setFont(new Font("Tahoma",Font.BOLD,18));
        a_pending.setBounds(40,420,220,25);
        panel.add(a_pending);

        a_pendingtext=new JTextField();
        a_pendingtext.setBounds(295,420,180,25);
        a_pendingtext.setForeground(Color.BLACK);
        a_pendingtext.setBackground(new Color(41, 207, 186));
        a_pendingtext.setFont(new Font("Tahoma",Font.PLAIN,15));
        panel.add(a_pendingtext);


        UPDATE=new JButton("UPDATE");
        UPDATE.setBounds(100,520,200,30);
        UPDATE.setBackground(Color.BLACK);
        UPDATE.setForeground(new Color(243,211,6));
        UPDATE.setFont(new Font("Tahoma",Font.BOLD,18));
        UPDATE.addActionListener(this);
        panel.add(UPDATE);

        CHECK=new JButton("CHECK");
        CHECK.setBounds(350,520,200,30);
        CHECK.setBackground(Color.BLACK);
        CHECK.setForeground(new Color(243,211,6));
        CHECK.setFont(new Font("Tahoma",Font.BOLD,18));
        CHECK.addActionListener(this);
        panel.add(CHECK);

        BACK=new JButton("BACK");
        BACK.setBounds(600,520,200,30);
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


    public void actionPerformed(ActionEvent E1){
        if(E1.getSource()==BACK){
            setVisible(false);
        }
        else if(E1.getSource()==CHECK){
            try{
                String id=c1.getSelectedItem();
                String q2=" select * from customer where number = '"+id+"' ";

                database con2=new database();
                ResultSet res2=con2.statement.executeQuery(q2);
                while(res2.next()){
                    roomtext.setText(res2.getString("room"));
                    nametext.setText(res2.getString("name"));
                    checkintext.setText(res2.getString("checkin"));
                    a_paidtext.setText(res2.getString("deposit"));
                }
                ResultSet res3=con2.statement.executeQuery("select * from room where roomnumber= '"+roomtext.getText()+"' ");
                while(res3.next()){
                    String price=res3.getString("price");
                    int amt_pending=Integer.parseInt(price) - Integer.parseInt(a_paidtext.getText());
                    a_pendingtext.setText(""+amt_pending);
                }
            }
            catch(Exception e1){e1.printStackTrace();}
        }
        else if(E1.getSource()==UPDATE){
            try{
                database con3=new database();
                String q3=c1.getSelectedItem();
                String room=roomtext.getText();
                String name=nametext.getText();
                String cin=checkintext.getText();
                String amount=a_paidtext.getText();
                con3.statement.executeUpdate("update customer set room = '"+room+"', name = '"+name+"' , checkin = '"+cin+"' , deposit = '"+amount+"' where number = '"+q3+"'");
                JOptionPane.showMessageDialog(null,"UPDATED SUCCESSFULLY");
                setVisible(false);
            }
            catch(Exception e2){e2.printStackTrace();}
        }
    }

    public static void main(String ars[]){

        new UpdateCheck();
    }
}
