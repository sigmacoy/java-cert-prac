package sample_problems;

import java.util.HashSet;
import java.util.Scanner;

public class list_of_integers_intersection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the first array: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter " + n1 + " elements of the first array:");
        for(int i = 0; i < n1; i++){
            arr1[i] = sc.nextInt();
        }
        System.out.print("Enter the size of the second array: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter " + n2 + " elements of the second array:");
        for(int i = 0; i < n2; i++){
            arr2[i] = sc.nextInt();
        }
        sc.close();
        

        
        // Use HashSet
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> intersection = new HashSet<>();

        // Put first array elements into set
        for(int i = 0; i < n1; i++){
            set1.add(arr1[i]);
        }

        // Check second array for intersection
        for(int i = 0; i < n2; i++){
            if(set1.contains(arr2[i])){
                intersection.add(arr2[i]);
            }
        }

        System.out.print("Unique common elements are: ");
        for(Integer num : intersection){
            System.out.print(num + " ");
        }
    }
}

/*
Given
1 2 2
2 2

Output:
2

*/
