package sample_problems.strings;

import java.util.*;

public class sort_each_word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[] words = text.split(" ");

        for (int i = 0; i < words.length; i++) {
            char[] chars = words[i].toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);
            System.out.print(sortedWord + " ");
        }
        sc.close();
    }
}

/*
Arrays.sort() can sort:

char[]	Arrays.sort(charArray)
int[]	Arrays.sort(intArray)
double[]	Arrays.sort(doubleArray)
String[]	Arrays.sort(stringArray) - sorts alphabetically
Object[]	Arrays.sort(objectArray) - needs Comparable

 */