import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends Actor
{
    /**
     * Act - do whatever the Bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        bulletMove();
        explosion();
        removeFromWorld();
    }
    public void explosion()
    {
        if(isTouching(enemyShooters.class))
        {
            Greenfoot.playSound("Boom.wav");
        }
    }
    public void addScore()
    {
        
    }
    public void bulletMove()
    {
        setLocation(getX(),getY() -5);
    }
    public void removeFromWorld ()
    { 
        if (getY()==0)
        {
            getWorld().removeObject(this);
        }
    }
}
