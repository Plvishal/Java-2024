public class decimalToBinary {
    // Write a function to print the Decimal to Binary to given number
    public static void decToBin(int n){
        int myNum=n;
        int pow=0;
        int binNum=0;
        while(n>0){
            int rem= n%2;
            binNum= binNum+(rem*(int)Math.pow(10, pow));
            pow++;
            n=n/2;
        }
        System.out.println("Binary of " + myNum +" = "+ binNum);
    }
    public static void main(String args[]){
        decToBin(5);

    }
}
