public class functionOverloading {
    // write a function to calculatethe sum  of two number
    public static int sum(int a , int b){
        return a+b;
    }
    // Write a function to calculate the sum of three number 
    public static int sum(int a, int b, int c){
return a+b+c;
    }
    public static void main(String args[]){
        int a=9;
        int b=6;
        int c=7;
System.out.println("sum of two number = " + sum(a,b));
System.out.println(" sum of three number = " +  sum(a,b,c));

    }
}
