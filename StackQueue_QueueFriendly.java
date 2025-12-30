/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsaproject;

import java.util.Stack;

/**
 *
 * @author Ridmi
 */
public class StackQueue_QueueFriendly {
    private Stack<Integer> mainStack;
    private Stack<Integer> auxStack;
    
    public StackQueue_QueueFriendly(){
        mainStack = new Stack<>();
        auxStack = new Stack<>();
    }
    
    public void enqueue(int x){
        while (!mainStack.isEmpty()){
            auxStack.push(mainStack.pop());
        }
        mainStack.push(x);
        while(!auxStack.isEmpty()){
            mainStack.push(auxStack.pop());
        }
    }
    
    public int dequeue(){
        if(mainStack.isEmpty()){
            throw new RuntimeException("Queue is Empty");
        }
        return mainStack.pop();
    }
    
    public boolean isEmpty(){
        return mainStack.isEmpty();
    }
    
    public int peek(){
        if(mainStack.isEmpty()){
            throw new RuntimeException("Queue is empty");
        }
        return mainStack.peek();
    }
    
    public static void main(String[] args){
        StackQueue_QueueFriendly queue = new StackQueue_QueueFriendly();
        
        queue.enqueue(3);
        queue.enqueue(5);
        queue.enqueue(7);
        
        System.out.println("Peek: " + queue.peek());
        System.out.println("Dequeue: " + queue.dequeue());
        System.out.println("Dequeue: " + queue.dequeue());
        System.out.println("Is Empty? " + queue.isEmpty());
    }
}
