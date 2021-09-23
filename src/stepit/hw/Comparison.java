package stepit.hw;

import java.util.Scanner;

public class Comparison {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);

        int x;
        int y;

        System.out.print ("Enter value of 'x': ");
        x = input.nextInt ();

        System.out.print ("Enter value of 'y': ");
        y = input.nextInt ();

        if (x>y) {
            System.out.println("x>y");
        }
        else if (x<y) {
            System.out.println("x<y");
        }
        else if (x==y) {
            System.out.println("x=y");
        }
        }
    }
