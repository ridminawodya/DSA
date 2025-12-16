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
public class StackQueueEnqueueFriendly {
    private Stack<Integer> s1 = new Stack<>();
    private Stack<Integer> s2 = new Stack<>();
    
    public void enqueue(int x){
        s1.push(x);
    }
    
    public int dequeue() throws Exception{
        if (s1.isEmpty() && s2.isEmpty()) throw new Exception("Queue Underflow");
        if(s2.isEmpty()){
            while (!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }
    
    public int front() throws Exception{
        if (s1.isEmpty() && s2.isEmpty()) throw new Exception("Queue is empty");
        if (s2.isEmpty()){
            while (!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }
        return s2.peek();
    }
    
    public boolean isEmpty(){
        return s1.isEmpty() && s2.isEmpty();
    }
    
    public static void main(String[] args) throws Exception{
        StackQueueEnqueueFriendly queue = new StackQueueEnqueueFriendly();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        
        System.out.println("Front: " + queue.front());
        System.out.println("Dequeue: " + queue.dequeue());
        System.out.println("Front after dequeue: " + queue.front());
    }
}
