public class MyMath {
    public static void main(String[] args) {

        int[] numArray = { 45, 99, 59, 2, 30 };

        // MAX
        int max = numArray[0];
        for (int num : numArray) {
            max = Math.max(max, num);
        }
        System.out.println("MAX: " + max);

        // MIN
        int min = numArray[0];
        for (int num : numArray) {
            // if (num < min) min = num;
            min = Math.min(min, num);
        }
        System.out.println("MIN: " + min);

        // FLOOR
        double doubleNum = 3.78;
        System.out.println("\nFloor of double '3.78' is '" + Math.floor(doubleNum) + "'");
        // float floatNum = 3.78f;
        // System.out.println("\nFloor of float '3.78' is '" + Math.floor(floatNum) +
        // "'"); // <-- the type of Math.floor()'s result is going to be double.

        // CEIL (opposite to floor)
        double toCeil = 2.1;
        double ceiled = Math.ceil(toCeil); // 3.0 (double)

        // RANDOM
        double randomNum = Math.random();
        System.out.println("\nMath.random(): " + randomNum);
        System.out.println("Math.random()*11: " + (randomNum * 11));
        System.out.println("(int) Math.random()*11: " + (int) (randomNum * 11));
        System.out.println("Math.floor(Math.random()*11): " + Math.floor(randomNum * 11));

        // ROUND
        System.out.println("\nrounding 1.1: " + Math.round(1.1));
        System.out.println("rounding 1.5: " + Math.round(1.5));

    }
}

// Typetester from
// https://stackoverflow.com/questions/3993982/how-to-check-type-of-variable-in-java
// class Typetester {
// void printType(byte x) {
// System.out.println(x + " is an byte");
// }
// void printType(int x) {
// System.out.println(x + " is an int");
// }
// void printType(float x) {
// System.out.println(x + " is an float");
// }
// void printType(double x) {
// System.out.println(x + " is an double");
// }
// void printType(char x) {
// System.out.println(x + " is an char");
// }
// }
