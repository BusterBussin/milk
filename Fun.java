import java.util.Scanner;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Fun {
    Events funEvent = new Events();
    String passcode = " "; 
    char option = ' ';
    String web = " ";
    boolean gotQuest = false;
    boolean gotRiddle = false;
    boolean gotYou = false;
    boolean aggro = false;
    boolean family = false;
    boolean looks = false;
    boolean met = false;
    Milk milk = new Milk();
    int number = 0;
    BossFight boss = new BossFight();
    boolean hasName = false;
    String name = " ";
    Staniel stan = new Staniel();
    BadEnd bad = new BadEnd();

    public void pass(Scanner funScan) {
        for (int lines = 0; lines <= 100; lines++) {
            System.out.println(AnsiColors.red() + "----------------------------------------------------------------------------------------------" + AnsiColors.reset()); }
            System.out.println(AnsiColors.yellow() + "VERIFYING PASSCODE: " + AnsiColors.green() + "0958" + AnsiColors.reset());
            System.out.println(AnsiColors.red() + "ACCESS GRANTED." + AnsiColors.reset());
            if (!met) {
            System.out.println("Welcome to the password dungeon. Oh?");
            System.out.println("(Press enter to continue.)");
            funScan.nextLine();
            System.out.println("Who are you?" + AnsiColors.red() + " You're not supposed to be here." + AnsiColors.reset());
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
                System.out.println(AnsiColors.red() + "*You hear beeping on your neck. Wait... WHAT THE-*" + AnsiColors.reset());
                funScan.nextLine();
                web = "https://www.youtube.com/watch?v=tHYJWn2jLaM";
                funEvent.webpage(web);
                System.exit(0);
            } else if (option != 'Y' || option != 'N') {
                System.out.println("Well... Stay silent. See where that gets you.");
                funScan.nextLine();
                System.out.println(AnsiColors.red() + "*You hear beeping on your neck. Wait... WHAT THE-*" + AnsiColors.reset());
                funScan.nextLine();
                web = "https://www.youtube.com/watch?v=tHYJWn2jLaM";
                funEvent.webpage(web);
                System.exit(0);
            }
            System.out.println("Well. It's simple. You give me a word or something, and maybe it aligns with something in my book.");
            funScan.nextLine();
            System.out.println("However, some of these passcodes are LETHAL.");
            funScan.nextLine();
            System.out.println(AnsiColors.blackBackground() + AnsiColors.red() + "Don't die :)" + AnsiColors.reset());
            funScan.nextLine();
            System.out.println("Enter a passcode when I ask for one. All caps would be nice, but be lazy if you will.");
            funScan.nextLine();
            System.out.println(AnsiColors.red() + "stupid... lousy... programmers..." + AnsiColors.reset());
            funScan.nextLine();
            System.out.println("(Remember, you press enter to continue. This is your last reminder.)");
            funScan.nextLine();
        } else if (met) {
            System.out.println("Welcome to the password dungeon");
            if (aggro) {
                System.out.println("Oh... you... yayyyyyy...");
            } else {
                System.out.println("Oh, hey. Welcome back.");
            }
        }
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
                    name = funScan.nextLine().toUpperCase();
                    hasName = true;
                    if (name.equals("KRUSKIE") || name.equals("JUSTIN")) {
                        System.out.println(name + "? That... sounds like a nerds name.");
                    } else if (name.equals("DREW") || name.equals("ANDREW")) {
                        System.out.println(name + "? You're probably a star war's fan, then.");
                    }
                    if (!aggro) {
                    System.out.println(name + ", huh... That's a nice name. I won't remember it. I never do.");
                    funScan.nextLine();
                    System.out.println("I hope you live a good life.");
                    funScan.nextLine();
                    System.out.println("Because I can't...");
                    funScan.nextLine();
                    System.out.println("Well, it's nice meeting you... uh... buddy.");
                    funScan.nextLine();
                    } else {
                        System.out.println(name + ", eh?");
                        funScan.nextLine();
                        System.out.println("Yeah. Perfect name for a" + AnsiColors.red() + " dumb idiot " + AnsiColors.reset() + "like you.");

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
                    System.out.println(AnsiColors.green() + "You got a note that says 'QUEST'." + AnsiColors.reset());
                    funScan.nextLine();
                    if (aggro) {
                        System.out.println("Please leave. God.");
                        funScan.nextLine();
                    }
                } else if (passcode.equals("QUEST")) {
                    if (gotQuest) {
                    System.out.println("Quest... Right. My " + AnsiColors.yellow() + "master" + AnsiColors.reset() + " said that there may be someone that will help.");
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
                    System.out.println(AnsiColors.yellow() + "\t 1) 'You probably look very beautiful. Or... handsome.'");
                    System.out.println("\t 2) 'Yeah... Who knows.'");
                    System.out.println("\t 3) 'You probably look like dog poo.'" + AnsiColors.reset());
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
                            System.out.println(AnsiColors.blue() + "(The strange person's opinion on you changed!)" + AnsiColors.reset());
                            funScan.nextLine();

                        } else {
                            System.out.println("...");
                            funScan.nextLine();
                            System.out.println(AnsiColors.blue() + "(The mysterious person seems to be embarrased. However, the programmer was too lazy to add a romance route. We apologize for any inconvenience.)" + AnsiColors.reset());
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
                            boss.boss(funScan);
                        } else {
                            System.out.println("Oh... You're...");
                            funScan.nextLine();
                            System.out.println("Jesus- you're actually kinda rude.");
                            funScan.nextLine();
                            System.out.println(AnsiColors.red() + "(The strange person's opinion on you changed!)" + AnsiColors.reset());
                            funScan.nextLine();
                            aggro = true;
                        }
                    }
                } else {
                    System.out.println(AnsiColors.blue() + "(You already asked him about his looks. Maybe don't bring it up again.)" + AnsiColors.reset());
                }
                } else if (passcode.equals("FAMILY")) {
                    if (!family) {
                        System.out.println("My... family?");
                        funScan.nextLine();
                        System.out.println("To be honest, I haven't seen them in so long.");
                        funScan.nextLine();
                        System.out.println("Dead by now, I bet.");
                        funScan.nextLine();
                        System.out.println("My dad wasn't such a great man, a drunk.");
                        funScan.nextLine();
                        System.out.println("Left me and my mom for some other rich girl.");
                        funScan.nextLine();
                        System.out.println("My mom took two jobs to help take care of me.");
                        funScan.nextLine();
                        System.out.println("Then, when I was 14, I saw an ad in the magazine.");
                        funScan.nextLine();
                        System.out.println(AnsiColors.yellow() + "'Milkman wanted! Deliver milk today!'" + AnsiColors.reset());
                        funScan.nextLine();
                        System.out.println("I took the job to help my mother, and it went so far.");
                        funScan.nextLine();
                        System.out.println("My sister? Well, she ran off with some biker gang.");
                        funScan.nextLine();
                        System.out.println("Nothing special to her, I bet.");
                        funScan.nextLine();
                        System.out.println("My wife...");
                        funScan.nextLine();
                        System.out.println("Before I was trapped here...");
                        funScan.nextLine();
                        System.out.println("We were so happy.");
                        funScan.nextLine();
                        System.out.println("They killed her.");
                        funScan.nextLine();
                        System.out.println("I miss her.");
                        funScan.nextLine();
                        System.out.println(AnsiColors.yellow() + "\t 1) 'I'm sorry to hear that.'" + AnsiColors.reset());
                        System.out.println(AnsiColors.yellow() + "\t 2) Stay silent" + AnsiColors.reset());
                        System.out.println(AnsiColors.yellow() + "\t 3) 'Yer mum is a pig.'" + AnsiColors.reset());
                        number = funScan.nextInt();
                        if (number == 1) {
                            System.out.println("It was rough...");
                            funScan.nextLine();
                        } else if (number != 1 && number != 3) {
                            System.out.println(AnsiColors.blue() + "You decided to stay silent." + AnsiColors.reset());
                            funScan.nextLine();
                        } else if (number == 3) {
                            if (aggro) {
                                System.out.println("Okay. That's... That's it!");
                                funScan.nextLine();
                                System.out.println("COME HERE YOU STUPID (smartypants) MOTHER(love)ING (precious) (creation of god)");
                                funScan.nextLine();
                                boss.boss(funScan);
                            } else {
                                aggro = true;
                                System.out.println("What the...");
                                funScan.nextLine();
                                System.out.println("WHAT IS WRONG WITH YOU?!");
                                funScan.nextLine();
                                System.out.println(AnsiColors.red() + "(The strange person's opinion on you changed!)" + AnsiColors.reset());
                                funScan.nextLine();
                            } 
                        }
                        System.out.println("Oh, yeah. I guess it's worth mentioning I have a cousin who is still alive.");
                        funScan.nextLine();
                        System.out.println("His name is Staniel.");
                        funScan.nextLine();
                    } else if (family) {
                        System.out.println("I already told you this.");
                        funScan.nextLine();
                    }
                } else if (passcode.equals("BACK")) {
                                System.out.println("You wanna go back?");
                                funScan.nextLine();
                                System.out.println("Alright. Goodbye.");
                                funScan.nextLine();
                                met = true;
                                milk.milk();
                            } else if (passcode.equals("STANIEL")) {
                                System.out.println("You want to see my cousin?");
                                funScan.nextLine();
                                System.out.println("Alright. Have fun.");
                                funScan.nextLine();
                                met = true;
                                stan.stan(name, hasName, funScan);
                            } else if (passcode.equals("STANIEL IS DEAD")) {
                                System.out.println("... What?");
                                funScan.nextLine();
                                System.out.println("You're a liar... You're a liar!");
                                funScan.nextLine();
                                bad.badend(funScan);
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