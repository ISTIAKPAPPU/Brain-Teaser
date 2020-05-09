
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
import static java.lang.Thread.sleep;
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

public class MainMenu  {
    
    JFrame Menu = new JFrame("PUZZLE MATCHING");
    JButton A1=new JButton();
    JButton A2=new JButton();
    JButton B1 = new JButton();
    JButton B2 = new JButton();
    JButton C1 = new JButton();
    JButton C2 = new JButton();
    JButton D1 = new JButton();
    JButton D2 = new JButton();
    JButton E1 = new JButton();
    JButton E2 = new JButton();
    
    int menuWidth = 70; //Width of each button/item on display
    int menuHeight = 70;//Height of each button/item on display
    int WIDTH = 750;
    int HEIGHT = 770;
    
    //check
    JButton tmp=new JButton();
    int clk=1;
    int exit=0;
    String s1,s2;

    
    //score
    private JPanel Scorepanel = new JPanel();
    private Container c;
    private JLabel Score,Value;
    private ImageIcon icon;
    private Font font;
    public int V=500;
    NumberFormat nf = new DecimalFormat("00");
   
	public MainMenu() {
          
     //maze icon
           addicon();
       
    	
        //Menu Variables
        Menu.setResizable(false);
        Menu.setSize(WIDTH, HEIGHT);
        Menu.setLayout(null);
        Menu.setLocationRelativeTo(null);
        Menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   
        //A1 Button Variables
      
        A1.setSize(menuWidth,menuHeight);
        A1.setLocation(350,120);
        Menu.add(A1); 
        A1.setToolTipText("Click to Play");
        A1.addActionListener(new ActionListener(){
                          

			@Override
			public void actionPerformed(ActionEvent arg0) {
                               
                           
                            check(A1);                                
				
			}
        	
        });	
        A1.setBackground(Color.GREEN);
        A1.setName("A1");
        //A2 Button
       
        A2.setSize(menuWidth,menuHeight);
        A2.setLocation(200, 390);
        Menu.add( A2);
        A2.setToolTipText("Click to Play");
       // Menu.add( lvlList);
        A2.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
                       
                             check(A2); 
		            
			}
        	
        });
         A2.setBackground(Color.cyan);
          A2.setName("A2");
       //C1 Button Variables
        
       C1.setSize(menuWidth,menuHeight);
       C1.setLocation(50, 300);
       Menu.add(C1);
       C1.setToolTipText("Click to Play");
       C1.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
                                
                                //JOptionPane.showMessageDialog(null, "still maintaning");
				  check(C1); 
			}
        	
        });
        C1.setBackground(Color.green);
        C1.setName("C1");
        //B2
        B2.setSize(menuWidth,menuHeight);
        B2.setLocation(350,300);
        Menu.add(B2);
        B2.setToolTipText("Click to Play");
        B2.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
                                   
                            check(B2);      
                                  
                                  
			}
        });
        B2.setBackground(Color.cyan);
         B2.setName("B2");
        //c2
        C2.setSize(menuWidth,menuHeight);
        C2.setLocation(490,320);
        Menu.add(C2);
        C2.setToolTipText("Click to Play");
        C2.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
                                  
                                  
                             check(C2);     
                                  
			}
        });
         C2.setBackground(Color.cyan);
          C2.setName("C2");
        //B1 Button Variables
        
        B1.setSize(menuWidth,menuHeight);
        B1.setLocation(100,490);
        Menu.add(B1);
        B1.setToolTipText("Click to Play");
        B1.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
                      check(B1);
	            //System.exit(0);
			}
        });
        B1.setBackground(Color.green);
        B1.setName("B1");
         //D2
        D2.setSize(menuWidth,menuHeight);
        D2.setLocation(450,490);
        Menu.add(D2);
        D2.setToolTipText("Click to Play");
        D2.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
                                   
                          check(D2);        
                                  
                                  
			}
        });
        D2.setBackground(Color.cyan);
        D2.setName("D2");
         //D1
        D1.setSize(menuWidth,menuHeight);
        D1.setLocation(100,130);
        Menu.add(D1);
        D1.setToolTipText("Click to Play");
        D1.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
                                   
                                  
                            check(D1);      
                                  
			}
        });
        D1.setBackground(Color.green);
        D1.setName("D1");
         //E1
        E1.setSize(menuWidth,menuHeight);
        E1.setLocation(200,250);
        Menu.add(E1);
        E1.setToolTipText("Click to Play");
        E1.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
                                   
                                  
                            check(E1);      
                                  
			}
        });
         E1.setBackground(Color.green);
        E1.setName("E1");
         //E2
        E2.setSize(menuWidth,menuHeight);
        E2.setLocation(280,520);
        Menu.add(E2);
        E2.setToolTipText("Click to Play");
        E2.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
                                  
                              check(E2);    
                                         
			}
        });
         E2.setBackground(Color.cyan);
         E2.setName("E2");
        
        
        //Add Score
        Score = new JLabel();
        Value= new JLabel();
        //Value.setText();
        Value.setFont(new Font("Helvetica", Font.PLAIN, 20));
        Score.setFont(new Font("Helvetica", Font.BOLD, 20));
        Score.setText("Score:");
        Value.setForeground(Color.blue);
        Score.setForeground(Color.red);
        Scorepanel.add(Score);
        Scorepanel.add(Value);
        Scorepanel.setBounds(20, 20, 150, 50);
        Value.setText(nf.format(V) );
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

     public static void main(String[] args) {
        new MainMenu();
    }
     
     
    
     void check(JButton x)
     {
            Thread thread = new Thread() {
            
            @Override
            public void run() {
                
               
                    try {
                       
                        sleep(500);   
                        x.setVisible(false);
                        tmp.setVisible(false);
                        
                 
                    } catch (InterruptedException ex) {
                      
                       ex.printStackTrace();
                   }
                }
            
     };
                
         
       if(clk==1)
       { 
         System.out.println("if "+clk);
         clk++;
         x.setBackground(Color.black);
         
         tmp=x;
         s1=x.getName();
         
       }
       else if(clk==2)
       {
           System.out.println(clk);
            x.setBackground(Color.black);
           clk=1;
           s2=x.getName();
           System.out.println("s1 ="+s1);
           System.out.println("s2 ="+s2);
           char k1=s1.charAt(0);
           char k2=s2.charAt(0);
           
           if(k1==k2)
           { 
              thread.start();
              //x.setVisible(false);
             // tmp.setVisible(false);
              exit=exit+2;
              if(exit==10)
              {
               Menu.setVisible(false);
               new level1();
              }
              s1="";
              s2="";
           }
           else 
           {
        
               V=V-10;
               Value.setText(nf.format(V) );
              char ch=s2.charAt(1);
              if(ch=='1'){
               x.setBackground(Color.green);
              }
              else
              {
               x.setBackground(Color.cyan);
              }
              char w=s1.charAt(1);
         
              if(w=='2'){
               tmp.setBackground(Color.cyan);
              }
              else
              {
               tmp.setBackground(Color.green);
              }
            
              s1="";
              s2=""; 
              tmp=new JButton();
           }
           
           
       }
       
     
     }
   

   
}
