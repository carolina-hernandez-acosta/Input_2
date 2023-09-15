// Carolina Hernandez-Acosta
// 9/15/2023
// Input Practice 2

import java.util.Scanner;

public class Input2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String nameOne, nameTwo;
        int studentID;

        System.out.println("Enter your first name! :: ");
        nameOne = input.next();

        System.out.println("Enter your last name! :: ");
        nameTwo = input.next();

        System.out.println("What is your student #1000? :: ");
        studentID = input.nextInt();

        System.out.print("####################\n");
        System.out.print("####################\n");
        System.out.println(nameOne + " " + nameTwo);
        System.out.print("####################\n");
        System.out.print("####################\n");
        System.out.println(nameTwo + ", " + nameOne);
        System.out.print("####################\n");
        System.out.print("####################\n");
        System.out.println("Student ID# :: " + studentID);
        System.out.print("####################\n");
        System.out.print("####################\n");





    }
}