/*Program to check the strings are anagram 
"dogo" 
"godo" 
Output: true    */ 

import java.util.Arrays;
import java.util.Scanner;
class demo{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String inp1="dogo";
        System.out.println("Enter the element");
        String inp2=sc.nextLine();
        char[] arr1= inp1.toCharArray();
        char[] arr2=inp2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        boolean result=Arrays.equals(arr1,arr2);
        System.out.println(result);

        

    }
}