package practice;

import java.util.Scanner;

public class palindromeNumber {
    public static boolean isPalindrome(int number){
        int palindrome= number;
        int reverse= 0;
        while (palindrome !=0) {
            int remainder= palindrome%10;
            reverse= reverse*10+remainder;
            palindrome= palindrome/10;
           ra
        }

        if(number==reverse){
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int num;
        System.out.print("Enter the number  = ");
        num= sc.nextInt();
        if(isPalindrome(num)){
            System.out.println("Number  is Palindrome");
        }else{
            System.out.println("Number is Not Palindrome");
        }
    }
    
}
