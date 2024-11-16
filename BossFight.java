import java.util.Scanner;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class BossFight {
    AnsiColors color = new AnsiColors();
    Scanner scan = new Scanner(System.in);
    Checks check = new Checks();
    String url = " ";
    char option = ' ';
    String action = " ";
    int bossHP = 2000;
    int playerHP = 2000;
    int damage = 0;
    boolean crit = false;
    int critrng = 0; 
    int specialPower = 0;
    int randomNumber = 0;
    int bossMove = 0;
    int bossSpecialPower = 0;

        public void boss() {
            System.out.println("Do you want boss music (Y/N)");
            option = scan.nextLine().toUpperCase().charAt(0);
            if (option == 'Y') {
                System.out.println("https://www.youtube.com/watch?v=m5ra-w1xct8");
                System.out.println("Have fun.");
            } else if (option == 'N') {
                System.out.println("Have fun.");
            } else {
                System.out.println("Oh well. You tried. Have fun.");
            }
            scan.nextLine();
            for (int lines = 0; lines <= 100; lines++) {
                System.out.println(color.red() + "----------------------------------------------------------------------------------------------" + color.reset()); }
                scan.nextLine();
                System.out.println(color.red() + "SO LONG HAVE I BEEN RIDICULED BY WEAK, PATHETIC, GOOD-FOR-NOTHING MORTALS!");
                scan.nextLine();
                System.out.println("YOU, OF ALL PEOPLE, HAVE PEEVED ME THE MOST!");
                scan.nextLine();
                System.out.println("FEAR ME, YOU ABSOLUTE MORON!");
                scan.nextLine();
                System.out.println("THY END IS NOW, FOR I AM THE MILKMAN!" + color.reset());    
                scan.nextLine();
                while (playerHP > 0 || bossHP > 0) {
                    while (option != 'A' && option != 'B' && option != 'C' && option != 'D' && option != 'X') {
                    System.out.println("DO A MOVE!");
                    System.out.println(color.yellow() + "\t A) Terror Chop" + color.reset());
                    System.out.println(color.yellow() + "\t B) Fatal Ghost Kick" + color.reset());
                    System.out.println(color.yellow() + "\t C) Nightmare Stomp" + color.reset());
                    System.out.println(color.yellow() + "\t D) Tickle Slap" + color.reset());
                    if (specialPower < 50) {
                        System.out.println(color.purple() + "Special attack needs atleast 50 Special Power." + color.reset());
                        System.out.println(color.purple() + "You currently have " + specialPower + " Special Power." + color.reset());
                    } else if (specialPower >= 50) {
                        System.out.println(color.purple() + "\t X) SPECIAL ATTACK");
                    }
                    option = scan.nextLine().toUpperCase().charAt(0);
                    critrng = (int)(Math.random() * 4);
                    if (critrng == 3) {
                        crit = true;
                    }
                    if (option == 'A') {
                        if (crit) {
                            crit();
                            damage = 250;
                        } else {
                            damage = 175;
                        }
                        System.out.println("It did " + damage + " damage!");
                        bossHP = bossHP - damage;
                    } else if (option == 'B') {
                        if (crit) {
                            crit();
                            damage = 200;
                        } else {
                            damage = 125;
                        }
                        System.out.println("It did " + damage + " damage!");
                        bossHP = bossHP - damage;
                    } else if (option == 'C') {
                        if (crit) {
                            crit();
                            damage = 350;
                        } else {
                            damage = 100;
                        }
                        System.out.println("It did " + damage + " damage!");
                        bossHP = bossHP - damage;
                    } else if (option == 'D') {
                        if (crit) {
                            crit();
                            damage = 400;
                        } else {
                            damage = 175;
                        }
                        System.out.println("It did " + damage + " damage!");
                        bossHP = bossHP - damage;
                    } else if (option == 'X') {
                        if (specialPower >= 50) {
                        System.out.println("SPECIAL!");
                        if (crit) {
                            crit();
                            damage = 700;
                        } else {
                            damage = 450;
                        }
                        System.out.println("It did " + damage + " damage!");
                        bossHP = bossHP - damage;
                    } else {
                        option = 'F';
                        System.out.println("Not enough star power.");
                    }
                    } else {
                        System.out.println("Not a valid choice.");
                    }
                    
                    specialPower = specialPower + 5;
                    check.isBossDead(bossHP, scan);
                }
                option = 'R';
                
                critrng = (int)(Math.random() * 4);
                    if (critrng == 3) {
                        crit = true;
                    }
                bossMove = (int)(Math.random() * 5);
                if (bossMove == 0) {
                    if (crit) {
                        crit();
                        damage = 250;
                    } else {
                        damage = 150;
                    }
                    playerHP = playerHP - damage;
                    System.out.println("The Milkman used Bottle Smash!");
                    System.out.println("It did " + damage + " damage!");
                } else if (bossMove == 1) {
                    webAttack();
                    damage = 25;
                    playerHP = playerHP - damage;
                    System.out.println("The Milkman used Web Attack!");
                    System.out.println("It did " + damage + " damage!");
                } else if (bossMove == 2) {
                    if (crit) {
                        crit();
                        damage = 450;
                    } else {
                        damage = 250;
                    }
                    playerHP = playerHP - damage;
                    System.out.println("The Milkman used Crate Throw!");
                    System.out.println("It did " + damage + " damage!");
                 } else if  (bossMove == 3) {
                    if (bossHP < 2000) {
                    bossHP = bossHP + 25;
                    System.out.println("The Milkman used Milk!");
                    System.out.println("It healed 25 HP!");
                    } else {
                        System.out.println("The Milkman used Milk, but it failed!");
                    } 
                 } else if (bossMove == 4) {
                    if (bossSpecialPower >= 75) {
                        System.out.println("SPECIAL!");
                        if (crit) {
                            damage = 700;
                        } else {
                            damage = 400;
                        }
                        playerHP = playerHP - damage;
                        System.out.println("It did " + damage + " damage!");
                    } else {
                    webAttack();
                    damage = 25;
                    playerHP = playerHP - damage;
                    System.out.println("The Milkman used Web Attack!");
                    System.out.println("It did " + damage + " damage!");
                    }
                 }
                 check.isPlayerDead(playerHP);
                 bossSpecialPower = bossSpecialPower + 5;
                }
        }

        public void webAttack() {
            for (int i = 1; i < 3; i++)
                randomNumber = (int)(Math.random() * 10);
                if (randomNumber == 0) {
                    web("https://www.google.com/search?client=opera-gx&q=help+i+accidentally+summoned+max+verstappen&sourceid=opera&ie=UTF-8&oe=UTF-8");
                } if (randomNumber == 1) {
                    web("https://c.tenor.com/w4AuyuSUFH8AAAAd/tenor.gif");
                } if (randomNumber == 2) {
                    web("https://www.youtube.com/watch?v=vHwKTOzLTDY");
                } if (randomNumber == 3) {
                    web("https://www.youtube.com/watch?v=Usb0OnhGJXg");
                } if (randomNumber == 4) {
                    web("https://www.youtube.com/watch?v=G8Xi8i2QHCs");
                } if (randomNumber == 5) {
                    web("https://media.tenor.com/KUO3XfgIozMAAAAM/insane.gif");
                } if (randomNumber == 6) {
                    web("https://www.youtube.com/watch?v=wl2JnXjwWBM");
                } if (randomNumber == 7) {
                    web("https://www.youtube.com/watch?v=RrDt9a0q3P0");
                } if (randomNumber == 8) {
                    web("https://media.tenor.com/vHORAvTvOfYAAAAM/dog-spooky.gif");
                } if (randomNumber == 9) {
                    web("https://open.spotify.com/track/3xZek9XkEaX130o3XN9cvd?si=5c82153910fc450d");
                }
        }
        public void crit() {
            System.out.println(color.yellow() + "CRIT!" + color.reset());
            crit = false;
        }
        public void web(String website) {
        if (Desktop.isDesktopSupported()) {
      
            //making a desktop object
            Desktop desktop = Desktop.getDesktop();
            try {
               URI uri = new URI(url);
               desktop.browse(uri);
            } catch (IOException excp) {
               excp.printStackTrace();
            } catch (URISyntaxException excp) {
               excp.printStackTrace();
            }
        }
        }
}
