package com.example;

public class MySwitchStatement {

    public void getSwitch(int num) {
        switch (num) {
            case 0:
                System.out.println("This is 0.");
                break;
            case 1:
                System.out.println("This is 1 (no break test).");
            case 2:
                System.out.println("This is 2.");
                break;
            case 3:
                System.out.println("This is 3.");
                break;
            default:
                System.out.println("default case");
        }
    }

    public static void main(String[] args) {
        // Switch
        MySwitchStatement switcher = new MySwitchStatement();
        switcher.getSwitch(1);
    }

}
