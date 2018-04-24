
import java.awt.BorderLayout;
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
public class InitialPanel extends JPanel {

    /**
     * @return the sp
     */
    public ScorePanel getSp() {
        return sp;
    }

    /**
     * @param sp the sp to set
     */
    public void setSp(ScorePanel sp) {
        this.sp = sp;
    }

    /**
     * @return the gp
     */
    public GamePanel getGp() {
        return gp;
    }

    /**
     * @param gp the gp to set
     */
    public void setGp(GamePanel gp) {
        this.gp = gp;
    }

   
    
    
    private ScorePanel sp;
    private GamePanel gp;
    
    
    public InitialPanel()
    {
        super();
        BorderLayout layout = new BorderLayout();
        setLayout(layout);
       sp = new ScorePanel();
        gp = new GamePanel();
      
       // add(sp,BorderLayout.NORTH);
        add(gp);
        
    }
}
