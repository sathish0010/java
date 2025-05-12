//first half in Ascending order and second half in Descending order

import java.util.Scanner;
class demo{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter Number of Elements:");
        int n=scan.nextInt();
        System.out.println();
        
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Number:");
            a[i]=scan.nextInt();
        }
        
        System.out.print("original array:");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        //To sort the array
        System.out.println();
        int temp=0;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.print("Sorted array:");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        //to sort the array in descending order
        System.out.println();
        int mid=n/2;
        int left=mid;
        int right=n-1;
        while(left<right){
            temp=a[left];
            a[left]=a[right];
            a[right]=temp;
            left++;
            right--;
        }
        System.out.print("first half of number in ascending and second half of number in descending order: ");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}