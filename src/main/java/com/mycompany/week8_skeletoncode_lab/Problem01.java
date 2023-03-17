/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8_skeletoncode_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class Problem01 {
    
    public static long getSumOfPrimes(int n){
    // Todo 04: Develop a method that returns the sum of the prime numbers between 1 and n
    //          Test your solution
    //          Analyze its space and time  
      long sum=0; //1
      System.out.println("Prime numbers on the way from 1 to " + n); //1
      for(int i=2; i <= n; i++){ //n
        boolean flag = false; //1
        for(int j=2; j <= i/2; j++){ //n nested loop
              if(i%j==0){ //1
                  flag=true; //1
                  break; //1
              }
        }
      
        if (!flag){ //1
            System.out.print(i + ", "); //1
            sum+=i; //1
        }
      }
      System.out.println(); //1
      return sum; //1
    }
    //nested for loop
    // n * n + 11 => n^2 + 11
    // runtime = O(n^2+11) => O(n^2)
}
