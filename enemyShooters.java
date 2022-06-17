import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class enemyShooters here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class enemyShooters extends Actor
{
    /**
     * Act - do whatever the enemyShooters wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        removeenemyShooters();
    }
    public void moveEnemy()
    {
        setLocation(getX(),getY()+3);
    }
    public void removeenemyShooters()
    {
        if (getY()==799)
        {
            getWorld().removeObject(this);
            
        }
    }
    
}
