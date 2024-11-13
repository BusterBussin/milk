import java.util.Scanner;

public class Events {

    Scanner eventScan = new Scanner(System.in);
    int randomMilk = (int)(Math.random() * 10001);

    public int milkRNG(int random, int milk, String name) {
        if (random == 1000000) {
            System.out.println("CURSE YOU. (+" + randomMilk + " " + name + ")");
            System.out.println("(Press enter to continue.)");
            eventScan.nextLine();
            return milk + randomMilk;            
        } else {
            return milk;
        }
    }
    
}
