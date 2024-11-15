import java.util.Scanner;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class BossFight {
    AnsiColors color = new AnsiColors();
    Scanner scan = new Scanner(System.in);
    String url = " ";
    char option = ' ';
    String action = " ";

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
        }

        public void web() {
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
