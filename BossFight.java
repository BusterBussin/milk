import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class BossFight {

    public static void boss(Scanner scan) {
        Checks check = new Checks();
        char option = ' ';
        int bossHP = 10000;
        int playerHP = 10000;
        int damage = 0;
        boolean crit = false;
        int critrng = 0;
        int specialPower = 0;
        int bossMove = 0;
        int bossSpecialPower = 0;
        System.out.println("Do you want boss music (Y/N)");
        option = scan.nextLine().toUpperCase().charAt(0);
        if (option == 'Y') {
            playBossMusic();
            System.out.println("Have fun.");
        } else if (option == 'N') {
            System.out.println("Have fun.");
        } else {
            System.out.println("Oh well. You tried. Have fun.");
        }
        scan.nextLine();
        for (int lines = 0; lines <= 100; lines++) {
            System.out.println(AnsiColors.red()
                    + "----------------------------------------------------------------------------------------------"
                    + AnsiColors.reset());
        }
        scan.nextLine();
        System.out.println(
                AnsiColors.red() + "SO LONG HAVE I BEEN RIDICULED BY WEAK, PATHETIC, GOOD-FOR-NOTHING MORTALS!");
        scan.nextLine();
        System.out.println("YOU, OF ALL PEOPLE, HAVE PEEVED ME THE MOST!");
        scan.nextLine();
        System.out.println("FEAR ME, YOU ABSOLUTE MORON!");
        scan.nextLine();
        System.out.println("THY END IS NOW, FOR I AM THE MILKMAN!" + AnsiColors.reset());
        scan.nextLine();
        while (playerHP > 0 || bossHP > 0) {
            while (option != 'A' && option != 'B' && option != 'C' && option != 'D' && option != 'X') {
                System.out.println("DO A MOVE!");
                System.out.println("Boss HP: " + bossHP);
                System.out.println("Player HP:" + playerHP);
                System.out.println(AnsiColors.yellow() + "\t A) Terror Chop" + AnsiColors.reset());
                System.out.println(AnsiColors.yellow() + "\t B) Fatal Ghost Kick" + AnsiColors.reset());
                System.out.println(AnsiColors.yellow() + "\t C) Nightmare Stomp" + AnsiColors.reset());
                System.out.println(AnsiColors.yellow() + "\t D) Tickle Slap" + AnsiColors.reset());
                if (specialPower < 50) {
                    System.out
                            .println(AnsiColors.purple() + "Special attack needs atleast 50 Special Power."
                                    + AnsiColors.reset());
                    System.out.println(
                            AnsiColors.purple() + "You currently have " + specialPower + " Special Power."
                                    + AnsiColors.reset());
                } else if (specialPower >= 50) {
                    System.out.println(AnsiColors.purple() + "\t X) SPECIAL ATTACK" + AnsiColors.reset());
                }
                option = scan.nextLine().toUpperCase().charAt(0);
                critrng = (int) (Math.random() * 4);
                if (critrng == 3) {
                    crit = true;
                }
                if (option == 'A') {
                    if (crit) {
                        crit = crit();
                        damage = 250;
                    } else {
                        damage = 175;
                    }
                    System.out.println("It did " + damage + " damage!");
                    bossHP = bossHP - damage;
                } else if (option == 'B') {
                    if (crit) {
                        crit = crit();
                        damage = 200;
                    } else {
                        damage = 125;
                    }
                    System.out.println("It did " + damage + " damage!");
                    bossHP = bossHP - damage;
                } else if (option == 'C') {
                    if (crit) {
                        crit = crit();
                        damage = 350;
                    } else {
                        damage = 100;
                    }
                    System.out.println("It did " + damage + " damage!");
                    bossHP = bossHP - damage;
                } else if (option == 'D') {
                    if (crit) {
                        crit = crit();
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
                            crit = crit();
                            damage = 700;
                        } else {
                            damage = 450;
                        }
                        System.out.println("It did " + damage + " damage!");
                        bossHP = bossHP - damage;
                        specialPower = specialPower - 50;
                    } else {
                        option = 'F';
                        System.out.println("Not enough star power.");
                    }
                } else {
                    System.out.println("Not a valid choice.");
                }

                
                check.isBossDead(bossHP, scan);
            }
            specialPower = specialPower + 5;
            scan.nextLine();
            option = 'R';

            critrng = (int) (Math.random() * 4);
            if (critrng == 3) {
                crit = true;
            }
            bossMove = (int) (Math.random() * 5);
            if (bossMove == 0) {
                if (crit) {
                    crit = crit();
                    damage = 250;
                } else {
                    damage = 150;
                }
                playerHP = playerHP - damage;
                System.out.println("The Milkman used Bottle Smash!");
                System.out.println("It did " + damage + " damage!");
            } else if (bossMove == 1) {
                webAttack();
                damage = 100;
                playerHP = playerHP - damage;
                System.out.println("The Milkman used Web Attack!");
                System.out.println("It did " + damage + " damage!");
            } else if (bossMove == 2) {
                if (crit) {
                    crit = crit();
                    damage = 450;
                } else {
                    damage = 250;
                }
                playerHP = playerHP - damage;
                System.out.println("The Milkman used Crate Throw!");
                System.out.println("It did " + damage + " damage!");
            } else if (bossMove == 3) {
                if (bossHP < 9976) {
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
                    bossSpecialPower = bossSpecialPower - 75;
                } else {
                    webAttack();
                    damage = 100;
                    playerHP = playerHP - damage;
                    System.out.println("The Milkman used Web Attack!");
                    System.out.println("It did " + damage + " damage!");
                }
            }
            check.isPlayerDead(playerHP);
            bossSpecialPower = bossSpecialPower + 5;
            scan.nextLine();
        }
    }

    public static void webAttack() {
        int i = 0;
        while (i < 4) {

            int randomNumber = 0;
            i = i + 1;
            randomNumber = (int) (Math.random() * 10);
            if (randomNumber == 0) {
                web("https://www.google.com/search?client=opera-gx&q=help+i+accidentally+summoned+max+verstappen&sourceid=opera&ie=UTF-8&oe=UTF-8");
            }
            if (randomNumber == 1) {
                web("https://c.tenor.com/w4AuyuSUFH8AAAAd/tenor.gif");
            }
            if (randomNumber == 2) {
                web("https://www.youtube.com/watch?v=vHwKTOzLTDY");
            }
            if (randomNumber == 3) {
                web("https://www.youtube.com/watch?v=Usb0OnhGJXg");
            }
            if (randomNumber == 4) {
                web("https://www.youtube.com/watch?v=G8Xi8i2QHCs");
            }
            if (randomNumber == 5) {
                web("https://media.tenor.com/KUO3XfgIozMAAAAM/insane.gif");
            }
            if (randomNumber == 6) {
                web("https://www.youtube.com/watch?v=wl2JnXjwWBM");
            }
            if (randomNumber == 7) {
                web("https://www.youtube.com/watch?v=RrDt9a0q3P0");
            }
            if (randomNumber == 8) {
                web("https://media.tenor.com/vHORAvTvOfYAAAAM/dog-spooky.gif");
            }
            if (randomNumber == 9) {
                web("https://open.spotify.com/track/3xZek9XkEaX130o3XN9cvd?si=5c82153910fc450d");
            }
        }
        i = 0;

    }

    public static boolean crit() {
        System.out.println(AnsiColors.yellow() + "CRIT!" + AnsiColors.reset());
        return false;
    }

    public static void web(String website) {
        if (Desktop.isDesktopSupported()) {
            Desktop desktop = Desktop.getDesktop();
            try {
                URI uri = new URI(website);
                desktop.browse(uri);
            } catch (IOException excp) {
                excp.printStackTrace();
            } catch (URISyntaxException excp) {
                excp.printStackTrace();
            }
        }
    }

    public static void playBossMusic() {
        try {
            AudioInputStream audioInputStream = AudioSystem
                    .getAudioInputStream(new File("AltarsOfApostasy.wav").getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch (Exception ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace();
        }
    }
}
