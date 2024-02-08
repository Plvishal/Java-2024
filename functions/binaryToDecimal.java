public class binaryToDecimal {
    // Write a function to print the Binary to decimal
    public static void binToDeci(int binNum){
        int myNum=binNum;
        int pow=0;
        int decNum=0;
        while (binNum>0) {
            int lastDig=binNum%10;
            decNum= decNum+(lastDig*(int)Math.pow(2, pow));
            pow++;
            binNum=binNum/10;
        }
System.out.println("Decimal of "+ myNum + " = "+ decNum);
    }
    public static void main(String args[]){
        binToDeci(110);
        
    }
    
}
