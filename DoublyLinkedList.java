/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsaproject;

/**
 *
 * @author Ridmi
 */
public class DoublyLinkedList {
    class Node{
        int data;
        Node prev, next;
        Node(int data) {this.data = data;}
    }
    
    private Node head;
    
    public void insertAtBeginning(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        if(head != null){
            head.prev = newNode;
        }
        head = newNode;
    }
    
    public void insertAtEnd(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }
    
    public void delete(int key){
        Node temp = head;
        while(temp != null && temp.data != key){
            temp = temp.next;
        }
        if(temp == null) return;
        if(temp.prev != null){
            temp.prev.next = temp.next;
        }else{
            head = temp.next;
        }
        if(temp.next != null){
            temp.next.prev = temp.prev;
        }
    }
    
    public void displayForward(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
    
    public void displayBackward(){
        Node temp = head;
        if (temp == null) return;
        while (temp.next != null){
            temp = temp.next;
        }
        while (temp != null){
            System.out.print(temp.data + "<->"); 
            temp = temp.prev;
        }
        System.out.println("NULL");
    }
    
    public static void main(String[] args){
        DoublyLinkedList list = new DoublyLinkedList();
        
        list.insertAtBeginning(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        
        System.out.println("Forward: ");
        list.displayForward();
        
        System.out.println("Backward: ");
        list.displayBackward();
        
        list.delete(20);
        System.out.println("After deleting 20 (Forward): ");
        list.displayForward();
    }
}
