import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Events {

    Scanner eventScan = new Scanner(System.in);
    int randomMilk = (int)(Math.random() * 10001);
    String web = " ";

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
    public void rngRoom(int rng1, int rng2, boolean win) {
        if (rng1 == 50) 
            System.out.println("You suck.");
            
            playSound();
            System.out.println("Time to get lucky and pair two numbers to be the same!");
            System.out.println("Type anything to get started.");
            eventScan.nextLine();
            while (!win) {
                rng1 = (int)(Math.random() * 64);
                rng2 = (int)(Math.random() * 64);
                System.out.println("First number: " + rng1);
                System.out.println("Second number: " + rng2);
                if (rng1 == rng2) {
                    System.out.println("You win!");
                    win = true;
                    win();
                    eventScan.nextLine();
                } else {
                    System.out.println("Try again.");
                    System.out.println("(Type anything to roll again)");
                    eventScan.nextLine();
                }
            }
            eventScan.close();
            System.exit(0);
    }
    public void rngRoomHard(int rng1, int rng2, boolean win, int rng3) {
        AnsiColors color = new AnsiColors();
        if (rng1 == 50) 
            System.out.println("You suck.");
            playSound();
            System.out.println("Time to get lucky and pair three numbers to be the same!");
            System.out.println("Type anything to get started.");
            eventScan.nextLine();
            while (!win) {
                rng1 = (int)(Math.random() * 1001);
                rng2 = (int)(Math.random() * 1001);
                rng3 = (int)(Math.random() * 1001);
                System.out.println("First number: " + rng1);
                System.out.println("Second number: " + rng2);
                System.out.println("Third number: " + rng3);
                if (rng1 == rng2 && rng1 == rng3) {
                    System.out.println(color.green() + "You win!" + color.reset());
                    win = true;
                    win();
                } else {
                    System.out.println(color.red() + "Get better." + color.reset());
                }
            }
            eventScan.nextLine();
            eventScan.close();
            System.exit(0);
    }
    public void webpage(String website) {
        if (Desktop.isDesktopSupported()) {
      
            //making a desktop object
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

    public void playSound() {
    try {
        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("Friday.wav").getAbsoluteFile());
        Clip clip = AudioSystem.getClip();
        clip.open(audioInputStream);
        clip.start();
    } catch(Exception ex) {
        System.out.println("Error with playing sound.");
        ex.printStackTrace();
    }
}

public void win() {
    try {
        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("yay.wav").getAbsoluteFile());
        Clip clip = AudioSystem.getClip();
        clip.open(audioInputStream);
        clip.start();
    } catch(Exception ex) {
        System.out.println("Error with playing sound.");
        ex.printStackTrace();
    }
}
}
