//_else_if_ex

import java.util.Scanner;
class demo{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int num=78;
        if(num>35){
            System.out.println("video game");
        }
        else if(num>60 && num<90){
            System.out.println("iponr");
        }
        else if(num>90){
            System.out.println("books");
        }
    }
}