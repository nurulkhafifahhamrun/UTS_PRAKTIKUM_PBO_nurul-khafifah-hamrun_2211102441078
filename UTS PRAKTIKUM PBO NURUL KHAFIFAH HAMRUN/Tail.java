import greenfoot.*;
public class Tail extends Actor
{
    private int length;
    private Tail nextNode;
    public void act() 
    {
        if(0==length--&&Head.getAlive())getWorld().removeObject(this);
    }
    public Tail(int pLength, int rotation, Tail next)
    {
        length = pLength;
        setRotation(rotation);
        nextNode = next;
    }
    public void increase()
    {
        length += Head.getScale();
        if(nextNode!=null)nextNode.increase();
    }
}
