
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jeremy Fortunato 
 */
public class NavModel {
    
    private Player rb;
    private GuardOne lb;
    private GuardTwo lb2;
    private Timer tim;
    private wall borderOne; 
    private wall borderTwo;
    private wall borderThree;
    private wall borderFour;
    private door door;
    public NavModel()
    {
        rb = new Player("Player", 5, 5, 100, 400, 120, 50, 100, 400);
       door = new door();
        lb = new GuardOne("Guard", 11, 8, 1600, 100, 100, 400, 3000, 200);
        lb2 = new GuardTwo("Guard", 12, 5, 1600, 600, 200, 100, 3000, 600);
        tim = new Timer(100);
        borderOne = new wall(0, 0, 25,  1000); 
        borderTwo = new wall(0, 0,  1000, 25);
        borderThree = new wall( 0, 928,1000,  25);
        borderFour = new wall (958, 0,  25, 1000);
        
    }
    public door getDoor() {
        return door;
    }

    /**
     * @param rb the rb to set
     */
    public void setDoor(door door) {
        this.door = door;
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

    /**
     * @return the lb
     */
    public GuardOne getLb() {
        return lb;
    }

    /**
     * @param lb the lb to set
     */
    public void setLb(GuardOne lb) {
        this.lb = lb;
    }

    /**
     * @return the lb2
     */
    public GuardTwo getLb2() {
        return lb2;
    }

    /**
     * @param lb2 the lb2 to set
     */
    public void setLb2(GuardTwo lb2) {
        this.lb2 = lb2;
    }

    /**
     * @return the end
     */
    /**
     * @return the tim
     */
    public Timer getTim() {
        return tim;
    }

    /**
     * @param tim the tim to set
     */
    public void setTim(Timer tim) {
        this.tim = tim;
    }

    /**
     * @return the wallOne
     */
    public wall getBorderOne() {
        return borderOne;
    }

    /**
     * @return the borderTwo
     */
    public wall getBorderTwo() {
        return borderTwo;
    }

    /**
     * @return the borderThree
     */
    public wall getBorderThree() {
        return borderThree;
    }

    /**
     * @return the borderFour
     */
    public wall getBorderFour() {
        return borderFour;
    }
}
