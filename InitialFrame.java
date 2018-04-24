
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jeremy Fortunato 
 */
public class InitialFrame extends JFrame {
   
     private InitialPanel Ip;
    
    public InitialFrame()
    {
        super("IST 311");
        Ip = new InitialPanel();
        add(Ip);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize (1000, 1000);
        setVisible(true); 
}

    /**
     * @return the Ip
     */
    public InitialPanel getIp() {
        return Ip;
    }

    /**
     * @param ip the ip to set
     */
    public void setIp(InitialPanel ip) {
        this.Ip = ip;
    }
}
