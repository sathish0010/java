import java.util.Scanner;
class demo{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int[] temp=new int[arr.length];
        System.out.print("enter no of rotation to be rotated:");
        int r=sc.nextInt();
        int k=0;
        for(int i=arr.length-r;i<arr.length;i++){
            temp[k]=arr[i];
            k++;
        }
        for(int i=0;i<arr.length-r;i++){
            temp[k]=arr[i];
            k++;
        }
        for(int i=0;i<temp.length;i++){
            System.out.print(temp[i]+" ");
        }
    }
}