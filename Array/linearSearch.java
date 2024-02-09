package Array;

public class linearSearch{
    public static int liSearch(int marks[], int key){
for(int i=0;i<marks.length;i++){
    if(marks[i]==key){
return i;
    }
}
return -1;
    }
    public static void main(String args[]){
        int marks[]={95,67,89,87,98,665,81};
        int key=89;
        int index=liSearch(marks,key);      
        if(index==-1){
            System.err.println("Not Found");
        }else{
            System.out.println("Element found at position: "+ index);
        }
    }
}
