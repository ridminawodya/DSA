/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsaproject;

/**
 *
 * @author Ridmi
 */
public class ArrayCircularQueue {
    private int[] arr;
    private int front, rear, size, capacity;
    
    public ArrayCircularQueue(int capacity){
        this.capacity = capacity;
        arr = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }
    
    public void enqueue(int x){
        if(isFull()){
            throw new RuntimeException("Queue Overflow");
        }
        rear = (rear + 1) % capacity;
        arr[rear] = x;
        size++;
    }
    
    public int dequeue(){
        if(isEmpty()){
            throw new RuntimeException("Queue Underflow");
        }
        int item = arr[front];
        front = (front + 1) % capacity;
        size--;
        return item;
    }
    
    public boolean isFull(){
        return size == capacity;
    }
    
    public boolean isEmpty(){
        return size == 0;
    }
    
    public int peek(){
        if(isEmpty()){
            throw new RuntimeException("Queue is empty");
        }
        return arr[front];
    }
    
    public static void main(String[] args){
        ArrayCircularQueue queue = new ArrayCircularQueue(5);
        
        queue.enqueue(7);
        queue.enqueue(11);
        queue.enqueue(9);
        
        System.out.println("Peek: " + queue.peek());
        System.out.println("Dequeue: " + queue.dequeue());
        queue.enqueue(20);
        queue.enqueue(4);
        
        System.out.println("Is Full? " + queue.isFull());
        while(!queue.isEmpty()){
            System.out.println("Dequeue: " + queue.dequeue());
        }
    }
}
