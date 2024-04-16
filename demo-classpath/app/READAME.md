
# Pre-requisite
Compile java files
```
cd demo-classpath/app
javac main/App.java
```

# Correct
```
CLASSPATH=<where you put project>/learning-java/demo-classpath/app java main.App
```

# Incorrect
```
CLASSPATH=<where you put project>/learning-java/demo-classpath/app/main java main.App
```
or
```
CLASSPATH=<where you put project>/learning-java/demo-classpath java main.App
```
