import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Hero extends Actor
{
    private static GreenfootImage myImage;
    
    public Hero()
    {
        myImage = new GreenfootImage("ppl1.png");
        setImage(myImage);
    }
    
    boolean atTop = true;
    public void act()
    {
        if(Greenfoot.mouseClicked(null) || "space".equals(Greenfoot.getKey())){
            atTop = !atTop;
        }
        if(atTop){
            setLocation(100, 100);
        }
        else{
            setLocation(100, 300);
        }
    }
}
