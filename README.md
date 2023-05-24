# JaPy Library (English)
[中文版本](README_zh.md)

JaPy is a simple library that facilitates Java-Python features.

Currently, only the printing function has been developed, providing a neat way to print various types of Java objects, such as integers, characters, strings, arrays, and lists.
Helping beginners and users who often use print to debug code easily achieve their goals.

## Print Function

- Print basic data types such as strings, characters, integers
- Print arrays of strings, characters, integers
- Print lists

## How to use

### Add jar file

1. Download the [JaPy-1.0-SNAPSHOT.jar](target/JaPy-1.0-SNAPSHOT.jar) file.
2. Copy the downloaded jar file to the `libs` directory of the project (if there is no such directory, create one).
3. In IntelliJ IDEA, you can add this jar to the classpath of the project by the following steps:
   - Right-click on the project -> Open Module Settings
   - Select Modules from the left menu
   - Select the Dependencies tab in the right panel
   - Click "+" and then select "JARs or directories..."
   - Select the jar file and click OK

The jar file has been added to the classpath of the project and can be referenced directly.

Here are some simple examples of import and print results:

```java
import static JaPy.Print.*;

public class Main {
    public static void main(String[] args){
        printHello();
        String greetings = "Hello, world!";
        print(greetings);
        print(new int[]{1, 2, 3});
        print(new char[]{'a', 'b', 'c'});
        print(new String[]{"How","are","you?"});
        Object[] arr = new Object[] {
                new int[]{1,2,3},
                new char[]{'a', 'b', 'c'},
                new String[]{"I","am","good!"}
        };
        print(greetings,arr[2]);
    }
}

```
```
Hello, please enjoy easy Print!
How are you? 
I am good! :) 
Hello, world! 
```

