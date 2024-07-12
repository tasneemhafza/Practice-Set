package PracticeSet;

//package calc; //--> gives error
import java.util.*;
class Calculator{
    void calculate(int a, int b) {
    System.out.println("a + b+ " + a+b);
    }
}
class ScCalculator{
    void calculate(int a, int b) {
    System.out.println("a + b " + Math.sin(a+b));
    }
}
class HyCalculator{
    void calculate(int a, int b) {
    System.out.println(a+b);
    System.out.println("a + b " + Math.sin(a+b));
    }
}

class Hello{
    void name(String name){
    System.out.println("Hello "+name+", how are you?");
}
}

public class lec67_PracticeSet12 {
    public static void main(String[] args) {
    //1 create three classes Calculator, ScCalculator, HyCalculator and group them into a package
       System.out.println("Im main method"); 

    // 2. Use a built-in pacjage in java to write a class which display a message(using sout) after taking input from the user
    System.out.print("Enter your name: ");
    try (Scanner name = new Scanner(System.in)) {
        String str = name.nextLine();
        Hello name1 = new Hello();
        name1.name(str);
    }
    }
}
