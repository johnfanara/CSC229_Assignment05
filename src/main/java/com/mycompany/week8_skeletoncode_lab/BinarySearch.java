/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8_skeletoncode_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class BinarySearch {

    public static int runBinarySearchIteratively(
            int[] sortedArray, int key, int low, int high) {
        int index = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = low + ((high - low) / 2);
            if (sortedArray[mid] < key) {
                low = mid + 1;
            } else if (sortedArray[mid] > key) {
                high = mid - 1;
            } else if (sortedArray[mid] == key) {
                index = mid;
                break;
            }
        }
        return index;
    }
    //ToDo 2: Call the above method and test the algorithm  
    // provide time and space analysis 
    
    /* Every iteration of binary search cuts the length of the array (n) in half
        it1 => n
        it2 => n/2
        it3 => n/2^2
        continues for k times
        itk => n/2^k
        at n/2^k, length of array is 1 
        n = 2^k
    
        log2(n) = log2(2^k)
        log2(n) = k*log2(2^k) => k
        k = log2(n)
    
        runtime = O(log2(n)) => O(logn)
    */

}
