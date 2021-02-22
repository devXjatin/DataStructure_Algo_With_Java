package questions;

import java.util.Arrays;
import java.util.Scanner;

public class PalindromeMain {
    public static void main(String[] args) {
        final Scanner scn = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String string = scn.nextLine();
        StackPalindrome stackPalindrome = new StackPalindrome(string.length());
        QueuePalindrome queuePalindrome = new QueuePalindrome(string.length());
        Palindrome palindrome = new Palindrome();
        for (int i = 0; i < string.length(); i++) {
            char character = string.charAt(i);
            if((character >= 'a' && character <= 'z') || (character >= 'A' && character <= 'Z')){
                stackPalindrome.pushCharacter(character);
                queuePalindrome.enqueueCharacter(character);
            }
        }
       /* stackPalindrome.displayStack();
        queuePalindrome.display();
        stackPalindrome.popCharacter();
        queuePalindrome.dequeueCharacter();
        stackPalindrome.displayStack();
        queuePalindrome.display();
        palindrome.palindromeString(sb);*/
        boolean flag=true;
        for (int i = 0; i < string.length(); i++) {
            char a = stackPalindrome.popCharacter();
            char b = queuePalindrome.dequeueCharacter();
            if(a != b){
                flag=false;
                break;

            }
        }
      /*  System.out.println(sb1);
        System.out.println(sb2);*/
        if(!flag){
            System.out.println("not palindrome");
        }
        else{
            System.out.println("palindrome");
        }



        }

}
