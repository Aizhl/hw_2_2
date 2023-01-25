import java.awt.*;

public class Iphone extends Phone {
   private String color;
   private int level;

    public Iphone(String color, int level) {
       this.color=color;
       this.level=level;
    }

    @Override
    public void print() {
        System.out.println("color: "+color+"\n"+"level: "+level);
    }
}
