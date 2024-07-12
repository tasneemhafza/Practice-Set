package PracticeSet;

// //-->ERROR but same thing runs in Online gdb and chatgpt


// class circle1 {
//     public double radius;

//     circle1() {
//         System.out.println("I'm super-class empty constructor.");
//     }

//     circle1(double r) {
//         System.out.println("The radius is: " + r);
//         this.radius = r;
//     }

//     public double area() {
//         System.out.print("The area of the circle1 is: ");
//         return Math.PI * this.radius * this.radius;
//     }
// }

// class Cylinder extends circle1 {
//     public double height; // Changed int to double

//     Cylinder() {
//         super(); //adding super() bcuz its giving error-->the circle1 class has a constructor that takes no arguments (circle1()), and the Cylinder class does not have a corresponding 
//                 //constructor to call the parent class constructor. To resolve this error, you should add a constructor in the Cylinder class that explicitly calls the superclass constructor using super():
//         System.out.println("I'm sub-class empty constructor.");
//     }

//     Cylinder(double r, double h) {
//         super(r);
//         this.height = h;
//         System.out.println("The height of the cylinder is: "+height);
//     }

//     public double volume() {
//         System.out.print("The Volume is: ");
//         return Math.PI * this.radius * this.radius * height;
//     }
// }



// public class lec52_PracticeSet10 {
//     public static void main(String[] args) {

//         // 1. Create a class circle1 and use inheritance to create another class cylinder from it.
//         // 3. Create methods for area and volume resp. in ques 1
//         circle1 obj1 = new circle1();
//         System.out.println(obj1.area());
//         Cylinder obj2 = new Cylinder(7, 14);
//         System.out.println(obj2.volume());

//         // 2. Create a class rectangle and use inheritance to create another class cuboid.
//         // 4. create methods for area and volume in ques 2. also create getter and setters
//     }
// }

//CWH's

class Circle1 {
    private double radius;

    Circle1() {
        System.out.println("I'm super-class empty constructor.");
    }

    Circle1(double r) {
        System.out.println("The radius is: " + r);
        this.radius = r;
    }

    public double area() {
        System.out.println("The area of the circle1 is: ");
        return Math.PI * this.radius * this.radius;
    }

    // Getter and Setter for radius (encapsulation)
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}

class Cylinder extends Circle1 {
    private double height;

    Cylinder() {
        super(); // Call the superclass constructor to initialize the radius
        System.out.println("I'm sub-class empty constructor.");
    }

    Cylinder(double r, double h) {
        super(r);
        this.height = h;
        System.out.println("The height of the cylinder is: " + height);
    }

    public double volume() {
        System.out.println("The Volume is: ");
        return Math.PI * this.getRadius() * this.getRadius() * height;
    }

    // Getter and Setter for height (encapsulation)
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


public class lec52_PracticeSet10 {
    
    public static void main(String[] args) {
        Circle1 obj1 = new Circle1();
        System.out.println(obj1.area());

        Cylinder obj2 = new Cylinder(7, 14);
        System.out.println(obj2.volume());
    }
}
}
