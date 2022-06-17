import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class secondEnemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class secondEnemy extends enemyShooters
{
    int timesHit = 2;
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
            timesHit--;
        }
        if (timesHit == 0)
        {
            getWorld().removeObject(this);
        }
        else if (getY()==799)
        {
            World world = getWorld();
            MyWorld myWorld = (MyWorld)world;
            HealthBar healthbar = myWorld.getHealthBar();
            healthbar.loseHealth();
            healthbar.loseHealth();
            getWorld().removeObject(this);
        }
        }
            public void moveOPP2()
    {
        setLocation(getX(),getY()+4);
    }
}

