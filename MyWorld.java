import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    HealthBar healthbar = new HealthBar();
    Counter counter = new Counter();
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 800, 1); 
        prepare();
    }
    public Counter getCounter()
    {
        return counter;
    }
    public HealthBar getHealthBar()
    {
        return healthbar;
    }
    public void act()
    {
        addfirstEnemy();
        addsecondEnemy();
    }
    public void addfirstEnemy()
    {
        if (Greenfoot.getRandomNumber (120)<1)
        {
            addObject(new firstEnemy(), Greenfoot.getRandomNumber(600), 0);
        }
    }
    public void addsecondEnemy()
    {
        if (Greenfoot.getRandomNumber (120)<1)
        {
            addObject(new secondEnemy(), Greenfoot.getRandomNumber(600), 0);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        addObject(counter, 100, 50);
        addObject(healthbar, 250, 50);
        Player player = new Player();
        addObject(player,252,510);
        player.setLocation(293,705);
        player.setLocation(287,698);
    }
}
