public class CharacterMethods {
    public static void main(String[] args) {
        
    }
}



// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
// CHARACTER CLASS BASICS

// Character is a wrapper class for primitive char
// char primitive vs Character object
    // char c = 'A';                    // Primitive
    // Character ch = 'A';              // Autoboxing
    // char primitive = ch;             // Auto-unboxing



// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
// CONSTRUCTORS AND VALUE OF

// Character(char value)         Constructor (deprecated in Java 9+)
// Character.valueOf(char c)     Returns Character instance (preferred)
    // Character ch = Character.valueOf('A');




// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~    
// CATEGORY CHECKING METHODS (Most commonly used)

// Character.isLetter(ch)              Checks if character is a letter
// Character.isDigit(ch)               Checks if character is a digit (0-9)
// Character.isLetterOrDigit(ch)       Checks if character is letter or digit
// Character.isWhitespace(ch)          Checks if character is whitespace (space, tab, newline, etc.)
// Character.isSpaceChar(ch)           Checks if character is Unicode space character
// Character.isUpperCase(ch)           Checks if character is uppercase
// Character.isLowerCase(ch)           Checks if character is lowercase
// Character.isAlphabetic(ch)          Checks if character is alphabetic (Unicode-aware, Java 7+)
    // if(Character.isLetter('A'))           // true
    // if(Character.isDigit('5'))            // true
    // if(Character.isWhitespace(' '))       // true
    // if(Character.isUpperCase('Z'))        // true




// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
// CASE CONVERSION METHODS

// Character.toUpperCase(ch)           Converts character to uppercase
// Character.toLowerCase(ch)           Converts character to lowercase
// Character.toTitleCase(ch)           Converts to title case (used for Unicode)
    // char upper = Character.toUpperCase('a');    // 'A'
    // char lower = Character.toLowerCase('Z');    // 'z'





// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
// NUMERIC CONVERSION METHODS

// Character.digit(ch, radix)          Returns numeric value of digit in specified radix
// Character.forDigit(digit, radix)    Returns character representation of digit in radix
// Character.getNumericValue(ch)       Returns Unicode numeric value of character
    // int val = Character.digit('F', 16);         // 15 (hexadecimal)
    // char hexChar = Character.forDigit(15, 16);  // 'F'
    // int numVal = Character.getNumericValue('Ⅻ'); // 12 (Roman numeral)




// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
// COMPARISON METHODS

// Character.compare(char x, char y)   Compares two characters numerically
// Character.equals(Object obj)        Compares Character objects (overrides Object.equals)
    // if(Character.compare('a', 'b') < 0)    // 'a' comes before 'b'
    // Character ch1 = 'A', ch2 = 'A';
    // if(ch1.equals(ch2))                   // true


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

// IMPORTANT NOTES:

// 1. Character methods are static - call them with Character.methodName()
// 2. Primitive char can be automatically boxed to Character
// 3. Character is immutable like all wrapper classes

// QUICK REFERENCE TABLE:
// Character.isLetter(ch)           -> Letters (a-z, A-Z, and Unicode letters)
// Character.isDigit(ch)            -> Numbers 0-9
// Character.isLetterOrDigit(ch)    -> Letters OR digits
// Character.isWhitespace(ch)       -> Space, tab, newline, etc.
// Character.isUpperCase(ch)        -> A-Z and Unicode uppercase
// Character.isLowerCase(ch)        -> a-z and Unicode lowercase
// Character.toUpperCase(ch)        -> Convert to uppercase
// Character.toLowerCase(ch)        -> Convert to lowercase
// Character.digit(ch)              -> Convert char to int value in given base
// Character.forDigit(ch)           -> Convert int to char in given base