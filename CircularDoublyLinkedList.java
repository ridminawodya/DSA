/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsaproject.Submission3;

/**
 *
 * @author Ridmi
 */
public class CircularDoublyLinkedList {
    class Node {
        int data;
        Node prev, next;
        Node(int data) {this.data = data;}
    }
    
    private Node head;
    
    public void insert(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            head.next = head;
            head.prev = head;
            return;
        }
        
        Node tail = head.prev;
        tail.next = newNode;
        newNode.prev = tail;
        newNode.next = head;
        head.prev = newNode;
    }
    
    public void delete(int key){
        if (head == null) return;
        
        Node current = head;
        do{
            if(current.data == key){
                if (current.next == current){
                    head = null;
                    return;
                }
                current.prev.next = current.next;
                current.next.prev = current.prev;
                if(current == head) head = current.next;
                return;
            }
            current = current.next;
        }while(current != head);
    }
    
    public void displayForward(){
        if(head == null) return;
        Node temp = head;
        do{
            System.out.print(temp.data + "<->");
            temp = temp.next;
        } while (temp != head);
        System.out.println("Back to head");
    }
    
    public void displayBackward(){
        if (head == null) return;
        Node temp = head.prev;
        do{
            System.out.print(temp.data + "<->");
            temp = temp.prev;
        } while(temp != head.prev);
        System.out.println("Back to tail");
    }
    
    public static void main(String[] args){
        CircularDoublyLinkedList list = new CircularDoublyLinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        
        System.out.println("Forward traversal: ");
        list.displayForward();
        
        System.out.println("Backward traversal: ");
        list.displayBackward();
        
        list.delete(20);
        System.out.println("After deleting 20: ");
        list.displayForward();
    }
}
