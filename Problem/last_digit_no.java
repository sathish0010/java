import java.util.Scanner;
class demo{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number:");
        int a=scan.nextInt();
        a=a%10;
        System.out.println("last digit number:"+a);
    }
}