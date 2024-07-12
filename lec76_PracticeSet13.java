package PracticeSet;

class GM extends Thread{
    public void run() {
        int i=0;
        while(i<10) {
            System.out.println("Good Morning");
            i++;
        }
    }
}
class Welcome extends Thread{
    public void run() {
        int i=0;
        while(i<10) {
            try {
                Thread.sleep(200);
            } catch (Exception e) {
                System.out.println(e);
            }
        System.out.println("Welcome");
        i++;
        }
    }
}

public class lec76_PracticeSet13 {
    public static void main(String[] args) {

    // 1. WAP to print GM and Welcome continuously using Threads. 
    // 2. Add a sleep method in welcome threadof 200ms
    // 3. Demonstrate getPriority() and setPriority() methods
    // 4. How do you get state of a given thread in java
    // 5. how do you get reference to the current thread
        GM gm = new GM();
        Welcome welcome = new Welcome();
        //gm.start();
        //welcome.start();
        gm.setPriority(7);
        welcome.setPriority(3);
        System.out.println(gm.getPriority());
        System.out.println(welcome.getPriority());
        System.out.println(gm.getState());
        System.out.println(welcome.getState()); 
        System.out.println(Thread.currentThread().getState());       
    }
}
