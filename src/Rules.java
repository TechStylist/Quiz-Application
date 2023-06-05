import javax.swing.*;    //JFrame
import java.awt.*;       //Color.WHITE
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Rules extends JFrame implements ActionListener {
    String name;
    JButton start,back;
    Rules(String name){
        this.name=name;
        setBounds(50,0,1440,850);
       getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel heading=new JLabel("Welcome " + name + " to Swiss Quiz");
        heading.setBounds(370,35,800,55);
        heading.setFont(new Font("Helvetica",Font.BOLD,55));
        heading.setForeground(new Color(26, 155, 175));
        add(heading);

        JLabel rules=new JLabel();
        rules.setBounds(400,80,700,650);
        rules.setFont(new Font("Helvetica",Font.PLAIN,25));
        rules.setText(
                "<html>"+
                        "1. You have to select one option out of 4" + "<br><br>" +
                        "2. You can once use a lifeline to eliminate two options" + "<br><br>" +
                        "3. Out of four options only one is correct" + "<br><br>" +
                        "4. You have to submit answer in 15 seconds otherwise next question will be arrived." + "<br><br>" +
                        "5. For next question, you can click on next option." + "<br><br>" +
                        "6. Click on next option will take you to next question " + "<br><br>" +
                        "7. It consists of 10 questions and then you can submit to view your score/result" + "<br><br>" +
                        "8. Once you have submitted you can't go back but you can play again" + "<br><br>" +
                        "<html>"
        );
        add(rules);

        back=new JButton("Back");
        back.setBounds(800,700,150,50);
        back.setBackground(new Color(26, 155, 175));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        start=new JButton("Start");
        start.setBounds(550,700,150,50);
        start.setBackground(new Color(26, 155, 175));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);


//        setSize(800,650);
//        setLocation(350,100);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==start){
            setVisible(false);
          new Quiz1(name);
        }
        else{
            setVisible(false);
            new Login();
        }
    }

    public static void main(String[] args) {
        new Rules("User");
    }
}
