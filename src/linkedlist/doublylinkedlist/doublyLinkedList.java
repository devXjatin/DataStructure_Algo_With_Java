package linkedlist.doublylinkedlist;

public class doublyLinkedList {
    Node head;
    public doublyLinkedList(){
        head = null;
    }

    //Insert a node
    public void insert(Node newNode){
        if(head == null){
            head = newNode;
        }
        else {
            Node temp = head;
            while (temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.previous = temp;
        }
    }

    //Insertion a Node At beginning

    public void insertAtBeginning(Node newNode){
        newNode.next = head;
        head.previous = newNode;
        head = newNode;
    }

    //Delete At beginning

    public void deleteAtBeginning(){
        head = head.next;
        head.previous = null;
    }



}
