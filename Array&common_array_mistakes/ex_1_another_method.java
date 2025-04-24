
//_ex_another method

import java.util.Scanner;
class demo{
    public static void main(String args[]){
        int[] score= new int[5];
        int a;
        Scanner scan=new Scanner(System.in);
        System.out.println("enter first number:");
        score[0]=scan.nextInt();
        System.out.println("enter second number:");
        score[1]=scan.nextInt();
        System.out.println("enter third number:");
        score[2]=scan.nextInt();
        System.out.println("enter fourth number:");
        score[3]=scan.nextInt();
        System.out.println("enter fifth number:");
        score[4]=scan.nextInt();
        a=score[0]+score[1]+score[2]+-score[3]+score[4];
        System.out.println(a);
        
        
    }
}