// if else ex 2

import java.util.Scanner;
class demo{
    public static void main(String arg[]){
        Scanner abc=new Scanner(System.in);
        int num1=abc.nextInt();
        int num2=abc.nextInt();
        if(num1>num2){
            System.out.println("Num1 is greater");
        }
        else{
            System.out.print("num2 is greater");
        }
    }
}