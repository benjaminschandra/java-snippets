import java.util.Scanner;
import java.util.Random;
import java.util.InputMismatchException;

public class Zahlenraten {

    public static final int FROM = 1;
    public static final int TO = 100;

    public static void main(String[] args) {
        
        var scanner = new Scanner(System.in);
        var random = new Random();

        var numberToGuess = random.nextInt(FROM, TO + 1);
        var guessCount = 1;

        System.out.println("Willkommen zum Zahlenraten!");
        
        for (;;) {
            int guess = -1;
            System.out.printf("#" + guessCount + ": Zahl raten zwischen %d und %d: ", FROM, TO);
            try {
                guess = scanner.nextInt();
                if (guess < FROM || guess > TO) {
                    System.out.println("Die Zahl muss zwischen " + FROM + " und " + TO + " liegen.");
                    System.out.println();
                    continue;
                }

            } catch (InputMismatchException e) {
                System.out.println("Bitte geben Sie eine gültige Zahl ein.");
                System.out.println();
                scanner.nextLine();
                continue;
            }
            if (guess < numberToGuess) {
                System.out.println("Zu niedrig! Versuchen Sie es erneut:");
            } else if (guess > numberToGuess) {
                System.out.println("Zu hoch! Versuchen Sie es erneut:");
            } else {
                System.out.println("Herzlichen Glückwunsch! Sie haben die Zahl in " + guessCount + " Versuchen erraten.");
                break;
            }
            guessCount++;
            System.out.println();
        }
        scanner.close();
    }
}