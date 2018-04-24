
import java.awt.Rectangle;
import javax.swing.JButton;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jeremy Fortunato
 */
public class GuardOne extends Rectangle {
    
    private String name;
    private int number;
    private int speed;
    private int startingX;
    private int startingY;
    private int WidthLB;
    private int HeightLB;
    private int Initialx;
    private int Initialy;
    private Player rb;
    
    public GuardOne(String Lname, int Lnumber, int Lspeed, int d, int e, int f, int g, int Lx, int Ly)
    {
        super(d,e,f,g);
        name = Lname;
        number = Lnumber;
        speed = Lspeed;
        Initialx = Lx;
        Initialy = Ly;
        this.setLocation(400, 325);
        this.setSize(50, 50);
    }
    
 
    
   
    
    public void purseUp(Rectangle rb)
    {
        this.y = this.y - speed;
    }
    
    public void purseDown(Rectangle rb)
    {
        this.y = this.y + speed;
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
        setSpeed(20);
    }
    
    public void fastSpeed()
    {
        setSpeed(45);
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
     * @return the WidthLB
     */
    public int getWidthLB() {
        return WidthLB;
    }

    /**
     * @param WidthLB the WidthLB to set
     */
    public void setWidthLB(int WidthLB) {
        this.WidthLB = WidthLB;
    }

    /**
     * @return the HeightLB
     */
    public int getHeightLB() {
        return HeightLB;
    }

    /**
     * @param HeightLB the HeightLB to set
     */
    public void setHeightLB(int HeightLB) {
        this.HeightLB = HeightLB;
    }
 public void LbLeft(Rectangle rb)
    {   
        this.x = this.x - speed;   
    }
    
    public void pursueRight(Rectangle rb)
    {
        this.x = this.x + speed;
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

     public String toStringLB()
    {
        String result;
        result = getName() + " " + getNumber();
        return result;
    }
}
