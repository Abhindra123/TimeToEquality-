import java.util.Scanner;

public class TimeToEquality {

    public static int timeToEquality(int arr[],int max){
        int main_count=0;
        int sub_count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=max){

                while(arr[i]!=max){
                    arr[i]=arr[i]+1;
                    sub_count=sub_count+1;
                }
            }
            main_count=main_count+sub_count;
            sub_count=0;
        }
        return main_count;


    }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int total_count=timeToEquality(arr,max);
        System.out.println("the total count is : "+total_count);
    }
}