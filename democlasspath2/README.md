# Store class files and Run java app at ~/classes

```
# create directory ~/classes
mkdir ~/classes

# compile java files
cd democlasspath2/app
javac -d ~/classes main/App.java

# run
CLASSPATH=~/classes java main.App

# or run
java -cp ~/classes main.App
```
