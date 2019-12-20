import java.awt.*;
import java.io.IOException;

abstract class Bird {

    protected int x;
    protected int y;
    protected int size = 50;
    protected Color color = Color.black;

    public Bird() {
        System.out.println("I'm a bird");
    }

    public abstract void fly() throws IOException;


    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x, y, size, size);
    }
    public static void sing(){};
}