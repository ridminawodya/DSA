/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsaproject;

/**
 *
 * @author Ridmi
 */
public class SinglyLinkedList {
    class Node{
        int data;
        Node next;
        Node(int data) {this.data = data;}
    }
    
    private Node head;
    
    public void insertAtBeginning(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    
    public void insertAtEnd(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }
    
    public void delete(int key){
        if (head == null) return;
        if (head.data == key){
            head = head.next;
            return;
        }
        Node temp = head;
        while (temp.next != null && temp.next.data != key){
            temp = temp.next;
        }
        if(temp.next != null){
            temp.next = temp.next.next;
        }
    }
    
    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
    
    public static void main(String[] args){
        SinglyLinkedList list = new SinglyLinkedList();
        
        list.insertAtBeginning(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        
        System.out.println("List: ");
        list.display();
        
        list.delete(20);
        System.out.println("After deleting 20: ");
        list.display();
    }
}
