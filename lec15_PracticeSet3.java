package PracticeSet;
public class lec15_PracticeSet3 {

    public static void main(String[] args) {
        // 1. WAP to convert a string to lower case
        String name = "TASneem";
        System.out.println(name.toLowerCase());

        // 2. WAP to replaces with underscores
        String name2 = "tas n eem";
        System.out.println(name2.replace(" ", "_"));

        // 3. WAP to fill in a letter template i.e. custom name
        String letter = "Dear <|name|>, Thanks a lot!";
        letter = letter.replace("<|name|>", "BTS");
        System.out.println(letter);

        // 4. WAP to detect double and tripple spaces in a string
        String spaces = "Hello,   my name is V, and I'm  a good boy.";
        System.out.println(spaces.indexOf(" "));  //prints 6 becuz 1st double/tripple sapce occur

        // 5. WAP to format written statement in a letter
        String letter2 = "Dear BTS, ARMYs all around the world loves you and will wait. We will have a alot of fun when we'll reunite. Thank you Love ARMY";
        System.out.println(letter);
        System.out.println("Dear BTS, \n\tARMYs all around the world loves you and will wait. We will have a alot of fun when we'll reunite. \n\tThank you \n\tLove ARMY");
        System.out.println(letter2);

    }
}