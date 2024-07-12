package PracticeSet;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class lec102_PracticeSet15 {
    public static void main(String[] args) {
        // 1. Create an arraylist and store names of 10 students inside it. print it using a for each loop

        // 2. Use date calss in java to rpint time in this format (21:47:02)

        // 3. repeat 2 using Calendar class

        // 4. repeat 2 using java.time API

        // 5. create a set in java. try to store duplicate elements inside this set and verify that only one instance is stored

        // 1.
        ArrayList<String> ar = new ArrayList<>(5);
        ar.add("Tasneem");
        ar.add("BTS");
        ar.add("ARMY");
        ar.add("Namjoon");
        ar.add("Seokjin");
        ar.add("Yoongi");
        ar.add("Hoseok");
        ar.add("Jimin");
        ar.add("Taehyung");
        ar.add("Jungkook");
        for(Object e: ar) {  //not element
            System.out.println(e);
        }

        // 2. 
        Date d = new Date();
        //System.out.println("Using Date class:- "+d.getHours()+":"+d.getMinutes()+":"+d.getSeconds());
        System.out.println(d.getTime());

        // 3.
        Calendar c = Calendar.getInstance();
        System.out.println("Using Calendar class:- "+c.get(Calendar.HOUR)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));

        // 4. 
        LocalDateTime dt = LocalDateTime.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("H:m:s");
        String mydate = dt.format(df);
        System.out.println("Using Time API:-" +mydate);

        // 5. 
        //hashset set becuz set is an abstract class
        HashSet<Integer> hs = new HashSet<>(0, 0.5f);
        hs.add(5);
        hs.add(10);
        hs.add(15);
        hs.add(5);
        hs.add(20);
        System.out.println(hs); //Only one 5 will be printed


    }
}

