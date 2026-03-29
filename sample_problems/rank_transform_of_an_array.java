package sample_problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class rank_transform_of_an_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Ranks: ");
        for(int num : arr){
            int rank = 1;
            List<Integer> considered = new ArrayList<>();
            for(int num2 : arr){
                if(num > num2 && !considered.contains(num2)){
                    rank++;
                    considered.add(num2);
                }
            }
            System.out.print(rank + " ");
        }
        sc.close();
    }
}
