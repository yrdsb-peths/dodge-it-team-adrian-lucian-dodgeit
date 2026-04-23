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
            if(Heart.lifeCount == 0)
            {
                World world = getWorld();
                Sadface sadFace = new Sadface();
                world.addObject(sadFace, 300, 200);
                
                Actor hero = getOneIntersectingObject(Hero.class);
                world.removeObject(hero);
                world.removeObject(this);
                Greenfoot.stop();
            }
            else if(Heart.lifeCount == 3)
            {
                resetBanana();
                World world = getWorld();
                Heart.lifeCount --;
                int x = 300 - getX();
                int y = 370 - getY();
                world.removeObject(getOneObjectAtOffset(x,y,Heart.class));
            }
            else if(Heart.lifeCount == 2)
            {
                resetBanana();
                World world = getWorld();
                Heart.lifeCount --;
                int x = 200 - getX();
                int y = 370 - getY();
                world.removeObject(getOneObjectAtOffset(x,y,Heart.class));
            }
            else 
            {
                resetBanana();
                World world = getWorld();
                Heart.lifeCount --;
                int x = 100 - getX();
                int y = 370 - getY();
                world.removeObject(getOneObjectAtOffset(x,y,Heart.class));
            }

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
