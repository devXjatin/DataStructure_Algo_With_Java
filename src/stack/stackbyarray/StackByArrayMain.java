package stack.stackbyarray;

import java.util.Scanner;

public class StackByArrayMain {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        StackByArray obj;
        System.out.println("Enter the Size of Array: ");
        int size = scn.nextInt();
        obj = new StackByArray(size);
        while (true) {
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.println("Enter Your Choice");
            int var = scn.nextInt();
            switch (var) {
                case 1 -> {
                    System.out.print("Enter The Element: ");
                    obj.pushElement(scn.nextInt());
                }
                case 2 -> obj.popElement();
                case 3 -> {
                    System.out.println(obj.peek());
                }
                case 4 -> obj.display();
                case 5 -> System.exit(0);
                default -> System.out.println("Wrong Choice!!");
            }
        }

    }
}
