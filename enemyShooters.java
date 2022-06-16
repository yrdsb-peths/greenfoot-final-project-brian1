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
        // Add your action code here.
    }
    public void removeenemyShooters()
    {
        if (getY()==799)
        {
            getWorld().removeObject(this);
        }
    }
    
}
