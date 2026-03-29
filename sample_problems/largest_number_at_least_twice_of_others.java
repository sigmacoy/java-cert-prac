package sample_problems;

import java.util.Scanner;

public class largest_number_at_least_twice_of_others {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of integers: ");
        int n = sc.nextInt();
        System.out.println("Enter the integers:");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        for(int i = 0; i < n; i++){
            boolean isLarger = true;
            for(int j = 0; j < n ; j++){
                if(i == j) continue;
                if(arr[i] < arr[j] * 2){
                    isLarger = false;
                    break;
                }
            }
            if(isLarger){
                System.out.println("Dominant Index: " + i);
                return;
            }
        }
        System.out.println("Dominant Index: -1");
    }
    
}
