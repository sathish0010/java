//get i/p for 3 variaable: Name, score and Dept, let user enter score for 100 mrks , you convert it into 10 and print it
import java.util.Scanner;
class q4{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        Double Score = scan.nextDouble();
        scan.nextLine();
        String Department = scan.nextLine();
        System.out.println("My name is "+name);
        System.out.println("my score is "+Score/10 +"/10");
        System.out.print("My department is "+Department);
    }
    
}