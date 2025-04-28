//Do while_ex_1

import java.util.Scanner;
class demo{
    public static void main(String args[]){
        int count=0;
        Scanner scan=new Scanner(System.in);
        do{
            System.out.println("Enter the number>10:");
            count=scan.nextInt();
        }
        while(count<10);
    }
}