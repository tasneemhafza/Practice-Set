package PracticeSet;
//1. Create a class with following methods and properties
//always sone error...tired of it
/*class Employee {
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }
}

public class lec39_PracticeSet8 {
    public static void main(String[] args) {
        // Problem 1
        Employee harry = new Employee();
        harry.setName("CodeWithHarry");
        harry.salary = 233;
        System.out.println(harry.getSalary());
        System.out.println(harry.getName());
    }
}
*/


//2. Create a class cellphone with method "ringing" , "vibrating" etc
/* class Cellphone{
    public void ringing() {
        System.out.println("Ringing...");
    }
    public void vibrating() {
        System.out.println("Vibrating...");
    }
    public void callFriend() {
        System.out.println("Calling a friend...");
    }
    
}
public class lec39_PracticeSet8 {
    public static void main(String[] args) {
        Cellphone note12 = new Cellphone();
        note12.callFriend();
        note12.ringing();
        note12.vibrating();
    }
}
*/

// 3. Create a class Rectangle with a method to initialize its size , calculating area, perimeter etc
/* class square{
    float side;
    public float area() {
        return side * side;
    }
    public float peri() {
        return 4*side;
    }
}
public class lec39_PracticeSet8 {
    public static void main(String[] args) {
        square sq = new square();
        sq.side = 4;

        System.out.println("The area is: " +sq.area());
        System.out.println("The perimeter is: " + sq.peri());
    }
}
*/

// 4. Create a class Rectangle 8 repeat ques no. 3
/* class Rectangle{
    float length;
    float breadth;
    public float area() {
        return length * breadth;
    }
    public float peri() {
        return 2*(length+breadth);
    }
}
public class lec39_PracticeSet8 {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        rec.length = 4;
        rec.breadth = 6;

        System.out.println("The area is: " +rec.area());
        System.out.println("The perimeter is: " + rec.peri());
    }
}
*/

// 5. Create a class TommyVecetti for Rockstar Games capable of hittng(print hitting), running, firing, etc
/* class Tommy{
    public void hit(){
        System.out.println("Hitting the enemy");
    }
    public void run(){
        System.out.println("Running from the enemy");
    }
    public void fire(){
        System.out.println("Firing on the enemy");
    }
}
public class lec39_PracticeSet8 {
    public static void main(String[] args) {
        Tommy player1 = new Tommy();
        player1.fire();
        player1.run();
        player1.hit();

    }
}
*/

// 6. Repeat ques no. 3 for a circle
class circle{
    float radius;
    public float area() {
        return 3.14f*radius*radius;
    }
    public float cir() {
        return 2*3.14f*radius;
    }
}
public class lec39_PracticeSet8 {
    public static void main(String[] args) {
        circle circle = new circle();
        circle.radius = 7;

        System.out.println("The area is: " +circle.area());
        System.out.println("The perimeter is: " + circle.cir());
    }
}