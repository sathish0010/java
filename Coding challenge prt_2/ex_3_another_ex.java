//lec_12_ex_3 another method
 
import java.util.Scanner;
class trafic{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        String color=scan.nextLine();
        if(color.equals("red")){
            System.out.println("stop");
        }
        else if(color.equals("yellow")){
            System.out.println("get ready");
        }
        else if(color.equals("green")){
            System.out.println("go");
        }
    }
}