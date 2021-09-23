package stepit.hw;

import java.util.Scanner;

public class Grade2 {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);

        int scoresToGrade;
        System.out.print("Enter your exam scores: ");
        scoresToGrade = input.nextInt();

         if (scoresToGrade >=90) {
             System.out.println("Your grade is 'A'! ");
         }
         else if (scoresToGrade >=80) {
             System.out.println("Your grade is 'B'! ");
         }
         else if (scoresToGrade >=70) {
             System.out.println("Your grade is 'C'! ");
         }
         else if (scoresToGrade >=60) {
             System.out.println("Your grade is 'D'! ");
         }
         else if (scoresToGrade <60) {
             System.out.println("Your grade is 'F'! ");
         }
        }
    }