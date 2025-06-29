//import java.util.Scanner;
class demo{
    public static void main(String args[]){
        int[] arr={12, 35, 1, 10, 34, 1};
        int temp=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int large=arr[arr.length-1];
        if(arr[arr.length-2]<large){
            System.out.println(arr[arr.length-2]+" is a second largest number");
        }
    }
}