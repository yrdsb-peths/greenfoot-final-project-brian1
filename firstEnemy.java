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
        hitByBullet();
    }
    public void hitByBullet()
    {
        Actor bullet = getOneIntersectingObject(Bullet.class);
        if (bullet != null)
        {
            getWorld().removeObject(bullet);
            World world = getWorld();
            MyWorld myWorld = (MyWorld)world;
            Counter counter = myWorld.getCounter();
            counter.addScore();
            getWorld().removeObject(this);
        }
        else if (getY()==799)
        {
            World world = getWorld();
            MyWorld myWorld = (MyWorld)world;
            HealthBar healthbar = myWorld.getHealthBar();
            healthbar.loseHealth();
            getWorld().removeObject(this);
        }
    }
    public void moveOPP()
    {
        setLocation(getX(),getY()+3);
    }
}
