//while loop_another ex

import java.util.Scanner;
class demo{
    public static void main(String args[]){
        Random rand=new Random();
        int newnum=0;
        while(newnum!=5){
            newnum=rand.nextInt(bound:11);
            System.out.println(newnum);
        }
        
    }
}