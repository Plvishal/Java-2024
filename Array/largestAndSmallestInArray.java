package Array;
import java.util.*;
public class largestAndSmallestInArray {
public static void findLagestAndSmallest(int marks[]){
    int largets= Integer.MIN_VALUE; //-Infinitive
    int smallest= Integer.MAX_VALUE; //+Infinitive
    for(int i=0;i<marks.length;i++){
        if(largets<marks[i]){
            largets=marks[i];
        }
        if(smallest>marks[i]){
            smallest=marks[i];
        }
    }
    System.out.println("Largest Elementin the array = "+ largets);
    System.out.println("Smallest Element in the array = "+ smallest);

}
    public static void main(String args[]){

        int marks[]={56,67,89,90,80,67,54,67,89,1,99};
        findLagestAndSmallest(marks);
    }
}
