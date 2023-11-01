import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;

/**
 * Write a description of class Magic here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Magic extends Food
{
    Random r = new Random();
    public void act()
    {
        while(getOneIntersectingObject(Tail.class)!=null)setLocation(r.nextInt(MyWorld.getMyWidth()), r.nextInt(MyWorld.getMyHeight()));
    }
}