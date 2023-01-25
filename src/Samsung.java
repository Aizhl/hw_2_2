import java.awt.*;

public class Samsung extends Phone {
   private String display;
   private int size;

    public Samsung(String display,int size) {
      this.display=display;
      this.size=size;

    }

    @Override
    public void print() {
     System.out.println("display: "+display+"\n"+"size: "+size);
    }
}
