public class primeNumber {
// Write a function to chech the number is prime or not 
    // public static boolean isPrime(int n){       
    //     for(int i=2;i<=n-1;i++){
    //         if(n % i == 0){
    //             return false;               
    //         }
    //     } 
    //     return true;      
    // }
    public static boolean isPrime(int n){
        if(n==2){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    // Write a function to print range of prime number for n num
    public static void PrimeRange(int n){
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
        
    }

    public static void main(String args[]){
        PrimeRange(20);

  

    }
}
