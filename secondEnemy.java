import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class secondEnemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class secondEnemy extends enemyShooters
{
    /**
     * Act - do whatever the secondEnemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */    
    public secondEnemy()
    {
        setRotation(90);
    }
    public void  act()
    {
        moveOPP2();
        removeenemyShooters();
    }
    public void moveOPP2()
    {
        setLocation(getX(),getY()+4);
    }
}
