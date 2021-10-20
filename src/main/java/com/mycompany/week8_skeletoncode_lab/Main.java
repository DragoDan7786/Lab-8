
package com.mycompany.week8_skeletoncode_lab;

/**
 *
 * @author Suleman Ali
 */
public class Main {
    
    public static void main(String args[]){
        
        //LinearSearch testing
        LinearSearch test1 = new LinearSearch();
        int arr[] = new int[]{ 1 , 2 , 3 , 4 , 5};
        System.out.println("The position of the array location containing the integer 3 is " + test1.search(arr, 3));
        System.out.println("The position of the array location containing the integer 31 is " + test1.search(arr, 31));
        
        //binarySearch Testing
        int[] arr2 = new int[]{2 , 4 , 6 , 8 , 12};
        BinarySearch test2 = new BinarySearch();
        System.out.println("The index location of the element 4 in the array is " + test2.runBinarySearchIteratively(arr2 , 4 , 0, 4));
        System.out.println("The index location of the element 42 in the array is " + test2.runBinarySearchIteratively(arr2 , 42 , 0, 4));
        
        
    }
    
}
