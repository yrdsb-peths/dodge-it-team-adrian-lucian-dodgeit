import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        Banana obstacle = new Banana();
        addObject(obstacle, 300, 200);
        
        Hero hero = new Hero();
        addObject(hero, 100, 100);
        
        Heart life1 = new Heart();
        addObject(life1, 100, 370);
        Heart life2 = new Heart();
        addObject(life2, 200, 370);
        Heart life3 = new Heart();
        addObject(life3, 300, 370);
    }
}
