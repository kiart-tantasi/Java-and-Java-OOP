package demo.packaging.utils;

public class ArgsLogger {
    public static void logArgs(String[] args) {
        if (args.length == 0) {
            System.out.println("Forgot to give me something ?");
            return;
        }

        for (String arg : args) {
            System.out.println("arg: " + arg);
        }
    }
}
