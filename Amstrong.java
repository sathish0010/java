import java.util.Scanner;
public class demo{
    public static void main(String args[]){
       Scanner scan=new Scanner(System.in); 
        int sum=0;
        System.out.println("enter the number:");
        int a=scan.nextInt();
        int temp=a;
        
        while(a>0){
            int digit = a%10;
            if(digit>0){
                sum =sum + (int) Math.pow(digit, 3);
            }
            a=a/10;
        }
        System.out.println("amstrong number:"+sum);
        if(sum==temp){
            System.out.println("it is amstrong number");
        }
        else{
            System.out.println("it is not a amstrong number");
        }
    }
}