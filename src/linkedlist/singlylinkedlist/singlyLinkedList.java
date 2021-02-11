package linkedlist.singlylinkedlist;

public class singlyLinkedList {
    Node head;
    public singlyLinkedList(){
        head = null;
    }

    //Insert A Node
    public void insert(Node newnode){
        if(head == null){
            head = newnode;
        }
        else{
            Node temp = head;
            while (temp.next != null){
                temp = temp.next;
            }
            temp.next = newnode;
        }
    }

    //Traversing or Printing
    public void traverseLinkedList(){
        Node temp = head;
        while(temp.next != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println(); //For next Line after completing the loop
    }

    //Insert A node At Beginning
    public void insertAtBeginning(Node newNode){
        newNode.next = head;
        head = newNode;
    }

    //Insertion A Node Specific Position
    public void insertAtSpecific(int pos, Node newNode){
        Node temp = head;
        for (int i = 0; i < pos-1; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    //Delete At Beginning
    public void deleteAtBeginning(){
        head = head.next;
    }

    // Delete At the End
    public void deleteAtEnd(){
        Node temp = head;
        Node pre = null;
        while(temp.next != null){
            pre = temp;
            temp = temp.next;
        }
        assert pre != null;
        pre.next = null;
    }





}
