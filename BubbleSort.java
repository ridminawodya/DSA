/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsaproject.Submission4;

/**
 *
 * @author Ridmi
 */
public class BubbleSort {
    public static void bubbleSort(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n-1; i++){
            for(int j = 0; j < n-i-1; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    
    public static void main(String[] args){
        int[] arr = {53, 20, 5, 22, 3};
        bubbleSort(arr);
        System.out.print("Sorted array: ");
        for (int num: arr)
            System.out.print(num + " ");
    }
}
