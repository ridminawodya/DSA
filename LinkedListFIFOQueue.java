/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsaproject.Submission3;

/**
 *
 * @author Ridmi
 */
public class LinkedListFIFOQueue {
    class Node{
        int data;
        Node next;
        Node(int data) {this.data = data;}
    }
    
    private Node front, rear;
    
    public void enqueue(int data){
        Node newNode = new Node(data);
        if(rear == null){
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }
    
    public int dequeue(){
        if(front == null) throw new RuntimeException("Queue Underflow");
        int value = front.data;
        front = front.next;
        if(front == null) rear = null;
        return value;
    }
    
    public int peek(){
        if(front == null) throw new RuntimeException("Queue is empty");
        return front.data;
    }
    
    public boolean isEmpty(){
        return front == null;
    }
    
    public void display(){
        Node temp = front;
        System.out.print("Queue (front->rear): ");
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args){
        LinkedListFIFOQueue queue = new LinkedListFIFOQueue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        
        queue.display();
        System.out.println("Peek: " + queue.peek());
        System.out.println("Dequeue: " + queue.dequeue());
        queue.display();
    }
}
