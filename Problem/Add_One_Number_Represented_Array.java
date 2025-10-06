/*
Write a function that adds one to this number and returns the resulting array of digits.
Example 1:
Input:
digits = [1, 2, 3]
Output:
[1, 2, 4]
Explanation:
The array represents the number 123. Adding 1 gives 124, so the result is [1, 2, 4].
Example 2:
Input:
digits = [4, 3, 2, 1]
Output:
[4, 3, 2, 2]
*/

import java.util.Scanner;
class demo{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        int num=0;
        for(int i=0;i<arr.length;i++){
            num=num*10+arr[i];
        }
        num=num+1;
        System.out.println(num);
    }
}