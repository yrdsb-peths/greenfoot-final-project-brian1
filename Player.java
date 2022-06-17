import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    boolean canFire = true;
    boolean touchingenemyShooters = false;
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Player()
    {
        setRotation(270);
    }
    public void act()
    {
       moveControl();
       fireBullet();
    }
    public void hitShooter()
    {
        Actor enemyShooters = getOneIntersectingObject(enemyShooters.class);
        if(enemyShooters != null)
        {
            World myWorld = getWorld();
            MyWorld myworld = (MyWorld)myWorld;
            HealthBar healthbar = myworld.getHealthBar();
            if(touchingenemyShooters == false)
            {
                healthbar.loseHealth();
                touchingenemyShooters = true;
            }
        }
    }
    public void moveControl()
    {
        if(Greenfoot.isKeyDown("right"))
        {
            setLocation(getX()+7,getY());
        }
        if(Greenfoot.isKeyDown("left"))
        {
            setLocation(getX()-7,getY());
        }
    }
    public void fireBullet()
    {
        if (Greenfoot.isKeyDown("space") && canFire== true)
        {
            getWorld().addObject(new Bullet(),getX(), getY()-30);
            canFire = false;
            Greenfoot.playSound("Pew.wav");
        }
        else if (!Greenfoot.isKeyDown("space"))
        {
            canFire = true;
        
        }
    }
}
