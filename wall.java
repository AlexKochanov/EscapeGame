/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jeremy
 */

import java.awt.Rectangle;

import javax.swing.JButton;

public class wall extends Rectangle {
  
   public wall(int Wx, int Wy, int wallWidth, int wallHeight){
       super(Wx,Wy,wallWidth,wallHeight); 
       this.setBounds(Wx,Wy,wallWidth,wallHeight);
        
       
   }
    
}
