package Array;
public class arrayAsFunctionArgument{

    public static void update(int marks[]){
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+2;
        }
    }
public static void main(String args[]){
int marks[]={2,3,4,5,6};
update(marks);

for(int i=0;i<marks.length;i++){
    System.out.print(marks[i]+" ");
}


}
}