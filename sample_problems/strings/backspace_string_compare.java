package sample_problems.strings;

import java.util.Scanner;

public class backspace_string_compare {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter string s: ");
        String s = sc.nextLine();
        System.out.print("Enter string t: ");
        String t = sc.nextLine();
        String s1 = processString(s);
        String t1 = processString(t);
        System.out.print(s1.equals(t1));

        sc.close();
    }

    public static String processString(String str) {
        StringBuilder sb = new StringBuilder();
            for (int i = 0; i < str.length(); i++){
                if (str.charAt(i) != '#') {
                    sb.append (str. charAt(1));
                } else if (!sb.isEmpty()) {
                    sb.deleteCharAt(sb.length()-1);
                }
            }
        return sb.toString();
    }
}

        