package PracticeSet;
import java.util.Scanner;

public class lec12_PracticeSet2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
        }

        // // 2. WAP to encrypt a grade by adding 8 to it. Decrypt it to show the correct grade
        // char ch = 'A';
        // ch +=(char) 8;
        // System.out.println("The grade is: " + ch);

        // ch -= (char) 8;
        // System.out.println("The actual grade is: " + ch);

        // // 3. WAP to check user input is greater than the given no
        // int x= 50;
        // System.out.print("Enter a number: ");
        // int y= sc.nextInt();
        // System.out.println(y>x);

        // // 4. write the exp
        // double v=3;
        // int u=2;
        // int a=1;
        // int s=5;
        // double x = ((v*v)- (u*u))/(2*a*s);
        // System.out.println(x);

        // 5. Find the value
        int x=7;
        int a = x*49/x+35/x;
        System.out.println(a);

    }
}    
