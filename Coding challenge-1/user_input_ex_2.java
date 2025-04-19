//get input for variable name,age and address 
import java.util.Scanner;
class name{
    public static void main(String args[]){
        Scanner abc=new Scanner(System.in);  
        String name=abc.nextLine();
        String adress=abc.nextLine();
        int age=abc.nextInt();
        System.out.println("my name is"+name);
        System.out.println("my age is"+age);
        System.out.print("my adress is "+adress);
    }
}