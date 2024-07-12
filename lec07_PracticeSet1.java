package PracticeSet;
import java.util.Scanner;

public class lec07_PracticeSet1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // //5. WAP to check input no is an int or not
            // System.out.print("Enter a number: ");
            // boolean a = sc.hasNextInt();
            // System.out.println(a);
            //OR
            System.out.print("Enter your number: ");
            System.out.println(sc.hasNextInt());
        }

        // //1. WAP to find sum of three numbers
        // System.out.print("Input three numbers to add:");
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();
        // int sum = a+b+c;
        // System.out.print("The sum is: " + sum);
        

        // //2. WAP to calculate CGPA of three subjects
        // System.out.print("Enter Maths marks: ");
        // int maths = sc.nextInt();
        // System.out.print("Enter English marks: ");
        // int eng = sc.nextInt();
        // System.out.print("Enter Computer marks: ");
        // int comp = sc.nextInt();
        // double percentage = (maths+eng+comp)/3;  // maths+..+../30 but it will give int value so for that change all of them to float
        // double cgpa = percentage/10;
        // System.out.println("The CGPA is: " + cgpa);


        // //3. WAP which asks a user for their name and greets them with "Hello <name>, have a good day."
        // System.out.print("Please enter your name: ");
        // String name = sc.nextLine();
        // System.out.println("Hello " + name + ", have a good day! Dont loose your momentum, keep working hard and don't forget we love and and support you.");


        // //4. WAP to convert Km to miles. hint: 1km=0.621miles
        // System.out.print("Enter distance in kilometer: ");
        // float km = sc.nextFloat();
        // float miles = km * 0.621f;
        // System.out.println("The distance in miles is: " + miles + " miles");


    }
}
