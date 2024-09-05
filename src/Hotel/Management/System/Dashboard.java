package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Dashboard extends JFrame implements ActionListener{

    JButton add,rec;

    Dashboard(){

        super("HOTEL MANAGEMENT SYSTEM - DASHBOARD");

        rec = new JButton("RECEPTION");
        rec.setBounds(415,510,170,60);
        rec.setFont(new Font("Tahoma",Font.BOLD,20));
        rec.setBackground(new Color(88, 13, 124));
        rec.setForeground(Color.WHITE);
        rec.addActionListener(this);
        add(rec);

        add = new JButton("ADMIN");
        add.setBounds(880,510,170,60);
        add.setFont(new Font("Tahoma",Font.BOLD,20));
        add.setBackground(new Color(88, 13, 124));
        add.setForeground(Color.WHITE);
        add.addActionListener(this);
        add(add);

        ImageIcon i11 = new ImageIcon(ClassLoader.getSystemResource("icon/boss.png"));
        Image i2 = i11.getImage().getScaledInstance(200,195, Image.SCALE_DEFAULT);
        ImageIcon imageIcon11 = new ImageIcon(i2);
        JLabel label1 = new JLabel(imageIcon11);
        label1.setBounds(870,300,200,195);
        add(label1);

        ImageIcon i111 = new ImageIcon(ClassLoader.getSystemResource("icon/Reception.png"));
        Image i22 = i111.getImage().getScaledInstance(200,195, Image.SCALE_DEFAULT);
        ImageIcon imageIcon111 = new ImageIcon(i22);
        JLabel label11 = new JLabel(imageIcon111);
        label11.setBounds(400,300,200,195);
        add(label11);

        ImageIcon imageicon=new ImageIcon(ClassLoader.getSystemResource("icon/Dashboard.gif"));
        Image i1=imageicon.getImage().getScaledInstance(1950,1090, Image.SCALE_DEFAULT);
        ImageIcon imageicon1=new ImageIcon(i1);
        JLabel label=new JLabel(imageicon1);
        label.setBounds(0,0,1950,1090);
        add(label);




        setLayout(null);
        setSize(1950,1090);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == rec) {
            new Reception();
            setVisible(false);
        } else {
            new login2();
            setVisible(false);
        }
    }

    public static void main(String ars[]){
        new Dashboard();
    }

}
