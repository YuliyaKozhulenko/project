package stepit.hw;
import java.util.Scanner; //program uses class Scanner

public class HomeWork1 {
    //main method begins execution of Java application
    public static void main(String[] args) {

    //create a Scanner to obtain input from the command window
    Scanner input = new Scanner(System.in);

    int a; //first number to add
    int b; //second number to add
    int c; //third number to add
    int d; //fourth number to add
    int e; //fifth number to add
    int f; //result of first calculation

    System.out.print ("Enter value of 'a'"); //prompt
    a = input.nextInt (); //read first number from user

    System.out.print ("Enter value of 'b'"); //prompt
    b = input.nextInt (); //read second number from user

    System.out.print("Enter value of 'c'"); //prompt
    c = input.nextInt(); //read third number from user

    System.out.print("Enter value of 'd'"); //prompt
    d = input.nextInt(); //read fourth number from user

    System.out.print("Enter value of 'e'"); //prompt
    e = input.nextInt(); //read fifth number from user

    f =(a+b)*(c-d)/e; //add numbers, then store the first calculation

    System.out.printf("f is %d%n",f); //display the first calculation

        int g; //first number to add
        int h; //second number to add
        int i; //third number to add
        int j; //result of second calculation

        System.out.print ("Enter value of 'g'"); //prompt
        g = input.nextInt (); //read first number from user

        System.out.print ("Enter value of 'h'"); //prompt
        h = input.nextInt (); //read second number from user

        System.out.print("Enter value of 'i'"); //prompt
        i = input.nextInt(); //read third number from user

        j =(g*h)%i; //add numbers, then store the second calculation

        System.out.printf("j is %d%n",j); //display the first calculation


        if (f < j)
            System.out.printf ("%d < %d%n", f, j);
        if (f > j)
            System.out.printf ("%d > %d%n", f, j);
        if (f <= j)
            System.out.printf ("%d <= %d%n", f, j);
        if (f >= j)
            System.out.printf ("%d >= %d%n", f, j);
        if (f == j)
            System.out.printf ("%d == %d%n", f, j);
        if (f != j)
            System.out.printf ("%d != %d%n", f, j);

} // end method main
} // end class HomeWork1