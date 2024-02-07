public class startFunction{
    public static int helloWorld(int num1,int num2){
        int sum=num1+num2;
        return sum;

    }
    public static void main(String args[]){
        int a=20;
        int b=20;
        int sum= helloWorld(a,b);
        System.out.println(sum);

    }
}