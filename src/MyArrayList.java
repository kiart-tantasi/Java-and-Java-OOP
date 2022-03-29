import java.util.ArrayList;
import java.util.Collections;

public class MyArrayList {
    public static void main(String[] args) {

        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("dog");
        stringArrayList.add("cat");
        stringArrayList.add("something else");

        // for
        for (int i = 0; i < stringArrayList.size(); i++) {
            System.out.println("For Loop: " + stringArrayList.get(i));
        }

        System.out.println("\n");

        // for each
        for (String str: stringArrayList) {
            System.out.println("For Each Loop: " + str);
        }

        System.out.println("\n" + stringArrayList.get(0));
        stringArrayList.set(0, "This item was changed");
        System.out.println(stringArrayList.get(0));

        java.util.ArrayList<String> integerArrayList = new java.util.ArrayList<>();
        integerArrayList.add("Front");
        integerArrayList.add("Middle");
        integerArrayList.add("Back");
        System.out.println("\nbefore item idx 0 deleted: " + integerArrayList.get(0));
        integerArrayList.remove(0);
        System.out.println("after item idx 0 deleted: " + integerArrayList.get(0));

        System.out.println("\nbefore clear: " + integerArrayList);
        System.out.println("size before clear: " + integerArrayList.size());
        integerArrayList.clear();
        System.out.println("after clear: " + integerArrayList);
        System.out.println("size after clear: " + integerArrayList.size());

        // sort
        ArrayList<Integer> integerArrayList1 = new ArrayList<>();
        integerArrayList1.add(5);
        integerArrayList1.add(1);
        integerArrayList1.add(3);

        System.out.println("\nbefore sorting: " + integerArrayList1);
        Collections.sort(integerArrayList1);
        System.out.println("after sorting: " + integerArrayList1);
    }
}
