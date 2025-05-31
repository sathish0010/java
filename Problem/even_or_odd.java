import java.util.Scanner;
class even_or_odd{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number:");
        int n=scan.nextInt();
        if(n%2==0){
            System.out.println("number is even");
        }
        else{
            System.out.println("number is odd");
        }

    }

}