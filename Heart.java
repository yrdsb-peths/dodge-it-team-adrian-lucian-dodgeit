import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Heart extends Actor
{
    private static GreenfootImage myImage;
    public static int lifeCount = 0;
    
    public Heart()
    {
        myImage = new GreenfootImage("herz.png");
        setImage(myImage);
        
        lifeCount++;
    }
    
    public void act()
    {
        // Add your action code here.
    }
}
