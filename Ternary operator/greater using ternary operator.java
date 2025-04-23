//which number is greater using ternary operator

import java.util.Scanner;
class demo{
    public static void main(String args[]){
    Scanner abc=new Scanner(System.in);
    System.out.println("enter num_1:");
    int num_1=abc.nextInt();
    System.out.println("enter num_2:");
    int num_2=abc.nextInt();
    String result=num_1>num_2?"num_1 is greater":"num_2 is greater";
    System.out.println(result);
    
    }
}