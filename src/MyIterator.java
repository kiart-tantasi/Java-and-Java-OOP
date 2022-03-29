import java.util.ArrayList;
import java.util.Iterator;

public class MyIterator {
    public static void main(String[] args) {

        ArrayList<String> animalArray = new ArrayList<>();

        animalArray.add("Dog");
        animalArray.add("Cat");
        animalArray.add("Turtle");

        Iterator<String> myIterator = animalArray.iterator();

        // Looping
//        while (myIterator.hasNext()) {
//            System.out.println(myIterator.next());
//        }

        System.out.println("\nBefore remove 'Cat': " + animalArray);

        while (myIterator.hasNext()) {
            String element = myIterator.next();
            if (element == "Cat") {
                myIterator.remove();
            }
        }
        System.out.println("After remove 'Cat': " + animalArray);

        // regular loop
        ArrayList<String> animalArrayTwo = new ArrayList<>();
        animalArrayTwo.add("Dog");
        animalArrayTwo.add("Cat");
        animalArrayTwo.add("Turtle");

        for (int i = 0; i < animalArrayTwo.size(); i++) {
            if (animalArrayTwo.get(i) == "Cat") {
                System.out.println("\nbefore deleting 'Cat' with for loop: " + animalArrayTwo);
                animalArrayTwo.remove(i);
                System.out.println("after deleting 'Cat' with for loop: " + animalArrayTwo + "\n");
            }
        }

    }
}
