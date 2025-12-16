/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsaproject;

/**
 *
 * @author Ridmi
 */
public class UnboundedArrayStack {
    private int[] arr;
    private int size;
    private int capacity;
    
    public UnboundedArrayStack(){
        capacity = 2;
        arr = new int[capacity];
        size = 0;
    }
    
    public void push(int x){
        if (size == capacity) resize(capacity*2);
        arr[size++] = x;
    }
    
    public int pop() throws Exception{
        if (size == 0) throw new Exception("Stack Underflow");
        int popped = arr[--size];
        if (size > 0 && size == capacity/4) resize(capacity/2);
        return popped;
    }
    
    public int top() throws Exception{
        if (size == 0) throw new Exception("Stack is Empty");
        return arr[size-1];
    }
    
    public boolean isEmpty(){
        return size == 0;
    }
    
    private void resize(int newCapacity){
        int[] newArr = new int[newCapacity];
        System.arraycopy(arr, 0, newArr, 0, size);
        arr = newArr;
        capacity = newCapacity;
    }
    
    public static void main(String[] args) throws Exception{
        UnboundedArrayStack stack = new UnboundedArrayStack();
        stack.push(5);
        stack.push(10);
        stack.push(15);
        
        System.out.println("Top: " + stack.top());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Top after pop: " + stack.top());
    }
}
