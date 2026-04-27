package strings;

public class StringMethods {
    public static void main(String[] args) {
        
    }
}


// CHARACTER AND LENGTH METHODS

// .charAt(index)           Returns the character at the specified index
// .length()                Returns the length of the string
// .isEmpty()               Checks if the string is empty
// .isBlank()               Checks if the string is empty or contains only whitespace (Java 11+)

// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
// SUBSTRING METHODS

// .substring(beginIndex)           Returns substring from beginIndex to end
// .substring(beginIndex, endIndex) Returns substring from beginIndex to endIndex-1
    // String str = "Hello, World!";
    // String sub1 = str.substring(7);      // "World!" (from index 7 to end)
    // String sub2 = str.substring(0, 5);   // "Hello" (from index 0 to 4)


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
// SEARCH METHODS

// .indexOf(ch/str)           Returns index of first occurrence (-1 if not found)
// .indexOf(ch/str, fromIndex) Returns index starting from specified position
// .lastIndexOf(ch/str)       Returns index of last occurrence (-1 if not found)
// .contains(CharSequence)    Checks if string contains the specified sequence
    // if(str.indexOf("World") != -1)  // Check if contains
    // if(str.contains("World"))       // Simpler check


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
// CHECK PREFIX/SUFFIX

// .startsWith(prefix)        Checks if string starts with the specified prefix
// .endsWith(suffix)          Checks if string ends with the specified suffix
    // if(str.startsWith("Hello"))     // true if prefix
    // if(str.endsWith("!"))           // true if suffix


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
// REPLACEMENT METHODS

// .replace(oldChar, newChar)           Replaces all occurrences of a character
// .replace(CharSequence target, CharSequence replacement)  Replaces all substrings
// .replaceAll(regex, replacement)      Replaces using regular expression
// .replaceFirst(regex, replacement)    Replaces first occurrence using regex


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
// MODIFICATION METHODS (Strings are immutable, these return NEW strings)

// .concat(str)              Concatenates the specified string
// .toUpperCase()            Converts to uppercase
// .toLowerCase()            Converts to lowercase
// .trim()                   Removes leading and trailing whitespace
// .strip()                  Removes leading and trailing whitespace (Unicode-aware, Java 11+)
// .repeat(count)            Returns string repeated count times (Java 11+)
    // String str = "Hello";
    // String newStr = str.concat(" World");     // "Hello World"
    // String upper = str.toUpperCase();         // "HELLO"
    // String repeated = str.repeat(3);          // "HelloHelloHello"


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
// COMPARISON METHODS

// .equals(Object)            Compares strings for equality (case-sensitive)
// .equalsIgnoreCase(String)  Compares strings ignoring case
// .compareTo(String)         Compares lexicographically (returns int)
// .compareToIgnoreCase(String) Compares lexicographically ignoring case
    // if(str1.equals(str2))                    // Check equality
    // if(str1.equalsIgnoreCase(str2))          // Case-insensitive equality
    // int result = str1.compareTo(str2);       // 0 if equal, negative if less, positive if greater


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
// SPLITTING AND JOINING

// .split(regex)              Splits string into array of substrings
// .split(regex, limit)       Splits with limit on number of elements
// .join(delimiter, elements) Joins elements with delimiter (static method, Java 8+)
    // String[] words = str.split(" ");          // Split by space
    // String joined = String.join("-", "a", "b", "c");  // "a-b-c"



// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
// CONVERSION METHODS

// .toCharArray()             Converts string to character array
// .valueOf(anyType)          Static method to convert any type to string (similar to to_string)
    // String numStr = String.valueOf(123);       // "123"
    // char[] chars = "Hello".toCharArray();      // ['H','e','l','l','o']



// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
// STRING BUILDER (Mutable strings for efficient modification)

// StringBuilder sb = new StringBuilder("Hello");
// sb.append(" World");        // "Hello World"
// sb.insert(5, ",");          // "Hello, World"
// sb.delete(5, 6);            // Remove character at index 5
// sb.deleteCharAt(5);         // Remove character at specific index
// sb.reverse();               // Reverse the string
// sb.toString();              // Convert back to String
    // StringBuilder sb = new StringBuilder("world");
    // sb.insert(0, 'H');                // "Hworld"
    // sb.insert(0, "Hello ");           // "Hello Hworld"
    // String result = sb.toString();





    

// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


// IMPORTANT NOTES:
// 1. Strings in Java are IMMUTABLE - methods return NEW strings
// 2. Use StringBuilder for frequent modifications
// 3. Use .equals() not == for string comparison
// 4. indexOf() returns -1 if not found (similar to string::npos in C++)
// 5. substring() end index is EXCLUSIVE (up to but not including)

// COMMON PATTERNS:
// Check if substring exists:
    // if(str.contains(substring))
    // if(str.indexOf(substring) != -1)

// Check if prefix:
    // if(str.startsWith(prefix))

// Remove first character:
    // if(!str.isEmpty()) str = str.substring(1);

// Convert between String and int:
    // int num = Integer.parseInt("123");     // String to int
    // String numStr = String.valueOf(456);   // int to String
    // String numStr2 = Integer.toString(456); // Alternative

// Create string of repeated character:
    // String repeated = "L".repeat(5);       // "LLLLL" (Java 11+)
    // String repeated2 = new String(new char[5]).replace('\0', 'L'); // Pre-Java 11

// Reverse string:
    // String reversed = new StringBuilder(str).reverse().toString();