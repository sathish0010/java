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
        int x=scan.nextInt();
        int res=fact(x);
        System.out.println("factorial of given number:"+res);
    }
}