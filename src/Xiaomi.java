import java.awt.*;

public class Xiaomi extends Phone {
  private String material;
  private int memory;

    public Xiaomi(String material,int memory) {
         this.material=material;
         this.memory=memory;
    }

    @Override
    public void print() {
        System.out.println("material: "+material+"\n"+"memory: "+memory);
    }
}
