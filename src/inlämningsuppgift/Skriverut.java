package inlämningsuppgift;

import java.util.Scanner;

public class Skriverut {
    private String text;
    private String longestWord = "";
    Räknar räknar = new Räknar();
    Scanner scan = new Scanner(System.in);

    Skriverut() {

        while (true) {
            text = scan.nextLine();
            räknar.raderplus();
            räknar.Textlengdthplus(text);
            räknar.textantalord(text);

            if (text.length() > longestWord.length()) {
                longestWord = text;
            }

            if (text.equals("stop") || text.equals("Stop")) {
                break;
            }
        }

        System.out.println("Du har skrivit " + räknar.getRader() + " rader");
        System.out.println("Du har " + räknar.getTextlengdth() + " antal tecken");
        System.out.println("Längsta ordet är: " + longestWord);
        System.out.println("Du har skrivit "+räknar.getAntalord()+" ord");

    }
}

