package pattern;

public class invertedPyramid {
    public static void invertedPyramid(){
        for(int i=4;i>=1;i--){
            for(int j=i;j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        invertedPyramid();
    }
    
}
