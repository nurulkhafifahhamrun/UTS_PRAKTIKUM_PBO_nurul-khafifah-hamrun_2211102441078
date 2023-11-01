import greenfoot.*;
import java.util.Random;
public class MyWorld extends World
{
    private static final int width = 40;
    private static final int height = 25;
    public MyWorld()
    {    
        super(40, 25, 20, false);
        Greenfoot.setSpeed(38);
        int x =Greenfoot.getRandomNumber(getWidth());
        int y =Greenfoot.getRandomNumber(getHeight());
        addObject(new Magic(), x, y);
        
        prepare();
        setPaintOrder(Counter.class, Head.class, Tail.class, Food.class, Magic.class);
    }
    
    public void addMagic()
    {
        int x =Greenfoot.getRandomNumber(getWidth());
        int y =Greenfoot.getRandomNumber(getWidth());
        addObject(new Magic(),x,y);
    }

    public static int getMyWidth()
    {
        return width;
    }

    public static int getMyHeight()
    {
        return height;
    }

    Random r = new Random();
    private void prepare()
    {
        Head head = new Head();
        addObject(head,getMyHeight()/2,getMyHeight()/2);
        addObject(new Food(), r.nextInt(getMyHeight()), r.nextInt(getMyHeight()));
    }
}