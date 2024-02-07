public class factorialNumber {
    public static int factorials(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f= f * i;
        }
        return f;

    }
    public static void main(String args[]){
        int a=5;
        int fac=factorials(a);
        System.out.println(fac);

    }
    
}
