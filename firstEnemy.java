import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class firstEnemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class firstEnemy extends enemyShooters
{
    /**
     * Act - do whatever the firstEnemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public firstEnemy()
    {
        setRotation(90);
    }
    public void  act()
    {
        moveOPP();
    }
    public void moveOPP()
    {
        setLocation(getX(),getY()+3);
    }
}
