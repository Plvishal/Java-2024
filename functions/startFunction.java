public class startFunction{
    public static int helloWorld(int num1,int num2){
        int sum=num1+num2;
        return sum;

    }
    public static void swap(int a, int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println("a swap value"+ a);
        System.out.println("b swap value" +b);
    }
    public static void main(String args[]){
        int a=20;
        int b=2;
        swap(a,b);
      

    }
}