package practice;
import java.util.Scanner;

public class avgOfThreeNum {
    public static void avgOfnum(int a,int b, int c){
        int avg=(a+b+c)/3;
        System.out.println("Avarage of three number is = " + avg);
    }
    public  static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the  number a= ");
        int a= sc.nextInt();
        System.out.print("Enter the  number b= ");
        int b= sc.nextInt();
        System.out.print("Enter the  number c= ");
        int c= sc.nextInt();
        avgOfnum(a, b, c);
    }
    
}
