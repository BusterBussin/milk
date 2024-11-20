
import java.util.Scanner;

public class Checks {
    AnsiColors color = new AnsiColors();
    int option;
    public void isBossDead(int bossHP, Scanner scan) {
        if (bossHP <= 0) {
            System.out.println("AGH! NO! WHAT THE...");
            scan.nextLine();
            System.out.println("THIS CAN'T BE!");
            scan.nextLine();
            System.out.println("WHAT DID... WHAT DID YOU DO?!");
            scan.nextLine();
            System.out.println(color.yellow() + "\t1) 'You just got... got.'" + color.reset());
            System.out.println(color.yellow() + "\t2) 'Oops.'" + color.reset());
            System.out.println(color.yellow() + "\t3) (Do a fortnite dance on his decaying body)" + color.reset());
            option = scan.nextInt();
            if (option == 1) {
                System.out.println(color.blue() + "(Hold for uproarous laughter.)" + color.reset());
                scan.nextLine();
                System.out.println(color.blue() + "(...)" + color.reset());
                scan.nextLine();
                System.out.println(color.blue() + "(But nobody laughed.)" + color.reset());
                scan.nextLine();
            } else if (option == 2) {
                System.out.println(color.blue() + "(The Milkman doesn't look very amused.)" + color.reset());
                scan.nextLine();
            } else {
                System.out.println(color.blue() + "(Because the Milkman is probably a middle-aged man in a midlife crisis, he doesn't understand.)" + color.reset());
                scan.nextLine();
            } if (option != 1 && option != 2 && option != 3) {
                System.out.println(color.blue() + "(You just... stared at the Milkman, not saying anything.)" + color.reset());
                scan.nextLine();
            }
            System.out.println("WHY... NO... HOW DID YOU DO THIS?!");
            scan.nextLine();
            System.out.println("I AM A " + color.red() + "GOD" + color.reset() + ", FOR HEAVEN'S SAKE!" );
            scan.nextLine();
            System.out.println("CURSE YOU, YOU WORTHLESS MORTAL! AND CURSE EVERYTHING YOU'RE LIVING FOR!");
            scan.nextLine();
            System.out.println("WORTHLESS... BAG... OF... FILTH...");
            scan.nextLine();
            System.out.println(color.blue() + "(...)" + color.reset());
            scan.nextLine();
            System.out.println(color.blue() + "(You begin to think this is too much for a man who's life revolves around milk.)" + color.reset());
            scan.nextLine();
            System.out.println(color.blue() + "(...)" + color.reset());
            scan.nextLine();
            System.out.println(color.blue() + "(You decide that maybe you should never drink milk again.)" + color.reset());
            scan.nextLine();
            System.out.println(color.yellow() + "YOU WON!" + color.reset());
            System.out.println(color.green() + "Got: True Ending" + color.reset());
            System.out.println(" ");
            System.out.println(color.blue() + "Program made by: BusterBussin" + color.reset());
            System.out.println(color.blue() + "AnsiColors code, bugfixing, and SKRIMP DETECTOR done by: AwesomeGearBoy" + color.reset());
            System.out.println(" ");
            System.out.println(color.red() + "Thank you for playing." + color.reset());
            System.exit(0);
        }
    }

    public void isPlayerDead(int playerHP) {
        if (playerHP <= 0) {
            System.out.println(color.red() + "GAME OVER." + color.reset());
            System.exit(0);
        }
    }
}
