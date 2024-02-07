public class binomialCoffiecient {
    public static int factorials(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f= f*i;
        }
        return f;
    }
    public static int binomial(int n, int r){
        int n_fact=factorials(n);
        int r_fact= factorials(r);
        int nr_fact=factorials(n-r);
        return n_fact/(r_fact*nr_fact);
    }
    public static void main(String args[]){
        int n=5;
        int r=2;    
        int b=binomial(n, r);
        System.out.println("Binomials Cofficients of nCr =  " + b);

    }
}
