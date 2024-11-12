import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double milkDouble;
        char playAgain = 'Y';
        String liquid;
        while(playAgain == 'Y' || playAgain == 'y') {
        System.out.println("What exactly is on the wall? It should be a liquid, so it makes sense. Won't stop you, though.");
        liquid = scan.nextLine().toLowerCase();
        System.out.println("How many bottles of " + liquid + " are on the wall?");
        milkDouble = scan.nextDouble();
        int milk = (int)milkDouble;
        
        while (milk <= 0) {
            System.out.println("There must be atleast one bottle of" + liquid + "on the wall.");
            System.out.println("How many bottles of " + liquid + " are on the wall?");
            milkDouble = scan.nextDouble();
            milk = (int)milkDouble;
        }
        while (milk > 2) {
            System.out.print(milk + " bottles of " + liquid + " on the wall, " + milk + " bottles of " + liquid + ". ");
            milk = milk - 1;
            System.out.println("You take one down, pass it around, " + milk + " bottles of " + liquid + " on the wall.");
        }
        if (milk == 2) {
            System.out.println("2 bottles of " + liquid + " on the wall, 2 bottles of " + liquid + ". You take one down, pass it around, one bottle of " + liquid + "on the wall.");
            milk = milk - 1;
        }
        if (milk == 1) {
            System.out.println("One bottle of " + liquid + "on the wall, one bottle of " + liquid + ". You take it down, pass it around, no more bottles of " + liquid + " on the wall.");
        }
        System.out.println("No more bottles of " + liquid + " on the wall, no more bottles of " + liquid + ". You took them around, passed them around, no more bottles of " + liquid + " on the wall.");
        System.out.println("Do you want to play again? (Y/N)");
        scan.nextLine();
        playAgain = scan.nextLine().charAt(0);
        while (playAgain != 'Y' && playAgain != 'y' && playAgain != 'N' && playAgain != 'n') {
            System.out.println("That is not a valid choice.");
            System.out.println("Do you want to play again? (Y/N)");
            playAgain = scan.nextLine().charAt(0);
        }
    }
        System.out.println("Thanks for playing.");
        scan.close();
        System.exit(0);
    
    }
}