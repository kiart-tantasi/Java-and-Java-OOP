package demo.packaging;

import demo.packaging.utils.ArgsLogger;

// to package: `javac demo/packaging/App.java`
public class App {

    public static void main(String[] args) {
        ArgsLogger.logArgs(args);
    }
}
