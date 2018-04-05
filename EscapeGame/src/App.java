import java.awt.EventQueue;
import javax.swing.JFrame;

public class App extends JFrame
{
    public App() 
    {
        generateUI();
    }
    private void generateUI() 
    {
        add(new Board());
        setSize(1000, 1000);
        setTitle("Application");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    } 
    public static void main(String[] args) 
    {
        EventQueue.invokeLater(() -> 
        {
            App game = new App();
            game.setVisible(true);
        });
    }    
}
