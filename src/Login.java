import javax.swing.*;      //JFrame class hoti hai swing package ke andar
import java.awt.*;         //Color.WHITE
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {
    JButton rules,back;
    JTextField tfname;
    Login(){
        setBounds(50,0,1440,850);
        getContentPane().setBackground(Color.DARK_GRAY);
        setLayout(null);

        JLabel head=new JLabel("It's Quiz Time...");
        head.setBounds(500,0,900,195);
        head.setFont(new Font("Helvetica",Font.BOLD,60));
        head.setForeground(new Color(102,226,215));
        add(head);

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/quiznew1.jpg"));
        JLabel image=new JLabel(i1);
        image.setBounds(50,135,600,500);                       //apna layout nma skte hai khud se
        add(image);                                                      //component ko frame ke upar place krna hai toh

       JLabel heading=new JLabel("Swiss Quiz");
       heading.setBounds(840,125,500,195);
       heading.setFont(new Font("Helvetica",Font.BOLD,60));
       heading.setForeground(new Color(26, 155, 175));
       add(heading);

        JLabel name=new JLabel("Enter your Name");
        name.setBounds(870,230,450,210);
        name.setFont(new Font("Helvetica",Font.BOLD,32));
        name.setForeground(Color.BLACK);
        add(name);

        tfname=new JTextField();
        tfname.setBounds(850,400,300,40);
        tfname.setFont(new Font("Helvetica",Font.PLAIN,30));
        add(tfname);

        rules=new JButton("Rules");
        rules.setFont(new Font("Helvetica",Font.PLAIN,27));
        rules.setBounds(820,500,160,45);
        rules.setBackground(new Color(26, 155, 175));
        rules.setForeground(Color.BLACK);
        rules.addActionListener(this);
        add(rules);

        back=new JButton("Exit");
        back.setFont(new Font("Helvetica",Font.PLAIN,27));
        back.setBounds(1015,500,160,45);
        back.setBackground(new Color(26, 155, 175));
        back.setForeground(Color.BLACK);
        back.addActionListener(this);
        add(back);

//        setSize(1200,500);
//        setLocation(200,200);
        setVisible(true);           //bydefault frame is hidden
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == rules){
          String name=tfname.getText();
          setVisible(false);
          new Rules(name);
        }
        if(ae.getSource() == back){
         setVisible(false);
        }
    }

    public static void main(String[] args) {

        new Login();     //class ka object,ananonyms object hota hai
    }
}
