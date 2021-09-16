package stepit.hw;
import java.util.Scanner; //program uses class Scanner


public class Language {
    //main method begins execution of Java application
    public static void main(String[] args) {
        //create a Scanner to obtain input from the command window
        Scanner input = new Scanner(System.in);


        System.out.println("Choose your language: en/ru/ro/fr/de ");
        String language = input.nextLine();

        if (language.equals("en")) {
    System.out.println("Hello!");
}
else if (language.equals("ru")) {
    System.out.println("Привет!");
}
else if (language.equals("ro")) {
    System.out.println("Salut!");
}
else if (language.equals("fr")) {
    System.out.println("Bonjour!");
}
else if (language.equals("de")) {
    System.out.println("Hallo!");
}
    }
}
