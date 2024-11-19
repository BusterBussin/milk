import java.util.Scanner;

public class Milk {
    public void milk() {
        Scanner scan = new Scanner(System.in);
        double milkDouble;
        char playAgain = 'y';
        String liquid;
        int misinputs = 0;
        Events event = new Events();
        Fun passcodes = new Fun();
        BossFight boss = new BossFight();

        while (playAgain == 'Y' || playAgain == 'y') {
            System.out.println(
                    "What exactly is on the wall? It should be a liquid, so it makes sense. Won't stop you, though.");
            liquid = scan.nextLine().toLowerCase();
            if (liquid.equals("passcoderoom")) {
                passcodes.pass();
            }
            if (liquid.equals("bossfight")) {
                boss.boss();
            }
            System.out.println("How many bottles of " + liquid + " are on the wall?");
            milkDouble = scan.nextDouble();
            int milk = (int) milkDouble;

            String website = "www.youtube.com";
            while (milk <= 0) {
                System.out.println("There must be atleast one bottle of " + liquid + " on the wall.");
                System.out.println("How many bottles of " + liquid + " are on the wall?");
                milkDouble = scan.nextDouble();
                milk = (int) milkDouble;
            }
            if (milk == 69) {
                System.out.println("Nice.");
            } else if (milk == 420) {
                System.out.println("Don't do this stuff.");
                liquid = "Snoop Dogg Juice (TM)";
            } else if (milk == 666) {
                System.out.println("Ohoho. No you don't.");
                System.exit(0);
            } else if (milk == 1) {
                System.out.println("Only one? Boring.");
            }
            while (milk > 2) {
                int milkrng = (int) (Math.random() * 1000001);
                milk = event.milkRNG(milkrng, milk, liquid);
                System.out.print(
                        milk + " bottles of " + liquid + " on the wall, " + milk + " bottles of " + liquid + ". ");
                milk = milk - 1;
                System.out.println(
                        "You take one down, pass it around, " + milk + " bottles of " + liquid + " on the wall.");
            }
            if (milk == 2) {
                System.out.println("2 bottles of " + liquid + " on the wall, 2 bottles of " + liquid
                        + ". You take one down, pass it around, one bottle of " + liquid + "on the wall.");
                milk = milk - 1;
            }
            if (milk == 1) {
                System.out.println("One bottle of " + liquid + " on the wall, one bottle of " + liquid
                        + ". You take it down, pass it around, no more bottles of " + liquid + " on the wall.");
            }
            System.out.println("No more bottles of " + liquid + " on the wall, no more bottles of " + liquid
                    + ". You took them around, passed them around, no more bottles of " + liquid + " on the wall.");
            playAgain = ' ';
            System.out.println("Do you want to play again? (Y/N)");
            scan.nextLine();
            playAgain = scan.nextLine().charAt(0);
            while (playAgain != 'Y' && playAgain != 'y' && playAgain != 'N' && playAgain != 'n') {

                if (playAgain == '1' || playAgain == '2' || playAgain == '3' || playAgain == '4' || playAgain == '5'
                        || playAgain == '6' || playAgain == '8' || playAgain == '9' || playAgain == '0') {
                    System.out.println("Are you stupid?");
                }
                int rng = (int) (Math.random() * 101);
                int rng2 = (int) (Math.random() * 101);
                int rng3 = (int) (Math.random() * 10001);
                boolean win = false;
                if (playAgain == '0') {
                    System.out.println("Enter a character. Now.");
                    playAgain = scan.nextLine().charAt(0);
                    if (playAgain == '9') {
                        System.out.println("Stop it. Stop it now.");
                        playAgain = scan.nextLine().charAt(0);
                        if (playAgain == '5') {
                            System.out.println("No. Stop.");
                            playAgain = scan.nextLine().charAt(0);
                            if (playAgain == '8') {
                                passcodes.pass();
                            }
                        }
                    }
                }
                if (playAgain == '7') {
                    System.out.println("Uhh... Try again.");
                    playAgain = scan.nextLine().charAt(0);
                    if (playAgain == '7') {
                        System.out.println("No. Don't. Stop that. Don't.");
                        website = "https://www.youtube.com/watch?v=xfJA_0DOAfs";
                        event.webpage(website);
                        playAgain = scan.nextLine().charAt(0);
                        if (playAgain == '7') {
                            System.out.println("NO!");
                            for (int lines = 0; lines <= 25; lines++) {
                                System.out.println(
                                        "----------------------------------------------------------------------------------------------");
                            }
                            event.rngRoomHard(rng, rng2, win, rng3);
                        }
                    }
                }
                if (rng == 50) {
                    event.rngRoom(rng, rng2, win);
                }
                misinputs = misinputs + 1;
                if (misinputs > 2 && misinputs < 6) {
                    System.out.println("It's not that hard.");
                }
                if (misinputs >= 6 && misinputs < 10) {
                    System.out.println("Dude...");
                }
                if (misinputs >= 10 && misinputs < 15) {
                    System.out.println("You utter buffoon.");
                }
                if (misinputs >= 15 && misinputs < 25) {
                    System.out.println("DO. IT. CORRECTLY!");
                }
                if (misinputs >= 25 && misinputs < 69) {
                    System.out.println("I'm done.");
                }
                if (misinputs == 69) {
                    System.out.println("0958.");
                }
                if (misinputs > 69) {
                    System.out.println("I'm done.");
                }
                if (misinputs == 100) {
                    System.out.println("https://www.youtube.com/watch?v=r5pEFAm63NM");
                }
                System.out.println("That is not a valid choice.");
                System.out.println("Do you want to play again? (Y/N)");
                playAgain = scan.nextLine().charAt(0);

                if (playAgain == 'Y' || playAgain == 'y') {
                    System.out.println("yay");
                }
            }

        }
        System.out.println("Thanks for playing.");
        scan.close();
        System.exit(0);

    }

}