package assignment;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter Length of Array:");
        int n = s.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter "+n+" Elements");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        try {

            System.out.println("Enter the index you want to access");


            int b = s.nextInt();
            int k = arr[b];


        } catch (Exception e) {

            System.out.println(e);
        }

    }
}
