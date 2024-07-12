package PracticeSet;
import java.util.Scanner;
public class lec35_PracticeSet7 {
    
    // 1. Print table of n using method
        // static void table(int n) {
        //     for(int i=1; i<=10; i++) {
        //         System.out.printf("%d x %d = %d\n", n,i,n*i);
        //     }
        // } 
        // public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a number for its table: ");
        // int n = sc.nextInt();
        // table(n);
        // }
   
    // 2. WAP using function to print the pattern
        /* static void pattern1(int x) {
            for(int i=1; i<=x; i++) {
                for(int j=1; j<=i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            
        } 
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of line to see its pattern: ");
        int n = sc.nextInt();
        pattern1(n);
        } */

    // 3. WAP a recursive function to calculate sum of first n natural no. 
        // static int sumRec(int n) {
        //  //base condition/ termination condition
        //     if(n==1) {
        //         return 1;
        //     } else {
        //         return n + sumRec(n-1); //sumRec(3) = 3 + sum(2) = 3+2+sum(1) = 3+2+1=6
        //     }
        // }
        // public static void main(String[] args) {
        //     Scanner sc = new Scanner(System.in);
        //     System.out.print("Enter number of terms: ");
        //     int n = sc.nextInt();   
        //     int sum = sumRec(n);
        //     System.out.println("The sum is: " +sum);
        // }

    // 4. WAP to print the following pattern using method
        // static void pattern(int x) {
        //     for(int i=x; i>0; i--) {
        //         for(int j=i; j>0; j--) {
        //             System.out.print("*");
        //         }
        //         System.out.println();
        //     }
        // }
        // public static void main(String[] args) {
        //     System.out.println("The pattern:-");
        //     pattern(4);
        // }
    
    // 5. WAP to print n term of fibonacci series using recursion
    // // My method that doesn't use Recursion
    // static void fibonacci(int n) {
    //     int a=0, b=1;
    //     for(int i=1; i<=n; i++) {
    //         //System.out.printf("%d, ",a); --> output from 1 if mention index i.e from 0
    //         int c= a+b;
    //         a=b;
    //         b=c;
    //         System.out.printf("%d, ",a); // --> output from 1
    //     }
    // }
    // public static void main(String[] args) {
    //     fibonacci(10);
    // }

    // CWH method using Recursion
    /* static int fib(int a) {
        if(a==1 || a==2) {
            return a-1;
        } else {
            return fib(a-1) + fib(a-2);
        }
    }

    public static void main(String[] args) {
        int result= fib(7);
        System.out.println(result); //prints out that term i.e for 5 its 3, 7 its 8
    } */ // multiline comment /* & */


    // 6. WAP to find avg of set of numbers passed as arguments --> hint: use Varargs
    // static double avg(int ...arr) {
    //     double sum = 0;
    //     for(double a: arr) {
    //         sum += a;
    //     }
    //     return sum;
    // }

    // public static void main(String[] args) {
    //     double result= avg(1,2,3,4,5,6);
    //     System.out.println(result/6);
    // }

    // 7. Repeat 4 using recursion
    // for example pattern2(3)
    // pattern2(2) + 3 times star and new line
    // pattern2(1) + 2 times star and new line + 3 times star and new line
    // pattern2(0) + 1 times star and new line + 2 times star and new line + 3 times star and new line

    /*    static void pattern2(int n) {
        if(n>0) {
            pattern2(n-1); 
            for(int i=0; i<n; i++) {
                    System.out.print("4");
        }
        System.out.println();
        }

    } 
    public static void main(String[] args) {
        pattern2(4); //4 baar print hoga but usse phle 3 usse phle 2 and usse phle 1 i.e Recursion
    } */

    // 8. repeat 2 using recursion
    // 9. repeat 3 using iterative approach

    // 10. WAP a function convert celsius to fahrenheit 
    static double fahrenheit(double x) {
        return x*1.8+32.0;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the temperature in Celsius: ");
            double temp = sc.nextDouble();
            double tempF= fahrenheit(temp);
            System.out.print("The temperature in Fahrenheit is: " + tempF);
        }

}
}
        


