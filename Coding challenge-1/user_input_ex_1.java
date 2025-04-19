//get input for variable name and age 
import java.util.Scanner;
class name{
    public static void main(String args[]){
        Scanner abc=new Scanner(System.in);  
        String name=abc.nextLine();
        int age=abc.nextInt();
        System.out.println("my name is"+name);
        System.out.println("my age is"+age);
    }
}