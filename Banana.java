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
    
    boolean isNewRound = true;
    int speed;
    public void act()
    {
        if(isNewRound)
        {
            speed = (Greenfoot.getRandomNumber(11) + 8) * -1;
            isNewRound = false;
        }
        
        move(speed);
        
        if(getX() <= 0) {
            resetBanana();
        }
        if(isTouching(Hero.class)){
            if(Heart.lifeCount == 1)
            {
                World world = getWorld();
                Sadface sadFace = new Sadface();
                world.addObject(sadFace, 300, 200);
                
                Actor hero = getOneIntersectingObject(Hero.class);
                world.removeObject(hero);
                
                Heart.lifeCount --;
                int x = 100 - getX();
                int y = 370 - getY();
                world.removeObject(getOneObjectAtOffset(x,y,Heart.class));
                
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
            else
            {
                resetBanana();
                World world = getWorld();
                Heart.lifeCount --;
                int x = 200 - getX();
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
        isNewRound = true;
    }
}
