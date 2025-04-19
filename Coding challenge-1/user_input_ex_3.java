// get input for three variable a,b, and c , now multiply all three variable and store it in d,now add all three variable store it in e and now divide d by e.
import java.util.Scanner;
class q3{
    public static void main(String args[]){
        Scanner three = new Scanner(System.in);
        int a= three.nextInt();
        int b= three.nextInt();
        int c= three.nextInt();
        int d= a*b*c;
        int e=a+b+c;
        System.out.print(d/e);
    }
}