
import java.awt.Rectangle;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jeremy Fortunato
 */
public class GuardTwo extends Rectangle {
    
    private String name;
    private int number;
    private int speed;
    private int startingX;
    private int startingY;
    private int WidthLB;
    private int HeightLB;
    private int Initialx;
    private int Initialy;
    
    public GuardTwo(String Lname, int Lnumber, int Lspeed, int Lx, int e, int f, int g, int h, int Ly)
    {
        super(Lx,e,f,g);
        name = Lname;
        number = Lnumber;
        speed = Lspeed;
        Initialx = Lx;
        Initialy = Ly;
        this.setLocation(500, 600);
        this.setSize(50, 50);
    }
    
    
    
    public void LbtwoLeft(Rectangle rb)
    {
        this.x = this.x - speed;
    }
    
    public void pursueRight(Rectangle rb)
    {
        this.x = this.x + speed;
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
        setSpeed(4);
    }
    
    public void mediumSpeed()
    {
        setSpeed(15);
    }
    
    public void fastSpeed()
    {
        setSpeed(30);
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
    public String toStringLB2()
    {
        String result;
        result = getName() + " " + getNumber();
        return result;
    }
}
