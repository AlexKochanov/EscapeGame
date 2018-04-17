import javax.swing.JPanel;
import java.awt.*;
import javax.swing.JButton;

public class Board extends JPanel 
{
   private static int RECT_X;
   private static int RECT_Y;
   private static int RECT_WIDTH;
   private static int RECT_HEIGHT;
   
   int guard1X = 400;
   int guard1Y = 150;
    
   int guard2X = 600;
   int guard2Y = 600;
    
   int guard3X = 450;
   int guard3Y = 400;
    
   int guard4X = 300;
   int guard4Y = 350;
   
   JButton guard1;
   JButton guard2;
   JButton guard3;
   JButton guard4;
   JButton player;
   prisonGuard prisonGuard;

   @Override
   protected void paintComponent(Graphics g) {
      super.paintComponent(g);
      g.setColor(Color.BLUE);
      g.fillRect(30, 30, 50, 50);
      //Guards
      g.setColor(Color.RED);
      g.fillRect(guard1X, guard1Y, 50, 50);
      g.fillRect(guard2X, guard2Y, 50, 50);
      g.fillRect(guard3X, guard3Y, 50, 50);
      g.fillRect(guard4X, guard4Y, 50, 50);
      //Borders
      g.setColor(Color.BLACK);
      g.fillRect(RECT_X = 0, RECT_Y = 0, RECT_WIDTH = 25, RECT_HEIGHT = 1000);
      g.fillRect(RECT_X = 0, RECT_Y = 0, RECT_WIDTH = 1000, RECT_HEIGHT = 25);
      g.fillRect(RECT_X = 0, RECT_Y = 928, RECT_WIDTH = 1000, RECT_HEIGHT = 25);
      g.fillRect(RECT_X = 958, RECT_Y = 0, RECT_WIDTH = 25, RECT_HEIGHT = 1000);
      //Maze Walls
      g.fillRect(RECT_X = 80, RECT_Y = 80, RECT_WIDTH = 25, RECT_HEIGHT = 350);
      g.fillRect(RECT_X = 80, RECT_Y = 80, RECT_WIDTH = 150, RECT_HEIGHT = 25);
      g.fillRect(RECT_X = 200, RECT_Y = 200, RECT_WIDTH = 25, RECT_HEIGHT = 200);
      g.fillRect(RECT_X = 200, RECT_Y = 200, RECT_WIDTH = 150, RECT_HEIGHT = 25);
      g.fillRect(RECT_X = 600, RECT_Y = 200, RECT_WIDTH = 25, RECT_HEIGHT = 200);
      g.fillRect(RECT_X = 450, RECT_Y = 200, RECT_WIDTH = 150, RECT_HEIGHT = 25);
      g.fillRect(RECT_X = 300, RECT_Y = 0, RECT_WIDTH = 25, RECT_HEIGHT = 100);
      g.fillRect(RECT_X = 300, RECT_Y = 80, RECT_WIDTH = 400, RECT_HEIGHT = 25);
      g.fillRect(RECT_X = 400, RECT_Y = 400, RECT_WIDTH = 25, RECT_HEIGHT = 550);
      g.fillRect(RECT_X = 700, RECT_Y = 80, RECT_WIDTH = 25, RECT_HEIGHT = 350);
      g.fillRect(RECT_X = 825, RECT_Y = 80, RECT_WIDTH = 25, RECT_HEIGHT = 350);
      g.fillRect(RECT_X = 700, RECT_Y = 700, RECT_WIDTH = 25, RECT_HEIGHT = 230);
      g.fillRect(RECT_X = 200, RECT_Y = 750, RECT_WIDTH = 400, RECT_HEIGHT = 25);
      g.fillRect(RECT_X = 100, RECT_Y = 600, RECT_WIDTH = 200, RECT_HEIGHT = 25);
      g.fillRect(RECT_X = 500, RECT_Y = 550, RECT_WIDTH = 500, RECT_HEIGHT = 25);
      g.fillRect(RECT_X = 825, RECT_Y = 700, RECT_WIDTH = 25, RECT_HEIGHT = 350);
      g.fillRect(RECT_X = 100, RECT_Y = 500, RECT_WIDTH = 25, RECT_HEIGHT = 350);
   }
   
   //Constructor
    public Board()
    {
        guard1 = new JButton();
        guard1.setBackground(Color.RED);
        guard1.setOpaque(true);
        guard1.setBorderPainted(false);
        guard1.setBounds(guard1X, guard1Y, 50, 50);
        add(guard1);
        
        guard2 = new JButton();
        guard2.setBackground(Color.RED);
        guard2.setOpaque(true);
        guard2.setBorderPainted(false);
        guard2.setBounds(guard2X, guard2Y, 50, 50);
        add(guard2);
        
        guard3 = new JButton();
        guard3.setBackground(Color.RED);
        guard3.setOpaque(true);
        guard3.setBorderPainted(false);
        guard3.setBounds(guard3X, guard3Y, 50, 50);
        add(guard3);
        
        guard4 = new JButton();
        guard4.setBackground(Color.RED);
        guard4.setOpaque(true);
        guard4.setBorderPainted(false);
        guard4.setBounds(guard4X, guard4Y, 50, 50);
        add(guard4);
    }
}
