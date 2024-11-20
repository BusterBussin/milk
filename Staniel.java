import java.io.File;
import java.util.Scanner;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Staniel {
    AnsiColors color = new AnsiColors();
    Scanner scan = new Scanner(System.in);
    int choice;

    public void stan(String name, boolean hasName) {
        System.out.println(color.black() + color.whiteBackground() + "You were teleported somewhere." + color.reset());
        playTheme();
        System.out.println(color.black() + color.whiteBackground()
                + "You look in front of yourself, and see a man, bleeding from the neck.\nHis blood stained his white collar shirt and black tie. His slacks were dirty.\nHe was... weird."
                + color.reset());
        System.out.println(color.green() + "Oh. Hey. What are you doing here?" + color.reset());
        System.out.println(color.green() + "A friend of my cousin? Perhaps?" + color.reset());
        System.out.println(color.green() + "Oh. Well then... Make yourself at home." + color.reset());
        System.out.println(color.black() + color.whiteBackground()
                + "The area was fairly nice. It was a house that looked like it was owned by rich people.\nWas this real? Where even are you?"
                + color.reset());
        System.out.println(color.green() + "We're in California." + color.reset());
        System.out.println(color.green() + "Oh- sorry. I can read thoughts." + color.reset());
        System.out.println(color.green() + "It isn't the *REAL* California, but it's a nice version." + color.reset());
        System.out.println(color.green() + "For reference, Katy Perry never made music. Thank god." + color.reset());
        System.out.println(color.green() + "I'm guessing Eddie sent you, huh." + color.reset());
        System.out.println(color.green() + "Well, I'm Stan. Staniel." + color.reset());
        if (hasName) {
            System.out.println(
                    color.green() + "Well, your name is " + name + ", if my mind recalls correctly." + color.reset());
        } else {
            System.out.println(color.green() + "Well, what's your name?" + color.reset());
            name = scan.nextLine();
            System.out.println(color.green() + name + ", right? Interesting." + color.reset());
        }
        System.out.println(color.green() + "If you're wondering... I'm actually dead." + color.reset());
        System.out.println(color.green()
                + "My cousin doesn't know that, though. If you could do me a favor, don't tell him." + color.reset());
        System.out.println(color.green() + "I was his last bit of family." + color.reset());
        System.out.println(color.green() + "I'm sure he won't react nicely if you told him." + color.reset());
        System.out.println(color.green() + "Anyways, why are you here?" + color.reset());
        System.out.println(color.yellow() + "\t1) Curious\n\t2) Speedrunning Ending\n\t3) Wanted to see you");
        choice = scan.nextInt();
        if (choice == 1) {
            System.out.println(color.green() + "Curious? But I heard curiousity kills the cat. That can't be good..."
                    + color.reset());
        } else if (choice == 2) {
            System.out.println(
                    color.green() + "Oh, one of those people... You guys have no life, I heard. How is that possible?"
                            + color.reset());
        } else if (choice == 3) {
            System.out.println(color.green() + "Aw, you flatter me." + color.reset());
        } else {
            System.out.println(color.green() + "Oh well, you tried." + color.reset());
        }

        while (choice != 5) {
            System.out.println(color.green() + "Anyways, what do you want to know?" + color.reset());
            System.out.println(color.yellow()
                    + "\t1) How did you die\n\t2) Eddie?\n\t3) Eddie's Master\n\t4) Age\n\t5) Quit\n\t6) Fight"
                    + color.reset());
            if (choice == 1) {
                System.out.println(color.green() + "Me? Well, it's simple." + color.reset());
                System.out.println(color.green() + "Boredom and depression ate at my soul." + color.reset());
                System.out.println(color.green() + "I tried therapy, but it never worked." + color.reset());
                System.out
                        .println(color.green() + "One day, I just got tired of feeling the way I did." + color.reset());
                System.out.println(color.green() + "I took a knife and stabbed myself in the neck." + color.reset());
                System.out.println(color.green() + "That's all there is to it" + color.reset());
            } else if (choice == 2) {
                System.out.println(color.green() + "Oh, that's the milkman." + color.reset());
                System.out.println(color.green() + "Nice fella, I tell you that much." + color.reset());
                System.out.println(color.green() + "Well, I wouldn't know." + color.reset());
                System.out.println(
                        color.green() + "Maybe the depths of the passcode room drove him insane." + color.reset());
                System.out.println(color.green() + "Who knows?" + color.reset());
                System.out.println(color.green() + "Who cares?" + color.reset());
            } else if (choice == 3) {
                System.out.println(color.green() + "Oh- uh..." + color.reset());
                System.out.println(color.green() + "I don't know." + color.reset());
            } else if (choice == 4) {
                System.out.println(
                        color.green() + "Well, let's see. It's been... 24 years since my death." + color.reset());
                System.out.println(color.green() + "So I'd be 42 now." + color.reset());
            } else if (choice == 5) {
                System.out.println(color.green() + "Done already? Fair enough." + color.reset());
            } else if (choice == 6) {
                System.out.println("(Coming soon)");
            } else {
                System.out.println(color.green() + "Hm? Try that again." + color.reset());
            }
        }
    }

    public void playTheme() {
        try {
            AudioInputStream audioInputStream = AudioSystem
                    .getAudioInputStream(new File("clairdelune.wav").getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch (Exception ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace();
        }
    }
}
