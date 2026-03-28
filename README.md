# Goodluck to anyone taking this upcoming java cert!

## Feel free to use/fork my notesz

## 1. Good practice about user input
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

## 2. Faster print
```java
import static java.lang.System.out;

out.println("Hello, You!"); // this will work
```

## 3. Use "ESC" if CodeChum suggest keyword you don't want (Leads to faster type)

## 4. To make all files fit inside Main.java file, Make the other class package-private

 
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


## 5. FileWriter vs BufferedWriter?
FileWriter: Writes directly to file, character by character.
BufferedWriter: Uses internal buffer (8KB default), writes in chunks.

### In practice: No difference in output. 
FileWriter is simpler for single writes.
BufferedWriter is faster for many writes (e.g., loops, large data). 

### Both work with \n:
FileWriter → write("text\n")
BufferedWriter → write("text\n") or newLine()