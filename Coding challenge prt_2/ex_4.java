//ex_4 nested if else method

import java.util.Scanner;
class loan{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter you salary:");
        int salary=scan.nextInt();
        System.out.println("Enter your age:");
        int age=scan.nextInt();
        if(salary>=20000 || age<=25){
            System.out.println("enter your loan:");
            int loan=scan.nextInt();
            if(loan<=50000){
                System.out.println("you are eligible");
            }
            else{
                System.out.println("max loan amount is 50000");
            }
        }
        else{
            System.out.println("you are not eligible");
        }
    }
}