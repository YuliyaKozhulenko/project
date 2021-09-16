package stepit.hw;
import java.util.Scanner; //program uses class Scanner
import java.util.Random; //program uses class Random

public class GuessGame {
    //main method begins execution of Java application
    public static void main(String[] args) {

        //create a Scanner to obtain input from the command window
        Scanner input = new Scanner(System.in);

        //create a Random to return random numbers
        Random random =  new Random();

        int guess = 0;
        int number = random.nextInt(26); // random number from 1 to 25

        while (guess != number) {
            System.out.print ("Guess the number from 1 to 25: ");
            guess = input.nextInt ();
            if (number != guess) {
                System.out.println ("Right number is " + ((guess > number)? "less" : "bigger"));
            }
        }
        System.out.println("You " + ((guess == number)? "Win!": + number));

    }
}

