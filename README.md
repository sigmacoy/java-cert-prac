# Tips

## 1.
```java
sc.nextLine(); // clear bufferr
``` 
### After nextInt(), nextDouble(), next() → add sc.nextLine() to clear buffer
### Even:
### char answer = Character.toUpperCase(sc.next().charAt(0));
```java
Scanner sc = new Scanner(System.in);
System.out.print("Enter age: ");
int age = sc.nextInt();           
sc.nextLine();
System.out.print("Enter name: ");
String name = sc.nextLine();      
```

## 2. 
```java
import static java.lang.System.out;
import java.util.*;
import java.io.*;
```

## 3. 
Use "ESC" if CodeChum suggest keyword you don't want (Leads to faster type)

## 4. 
To make all files fit inside Main.java file
Make the other class package-private 
### So instead of:
```java
public class Main {
    ...
}
public class Animal {
    ...
}
```
### Make it:
```java
public class Main {
    ...
}
class Animal {
    ...
}
```


## 5. 
