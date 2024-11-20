
import java.util.Scanner;

public class Checks {
    int option;
    public void isBossDead(int bossHP, Scanner scan) {
        if (bossHP <= 0) {
            System.out.println("AGH! NO! WHAT THE...");
            scan.nextLine();
            System.out.println("THIS CAN'T BE!");
            scan.nextLine();
            System.out.println("WHAT DID... WHAT DID YOU DO?!");
            scan.nextLine();
            System.out.println(AnsiColors.yellow() + "\t1) 'You just got... got.'" + AnsiColors.reset());
            System.out.println(AnsiColors.yellow() + "\t2) 'Oops.'" + AnsiColors.reset());
            System.out.println(AnsiColors.yellow() + "\t3) (Do a fortnite dance on his decaying body)" + AnsiColors.reset());
            option = scan.nextInt();
            if (option == 1) {
                System.out.println(AnsiColors.blue() + "(Hold for uproarous laughter.)" + AnsiColors.reset());
                scan.nextLine();
                System.out.println(AnsiColors.blue() + "(...)" + AnsiColors.reset());
                scan.nextLine();
                System.out.println(AnsiColors.blue() + "(But nobody laughed.)" + AnsiColors.reset());
                scan.nextLine();
            } else if (option == 2) {
                System.out.println(AnsiColors.blue() + "(The Milkman doesn't look very amused.)" + AnsiColors.reset());
                scan.nextLine();
            } else {
                System.out.println(AnsiColors.blue() + "(Because the Milkman is probably a middle-aged man in a midlife crisis, he doesn't understand.)" + AnsiColors.reset());
                scan.nextLine();
            } if (option != 1 && option != 2 && option != 3) {
                System.out.println(AnsiColors.blue() + "(You just... stared at the Milkman, not saying anything.)" + AnsiColors.reset());
                scan.nextLine();
            }
            System.out.println("WHY... NO... HOW DID YOU DO THIS?!");
            scan.nextLine();
            System.out.println("I AM A " + AnsiColors.red() + "GOD" + AnsiColors.reset() + ", FOR HEAVEN'S SAKE!" );
            scan.nextLine();
            System.out.println("CURSE YOU, YOU WORTHLESS MORTAL! AND CURSE EVERYTHING YOU'RE LIVING FOR!");
            scan.nextLine();
            System.out.println("WORTHLESS... BAG... OF... FILTH...");
            scan.nextLine();
            System.out.println(AnsiColors.blue() + "(...)" + AnsiColors.reset());
            scan.nextLine();
            System.out.println(AnsiColors.blue() + "(You begin to think this is too much for a man who's life revolves around milk.)" + AnsiColors.reset());
            scan.nextLine();
            System.out.println(AnsiColors.blue() + "(...)" + AnsiColors.reset());
            scan.nextLine();
            System.out.println(AnsiColors.blue() + "(You decide that maybe you should never drink milk again.)" + AnsiColors.reset());
            scan.nextLine();
            System.out.println(AnsiColors.yellow() + "YOU WON!" + AnsiColors.reset());
            System.out.println(AnsiColors.green() + "Got: True Ending" + AnsiColors.reset());
            System.out.println(" ");
            System.out.println(AnsiColors.blue() + "Program made by: BusterBussin" + AnsiColors.reset());
            System.out.println(AnsiColors.blue() + "AnsiColors code, bugfixing, and SKRIMP DETECTOR done by: AwesomeGearBoy" + AnsiColors.reset());
            System.out.println(" ");
            System.out.println(AnsiColors.red() + "Thank you for playing." + AnsiColors.reset());
            System.exit(0);
        }
    }

    public void isPlayerDead(int playerHP) {
        if (playerHP <= 0) {
            System.out.println(AnsiColors.red() + "GAME OVER." + AnsiColors.reset());
            System.exit(0);
        }
    }
}
