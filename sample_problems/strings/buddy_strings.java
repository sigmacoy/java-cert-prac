package sample_problems.strings;

import java.util.Scanner;

public class buddy_strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string A: ");
        String a = sc.nextLine();
        System.out.print("Enter string B: ");
        String b = sc.nextLine();
        System.out.println(buddy(a, b));
        sc.close();
    }
    public static boolean buddy(String a, String b){
        char[] s = a.toCharArray();
        char[] t = b.toCharArray();
        for(int i = 0; i < a.length(); i++){
            if(s[i] != t[i]){
                for(int j = i + 1; j < a.length(); j++){
                    if(s[j] != t[j]){
                        char tmp = s[j];
                        s[j] = s[i];
                        s[i] = tmp;
                        if(String.copyValueOf(s).equals(b))
                            return true;
                        else {
                            s = a.toCharArray();
                        }
                    }
                }
            }
        }
        return false;
    }
}
