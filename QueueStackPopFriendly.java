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
public class QueueStackPopFriendly {
        private Queue<Integer> q1 = new LinkedList<>();
    private Queue<Integer> q2 = new LinkedList<>();
    
    public void push(int x){
        q1.add(x);
        while(!q1.isEmpty()){
            q2.add(q1.remove());
        }
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }
    
    public int pop() throws Exception{
        if(q1.isEmpty()) throw new Exception("stack Underflow");
        return q1.remove();
    }
    
    public int top() throws Exception{
        if(q1.isEmpty()) throw new Exception("Stack is Empty");
        return q1.peek();
    }
    
    public boolean isEmpty(){
        return q1.isEmpty();
    }
    
    public static void main(String[] args) throws Exception{
        QueueStackPopFriendly stack = new QueueStackPopFriendly();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Top: " + stack.top());
        System.out.println("Pop: " +stack.pop());
        System.out.println("Top after pop: " + stack.top());
    }
}
