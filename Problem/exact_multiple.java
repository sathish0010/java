import java.util.Scanner;
class exact_multiple{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter M value:");
        int m=scan.nextInt();
        System.out.println("enter N value:");
        int n=scan.nextInt();
        if(m==0){
            System.out.println("0 is not allowed");
        }
        else if(m%n==0){
            System.out.println("N is an exact multiple of M");
        }
        else{
            System.out.println("N is not an exact multiple of M");
        }
    }
}