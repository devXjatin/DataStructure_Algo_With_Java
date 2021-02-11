package linkedlist.doublylinkedlist;

public class doublyLinkedListMain {
    public static void main(String[] args) {
        doublyLinkedList obj = new doublyLinkedList();
        for (int i = 10; i < 50; i+=10) {
            obj.insert(new Node(i));
        }
        obj.traverseLinkedList();
        obj.insertAtBeginning(new Node(100));
        System.out.println("Insert At Beginning: ");
        obj.traverseLinkedList();
        obj.deleteFromEnd();
        System.out.println("Delete From End: ");
        obj.traverseLinkedList();
        obj.deleteAtBeginning();
        System.out.println("Delete At beginning: ");
        obj.traverseLinkedList();

    }
}
