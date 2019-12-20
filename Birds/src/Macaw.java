import java.awt.*;
import javax.imageio.ImageIO;
import java.io.File;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Macaw extends Bird {
    private static String name ;
    private static int num = 0;
    public static int maxX = 0;
    public static int maxY = 0;
    public static int minX = Window.width+100;
    public static int minY = Window.height+100;
    public Macaw(String str,int x,int y ) throws IOException {
        this.name = str;
        System.out.println("My name is " + this.name + "!");
        num++;
        System.out.println("My number " + num);
        size = 60;
        color = Color.green;
        this.fly();
        this.x=x;
        this.y=y;



    }



    void speak(String name){
        this.name = name;
        System.out.println("My name is " + this.name + "!");
    }



    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public void handshake(Macaw brd){
        System.out.println("Hello,my name " + name + ". You " + brd.getName() + ", am i right?");
    }
    public void fly() throws IOException {

        System.out.println("I'm flying. And my name is" + this.name + "remember that");
    }
    public static void sing(){
        Sound mac = new Sound(new File("Sounds/Macaw.wav"));
        mac.play();
    }
}
