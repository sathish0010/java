//ex_2

import java.util.Scanner;
class Avg{
    public static void main(String args[]){
        Scanner scan= new Scanner(System.in);
        int maths=scan.nextInt();
        int tamil=scan.nextInt();
        int english=scan.nextInt();
        int science=scan.nextInt();
        int social=scan.nextInt();
        int total= tamil+maths+english+science+social;
        int average=total/5;
        if(average<35){
            System.out.println("additional class required");
        }
        else{
            System.out.println("you are good");
        }
    }
}
