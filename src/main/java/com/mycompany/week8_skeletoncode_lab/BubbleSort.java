/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8_skeletoncode_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class BubbleSort {

    public static void bubbleSort(int a[], int size) {
        int outer, inner, temp;
        for (outer = size - 1; outer > 0; outer--) { // counting down //n
            for (inner = 0; inner < outer; inner++) { // bubbling up //n
                //ToDo 3: complete this algorithm, test it, provide its time complexity
                if (a[inner] > a [inner+1]) { //1
                    temp = a[inner]; //1
                    a[inner] = a[inner+1]; //1
                    a[inner+1] = temp; //1
                }
            }
        }
    }
    //nested for loops
    //n * n + 4 => n^2 + 4
    //runtime = O(n^2+4) => O(n^2)
    
    
}
