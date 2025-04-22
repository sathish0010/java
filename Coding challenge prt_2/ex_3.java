//ex_3 
import java.util.Scanner;
class trafic{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        String color=scan.nextLine();
        if(color=="red"){
            System.out.println("stop");
        }
        else if(color=="yellow"){
            System.out.println("get ready");
        }
        else if(color=="green"){
            System.out.println("go");
        }
    }
}