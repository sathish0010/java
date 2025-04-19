//another method 
import java.util.Scanner;
class name{
    public static void main(String args[]){
        Scanner abc=new Scanner(System.in);  
        String name=abc.nextLine();
        int age=abc.nextInt();
        abc.nextLine();      // after declaration of integer we should give this command to go to the other string , otherwise it will stop at the age itself 
        String address=abc.nextLine();
        System.out.println("my name is"+name);
        System.out.println("my age is"+age);
        System.out.print("my adress is "+address);
    }
}