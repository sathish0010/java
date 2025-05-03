import java.util.Scanner;
class demo{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter starting number:");
        int num_1=scan.nextInt();
        System.out.println("enter ending number:");
        int num_2=scan.nextInt();
        System.out.println("valid amstrong number are:");
        for(int i=num_1;i<num_2;i++){
            int num=i;
            int sum=0;
            int temp=num;
            while(num>0){
                int digit=num%10;
                sum=sum+(int)Math.pow(digit,3);
                num=num/10;
            }
            if(sum==temp){
                System.out.println(temp);
            }
        }
    }
}