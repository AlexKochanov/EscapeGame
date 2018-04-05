/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dansimons
 */
import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author dansimons
 */
public class prisonGuard {
    JButton guard1;
    JButton guard2;
    JButton guard3;
    JButton guard4;
    
    Timer time;
    int delay = 30;
    
    //initialize coordinates for guards once layout is complete
    int guard1X;
    int guard1Y;
    
    int guard2X;
    int guard2Y;
    
    int guard3X;
    int guard3Y;
    
    int guard4X;
    int guard4Y;
    
    public prisonGuard()
    {
        initComponents();
    }
    
    public void initComponents()
    {
        guard1 = new JButton();
        guard1.setBackground(Color.RED);
        guard1.setOpaque(true);
        guard1.setBorderPainted(false);
        guard1.setBounds(50, 50, 40, 40);
        
        
        guard2 = new JButton();
        guard2.setBackground(Color.RED);
        guard2.setOpaque(true);
        guard2.setBorderPainted(false);
        guard2.setBounds(50, 50, 40, 40);
        
        
        guard3 = new JButton();
        guard3.setBackground(Color.RED);
        guard3.setOpaque(true);
        guard3.setBorderPainted(false);
        guard3.setBounds(50, 50, 40, 40);
        
        
        guard4 = new JButton();
        guard4.setBackground(Color.RED);
        guard4.setOpaque(true);
        guard4.setBorderPainted(false);
        guard4.setBounds(50, 50, 40, 40);
        
    }
    
    public void timer()
    {
        setTimer(new Timer(getDelay(), (ActionEvent e) -> {
            
        }));
    }
   
    public void guard1Movement() 
    {
        if(guard1X == 40)
        {
            setGuard1X(getGuard1X() + 1);
        }
        else if(guard1X == 400)
        {
            setGuard1X(getGuard1X() - 1);
        }
    }
    
    public void guard2Movement()
    {
        if (guard2Y == 40)
        {
            setGuard2Y(getGuard2Y() + 1);
        }
        else if ((guard2Y == 150)&&(guard2X == 40))
        {
            setGuard2Y(150);
            setGuard2X(getGuard2X() + 1);
        }
        else if ((guard2Y == 150)&&(guard2X==275))
        {
            setGuard2Y(getGuard2Y() - 1);
            setGuard2X(275);
        }
        else if ((guard2Y == 40)&&(guard2X==275))
        {
            setGuard2Y(40);
            setGuard2X(getGuard2X() - 1);
        }
    }
    
    public int getGuard1X()
    {
        return guard1X;
    }
    
    public void setGuard1X(int guard1X)
    {
        this.guard1X = guard1X;
    }
    
    public int getGuard1Y()
    {
        return guard1Y;
    }
    
    public void setGuard1Y(int guard1Y)
    {
        this.guard1Y = guard1Y;
    }
    
    public int getGuard2X()
    {
        return guard2X;
    }
    
    public void setGuard2X(int guard2X)
    {
        this.guard2X = guard2X;
    }
    
    public int getGuard2Y()
    {
        return guard2Y;
    }
    
    public void setGuard2Y(int guard2Y)
    {
        this.guard2Y = guard2Y;
    }
    
    public int getGuard3X()
    {
        return guard3X;
    }
    
    public void setGuard3X(int guard3X)
    {
        this.guard3X = guard3X;
    }
    
    public int getGuard3Y()
    {
        return guard3Y;
    }
    
    public void setGuard3Y(int guard3Y)
    {
        this.guard3Y = guard3Y;
    }
    
    public int getGuard4X()
    {
        return guard4X;
    }
    
    public void setGuard4X(int guard4X)
    {
        this.guard4X = guard4X;
    }
    
    public int getGuard4Y()
    {
        return guard4Y;
    }
    
    public void setGuard4Y(int guard4Y)
    {
        this.guard4Y = guard4Y;
    }
    
    public JButton getGuard1() 
    {
        return guard1;
    }
    
    public void setGuard1(JButton guard1)
    {
        this.guard1 = guard1;
    }
    
    public JButton getGuard2() 
    {
        return guard2;
    }
    
    public void setGuard2(JButton guard2)
    {
        this.guard2 = guard2;
    }
    
    public JButton getGuard3() 
    {
        return guard3;
    }
    
    public void setGuard3(JButton guard3)
    {
        this.guard3 = guard3;
    }
    
    public JButton getGuard4() 
    {
        return guard4;
    }
    
    public void setGuard4(JButton guard4)
    {
        this.guard4 = guard4;
    }
    
    public Timer getTimer()
    {
        return time;
    }
    
    public void setTimer(Timer time)
    {
        this.time = time;
    }
    
    public int getDelay()
    {
        return delay;
    }
    
    public void setDelay(int delay)
    {
        this.delay = delay;
    }
}
