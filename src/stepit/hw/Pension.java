package stepit.hw;

import java.util.Scanner;

public class Pension {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);

        String sex;
        System.out.println(" Choose your sex - enter 'f' for female and 'm' for male: ");
        sex = input.nextLine();

        int age;
        System.out.print("Enter your age: ");
        age = input.nextInt();

        int diffF = (65 - age);
        int diffM = (70 - age);
        int retireF = (age - 65);
        int retireM = (age - 70);

        if (sex.equals("f") && diffF > 0) {
            System.out.println("Years until retirement: " + diffF);
        } else if (sex.equals("m") && diffM > 0) {
            System.out.println("Years until retirement: " + diffM);
        } else if (sex.equals("f") && diffF < 0) {
            System.out.println("Years on retirement: " + retireF);
        } else if (sex.equals("m") && diffF < 0) {
            System.out.println("Years on retirement: " + retireM);

        }

    }
}
