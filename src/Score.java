import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Score extends JFrame implements ActionListener {
    String name;
    Score(String name, int score){
        this.name=name;
        setBounds(50,0,1440,850);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/Score.png"));
        Image i2=i1.getImage().getScaledInstance(300,250,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(530,400,350,300);                       //apna layout nma skte hai khud se
        add(image);

        JLabel heading=new JLabel("Thankyou " + name + " for playing Swiss Quiz ");
        heading.setBounds(405,130,800,50);
        heading.setFont(new Font("Helvetica",Font.BOLD,40));
        heading.setForeground(new Color(26, 155, 175));
        add(heading);

        JLabel lbscore=new JLabel("Your Score is:  " + score );
        lbscore.setBounds(560,235,400,40);
        lbscore.setFont(new Font("Helvetica",Font.BOLD,40));
        add(lbscore);

        JButton submit=new JButton("Play Again");
        submit.setBounds(630,330,150,45);
        submit.setBackground(new Color(26, 155, 175));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Login();
    }

    public static void main(String[] args) {
        new Score("User",0);
    }
}
