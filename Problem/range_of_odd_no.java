import java.util.Scanner;
class range_of_odd_no{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int count=0;
        System.out.print("enter the number:");
        int m=scan.nextInt();
        for(int i=1;i<=m;i++){
            System.out.print("number"+i+":");
            int n=scan.nextInt();
            if(n%2!=0){
                count=count+1;
            }
        }
        System.out.println("Total odd number:"+count);
    }
}