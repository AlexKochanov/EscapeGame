/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dansimons
 */
import java.awt.event.ActionEvent;
import javax.swing.Timer;

/**
 *
 * @author dansimons
 */
public class prisonGuard{
    
    
    Timer time;
    int delay = 30;
    Board board;
    
    //initialize coordinates for guards once layout is complete
    int guard1X = 400;
    int guard1Y = 150;
    
    int guard2X = 400;
    int guard2Y = 600;
    
    int guard3X = 600;
    int guard3Y = 400;
    
    int guard4X = 200;
    int guard4Y = 100;
    
    public prisonGuard()
    {
       timer();
    }
    

    public void timer()
    {
        setTimer(new Timer(delay, (ActionEvent e) -> {
            guard1Movement();
            guard2Movement();
            guard3Movement();
            guard4Movement();
        }));
    }
   
    public void guard1Movement() 
    {
        if(board.guard1X == 40)
        {
            setGuard1X(getGuard1X() + 1);
        }
        else if(board.guard1X == 400)
        {
            setGuard1X(getGuard1X() - 1);
        }
    }
    
    public void guard2Movement()
    {
        if (board.guard2Y == 40)
        {
            setGuard2Y(getGuard2Y() + 1);
        }
        else if ((board.guard2Y == 150)&&(board.guard2X == 40))
        {
            setGuard2Y(150);
            setGuard2X(getGuard2X() + 1);
        }
        else if ((board.guard2Y == 150)&&(board.guard2X==275))
        {
            setGuard2Y(getGuard2Y() - 1);
            setGuard2X(275);
        }
        else if ((board.guard2Y == 40)&&(board.guard2X==275))
        {
            setGuard2Y(40);
            setGuard2X(getGuard2X() - 1);
        }
    }
    
    public void guard3Movement()
    {
        if(board.guard3Y == 40)
        {
            setGuard3Y(getGuard3Y() + 1);
            setGuard3X(40);
        }
        else if(board.guard3Y == 300)
        {
            setGuard3Y(getGuard3Y() - 1);
            setGuard3X(40);
        }
    }
    
    public void guard4Movement()
    {
        if(board.guard4Y == 40)
        {
            setGuard3Y(getGuard3Y() - 1);
            setGuard3X(40);
        }
        else if(board.guard4Y == 5)
        {
            setGuard3Y(getGuard3Y() + 1);
            setGuard3X(40);
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
