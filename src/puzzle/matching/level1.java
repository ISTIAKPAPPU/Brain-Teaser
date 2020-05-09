
package puzzle.matching;

import static java.awt.AWTEventMulticaster.add;
import static java.awt.AWTEventMulticaster.add;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import static java.awt.PageAttributes.MediaType.A1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import static javafx.print.Paper.A1;
import static javafx.scene.paint.Color.color;
import static javax.management.Query.value;
import static javax.management.Query.value;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author student
 */

public class level1  {
    
    JFrame Menu = new JFrame("PUZZLE MATCHING");
    JButton A1=new JButton("YES");
    JButton A2=new JButton("NO");
    private ImageIcon icon;
   
    int menuWidth = 70; 
    int menuHeight = 70;
    int WIDTH = 550;
    int HEIGHT = 570;


    
    //score
    private JPanel Scorepanel = new JPanel();
    private Container c;
    private JLabel Score;
  

   
	public level1() {
            
         addicon();
          

        //Menu Variables
        Menu.setResizable(false);
        Menu.setSize(WIDTH, HEIGHT);
        Menu.setLayout(null);
        Menu.setLocationRelativeTo(null);
        Menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   
        //A1 Button Variables
      
        A1.setSize(menuWidth,menuHeight);
        A1.setLocation(180,200);
        Menu.add(A1); 
        A1.setToolTipText("Click to Play Again");
        A1.addActionListener(new ActionListener(){
                          

			@Override
			public void actionPerformed(ActionEvent arg0) {
                               
                           
                              new MainMenu();                         
				
			}
        	
        });	
        A1.setBackground(Color.GREEN);
        
        //A2 Button
        A2.setSize(menuWidth,menuHeight);
        A2.setLocation(320, 200);
        Menu.add( A2);
        A2.setToolTipText("Click to EXIT");
       // Menu.add( lvlList);
        A2.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
                       
                            System.exit(0);
		            
			}
        	
        });
         A2.setBackground(Color.cyan);
       
        //Add Score
        Score = new JLabel();

        //Value.setText();

        Score.setFont(new Font("Helvetica", Font.BOLD, 30));
        Score.setText("You wanna Play Again?");

        Score.setForeground(Color.black);
        Scorepanel.add(Score);

        Scorepanel.setBounds(90, 120, 400, 50);

        Scorepanel.setBackground(Color.yellow);
        Menu.add(Scorepanel);
        
        //Display Picture
        
        Menu.setUndecorated( true );
        c=Menu.getContentPane();
        c.setBackground(Color.yellow);
        Menu.setVisible(true);
        Menu.getRootPane().setWindowDecorationStyle(1);
       
    }
          public void addicon()
    {
        icon=new ImageIcon(getClass().getResource("image.png"));
        Menu.setIconImage(icon.getImage());
    }


   
     
    
    
  }
     
     


   


