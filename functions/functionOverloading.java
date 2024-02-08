public class functionOverloading {

    // Function overloading using the parameters
    public static int sum(int a , int b){
        return a+b;
    }
    public static int sum(int a, int b, int c){
return a+b+c;
    }

    // function overloadidng using the data types
    public static int sum1(int a, int b){
return a+b;
    }
    public static float sum1(float a, float b){
return a+b;
    }
    public static void main(String args[]){
        int a=9;
        int b=6;
        int c=7;
        float d=4.4f;
        float e=4.6f;
        System.out.println("-----------function Overloading using Parameters");
System.out.println("sum of two number = " + sum(a,b));
System.out.println(" sum of three number = " +  sum(a,b,c));
System.out.println("-----------function Overloading using Data Types");
System.out.println(sum1(a,b));
System.out.println(sum1(d,e));

    }
}
