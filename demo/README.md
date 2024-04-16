Steps to compile to jar file

1. Compile .java to .class
    ```
    javac demo/packaging/App.java
    ```

2. Package .class files into .jar file
    ```
    jar cfmv app.jar demo/manifest.txt demo/packaging/*
    ```

3. Run app
    ```
    java -jar app.jar HelloWorld
    ```

NOTE: run these commands at project root for correct classpath
