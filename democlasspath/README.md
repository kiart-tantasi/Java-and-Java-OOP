
# Pre-requisite
Compile java files
```
cd democlasspath/app
javac main/App.java
```

# Correct
```
CLASSPATH=<where you put project>/learning-java/democlasspath/app java main.App
```

# Incorrect
```
CLASSPATH=<where you put project>/learning-java/democlasspath/app/main java main.App
```
or
```
CLASSPATH=<where you put project>/learning-java/democlasspath java main.App
```
