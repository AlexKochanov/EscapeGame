import javax.swing.JPanel;
import java.awt.*;

public class Board extends JPanel 
{
   private static int RECT_X;
   private static int RECT_Y;
   private static int RECT_WIDTH;
   private static int RECT_HEIGHT;

   @Override
   protected void paintComponent(Graphics g) {
      super.paintComponent(g);
      //Borders
      g.fillRect(RECT_X = 0, RECT_Y = 0, RECT_WIDTH = 25, RECT_HEIGHT = 1000);
      g.fillRect(RECT_X = 0, RECT_Y = 0, RECT_WIDTH = 1000, RECT_HEIGHT = 25);
      g.fillRect(RECT_X = 0, RECT_Y = 928, RECT_WIDTH = 1000, RECT_HEIGHT = 25);
      g.fillRect(RECT_X = 958, RECT_Y = 0, RECT_WIDTH = 25, RECT_HEIGHT = 1000);
      //Maze Walls
      g.fillRect(RECT_X = 60, RECT_Y = 60, RECT_WIDTH = 25, RECT_HEIGHT = 150);
      g.fillRect(RECT_X = 240, RECT_Y = 240, RECT_WIDTH = 25, RECT_HEIGHT = 150);
      g.fillRect(RECT_X = 60, RECT_Y = 60, RECT_WIDTH = 150, RECT_HEIGHT = 25);
      g.fillRect(RECT_X = 180, RECT_Y = 240, RECT_WIDTH = 200, RECT_HEIGHT = 25);
      g.fillRect(RECT_X = 400, RECT_Y = 400, RECT_WIDTH = 25, RECT_HEIGHT = 550);
      g.fillRect(RECT_X = 700, RECT_Y = 60, RECT_WIDTH = 25, RECT_HEIGHT = 150);
      
   }
    public Board()
    {
    
    }
}
