package sample_problems.strings;

import java.util.*;

public class anagrammer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string 1: ");
        String s1 = sc.nextLine();

        System.out.print("Enter string 2: ");
        String s2 = sc.nextLine();

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (char c : s1.toCharArray()) {
            if (Character.isLetter(c)) {
                c = Character.toLowerCase(c);
                if (map1.containsKey(c)) {
                    map1.put(c, map1.get(c) + 1);
                } else {
                    map1.put(c, 1);
                }
            }
        }

        for (char c : s2.toCharArray()) {
            if (Character.isLetter(c)) {
                c = Character.toLowerCase(c);
                if (map2.containsKey(c)) {
                    map2.put(c, map2.get(c) + 1);
                } else {
                    map2.put(c, 1);
                }
            }
        }

        if (map1.equals(map2))
            System.out.println("\"" + s1 + "\" and \"" + s2 + "\" are anagrams.");
        else
            System.out.println("\"" + s1 + "\" and \"" + s2 + "\" are not anagrams.");

        sc.close();
    }
}