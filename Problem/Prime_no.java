import java.util.Scanner;
class Prime_no{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number:");
        int num=scan.nextInt();
        int sum=0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                sum=sum+1;
            }
        }
        if(sum==2){
            System.out.println("it is prime number");

        }
       


    }
}