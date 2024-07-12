package PracticeSet;
public class lec25_PracticeSet5 {
    
    public static void main(String[] args) {
    // 1. Pattern printing
       int n = 4;
       System.out.println("1.");
       for (int i=n; i>0; i--){
           for(int j=0;j<i;j++){
               System.out.print("*");
           }
           System.out.print("\n");
       }
       

    // 2. WAP to print sum of first even numbers
       int sum=0;
       int m=4;
       for(int i=0;i<m;i++){
           sum = sum + (2*i);
       }
       System.out.println("2.");
       System.out.print("Sum of even numbers is: ");
       System.out.println(sum);
	System.out.printf("\n");
    
    
    // 3. WAP to write table of a
    int a= 8;
    System.out.println("3.");
    for(int i=1; i<=10; i++){
    System.out.printf("%d X %d = %d\n", a, i, a*i);
    }
    System.out.printf("\n");
    
    // 4. Wap table of 10 in reverse order
    int b=10;
    System.out.println("4.");
    for(int i=10; i>0; i--) {
        System.out.printf("%d X %d = %d\n", b, i, b*i);
    }
    System.out.printf("\n");
    
    // 5. WAP to find factorial given number using for loop
    int x=5, fact=1;
    System.out.println("5.");
    for(int i=x; i>0; i--) {
        fact *= i;
    }
        System.out.println("The factorial is : " + fact);
        System.out.printf("\n");
        
        
    // 6. Repeat 5 using while loop
    int t = 5, count=0;
    System.out.println("6.");
    while(t>0) {
        System.out.println(t);
        count++;
    if(count==10)
    break;
    }
    System.out.printf("\n");
    
    // 7. Repeat 1 using for loop
    System.out.println("7.");
    for(int i=1; i<=10; i++) {
        System.out.println("1");
    }
    System.out.printf("\n");
    
    
    // 8. mcq
    
    // 9. WAP to add no. of table 8
    int y=8, sum2=0; 
    System.out.println("9.");
    for(int i=1; i<=10; i++) {
        sum2 +=y* i;
    }
    System.out.println("The Sum is: " + sum2);
    System.out.printf("\n");
    
    // 10. mcq
    
    // 11. Repeat 2 using for loop
    }
    
}
