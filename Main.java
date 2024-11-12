import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double milkDouble;
        System.out.println("How many bottles of milk are on the wall?");
        milkDouble = scan.nextDouble();
        int milk = (int)milkDouble;
        while (milk <= 0) {
            System.out.println("There must be atleast one bottle of milk on the wall.");
            System.out.println("How many bottles of milk are on the wall?");
            milkDouble = scan.nextDouble();
            milk = (int)milkDouble;
        }
        while (milk > 2) {
            System.out.print(milk + " bottles of milk on the wall, " + milk + " bottles of milk. ");
            milk = milk - 1;
            System.out.println("You take one down, pass it around, " + milk + " bottles of milk on the wall.");
        }
        if (milk == 2) {
            System.out.println("2 bottles of milk on the wall, 2 bottles of milk. You take one down, pass it around, one bottle of milk on the wall.");
            milk = milk - 1;
        }
        if (milk == 1) {
            System.out.println("One bottle of milk on the wall, one bottle of milk. You take it down, pass it around, no more bottles of milk on the wall.");
        }
        System.out.println("No more bottles of milk on the wall, no more bottles of milk. You took them around, passed them around, no more bottles of milk on the wall.");
        System.out.println("Thanks for playing.");
        scan.close();
        System.exit(0);
    
    }
}