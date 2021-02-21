package queue;

import java.util.Scanner;

public class CircularQueueMain {
    public static void main(String[] args) {
        final Scanner scn = new Scanner(System.in);
        System.out.print("Enter the Size of the Array: ");
        int sizeOfArray = scn.nextInt();
        CircularQueue obj = new CircularQueue(sizeOfArray);
        while (true){
            System.out.println("Press 1 to Insert a Element.");
            System.out.println("Press 2 to Delete a Element.");
            System.out.println("Press 3 to Display Queue.");
            System.out.println("Press 4 to Peek");
            System.out.println("Press 5 to Exit.");
            System.out.println("Enter Your Choice: ");
            int choice = scn.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.println("Enter the Element: ");
                    int element = scn.nextInt();
                    obj.enQueue(element);
                }
                case 2 -> obj.deQueue();
                case 3 -> obj.display();
                case 4 -> System.out.println(obj.peek());
                case 5 -> System.exit(0);
                default -> System.out.println("Wrong Choice!!!");
            }
        }
    }
}
