package Hotel.Management.System;
import javax.swing.*;
public class Splash extends JFrame {

    Splash(){
        super("HOTEL MANAGEMENT SYSTEM");

        ImageIcon imageicon=new ImageIcon(ClassLoader.getSystemResource("icon/splash.gif"));  //ADDING IMAGE
        JLabel label=new JLabel(imageicon);
        label.setBounds(0,0,858,680);
        add(label);

        setLayout(null);  //TO MANUALLY PLACE THINGS WITHIN FRAME
        setLocation(300,20);  //TO OPEN UP THE FRAME AT CENTER OF SCREEN
        setSize(858,680);
        setVisible(true);  //MAKE FRAME VISIBLE

        try{
            Thread.sleep(3000);//TO KEEP THE IMAGE FOR ONLY 5 SEC
            new login();
            setVisible(false);
        }
        catch(Exception e){e.printStackTrace();}  //sleep() THROWS EXCEPTION
    }

    public static void main(String ars[]){

        new Splash();
    }
}
