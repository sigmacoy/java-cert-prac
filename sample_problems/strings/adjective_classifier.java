package sample_problems.strings;

import java.util.Scanner;

public class adjective_classifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter adjective: ");
        String str = sc.nextLine().toLowerCase().trim();
        sc.close();

        boolean startsMore = str.startsWith("more ");
        boolean startsMost = str.startsWith("most ");
        boolean endsEr = str.endsWith("er");
        boolean endsEst = str.endsWith("est");

        if ((startsMore && endsEr) || (startsMore && endsEst) ||
            (startsMost && endsEr) || (startsMost && endsEst)) {
            System.out.println("WRONG");
        }
        else if (startsMore || endsEr) {
            System.out.println("COMPARATIVE");
        }
        else if (startsMost || endsEst) {
            System.out.println("SUPERLATIVE");
        }
        else {
            System.out.println("POSITIVE");
        }
    }
}