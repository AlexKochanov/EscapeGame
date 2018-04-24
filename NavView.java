/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jeremy Fortunato 
 */
public class NavView {
    
    private InitialFrame frame;
    private NavModel model;
    
    NavView(NavModel model)
    {
        this.model = model;
        frame = new InitialFrame();
    }

    /**
     * @return the frame
     */
    public InitialFrame getFrame() {
        return frame;
    }

    /**
     * @param frame the frame to set
     */
    public void setFrame(InitialFrame frame) {
        this.frame = frame;
    }

    /**
     * @return the model
     */
    public NavModel getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(NavModel model) {
        this.model = model;
    }
}
