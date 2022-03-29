package oop;

public class MyEnum {
    enum DemoEnum {
        FIRST(1),
        SECOND(2),
        THIRD(3);

        private int number;

        private DemoEnum(int number) {
            this.number = number;
        }
    }

    public static void main(String[] args) {
        for (DemoEnum demoEnum: DemoEnum.values()) {
            System.out.println("Looping: " + demoEnum + " - " + demoEnum.number);
        }

        DemoEnum one = DemoEnum.FIRST;
        System.out.println("\n" + one + " " + one.number);
    }
}
