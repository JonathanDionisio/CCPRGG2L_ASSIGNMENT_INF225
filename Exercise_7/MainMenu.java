import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.*;


public class MainMenu extends JFrame{

    MainMenu(){

        JLabel imageLabel = new JLabel();
        ImageIcon lander = new ImageIcon("homelander.gif");
        imageLabel.setIcon(lander);
        

        JButton StartButton = new JButton();
        StartButton.setText("Start Game");
        StartButton.setFont(new Font("Arial", Font.BOLD, 25));


        this.add(imageLabel);
        this.add(StartButton);
        this.setLayout(new FlowLayout());
        EventHandler handler = new EventHandler();
        StartButton.addActionListener(handler);

        setTitle("Snake Game");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLocationRelativeTo(rootPane);
        this.setVisible(true);
        this.setResizable(false);
        this.getContentPane().setBackground(Color.CYAN);

    }

    private class EventHandler implements ActionListener{

        public void actionPerformed(ActionEvent event){
            new ColorMenu();
            dispose();

        }

    }
    
}
