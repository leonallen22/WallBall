import java.awt.event.KeyEvent;
import java.awt.Rectangle;

public class Player extends Sprite
{
    private final int INITIAL_X = 450;
    private final int INITIAL_Y = 840;
    
    public Player()
    {
        bounds = new Rectangle(60, 20);
        width = (int)bounds.getWidth();
        height = (int)bounds.getHeight();
        setX(INITIAL_X);
        setY(INITIAL_Y);
    }
    
    public void move()
    {
        int x = (int)bounds.getX();
        int y = (int)bounds.getY();
        bounds.setLocation(x+dx, y);
    }
    
    public void reset()
    {
        bounds.setLocation(INITIAL_X, INITIAL_Y);
    }
    
    public void keyPressed(KeyEvent e)
    {
        int key = e.getKeyCode();
        
        switch(key)
        {
            case KeyEvent.VK_LEFT:
                dx = -2;
                break;
                
            case KeyEvent.VK_RIGHT:
                dx = 2;
                break;
        }
    }
    
    public void keyReleased(KeyEvent e)
    {
        int key = e.getKeyCode();
        
        switch(key)
        {
            case KeyEvent.VK_LEFT:
                dx = 0;
                break;
                
            case KeyEvent.VK_RIGHT:
                dx = 0;
                break;
                
            default:
                dx = 0;
                break;
        }
    }
}