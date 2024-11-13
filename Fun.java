import java.util.Scanner;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Fun {
    Scanner funScan = new Scanner(System.in);
    Events funEvent = new Events();
    AnsiColors color = new AnsiColors();
    String passcode = " "; 
    char option = ' ';
    String web = " ";

    public void pass() {
        for (int lines = 0; lines <= 100; lines++) {
            System.out.println(color.red() + "----------------------------------------------------------------------------------------------" + color.reset());
            System.out.println(color.yellow() + "VERIFYING PASSCODE: " + color.green() + "0958" + color.reset());
            System.out.println(color.red() + "ACCESS GRANTED." + color.reset());
            System.out.println("Welcome to the password dungeon. Oh?");
            System.out.println("(Press enter to continue.)");
            funScan.nextLine();
            System.out.println("Who are you?" + color.red() + " You're not supposed to be here." + color.reset());
            funScan.nextLine();
            System.out.println("Oh well. It's not like you're going to break anything");
            System.out.println(".");
            System.out.println(".");
            System.out.println(".");
            System.out.println("Right? (Y/N)");
            option = funScan.nextLine().toUpperCase().charAt(0);
            if (option == 'Y') {
                System.out.println("Great! Let's continue.");
            } else if (option == 'N') {
                System.out.println("Oh. That's too bad.");
                System.out.println(color.red() + "*You hear beeping on your neck. Wait... WHAT THE-*" + color.reset());
                web = "https://www.youtube.com/watch?v=tHYJWn2jLaM";
                funEvent.webpage(web);
                System.exit(0);
            } else if (option != 'Y' || option != 'N') {
                System.out.println("Well... Stay silent. See where that gets you.");
                System.out.println(color.red() + "*You hear beeping on your neck. Wait... WHAT THE-*" + color.reset());
                web = "https://www.youtube.com/watch?v=tHYJWn2jLaM";
                funEvent.webpage(web);
                System.exit(0);
            }
            System.out.println("Well. It's simple. You give me a word or something, and maybe it aligns with something in my book.");
            System.out.println("However, some of these passcodes are LETHAL.");
            System.out.println(color.blackBackground() + color.red() + "Don't die :)" + color.reset());
            System.out.println("Enter a passcode. All caps would be nice, but be lazy if you will.");
            System.out.println(color.red() + "stupid... lousy... programmers..." + color.reset());
            System.out.println("(Remember, you press enter to continue. This is your last reminder.)");
            funScan.nextLine();
            while (!passcode.equals("MILKMAN")) {
                System.out.println("Go ahead. Password, please.");
                passcode = funScan.nextLine().toUpperCase();
                // Everything here is nonlethal. Do not close program.
                if (passcode.equals("YOU")) {
                    System.out.println("Who am I?");
                    funScan.nextLine();
                    System.out.println("I... don't know.");
                    funScan.nextLine();
                    System.out.println("I forgot a long time ago.");
                    System.out.println("Well... who are you?");
                    passcode = funScan.nextLine();
                    System.out.println(passcode + ", huh... That's a nice name. I won't remember it. I never do.");
                    funScan.nextLine();
                    System.out.println("I hope you live a good life.");
                    System.out.println("Because I cant");
                    System.out.println("Well, it's nice meeting you... uh... buddy.");
                } else if (passcode.equals("EXIT")) {
                    System.out.println("Exit? Uh... heck... Ionno...");
                    System.out.println("I got a sticky note. That's all.");
                    System.out.println(color.green() + "You got a note that says 'QUEST'." + color.reset());
                } else if (passcode.equals("QUEST")) {
                    System.out.println("Quest... Right. My " + color.yellow() + "master" + color.reset() + " said that there may be someone that will help.");
                    System.out.println("Well... Here you are.");
                    System.out.println("I come by every night, and I drop off a sweet delight.\n In the box that stores the liquid, is the man that did it.\n Who am I?");
                    System.out.println("...");
                    System.out.println("Oh, it's stupid. Forget it.");
                } else if (passcode.equals("MILKMAN")) {
                    System.out.println("Wait... RIGHT!");
                    System.out.println("I'M THE MILKMAN!");
                    System.out.println("THANK YOU SO MUCH. I CAN DELIVER THE MILK TO THE PEOPLE AROUND THE WORLD.");
                    System.out.println("You Won!");
                    System.exit(0);
                }
                // Everything below here should be lethal. Close program after death.
                else if (passcode.equals("SYMPHONY")) {
                    funEvent.webpage("https://youtube.com/shorts/hnvsxJdXDfk?si=O1EA9zupDFgmxHh6");
                    System.out.println("Press enter to continue.");
                    funScan.nextLine();
                    dead();
                } else if (passcode.equals("GARBAGE")){
                    funEvent.webpage("https://www.youtube.com/watch?v=At8v_Yc044Y");
                    System.out.println("Yikes. That's terrible.\n Press enter.");
                    funScan.nextLine();
                    dead();
                }
            }
        }
    }
    public void dead() {
        if (Desktop.isDesktopSupported()) {
      
            //making a desktop object
            Desktop desktop = Desktop.getDesktop();
            try {
               URI uri = new URI("https://youtu.be/-ZGlaAxB7nI");
               desktop.browse(uri);
            } catch (IOException excp) {
               excp.printStackTrace();
            } catch (URISyntaxException excp) {
               excp.printStackTrace();
            }
            System.exit(0);
    }
}
}