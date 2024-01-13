Steps to compile to jar file

1. Compile .java to .class

At project root

```
javac demo/packaging/App.java
```

2. Package .class files into .jar file

At project root

```
jar cfmv app.jar demo/manifest.txt demo/packaging/*
```

3. Run app

At root project

```
java -jar app.jar HelloWorld
```
