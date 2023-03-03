    import javax.swing.JFrame;
    import javax.swing.JButton;
    import java.awt.event.ActionListener;
    import java.awt.event.ActionEvent;
    import java.awt.*;
    public class TryAgain extends JFrame{

        TryAgain(){



            setTitle("Snake Game");
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);
            this.setSize(500, 500);
            this.setLocationRelativeTo(rootPane);
            this.setVisible(true);
            this.setResizable(false);
            this.getContentPane().setBackground(Color.CYAN);


            JButton playagain = new JButton();
            playagain.setText("Try Again");
            playagain.setFont(new Font("Arial", Font.BOLD, 25));
            EventHandler handler = new EventHandler();
            playagain.addActionListener(handler);

            JButton Exit = new JButton();
            Exit.setText("Rage Quit?");
            Exit.setFont(new Font("Arial", Font.BOLD, 25));
            ExitHandler handlerr = new ExitHandler();
            Exit.addActionListener(handlerr);

            this.setLayout(new FlowLayout());

            this.add(Exit);
            this.add(playagain);
        }

        private class EventHandler  implements ActionListener{

            public void actionPerformed(ActionEvent event){
                new GameFrame();
                dispose();
        
            }
        } 
        private class ExitHandler implements ActionListener{           
           
            public void actionPerformed(ActionEvent event){
                dispose();
            
        }


        }



    
}
