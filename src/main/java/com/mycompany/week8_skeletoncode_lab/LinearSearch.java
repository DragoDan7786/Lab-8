/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8_skeletoncode_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class LinearSearch {

    public static int search(int arr[], int x) {
        int n = arr.length;
        // Todo 01: - complete the implementation of linear search and test your code  
        //         - prvoide asymptotic analysis of the developed solution

        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                return i;
            }
        }

        return -1;
    }

}
/*
Time Analysis
- L15 = 1 run
- L19 = 1 run on int i = 0, n runs of i < n , n runs of i++
- L20 = n runs at worst case scenario
- L21 / L24 = 1 run as a return statement
- f(n) = 3 + 3n

- for big Oh, we find a g(n) where c*g(n) is always greater than or equal to f(n). 
ex -> c1 * g(n) = 5 * (n+1) where g(n) is n+1. Since this is always greater than f(n), we can establish a O(g(n)) which can be written as O(n).

-for big Omega, we find a g(n) where c*g(n) is always less than or equal to f(n).
ex -> c2 * g(n) = 2 * (n-1) where g(n) is n-1. Since this is always less than f(n), we can esablish a Ω(g(n)) which can be written as Ω(n).

-for big Theta, we need to find a tight fit between big Oh and big Omega
ex -> c1 is 5 and c2 is 2, which leads to a Θ(n) with a range of c1 and c2 which are 5 and 2.

 */
