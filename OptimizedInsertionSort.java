/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsaproject.Submission5;

/**
 *
 * @author Ridmi
 */
public class OptimizedInsertionSort {
    public static void insertionSort(int[] arr){
        int n = arr.length;
        for(int i = 1; i < n; i++){
            int key = arr[i];
            int j = i-1;
            
            while (j>=0 && arr[j]> key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
    
    public static void main(String[] args){
        int[] arr = {29, 10, 14, 37, 13};
        insertionSort(arr);
        System.out.println("Sorted array: ");
        for(int num : arr)
            System.out.print(num+" ");
    }
}
