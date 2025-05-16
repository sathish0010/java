import java.util.Scanner;
class demo{
    static int fact(int a){
        if(a==0||a==1){
            return 1;
        }
        else{
            return a*fact(a-1);
        }
    }
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number:");
        int n=scan.nextInt();
        int temp=n;
        int sum=0;
        int digit;
        while(n>0){
            digit=n%10;
            int res =fact(digit);
            sum=sum+res;
            n=n/10;
        }
        if(temp==sum){
            System.out.println("strong number");
            
        }
        else{
            System.out.println("not strong number");
        }
    }
}