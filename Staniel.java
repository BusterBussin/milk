import java.io.File;
import java.util.Scanner;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Staniel {
    int choice;
    // Fun pass = new Fun();

    public void stan(String name, boolean hasName, Scanner scan) {
        System.out.println(AnsiColors.black() + AnsiColors.whiteBackground() + "You were teleported somewhere." + AnsiColors.reset());
        playTheme();
        System.out.println(AnsiColors.black() + AnsiColors.whiteBackground()
                + "You look in front of yourself, and see a man, bleeding from the neck.\nHis blood stained his white collar shirt and black tie. His slacks were dirty.\nHe was... weird."
                + AnsiColors.reset());
        System.out.println(AnsiColors.green() + "Oh. Hey. What are you doing here?" + AnsiColors.reset());
        System.out.println(AnsiColors.green() + "A friend of my cousin? Perhaps?" + AnsiColors.reset());
        System.out.println(AnsiColors.green() + "Oh. Well then... Make yourself at home." + AnsiColors.reset());
        System.out.println(AnsiColors.black() + AnsiColors.whiteBackground()
                + "The area was fairly nice. It was a house that looked like it was owned by rich people.\nWas this real? Where even are you?"
                + AnsiColors.reset());
        System.out.println(AnsiColors.green() + "We're in California." + AnsiColors.reset());
        System.out.println(AnsiColors.green() + "Oh- sorry. I can read thoughts." + AnsiColors.reset());
        System.out.println(AnsiColors.green() + "It isn't the *REAL* California, but it's a nice version." + AnsiColors.reset());
        System.out.println(AnsiColors.green() + "For reference, Katy Perry never made music. Thank god." + AnsiColors.reset());
        System.out.println(AnsiColors.green() + "I'm guessing Eddie sent you, huh." + AnsiColors.reset());
        System.out.println(AnsiColors.green() + "Well, I'm Stan. Staniel." + AnsiColors.reset());
        if (hasName) {
            System.out.println(
                    AnsiColors.green() + "Well, your name is " + name + ", if my mind recalls correctly." + AnsiColors.reset());
        } else {
            System.out.println(AnsiColors.green() + "Well, what's your name?" + AnsiColors.reset());
            name = scan.nextLine();
            System.out.println(AnsiColors.green() + name + ", right? Interesting." + AnsiColors.reset());
        }
        System.out.println(AnsiColors.green() + "If you're wondering... I'm actually dead." + AnsiColors.reset());
        System.out.println(AnsiColors.green()
                + "My cousin doesn't know that, though. If you could do me a favor, don't tell him." + AnsiColors.reset());
        System.out.println(AnsiColors.green() + "I was his last bit of family." + AnsiColors.reset());
        System.out.println(AnsiColors.green() + "I'm sure he won't react nicely if you told him." + AnsiColors.reset());
        System.out.println(AnsiColors.green() + "Anyways, why are you here?" + AnsiColors.reset());
        System.out.println(AnsiColors.yellow() + "\t1) Curious\n\t2) Speedrunning Ending\n\t3) Wanted to see you");
        choice = scan.nextInt();
        if (choice == 1) {
            System.out.println(AnsiColors.green() + "Curious? But I heard curiousity kills the cat. That can't be good..."
                    + AnsiColors.reset());
        } else if (choice == 2) {
            System.out.println(
                    AnsiColors.green() + "Oh, one of those people... You guys have no life, I heard. How is that possible?"
                            + AnsiColors.reset());
        } else if (choice == 3) {
            System.out.println(AnsiColors.green() + "Aw, you flatter me." + AnsiColors.reset());
        } else {
            System.out.println(AnsiColors.green() + "Oh well, you tried." + AnsiColors.reset());
        }

        while (choice != 5) {
            System.out.println(AnsiColors.green() + "Anyways, what do you want to know?" + AnsiColors.reset());
            System.out.println(AnsiColors.yellow()
                    + "\t1) How did you die\n\t2) Eddie?\n\t3) Eddie's Master\n\t4) Age\n\t5) Quit\n\t6) Fight"
                    + AnsiColors.reset());
            if (choice == 1) {
                System.out.println(AnsiColors.green() + "Me? Well, it's simple." + AnsiColors.reset());
                System.out.println(AnsiColors.green() + "Boredom and depression ate at my soul." + AnsiColors.reset());
                System.out.println(AnsiColors.green() + "I tried therapy, but it never worked." + AnsiColors.reset());
                System.out
                        .println(AnsiColors.green() + "One day, I just got tired of feeling the way I did." + AnsiColors.reset());
                System.out.println(AnsiColors.green() + "I took a knife and stabbed myself in the neck." + AnsiColors.reset());
                System.out.println(AnsiColors.green() + "That's all there is to it" + AnsiColors.reset());
            } else if (choice == 2) {
                System.out.println(AnsiColors.green() + "Oh, that's the milkman." + AnsiColors.reset());
                System.out.println(AnsiColors.green() + "Nice fella, I tell you that much." + AnsiColors.reset());
                System.out.println(AnsiColors.green() + "Well, I wouldn't know." + AnsiColors.reset());
                System.out.println(
                        AnsiColors.green() + "Maybe the depths of the passcode room drove him insane." + AnsiColors.reset());
                System.out.println(AnsiColors.green() + "Who knows?" + AnsiColors.reset());
                System.out.println(AnsiColors.green() + "Who cares?" + AnsiColors.reset());
            } else if (choice == 3) {
                System.out.println(AnsiColors.green() + "Oh- uh..." + AnsiColors.reset());
                System.out.println(AnsiColors.green() + "I don't know." + AnsiColors.reset());
            } else if (choice == 4) {
                System.out.println(
                        AnsiColors.green() + "Well, let's see. It's been... 24 years since my death." + AnsiColors.reset());
                System.out.println(AnsiColors.green() + "So I'd be 42 now." + AnsiColors.reset());
            } else if (choice == 5) {
                System.out.println(AnsiColors.green() + "Done already? Fair enough." + AnsiColors.reset());
            } else if (choice == 6) {
                System.out.println("(Coming soon)");
            } else {
                System.out.println(AnsiColors.green() + "Hm? Try that again." + AnsiColors.reset());
            }
        }
        System.out.println(AnsiColors.green() + "Well. I'll see you around." + AnsiColors.reset());
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
