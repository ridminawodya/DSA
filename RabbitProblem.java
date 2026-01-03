/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsaproject.Submission3;

/**
 *
 * @author Ridmi
 */
public class RabbitProblem {
    public static int rabbitsRecursive(int n){
        if(n <= 1) return n;
        return rabbitsRecursive(n-1) + rabbitsRecursive(n-2);
    }
    
    public static int rabbitsIterative(int n){
        if(n <= 1) return n;
        int a = 0, b = 1, c = 0;
        for (int i = 2; i <= n; i++){
            c = a+b;
            a = b;
            b = c;
        }
        return b;
    }
    
    public static void main(String[] args){
        int months = 10;
        System.out.println("Rabbits pairs after: " + months + " months(recursive): " + rabbitsRecursive(months));
        System.out.println("Rabbit pairs after " + months + "months(iterative): " + rabbitsIterative(months));
    }
}
