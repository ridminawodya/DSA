/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsaproject;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Ridmi
 */
public class QueueStackPushFriendly {
    private Queue<Integer> q1 = new LinkedList<>();
    private Queue<Integer> q2 = new LinkedList<>();
    
    public void push(int x){
        q1.add(x);
    }
    
    public int pop() throws Exception{
        if (q1.isEmpty()) throw new Exception("Stack Underflow");
        while (q1.size() > 1){
            q2.add(q1.remove());
        }
        int popped = q1.remove();
        
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
        
        return popped;
    }
    
    public int top() throws Exception{
        if (q1.isEmpty()) throw new Exception("Stack is Empty");
        while (q1.size() > 1){
            q2.add(q1.remove());
        }
        int top = q1.peek();
        q2.add(q1.remove());
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
        return top;
    }
    
    public boolean isEmpty(){
        return q1.isEmpty();
    }
    
    public static void main(String[] args) throws Exception{
        QueueStackPushFriendly stack = new QueueStackPushFriendly();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Top: "+stack.top());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Top after pop: " + stack.top());
    }
}
