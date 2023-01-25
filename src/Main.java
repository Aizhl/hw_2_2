import java.awt.*;

public class Main {
    public static void main(String[] args) {
       createObject("Iphone");
       createObject("Xiaomi");
       createObject("Samsung");
    }
    public static String createObject(String className) {
        switch (className) {
            case "Iphone":
                Iphone iphone = new Iphone("red", 3);
                System.out.println(iphone);
                iphone.print();
                break;
            case "Xiaomi":
                Xiaomi xiaomi = new Xiaomi("plastic", 128);
                System.out.println(xiaomi);
                xiaomi.print();
                break;
            case "Samsung":
                Samsung samsung = new Samsung("IPS", 6);
                System.out.println(samsung);
                samsung.print();
                break;
        }
     return className;
    }
}