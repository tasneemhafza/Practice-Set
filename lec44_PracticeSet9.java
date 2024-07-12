package PracticeSet;
//Ques 1
class myCylinder{
    private int radius;
    private int height;
// Ques 3
    public myCylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }
//----ques 3
    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
//Ques 2
    public double surfaceArea(){
        return 2*3.14* radius * radius + 2*3.14*radius*height;
    }
    public double volume(){
        return Math.PI* radius * radius * height;
    }

}
//-----
//Ques 4
class Rectangle{
    private int length;
    private int breadth;

    public Rectangle() {
        this.length = 4;
        this.breadth = 5;
    }
    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}


public class lec44_PracticeSet9 {
    public static void main(String[] args) {
        // 1. Create a class Cylinder and use getter and setter to set its radius and height
        myCylinder Cylinder = new myCylinder(9, 12);
        Cylinder.setHeight(12);
        System.out.println(Cylinder.getHeight());
        Cylinder.setRadius(9);
        System.out.println(Cylinder.getRadius());

        // 2. use 1 to calculate its surface area and vol
        System.out.println(Cylinder.surfaceArea());
        System.out.println(Cylinder.volume());

        // 3. Use a constructor and repeat
        //myCylinder Cylinder = new myCylinder(9, 12);

        // 4. Overloar a constructor used to initialize a rectangle of lenght 4 and breadth 5 for using custom parameters
        Rectangle r = new Rectangle(12, 56);
        System.out.println(r.getLength());
        System.out.println(r.getBreadth());

    }
    
}
