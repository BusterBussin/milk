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
    boolean gotQuest = false;
    boolean gotRiddle = false;
    boolean gotYou = false;
    boolean aggro = false;
    boolean family = false;
    boolean looks = false;
    int number = 0;

    public void pass() {
        for (int lines = 0; lines <= 100; lines++) {
            System.out.println(color.red() + "----------------------------------------------------------------------------------------------" + color.reset()); }
            System.out.println(color.yellow() + "VERIFYING PASSCODE: " + color.green() + "0958" + color.reset());
            System.out.println(color.red() + "ACCESS GRANTED." + color.reset());
            System.out.println("Welcome to the password dungeon. Oh?");
            System.out.println("(Press enter to continue.)");
            funScan.nextLine();
            System.out.println("Who are you?" + color.red() + " You're not supposed to be here." + color.reset());
            funScan.nextLine();
            System.out.println("Oh well. It's not like you're going to break anything");
            funScan.nextLine();
            System.out.println(".");
            funScan.nextLine();
            System.out.println(".");
            funScan.nextLine();
            System.out.println(".");
            funScan.nextLine();
            System.out.println("Right? (Y/N)");
            option = funScan.nextLine().toUpperCase().charAt(0);
            if (option == 'Y') {
                System.out.println("Great! Let's continue.");
                funScan.nextLine();
            } else if (option == 'N') {
                System.out.println("Oh. That's too bad.");
                funScan.nextLine();
                System.out.println(color.red() + "*You hear beeping on your neck. Wait... WHAT THE-*" + color.reset());
                funScan.nextLine();
                web = "https://www.youtube.com/watch?v=tHYJWn2jLaM";
                funEvent.webpage(web);
                System.exit(0);
            } else if (option != 'Y' || option != 'N') {
                System.out.println("Well... Stay silent. See where that gets you.");
                funScan.nextLine();
                System.out.println(color.red() + "*You hear beeping on your neck. Wait... WHAT THE-*" + color.reset());
                funScan.nextLine();
                web = "https://www.youtube.com/watch?v=tHYJWn2jLaM";
                funEvent.webpage(web);
                System.exit(0);
            }
            System.out.println("Well. It's simple. You give me a word or something, and maybe it aligns with something in my book.");
            funScan.nextLine();
            System.out.println("However, some of these passcodes are LETHAL.");
            funScan.nextLine();
            System.out.println(color.blackBackground() + color.red() + "Don't die :)" + color.reset());
            funScan.nextLine();
            System.out.println("Enter a passcode when I ask for one. All caps would be nice, but be lazy if you will.");
            funScan.nextLine();
            System.out.println(color.red() + "stupid... lousy... programmers..." + color.reset());
            funScan.nextLine();
            System.out.println("(Remember, you press enter to continue. This is your last reminder.)");
            funScan.nextLine();
            while (!passcode.equals("MILKMAN")) {
                if (aggro) {
                    System.out.println("Password. Now.");
                } else {
                System.out.println("Go ahead. Password, please.");
                }
                passcode = funScan.nextLine().toUpperCase();
                // Everything here is nonlethal. Do not close program.
                if (passcode.equals("YOU")) {
                    if (!gotYou) { 
                        
                    System.out.println("Who am I?");
                    funScan.nextLine();
                    System.out.println("I... don't know.");
                    funScan.nextLine();
                    System.out.println("I forgot a long time ago.");
                    funScan.nextLine();
                    System.out.println("Well... who are you?");
                    passcode = funScan.nextLine().toUpperCase();
                    if (passcode.equals("KRUSKIE") || passcode.equals("JUSTIN")) {
                        System.out.println(passcode + "? That... sounds like a nerds name.");
                    } else if (passcode.equals("DREW") || passcode.equals("ANDREW")) {
                        System.out.println(passcode + "? You're probably a star war's fan, then.");
                    }
                    if (!aggro) {
                    System.out.println(passcode + ", huh... That's a nice name. I won't remember it. I never do.");
                    funScan.nextLine();
                    System.out.println("I hope you live a good life.");
                    funScan.nextLine();
                    System.out.println("Because I can't...");
                    funScan.nextLine();
                    System.out.println("Well, it's nice meeting you... uh... buddy.");
                    funScan.nextLine();
                    } else {
                        System.out.println(passcode + ", eh?");
                        funScan.nextLine();
                        System.out.println("Yeah. Perfect name for a " + color.red() + " dumb idiot " + color.reset() + "like you.");

                    }
                    gotYou = true;
                } else if (gotYou) {
                    if (!aggro) {
                    System.out.println("I already told you who I am.");
                    funScan.nextLine();
                    } else {
                        System.out.println("Forgot already?");
                        funScan.nextLine();
                        System.out.println("You're demented... I swear...");
                        funScan.nextLine();
                    }
                }
                } else if (passcode.equals("EXIT")) {
                    gotQuest = true;
                    System.out.println("Exit? Uh... heck... Ionno...");
                    funScan.nextLine();
                    System.out.println("I got a sticky note. That's all.");
                    funScan.nextLine();
                    System.out.println(color.green() + "You got a note that says 'QUEST'." + color.reset());
                    funScan.nextLine();
                    if (aggro) {
                        System.out.println("Please leave. God.");
                        funScan.nextLine();
                    }
                } else if (passcode.equals("QUEST")) {
                    if (gotQuest) {
                    System.out.println("Quest... Right. My " + color.yellow() + "master" + color.reset() + " said that there may be someone that will help.");
                    funScan.nextLine();
                    System.out.println("Well... Here you are.");
                    funScan.nextLine();
                    System.out.println("I come by every night, and I drop off a sweet delight.\n In the box that stores the liquid, is the man that did it.\n Who am I?");
                    funScan.nextLine();
                    System.out.println("...");
                    funScan.nextLine();
                    System.out.println("Oh, it's stupid. Forget it.");
                    funScan.nextLine();
                    gotRiddle = true;
                    } else if (!gotQuest) {
                        System.out.println("Quest? Like Dragon Quest?");
                        funScan.nextLine();
                    }
                } else if (passcode.equals("MILKMAN")) {
                    if (gotRiddle) {
                        if (!aggro) {
                    System.out.println("Wait... RIGHT!");
                    funScan.nextLine();
                    System.out.println("I'M THE MILKMAN!");
                    funScan.nextLine();
                    System.out.println("THANK YOU SO MUCH. I CAN DELIVER THE MILK TO THE PEOPLE AROUND THE WORLD.");
                    funScan.nextLine();
                    System.out.println("You Won!");
                    System.exit(0);
                        } else {
                            System.out.println("...");
                            funScan.nextLine();
                            System.out.println("Right... I'm the... milkman.");
                            funScan.nextLine();
                            System.out.println("But why do you even care?");
                            funScan.nextLine();
                            System.out.println("What are you? Just... a smart(###)? or a worthless bag of filth?");
                            funScan.nextLine();
                            System.out.println("Well...");
                            funScan.nextLine();
                            System.out.println("Now that I know who I am, I'll leave.");
                            funScan.nextLine();
                            System.out.println("You can leave too, but no thanks to me.");
                            funScan.nextLine();
                            System.out.println("You won.");
                            System.exit(0);
                        }
                    } else if (!gotRiddle) {
                        System.out.println("Wh... What?");
                        funScan.nextLine();
                    }
                } else if (passcode.equals("LOOKS")) {
                    if (!looks) {
                        
                    System.out.println("What do I... look like?");
                    funScan.nextLine();
                    System.out.println("I'm not entirely sure, to be honest.");
                    funScan.nextLine();
                    System.out.println("I'm just a character in the terminal.");
                    funScan.nextLine();
                    System.out.println("I probably look ugly.");
                    funScan.nextLine();
                    System.out.println(color.yellow() + "\t 1) 'You probably look very beautiful. Or... handsome.'");
                    System.out.println("\t 2) 'Yeah... Who knows.'");
                    System.out.println("\t 3) 'You probably look like dog poo.'" + color.reset());
                    number = funScan.nextInt();
                    looks = true;
                    if (number == 1) {
                        if (aggro) {
                            aggro = false;
                            System.out.println("What?");
                            funScan.nextLine();
                            System.out.println("Huh... And to think earlier you called my mother something terrible...");
                            funScan.nextLine();
                            System.out.println("Uh... Well... Thank you.");
                            funScan.nextLine();
                            System.out.println(color.blue() + "(The strange person's opinion on you changed!)" + color.reset());
                            funScan.nextLine();

                        } else {
                            System.out.println("...");
                            funScan.nextLine();
                            System.out.println(color.blue() + "(The mysterious person seems to be embarrased. However, the programmer was too lazy to add a romance route. We apologize for any inconvenience.)" + color.reset());
                            funScan.nextLine();
                        }
                    } else if (number == 2) {
                        System.out.println("Yeah. It is.");
                        funScan.nextLine();
                    } else {
                        if (aggro) {
                            System.out.println("Okay. That's... That's it!");
                            funScan.nextLine();
                            System.out.println("COME HERE YOU STUPID (smartypants) MOTHER(love)ING (precious) (creation of god)");
                            funScan.nextLine();
                        } else {
                            System.out.println("Oh... You're...");
                            funScan.nextLine();
                            System.out.println("Jesus- you're actually kinda rude.");
                            funScan.nextLine();
                            System.out.println(color.red() + "(The strange person's opinion on you changed!)" + color.reset());
                            funScan.nextLine();
                            aggro = true;
                        }
                    }
                } else {
                    System.out.println(color.blue() + "(You already asked him about his looks. Maybe don't bring it up again.)" + color.reset());
                }
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
                } else if (passcode.equals("LEBANON GAMES")){
                    funEvent.webpage("https://www.youtube.com/watch?v=NhHb9usKy6Q");
                    System.out.println("Goated.");
                    funScan.nextLine();
                    System.exit(0);
                } else if (passcode.equals("PASSWORD")) {
                    funEvent.webpage("https://letmegooglethat.com/?q=how+to+stop+being+stupid");
                    System.out.println("Here, let me google that for you.");
                    System.exit(0);
                } else if (passcode.equals("SKRIMP")) {
                    funEvent.webpage("https://awesomegearboy.github.io/skrimp-detector/index.html");
                    System.out.println("So... what did you press? Yes? or no?");
                    passcode = funScan.nextLine().toUpperCase();
                    if (passcode.equals("YES")) {
                        System.out.println("Ew.");
                        funScan.nextLine();
                        dead();
                    } else if (passcode.equals("NO")) {
                        System.out.println("Good, good...");
                        funScan.nextLine();
                    } else {
                        System.out.println("That's not an answer. Might as well...");
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