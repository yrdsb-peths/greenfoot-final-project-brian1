import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
 int enemyShootersCount = 0;
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
    public void act()
    {
    enemyShootersCount++;
        if(enemyShootersCount>59)
    {
        addfirstEnemy();
        addsecondEnemy();
        enemyShootersCount = 0;
    }
    }
    public void addfirstEnemy()
    {
        addObject(new firstEnemy(), Greenfoot.getRandomNumber(600), 0);
    }
    public void addsecondEnemy()
    {
        addObject(new secondEnemy(), Greenfoot.getRandomNumber(600), 0);
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Player player = new Player();
        addObject(player,284,760);
        player.setLocation(300,759);
        firstEnemy firstEnemy = new firstEnemy();
        addObject(firstEnemy,273,50);
        player.setLocation(297,678);
        firstEnemy.setLocation(278,51);
        firstEnemy.setLocation(293,37);
        secondEnemy secondEnemy = new secondEnemy();
        addObject(secondEnemy,166,102);
    }
}
