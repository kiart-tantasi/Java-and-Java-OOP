public class MyEquals {

    public static void main(String[] args) {

        Rabbit obj1 = new Rabbit();
        Rabbit obj2 = new Rabbit();

        System.out.println("\"obj1 == obj2 \": " + (obj1 == obj2));

        System.out.println("\n");

        System.out.println("\"obj1.equals(obj2)\": " + obj1.equals(obj2));

        System.out.println("\n");

        System.out.println("\"obj1.equals(obj2) (override default .equals())\": " + obj1.equals(obj2));

        System.out.println("\n");

        int int1 = 1;
        int int2 = 1;
        System.out.println("\"int1 === int2\": " + (int1 == int2));

        System.out.println("\n");

        Integer integer1 = 1;
        Integer integer2 = 1;
        System.out.println("\"Integer1 === Integer2\": " + (integer1 == integer2));
        System.out.println("\"integer1.equals(integer2)\": " + integer1.equals(integer2));
    }
}

class Rabbit {
    public String name;

    public Rabbit() {
    }

    public boolean equals(Object object) {
        if (object instanceof Rabbit) {
            return true;
        } else return false;
    }
}
