//  EX_1

import java.util.Scanner;
class demo{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int marks=scan.nextInt();
        if(marks>34){
            System.out.println("pass");
        }
        else{
            System.out.println("fail");
        }
    }
}