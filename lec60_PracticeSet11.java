package PracticeSet;

abstract class Pen{
    abstract void write();
    abstract void refill(); //can only create a method...cause abstract class dont specify a body
}
class FountainPen extends Pen{
    void write() {  //dont use abstract here again just void
        System.out.println("Writing...");
    }
    void refill() {
        System.out.println("Refilling...");
    }
    public void changeNib() {
        System.out.println("Changing the nib...");
    }
}

class Monkey {
    void jump() {
        System.out.println("Jumping...");
    }
    public void bite() {
        System.out.println("Biting...");
    }
}
interface BasicAnimals {
    void eat(); //orignally an astract class...
    void sleep();
}
interface Dog {
    void bark();
}

class Human extends Monkey implements BasicAnimals, Dog {
    void speak() {
        System.out.println("Can speak...");
    }
    //@Override -->defining basicanimals methods
    public void eat() {  //adding public  is important
        System.out.println("Eating...");
    }
    public void sleep() {
        System.out.println("Sleeping...");
    }
    public void bark() {
        System.out.println("Barking...");
    }
}

abstract class Telephone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}
interface Camera{
    void camera();
}
interface Google{
    void google();
}
class SmartPhone extends Telephone implements Camera, Google {
    void ring() {
        System.out.println("Ringing...");
    }
    void lift() {
        System.out.println("Lifting the phone...");
    }
    void disconnect(){
        System.out.println("Call Disconnected...");
    }
    public void camera() {
        System.out.println("Recoding in 4k...");
    }
    public void google() {
        System.out.println("Swipe left to use Google Search.");
    }
    public void call() {
        System.out.println("Calling...");
    }
}

interface SmartTVRemote{
    void playGames();
    void playNetflix();
}
interface TVRemote extends SmartTVRemote{
    void volume();
    void up();
    void down();
}
class Tv implements TVRemote {
    public void volume() {
        System.out.println("Press vol key for Volume up...");
    }
    public void up(){
        System.out.println("Press up button for next channels...");
    }
    public void down() {
        System.out.println("Press down button for previous channel...");
    }
    public void playGames() {
        System.out.println("Play games");
    }
    public void playNetflix() {
        System.out.println("Play Netflix");
    }
}


public class lec60_PracticeSet11 {
    public static void main(String[] args) {
        
        // 1. Create an abstract class pen with methods write() nad refill() as abstract methods
        // 2. use pen to create concrete class FountainPen with additional method changeNib()
        FountainPen pen = new FountainPen();
        pen.write();
        pen.refill();
        pen.changeNib();

        // 3. Create a class Monkey with jump() and bite() methods. Create a class human which inherits this Monkey and BasicAnimals interface with eat() and sleep
        Human Tasneem = new Human();
        Tasneem.speak();
        // Tasneem.jump(); //can use parent class methods

        // // 5. Use Q.3 to demonstrate polymorphism using monkey class 
        Monkey monkey = new Human();
        monkey.jump();
        // // monkey.speak(); //cannot use this method as its not defined under Monkey
        // // monkey.sleep(); //tho human obj is created but the reference is monkey
        BasicAnimals puppy = new Human();
        puppy.sleep();
            

        // 4. Create a class Telephone withb ring(), lift(), and disconnect() methods as abstract methods. Create another class 
        // SmartPhone and demonstrate polymorphism
        //Dont know why only this one gives error
        // SmartPhone ph = new SmartPhone(); //should use telephone to show polymorphism but gives error
        // ph.ring();
        // ph.call(); // cannot call the 'call()' method.
        // Camera cam = new SmartPhone();
        // cam.camera(); //can use only this one

        // 6. Create an interface TVRemote and use it to input another interface SmartTvRemote
        // 7. Create a class TV which uses TVRemote interface
        Tv tv = new Tv();
        TVRemote remote = new Tv(); //tv can only use tvremote functions
        tv.playGames();
        remote.volume();
}
}

