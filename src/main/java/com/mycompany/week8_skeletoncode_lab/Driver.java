package com.mycompany.week8_skeletoncode_lab;
/**
 *
 * @author johnf
 */
import java.util.Scanner;
public class Driver {
    public static void main(String[] args){
        int[] arr1 = {4, 8, 13, 17, 23, 29, 35, 42};
        int[] arr2 = {2, 4, 21, 1, 19, 42, 17, 31};
        System.out.println("Enter Selection: ");
        System.out.println("1 - Linear Search");
        System.out.println("2 - Binary Search");
        System.out.println("3 - Bubble Sort");
        System.out.println("4 - Sum of Primes");
        Scanner slct = new Scanner(System.in);
        int opt = slct.nextInt();
        
        switch(opt) {
            case 1:
                System.out.println("Enter target number to search: ");
                Scanner sc1 = new Scanner(System.in);
                int trgt1 = sc1.nextInt();

                int search = LinearSearch.search(arr1, trgt1);     
        
                System.out.println("Searching for number " + trgt1 + "...");
                if (search != -1){
                    System.out.println("Target found at index " + search);
                }
                else{
                    System.out.println("Target not found!");
                }
                break;
            case 2:
                System.out.println("Enter target number to search: ");
                Scanner sc2 = new Scanner(System.in);
                int trgt2 = sc2.nextInt();
                int low = arr1[0];
                int high = arr1.length - 1;
                int search2 = BinarySearch.runBinarySearchIteratively(arr1, trgt2, low, high);
                
                System.out.println("Searching for number " + trgt2 + " iteratively...");
                System.out.println("Index found at index " + search2);
                break;
                
            case 3: 
                int arrSize = arr2.length;
                System.out.println("Printing original array...");
                PrintArray.print(arr2);
                
                System.out.println("Printing sorted array...");
                BubbleSort.bubbleSort(arr2, arrSize);
                PrintArray.print(arr2);
                break;
                
            case 4:
                System.out.println("Enter a number: ");
                Scanner sc3 = new Scanner(System.in);
                int num = sc3.nextInt();
                
                System.out.println("Getting sum of all primes up to " + num);
                long sum = Problem01.getSumOfPrimes(num);
                
                System.out.println("Sum of primes from 1 to " + num);
                System.out.println(sum);
                
                break;
                
            default:
                break;
        }
    }
}
