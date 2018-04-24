
import java.awt.Color;
import java.awt.GridLayout;
import java.util.Hashtable;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jeremy Fortunato
 */
public class ScorePanel extends JPanel {
 private JLabel touchdown;
    private JLabel tackle;
    private JSlider difficulty;
    private JSlider speed;
    private GuardOne lb;
    private GuardTwo lb2;
    private Player rb;
    private int touchdownCounter;
    private int tackleCounter;
    private JSlider enemyspeed; 
    private JButton mich; 
    private JButton Northw; 
    private JButton tulane; 
    private JButton PennState; 
    public ScorePanel()
    {
        super();
        GridLayout layout = new GridLayout();
        setLayout(layout);
        
        touchdown = new JLabel("Touchdown: " + getTouchdownCounter());
        tackle = new JLabel("Tackle: " + getTackleCounter());
        
        speed = new JSlider(JSlider.HORIZONTAL, 1,3,1);
        speed.setMajorTickSpacing(3);
        speed.setPaintTicks(true);
        
        Hashtable labTable = new Hashtable();
        labTable.put(new Integer(1), new JLabel("Slow"));
        labTable.put(new Integer(2), new JLabel("Normal"));
        labTable.put(new Integer(3), new JLabel("Fast"));
        speed.setLabelTable(labTable);
        speed.setPaintLabels(true);
        
        difficulty = new JSlider( 1,3,1);
        difficulty.setMajorTickSpacing(3);
        difficulty.setPaintTicks(true);
       
        Hashtable DiffTablel = new Hashtable();
        DiffTablel.put(new Integer(1), new JLabel("Easy"));
        DiffTablel.put(new Integer(2), new JLabel("Medium"));
        DiffTablel.put(new Integer(3), new JLabel("Hard"));
        difficulty.setLabelTable(DiffTablel);
        difficulty.setPaintLabels(true);
        mich = new JButton("Michigan"); 
        mich.setBackground(Color.yellow); 
        Northw = new JButton("NorthWestern");
        Northw.setBackground(Color.decode("#8A2BE2")); 
        tulane = new JButton("Tulane"); 
        tulane.setBackground(Color.green); 
        PennState = new JButton("Penn State"); 
        PennState.setBackground(Color.decode("#ADD8E6")); 
        add(mich); 
        add(tulane); 
        add(Northw); 
        add(PennState);
        add(difficulty);
        
        add(speed);
        add(tackle);
        add(touchdown);
        
         
        
        
        touchdown.setFocusable(false);
        tackle.setFocusable(false);
        difficulty.setFocusable(false);
        speed.setFocusable(false); 
    }
    
    /**
     * @return the touchdown
     */
    public JLabel getTouchdown() {
        return touchdown;
    }

    /**
     * @param touchdown the touchdown to set
     */
    public void setTouchdown(JLabel touchdown) {
        this.touchdown = touchdown;
    }

    /**
     * @return the tackle
     */
    public JLabel getTackle() {
        return tackle;
    }

    /**
     * @param tackle the tackle to set
     */
    public void setTackle(JLabel tackle) {
        this.tackle = tackle;
    }

    /**
     * @return the difficulty
     */
    public JSlider getDifficulty() {
        return difficulty;
    }

    /**
     * @param difficulty the difficulty to set
     */
    public void setDifficulty(JSlider difficulty) {
        this.difficulty = difficulty;
    }

    /**
     * @return the speed
     */
    public JSlider getSpeed() {
        return speed;
    }

    /**
     * @param speed the speed to set
     */
    public void setSpeed(JSlider speed) {
        this.speed = speed;
    }
    
   
    public void touchdown()
    {
        setTouchdownCounter(getTouchdownCounter() + 1);
        getTouchdown().setText("Touchdown " + getTouchdownCounter());
    }
    
    public void tackle()
    {
        setTackleCounter(getTackleCounter() + 1);
        getTackle().setText("Tackle " + getTackleCounter());
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
     * @return the touchdownCounter
     */
    public int getTouchdownCounter() {
        return touchdownCounter;
    }

    /**
     * @param touchdownCounter the touchdownCounter to set
     */
    public void setTouchdownCounter(int touchdownCounter) {
        this.touchdownCounter = touchdownCounter;
    }

    /**
     * @return the tackleCounter
     */
    public int getTackleCounter() {
        return tackleCounter;
    }

    /**
     * @param tackleCounter the tackleCounter to set
     */
    public void setTackleCounter(int tackleCounter) {
        this.tackleCounter = tackleCounter;
    }

    /**
     * @return the enemyspeed
     */
    public JSlider getEnemyspeed() {
        return enemyspeed;
    }

    /**
     * @param enemyspeed the enemyspeed to set
     */
    public void setEnemyspeed(JSlider enemyspeed) {
        this.enemyspeed = enemyspeed;
    }

    /**
     * @return the mich
     */
    public JButton getMich() {
        return mich;
    }

    /**
     * @param mich the mich to set
     */
    public void setMich(JButton mich) {
        this.mich = mich;
    }

    /**
     * @return the Northw
     */
    public JButton getNorthw() {
        return Northw;
    }

    /**
     * @param Northw the Northw to set
     */
    public void setNorthw(JButton Northw) {
        this.Northw = Northw;
    }

    /**
     * @return the tulane
     */
    public JButton getTulane() {
        return tulane;
    }

    /**
     * @param tulane the tulane to set
     */
    public void setTulane(JButton tulane) {
        this.tulane = tulane;
    }

    /**
     * @return the PennState
     */
    public JButton getPennState() {
        return PennState;
    }

    /**
     * @param PennState the PennState to set
     */
    public void setPennState(JButton PennState) {
        this.PennState = PennState;
    }
}
