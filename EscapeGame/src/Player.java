
import java.awt.Rectangle;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jeremy Fortunato
 */
public class Player extends Rectangle{
    
    private String name;
    private int number;
    private int Initialx;
    private int Initialy;
     private int startingX;
    private int startingY;
    private int speed;
    
    Board board;
    prisonGuard guard;
   
    private int WidthRB;
    private int HeightRB;
  
    
    public Player(String Rname, int Rnumber, int Rspeed, int d, int e, int f, int g, int Rx, int Ry)
    {
        super(d,e,f,g);
        name = Rname;
        number = Rnumber;
        speed = 25;// RSpeed
        Initialx = Rx;
        Initialy = Ry;
        this.setLocation(100, 400);
        this.setSize(70, 70);
    }
    
    public void playerListener()
    {
       new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) 
            {
                int k = e.getKeyCode();

                if (k == e.VK_LEFT) 
                {
                   moveRBLeft();
                   //NEED TO ADD RB BOUNDS
                   //e.g. board.playerBounds();
                   guard.getTimer().start();
                } 
                else if (k == e.VK_RIGHT) 
                {
                   moveRBRight();
                   
                   guard.getTimer().start();

                } 
                else if (k == e.VK_UP) 
                {
                    moveRBUp();
                    
                    guard.getTimer().start();

                } 
                else if (k == e.VK_DOWN) 
                {
                    moveRBDown();
                    
                    guard.getTimer().start();
                }
                
            }   
        };
    }
       
  
    public void reset()
    {
        this.x = Initialx;
        this.y = Initialy;
    }
    
    public void slowSpeed()
    {
        setSpeed(7);
    }
    
    public void mediumSpeed()
    {
        setSpeed(14);
    }
    
    public void fastSpeed()
    {
        setSpeed(15);
    }
    

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the number
     */
    public int getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * @return the speed
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * @param speed the speed to set
     */
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    /**
     * @return the startingX
     */
    public int getStartingX() {
        return startingX;
    }

    /**
     * @param startingX the startingX to set
     */
    public void setStartingX(int startingX) {
        this.startingX = startingX;
    }

    /**
     * @return the startingY
     */
    public int getStartingY() {
        return startingY;
    }

    /**
     * @param startingY the startingY to set
     */
    public void setStartingY(int startingY) {
        this.startingY = startingY;
    }

    /**
     * @return the widthRB
     */
    public int getWidthRB() {
        return WidthRB;
    }

    /**
     * @param widthRB the widthRB to set
     */
    public void setWidthRB(int widthRB) {
        this.WidthRB = widthRB;
    }

    /**
     * @return the heightRB
     */
    public int getHeightRB() {
        return HeightRB;
    }

    /**
     * @param heightRB the heightRB to set
     */
    public void setHeightRB(int heightRB) {
        this.HeightRB = heightRB;
    }

    /**
     * @return the Initialx
     */
    public int getInitialx() {
        return Initialx;
    }

    /**
     * @param Initialx the Initialx to set
     */
    public void setInitialx(int Initialx) {
        this.Initialx = Initialx;
    }

    /**
     * @return the Initialy
     */
    public int getInitialy() {
        return Initialy;
    }

    /**
     * @param Initialy the Initialy to set
     */
    public void setInitialy(int Initialy) {
        this.Initialy = Initialy;
    }
      public String toStringRunningBack()
    {
        String result;
        result = getName() + " " + getNumber();
        return result;
    }
    
    
    
    public void moveRBLeft()
    {
        this.x = this.x - speed;
    }
    
    public void moveRBRight()
    {
        this.x = this.x + speed;
    }
    
    public void moveRBUp()
    {
        this.y = this.y -speed;
    }
    
    public void moveRBDown()
    {
        this.y = this.y + speed;
    }
    
}
