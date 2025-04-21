//lec_10 Ex_3

import java.util.Scanner;
class Demo{
    public static void main(String args[]){
       Scanner scan= new Scanner(System.in);
       int num=scan.nextInt();
       if(num%3==0 && num%5==0){
           System.out.println("Divisible");
       }
       else{
           System.out.println("Not divisible");
       }
    }
}