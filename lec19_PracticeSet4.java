package PracticeSet;
import java.util.Scanner;
public class lec19_PracticeSet4 {

    public static void main(String[] args) {
    // // 1.
    // int a=10;
    // if(a==11)  //in ques it was (a=11) which gives error as int--> bool not possible 
    // System.out.println("I am 11.");
    // else
    // System.out.println("I am not 11.");

    // // 2. WAP to check if a student passed if it requires 33% in each subj and overall 40%
    // Scanner marks = new Scanner(System.in);
    // double sum = 0, percentage;
    // System.out.print("Enter Maths marks: ");
    // double maths = marks.nextDouble();
    // System.out.print("Enter Science marks: ");
    // double sci = marks.nextDouble();
    // System.out.print("Enter English marks: ");
    // double eng = marks.nextDouble();
    // sum= maths + sci + eng; 
    // percentage = sum/3;
    // if(percentage>=40 && maths>=maths*.33 && sci>=sci*.33 && eng>=eng*.33) {
    //         System.out.println("Congratulations, you've PASSED!");
    //     } 
    //     else
    //     {
    //         System.out.println("Sorry, you FAILED.");
    //     }

    // } else 
    // {
    //     System.out.println("Sorry, you FAILED.");
    // }

    // // 3. Calculate income tax paid as per the rate
    // Scanner incomeTax = new Scanner(System.in);
    // System.out.print("Please enter your salary: ");
    // float salary = incomeTax.nextFloat();
    // if(salary<250000)
    // {
    //     System.out.println("You don't have to pay the taxes.");
    // } else
    // {
    //     if(250000<=salary || salary<500000)
    //     {
    //         System.out.println("Tax amount you have to pay is: " + salary*0.05);
    //     }
    //     else if(500000<=salary || salary<1000000)
    //     {
    //         System.out.println("Tax amount you have to pay is: " + salary*0.2);
    //     }
    //     else if(salary>=1000000)
    //     {
    //         System.out.println("Tax amount you have to pay is: " + salary*0.3);
    //     }
    // }


    // // 4. WAP to find out the day of the week by given number
    // Scanner week = new Scanner(System.in);
    // System.out.print("Enter the number you want to know the day of: ");
    // int day = week.nextInt();
    // switch(day)
    // {
    //     case 1:
    //     System.out.println("The day is Monday.");
    //     break;
    //     case 2:
    //     System.out.println("The day is Tuesday.");
    //     break;
    //     case 3:
    //     System.out.println("The day is Wednesday.");
    //     break;
    //     case 4:
    //     System.out.println("The day is Thursday.");
    //     break;
    //     case 5:
    //     System.out.println("The day is Friday.");
    //     break;
    //     case 6:
    //     System.out.println("The day is Saturday.");
    //     break;
    //     case 7:
    //     System.out.println("The day is Sunday.");
    //     break;
    //     default:
    //     System.out.println("Wrong Input.");
    // }


    // // 5. WAP to chech input year is leap or not
    // Scanner leap = new Scanner(System.in);
    // System.out.print("Enter the year to know if its leap year or not: ");
    // int year = leap.nextInt();
    // if(year%4==0)
    // {
    //     System.out.println("The year is a leap year.");
    // } else
    // {
    //     System.out.println("The year is not a leap year.");
    // }


    try (// 6. WAP to find out the type of website from the url
    Scanner website = new Scanner(System.in)) {
        System.out.print("Enter the last three letter of the URL: ");
        String url = website.next();
        switch(url)
        {
            case "com":
            System.out.println("Its a commercial website.");
            break;
            case "org":
            System.out.println("Its an organisation website.");
            break;
            case "in":
            System.out.println("Its an Indian Website.");
            break;
            default:
            System.out.println("Informatin niot available.");
        }
        // or use 
        //if(website.endsWith(".com")) {
        //    System.out.println("This is commercial website."); etc
    }
    
}
}

