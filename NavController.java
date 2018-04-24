
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jeremy Fortunato
 */
public class NavController{
    
    private NavModel model;
    private NavView view;
    private Timer tim;
    int hitCounter =0; 
    NavController(NavModel model, NavView iview)
    {
        this.model = model;
        this.view = iview;
        
        winGame();
        view.getFrame().getIp().getGp().positionRBButton(model.getRb());
        view.getFrame().getIp().getGp().positionLB1Button(model.getLb());
        view.getFrame().getIp().getGp().positionLB2(model.getLb2());
        
        
      
        
  
        tim = new Timer(100, new ActionListener(){
            
            public void actionPerformed(ActionEvent e){
                /*
                if(model.getRb().x < model.getLb().x){
                model.getLb().LbLeft(model.getRb());
                view.getFrame().getIp().getGp().positionLB1Button(model.getLb());}
                
                if(model.getRb().x < model.getLb2().x){
                model.getLb2().LbtwoLeft(model.getRb());
                view.getFrame().getIp().getGp().positionLB2(model.getLb2());}
                
                if(model.getRb().x > model.getLb().x){
                model.getLb().pursueRight(model.getRb());
                view.getFrame().getIp().getGp().positionLB1Button(model.getLb());}
                    
                if(model.getRb().x > model.getLb2().x){
                model.getLb2().pursueRight(model.getRb());
                view.getFrame().getIp().getGp().positionLB2(model.getLb2());}
                
                if(model.getRb().y > model.getLb().y){
                model.getLb().purseDown(model.getRb());
                view.getFrame().getIp().getGp().positionLB1Button(model.getLb());}
                
                if(model.getRb().y > model.getLb2().y){
                model.getLb2().purseDown(model.getRb());
                view.getFrame().getIp().getGp().positionLB2(model.getLb2());}
            
                if(model.getRb().y < model.getLb().y){
                model.getLb().purseUp(model.getRb());
                view.getFrame().getIp().getGp().positionLB1Button(model.getLb());}
                
                if(model.getRb().y < model.getLb2().y){
                model.getLb2().purseUp(model.getRb());
                view.getFrame().getIp().getGp().positionLB2(model.getLb2());}
                */
             

                if((model.getLb().x == 400) && (model.getLb().y == 325)){
                    
                    model.getLb().pursueRight(model.getRb());
                    model.getLb().purseUp(model.getRb());
                    view.getFrame().getIp().getGp().positionLB1Button(model.getLb());
                     
                }
                
                else if((model.getLb().x == 240) && model.getLb().y == 500){
                     
                    model.getLb().pursueRight(model.getLb());
                    view.getFrame().getIp().getGp().positionLB1Button(model.getLb());
                     
                }
               
               
              
                if(model.getRb().intersects(model.getLb()) || model.getRb().intersects(model.getLb2())){
                    model.getRb().reset();
                    model.getLb().reset();
                    model.getLb2().reset();
                    view.getFrame().getIp().getGp().positionRBButton(model.getRb());
                    view.getFrame().getIp().getGp().positionLB1Button(model.getLb());
                    view.getFrame().getIp().getGp().positionLB2(model.getLb2());
                    view.getFrame().getIp().getSp().tackle();}
                
                
           
                
            }
        });
         
         // Key Listener moves the runningback
         view.getFrame().getIp().getGp().setFocusable(true);
         view.getFrame().getIp().getGp().addKeyListener(new KeyAdapter(){
            
             public void keyPressed(KeyEvent e){
                 //if(model.getRb().intersects(model.getWallOne())){
                 int kk = e.getKeyCode();
           if(model.getRb().intersects(model.getBorderOne())){
                 model.getRb().setBounds(model.getRb().x+5,model.getRb().y, model.getRb().width,model.getRb().height);  
             }
           else if(model.getRb().intersects(model.getBorderTwo())){
                 model.getRb().setBounds(model.getRb().x,model.getRb().y+5, model.getRb().width,model.getRb().height);  
             }
           else if(model.getRb().intersects(model.getBorderThree())){
                 model.getRb().setBounds(model.getRb().x,model.getRb().y-5, model.getRb().width,model.getRb().height);  
             }
           else if(model.getRb().intersects(model.getBorderFour())){
                 model.getRb().setBounds(model.getRb().x-5,model.getRb().y, model.getRb().width,model.getRb().height);  
             }
           else  if(kk == e.VK_LEFT)
         {
             model.getRb().moveRBLeft();
             tim.start();
             view.getFrame().getIp().getGp().positionRBButton(model.getRb());
         }
         
           else  if(kk == e.VK_RIGHT)
         {
              //  if(model.getRb().intersects(model.getWallOne())){
                  // model.getRb().setBounds(model.getRb().x,model.getRb().y, model.getRb().width,model.getRb().height);
              //  }
               //   else{
            model.getRb().moveRBRight();
            tim.start();
            view.getFrame().getIp().getGp().positionRBButton(model.getRb());
             
         }
         
           else  if(kk == e.VK_UP)
         {  
            
            model.getRb().moveRBUp();
            tim.start();
            view.getFrame().getIp().getGp().positionRBButton(model.getRb());
             
         }
         
           else  if(kk == e.VK_DOWN)
         {
             model.getRb().moveRBDown();
             tim.start();
             view.getFrame().getIp().getGp().positionRBButton(model.getRb());
         }
         }
         });
          
        
     
         view.getFrame().getIp().getSp().getDifficulty().addChangeListener(new ChangeListener(){
           
             public void stateChanged(ChangeEvent e) {
                 
                 if(view.getFrame().getIp().getSp().getDifficulty().getValue() == 1){
                 model.getLb().slowSpeed();
                 model.getLb2().slowSpeed();}    
                 if(view.getFrame().getIp().getSp().getDifficulty().getValue() == 2){
                 model.getLb().mediumSpeed();
                 model.getLb2().mediumSpeed();}
                 if(view.getFrame().getIp().getSp().getDifficulty().getValue() == 3){  
                 model.getLb().fastSpeed();
                 model.getLb2().fastSpeed();
                 }  
             }
         });
         
         view.getFrame().getIp().getSp().getSpeed().addChangeListener(new ChangeListener(){
             
             public void stateChanged(ChangeEvent e){
                 
                 if(view.getFrame().getIp().getSp().getSpeed().getValue() == 1){ 
                 model.getRb().slowSpeed();}
                 if(view.getFrame().getIp().getSp().getSpeed().getValue() == 2){
                 model.getRb().mediumSpeed();}
                 if(view.getFrame().getIp().getSp().getSpeed().getValue() == 3){
                 model.getRb().fastSpeed();}
             }
         });
    }
    
    public void winGame() {
        if (model.getRb().x == 350 && model.getRb().y == 100)
        {
            model.getDoor().winMessage();
        }
    }
}
    
    

