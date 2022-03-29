import oop.MySubClass;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int[] numArray = Array.getNumArray();

        // find max of array
//        int max = numArray[0];
//        for (int i = 1; i < numArray.length; i++) {
//            max = Math.max(max, numArray[i]);
//        }
//        System.out.println("MAX by For Loop: ".concat(String.valueOf(max)));

        // find max of array (for each loop)
//        int maxTwo = numArray[0];
//        for (int num: numArray) {
//            maxTwo = Math.max(maxTwo, num);
//        }
//        System.out.println("MAX by For Each Loop: " + String.valueOf(maxTwo));

        // Switch
//        Switch switcher = new Switch();
//        switcher.getSwitch(1);

        // Implementation of Interface
//        DemoImplementation myDemo = new DemoImplementation();
//        myDemo.setData("My name is 'Data' !");
//        System.out.println(myDemo.getData());

        // Subclass extending SuperClass
//        MySubClass mySubClass = new MySubClass();
//        mySubClass.doSomethingAbstract();
//        mySubClass.doSomething();
//        // public vs protected attributes
//        System.out.println(mySubClass.data);
//        mySubClass.showProtectedData(); // cannot access with 'mySubClass.protectedData'
    }
}
