// ex_1

import java.util.Scanner;
class demo{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter a:");
        int a=scan.nextInt();
        System.out.println("enter b:");
        int b=scan.nextInt();
        for(int i=a;i<=b;i=i+1){
            System.out.println(i);
        }
    }
}