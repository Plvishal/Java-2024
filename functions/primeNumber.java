public class primeNumber {
// Write a function to chech the number is prime or not 
    public static boolean isPrime(int n){       
        for(int i=2;i<=n-1;i++){
            if(n % i == 0){
                return false;               
            }
        } 
        return true;      
    }
    public static void main(String args[]){

        System.out.println("Number is Prime =  " + isPrime(17));

    }
}
