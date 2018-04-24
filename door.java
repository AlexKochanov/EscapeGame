/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dansimons
 */
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;

public class door {
    
    private int doorX = 350;
    private int doorY = 100;
    
    public door()
    {
        
    }

    public int getDoorX() {
        return doorX;
    }

    public void setDoorX(int doorX) {
        this.doorX = doorX;
    }

    public int getDoorY() {
        return doorY;
    }

    public void setDoorY(int doorY) {
        this.doorY = doorY;
    }
    
    public void winMessage()
    {
        {
            JOptionPane.showMessageDialog(null, "Congratulations, you win!");
        }
    }
}
