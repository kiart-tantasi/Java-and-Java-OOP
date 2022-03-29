import java.util.ArrayList;
import java.util.function.Consumer;

public class MyLambda {
    public static void main(String[] args) {

        ArrayList<String> animalArrayList = new ArrayList<>();
        animalArrayList.add("Dog");
        animalArrayList.add("Cat");
        animalArrayList.add("Pig");

        animalArrayList.forEach(x -> System.out.println(".forEach(): " + x));

        System.out.println("\n");

        animalArrayList.forEach(x -> {
            System.out.println(".forEach() 2: " + x);
        });

        System.out.println("\n");

        Consumer<String> consumerLambdaMethod = (x) -> System.out.println("Consumer: " + x);
        animalArrayList.forEach(consumerLambdaMethod);

        System.out.println("\n");
        MyFunction sayHi = (str) -> System.out.println("Hi ! " + str + " How are you ?");
        sayHi.runFunction("David.");
    }
}

interface MyFunction {
    void runFunction(String str);
}
