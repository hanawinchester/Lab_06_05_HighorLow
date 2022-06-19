import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random generator = new Random();
        int val = generator.nextInt(10) + 1;

        int guess;
        String trash;
        Scanner in = new Scanner(System.in);
        System.out.print("Guess the number! (between 1 and 10, inclusive): ");
        if (in.hasNextDouble()) {
            guess = in.nextInt();
            in.nextLine();
            if (guess >= 1 && guess <= 10) {
                if (guess == val) {
                    System.out.println("You guessed correctly! The number was " + guess);
                }
                else if (guess < val)
                {
                    System.out.println("Sorry, you guessed too low! The number was " + val);
                }
                else {
                    System.out.println("You guessed too high! The number was " + val);
                }
            }
            else {
                System.out.println("Number not in range 1-10");
            }
        }
            else
        {
            trash = in.nextLine();
            System.out.println("Must enter a valid number for guess. You entered: " + trash);
        }
        }
    }