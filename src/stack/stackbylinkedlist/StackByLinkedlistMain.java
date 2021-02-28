package stack.stackbylinkedlist;

import java.util.Scanner;

public class StackByLinkedlistMain {
    public static void main(String[] args) {
        final Scanner scn = new Scanner(System.in);
        StackByLinkedList stackByLinkedList = new StackByLinkedList();
        while (true){
            System.out.println("Press 1 to Insert a Value.");
            System.out.println("Press 2 to Pop a Value.");
            System.out.println("Press 3 to Peek the Value.");
            System.out.println("Press 4 to Display Stack.");
            System.out.println("Press 5 to Exit.");
            System.out.println();// for next line.
            System.out.print("Enter your Choice: ");
            int choice = scn.nextInt();
            switch (choice){
                case 1 ->{
                    System.out.println("Enter the Value: ");
                    stackByLinkedList.pushElement(new Node(scn.nextInt()));
                }
                case 2 -> stackByLinkedList.popElement();
                case 3 -> System.out.println(stackByLinkedList.peekStack());
                case 4 -> stackByLinkedList.displayStack();
                case 5 -> System.exit(0);
                default -> System.out.println("Wrong Choice!!!!");
            }
        }//end of while
    }
}
