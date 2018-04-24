
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jeremy Fortunato
 */
public class GamePanel extends JPanel {
    
    private JButton runningBack;
    private JButton lineBacker1;
    private JButton lineBacker2;
    private JButton endzone;
    private JButton door;
    private Player rb;
    int RECT_X; 
    int RECT_Y;
    int RECT_WIDTH;
    int RECT_HEIGHT; 
    
    public GamePanel()
    {
        super();
        setLayout(null);
        
        setBackground(Color.decode ("#f5deb3"));
        
        door = new JButton();
        door.setBackground(Color.LIGHT_GRAY);
        door.setBounds(350, 100, 30, 30);
        add(door);
        
        runningBack = new JButton();
        runningBack.setBackground(Color.decode ("#ADD8E6"));
        add(runningBack);
        
        lineBacker1 = new JButton("Guard");
        lineBacker1.setBackground(Color.red);
        add(lineBacker1);
        
        lineBacker2 = new JButton("Guard");
        lineBacker2.setBackground(Color.red);
        add(lineBacker2);
        
        endzone = new JButton();
        endzone.setBackground(Color.yellow);
        add(endzone);
        
        
        setFocusable(true);

    }
    
    public void positionRBButton(Rectangle rb)
    {
        getRunningBack().setBounds(rb);  
    }
    
    public void positionLB1Button(Rectangle lb)
    {
        getLineBacker1().setBounds(lb);
    }
    
    public void positionLB2(Rectangle lb2)
    {
        getLineBacker2().setBounds(lb2);
    }
    
    public void positionEnd(Rectangle end)
    {
        getEndzone().setBounds(end);
    }
    
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        requestFocusInWindow();
         
         g.setColor(Color.BLACK); 
         //borders
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
    
  
    
   
    
    
  
    

    /**
     * @return the runningBack
     */
    public JButton getRunningBack() {
        return runningBack;
    }

    /**
     * @param runningBack the runningBack to set
     */
    public void setRunningBack(JButton runningBack) {
        this.runningBack = runningBack;
    }

    /**
     * @return the lineBacker1
     */
    public JButton getLineBacker1() {
        return lineBacker1;
    }

    /**
     * @param lineBacker1 the lineBacker1 to set
     */
    public void setLineBacker1(JButton lineBacker1) {
        this.lineBacker1 = lineBacker1;
    }

    /**
     * @return the lineBacker2
     */
    public JButton getLineBacker2() {
        return lineBacker2;
    }

    /**
     * @param lineBacker2 the lineBacker2 to set
     */
    public void setLineBacker2(JButton lineBacker2) {
        this.lineBacker2 = lineBacker2;
    }

    /**
     * @return the endzone
     */
    public JButton getEndzone() {
        return endzone;
    }

    /**
     * @param endzone the endzone to set
     */
    public void setEndzone(JButton endzone) {
        this.endzone = endzone;
    }

    /**
     * @return the rb
     */
    public Player getRb() {
        return rb;
    }

    /**
     * @param rb the rb to set
     */
    public void setRb(Player rb) {
        this.rb = rb;
    }
}
