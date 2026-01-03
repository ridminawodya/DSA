/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsaproject.Submission3;

/**
 *
 * @author Ridmi
 */
public class LinkedListStack {
    class Node{
        int data;
        Node next;
        Node(int data) {this.data = data;}
    }
    
    private Node top;
    
    public void push(int data){
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }
    
    public int pop(){
        if(top == null) throw new RuntimeException("Stack Underflow");
        int value = top.data;
        top = top.next;
        return value;
    }
    
    public int peek(){
        if (top == null) throw new RuntimeException("Stack is empty");
        return top.data;
    }
    
    public boolean isEmpty(){
        return top == null;
    }
    
    public void display(){
        Node temp = top;
        System.out.print("Stack (top->bottom): ");
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args){
        LinkedListStack stack = new LinkedListStack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        
        stack.display();
        System.out.println("Peek: " + stack.peek());
        System.out.println("Pop: " + stack.pop());
        stack.display();
    }
}
