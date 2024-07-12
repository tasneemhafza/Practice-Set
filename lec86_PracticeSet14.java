package PracticeSet;

import java.util.Scanner;

public class lec86_PracticeSet14 {
    public static void main(String[] args) {
        // Problem 1
        // Syntax Error - int a = 7
        int age = 78;
        int year_born = 2000-78; // Logical error
//        System.out.println(6/0);
        System.out.println(age);
        System.out.println(year_born);

        // Problem 2
        try{
            //int a = 666/0;
        }
        catch (IllegalArgumentException e){
            System.out.println("HeHe");
        }
        catch (ArithmeticException e){
            System.out.println("Haha");
        }
        

        // Problem 3
        boolean flag = true;
        int [] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        try (Scanner Sc = new Scanner(System.in)) {
            int index;
            int i = 0;
            while(flag && i<5){
                try {
                    System.out.println("Enter the value of index");
                    index = Sc.nextInt();
                    System.out.println("The value of marks at that index: " + marks[index]);
                    break;
                }
                catch (Exception e) {
                    System.out.println("Invalid Index");
                    i++;
                }
            }
            if(i>=5){  //only 5 tries
                System.out.println("Error");
            }
        }
    }
}

