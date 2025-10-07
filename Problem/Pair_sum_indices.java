/*
Example 1:
 Input:
  nums = [2, 7, 11, 15],
  target = 9 
  Output: [0, 1]
  Example 2: 
  Input:
  nums = [3, 2, 4],
   target = 6
   Output: [1, 2]
*/

import java.util.Scanner;
class demo{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int target=sc.nextInt();
        int[] arr=new int[n];
        
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int sum=arr[i]+arr[j];
                if(sum==target){
                    System.out.print(i+","+j);
                }
            }
        }
    }
}