import oop.MySubClass;

public class App {
    public static void main(String[] args) {
        int[] numArray = Array.getNumArray();

        // Scanner
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Your name: ");
//        String nameInput = scanner.nextLine();
//        System.out.println("Welcome " + nameInput + " !");

        // for loop
//        for (int i = 0; i < numArray.length; i++) {
//            System.out.println(numArray[i]);
//        }

        // for each loop
//        for (int num: numArray) {
//            System.out.println(String.valueOf(num));
//        }

        // find max of array
//        int max = numArray[0];
//        for (int i = 1; i < numArray.length; i++) {
//            max = Math.max(max, numArray[i]);
//        }
//        System.out.println("MAX: ".concat(String.valueOf(max)));

        // find max of array (for each loop)
//        int max = numArray[0];
//        for (int num: numArray) {
//            max = Math.max(max, num);
//        }
//        System.out.println("MAX by For Each Loop: " + String.valueOf(max));

        //MultiDimensional Array + Double Loop (Big O of (N * M))
//        for (int[] arr: Array.multiNumArray) {
//            System.out.println("one dimensional array:" + arr);
//            for (int num: arr) {
//                System.out.println("NUMBER:" + num);
//            }
//        }

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
