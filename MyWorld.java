import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        Banana obstacle = new Banana();
        addObject(obstacle, 300, 200);
    }
}
