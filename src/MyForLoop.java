public class MyForLoop {
    public static void main(String[] args) {
        int[] numArray = MyArray.getNumArray();

        // for loop
        for (int i = 0; i < numArray.length; i++) {
            System.out.println("For Loop: " + numArray[i]);
        }

         // for each loop
        for (int num: numArray) {
            System.out.println("For Each Loop: " + num);
        }

        //MultiDimensional Array + Double Loop (Big O of (N * M))
        for (int[] arr: MyArray.multiNumArray) {
            System.out.println("one dimensional array:" + arr);
            for (int num: arr) {
                System.out.println("NUMBER:" + num);
            }
        }
    }
}
