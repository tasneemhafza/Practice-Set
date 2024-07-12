package PracticeSet;
/*
 Q 1- Create javadoc from a java program using and without usoing vs code
 Q 2- Create a class and add a method with deprecated annotation 
 Q 3- Supress the warning from Q 2
 Q 4- Create an interface and generate an instance from it
 Q 5- Wap to generate table of a given no. and write it to a file
 Q 6- Repeat Q 5 with no. from 2-9 and save all these table to a file 
 */

 import java.io.FileWriter;
import java.io.IOException;

class MyDeprecated{
    @Deprecated
    void meth1(){
        System.out.println("I am method 1");
    }
}

interface MyInt{
    void display();
}

public class lec112_PracticeSet16 {
    public static void main(String[] args) {
        // @SuppressWarnings ("deprecation")
        MyDeprecated d = new MyDeprecated();
       d.meth1();
       MyInt i = () -> System.out.println("I am display");

        int i1 = 19;
        String table = "";
        for (int j = 0; j < 10; j++) {
            table += i + "X"+(j+1) + "=" + i1*(j+1);
            table += "\n";
        }
        try {
            FileWriter fileWriter = new FileWriter("MultiplicationTable.txt");
            fileWriter.write(table);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
