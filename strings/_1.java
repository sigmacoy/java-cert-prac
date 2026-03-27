package strings;

public class _1 {
    public static void main(String[] args) {
        // 1. Get Character at Index k
        String str1 = "Macoy";
        int k = 1;
        System.out.println(str1.charAt(k)); // a

        // 2. .compareTo


        // 3. Case-Insensitive String Comparison
        String str2 = "Jelian";
        int result = str1.compareToIgnoreCase(str2); 
            // 0 is equal
            // -1 is 
            // 1 is 
        
        // 4. Concatenate string
        // String str = str1.concat(str2)
        
        // 5. Contains Specified Sequence
        str1 = "Jelian and Macoy";
        str2 = "and";
        System.out.println(str1.contains(str2)); // true
        

        /*
        
        CharSequence (interface)
        ├── String (implements)
        ├── StringBuffer (implements)
        ├── StringBuilder (implements)
        └── CharBuffer (implements)
        
        */


        // 6. Compare with StringBuffer and CharSequence
        str1 = "example.com";
        str2 = "Example.com";
        StringBuffer strbuf = new StringBuffer(str1);
        System.out.println(str1.contentEquals(strbuf)); // true
        System.out.println(str2.contentEquals(strbuf)); // false
        
        // 7. String from Character Array
        char[] arr_num = new char[] { '1', '2', '3', '4' };
        String str = String.copyValueOf(arr_num, 1, 3);
        System.out.println(str + " pages."); // 234 pages.

        // 8. Ends With Substring: boolean x = str1.endsWith(end_str) 

        // 9. String object .equals

        // 10. .equalsIgnoreCase

        // 11. .length()

        // 12. Replace Character
        str = "dog";
        System.out.println(str.replace('d', 'f')); // fog

        // 13. Replace Substring with Regex
        str = "Macoy Jelian Macoy";
        System.out.println(str.replaceAll("Macoy", "Love")); // Love Jelian Love

        // 14. Starts With Substring
        str1 = "Red is favorite color.";
        String startStr = "Red";
        String[] words = str1.split(" ");
        if(words[0].equals(startStr)) System.out.println("Oo nag start sha og " + startStr);

        // 15. Get Substring by Position
        str = "Macoy Jelian Macoy";
        System.out.println( str.substring(6, 12) ); // Jelian 
        //                                  inclusive       exclusive

        // 16. Char Array from String
        str = "Macoy Jelian Macoy";
        char[] arr = str.toCharArray();
        System.out.println(arr);

        // 17. Convert String to Lowercase : .toLowerCase();

        // 18. .toUpperCase();

        // 19. Trim leading or trailing whitespace
        str = "     Macoy     Jelian     ";
        System.out.println( str.trim() ); // Macoy     Jelian

        // 20. Find the first occurrence of a specific character (or substring)
        str = "Macoy Jelian";
        int idx = str.indexOf("Macoy"); // 0
        idx = str.indexOf("J"); // 6

        // 21. Reverse a String
        str1 = "abc";
        String reversed = new StringBuilder(str1).reverse().toString();
        System.out.println(reversed); // Output: "cba"

        // 22. Remove 'a' from "abc":
        str1 = "abc";
        String resultStr = str1.replace("a", "");
        System.out.println(resultStr); // Output: "bc"
        
            // .replaceAll
        str1 = "abca";
        resultStr = str1.replaceAll("a", "");
        System.out.println(resultStr); // Output: "bc

        /*
            replace and replaceAll works for Strings also!
        */

        // 23. StringBuilder to string object
        StringBuilder sb = new StringBuilder("abc");
        str1 = sb.toString();  
        System.out.println(str1); // abc

        // 24. Swap Last Two Characters
        str1 = "Test";
        int len = str1.length();
        str2 = str1.substring(0, len - 2) + str1.charAt(len - 1) + str1.charAt(len - 2);
        System.out.println(str2); // Tets

        // 25. String to int, long, floating and double.
        /*
            .parseInt
            .parseLong
            .parseFloat
            .parseDouble
        */
       str1 = "12";
       int num = Integer.parseInt(str1);
       System.out.println(num); // 12


    }
}