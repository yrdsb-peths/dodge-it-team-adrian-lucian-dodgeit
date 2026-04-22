import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Banana extends Actor
{
    /**
     * Act - do whatever the Banana wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private static GreenfootImage myImage;
    
    public Banana()
    {
        myImage = new GreenfootImage("bananas.png");
        setImage(myImage);
    }
    
    
    public void act()
    {
        move(-8);
        
        if(getX() <= 0) {
            resetBanana();
        }
        if(isTouching(Hero.class)){
            World world = getWorld();
            Sadface sadFace = new Sadface();
            world.addObject(sadFace, 300, 200);
            
            Actor hero = getOneIntersectingObject(Hero.class);
            world.removeObject(hero);
            world.removeObject(this);
            Greenfoot.stop();
        }
    }
    
    public void resetBanana() {
        int num = Greenfoot.getRandomNumber(2);
        if(num == 0) {
            setLocation(600, 100);
        } else {
            setLocation(600, 300);
        }
    }
}
