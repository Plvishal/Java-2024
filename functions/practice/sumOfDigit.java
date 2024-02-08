package practice;
import java.util.Scanner;
public class sumOfDigit {

    public static int sumOfDigit(int n){
        int sumOfnum=0;
        while(n>0){
                int lastDigit=n%10;
                sumOfnum=sumOfnum+lastDigit;
                n=n/10;
        }
        return sumOfnum;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int num;
        System.out.print("Enter the number = ");
        num= sc.nextInt();
      int res= sumOfDigit(num);
     System.out.println("Sum of Digit is = " + res);

    }
    
}
