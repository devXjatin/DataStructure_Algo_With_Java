package queuebyarray.linearqueue;

import java.util.Scanner;

public class LinearQueueMain {
    public static void main(String[] args) {
        final Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Size of the Queue: ");
        int size = scn.nextInt();
        LinearQueue linearQueue = new LinearQueue(size);
        while (true){
            System.out.println("Press 1 To Insert value in Queue.");
            System.out.println("Press 2 To Delete value in Queue.");
            System.out.println("Press 3 To Display Queue.");
            System.out.println("Press 4 To Peek in Queue.");
            System.out.println("Press 5 To Exit.");
            System.out.println("Enter Your Choice: ");
            int choice = scn.nextInt();
            switch (choice){
                case 1 ->{
                    System.out.println("Enter the Element: ");
                    int element = scn.nextInt();
                    linearQueue.enQueue(element);
                }
                case 2 -> linearQueue.deQueue();
                case 3 -> linearQueue.display();
                case 4 -> System.out.println(linearQueue.peek());
                case 5 -> System.exit(0);
                default -> System.out.println("Wrong Choice....");
            }
        }

    }
}
