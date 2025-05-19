//1.Calculate CGST and SGST for a product and print the total price to pay {CGST=9%, SGST=11%}

import java.util.Scanner;
class store{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the bill amount to pay:");
        int bill_amount=scan.nextInt();
        double sgst_rate=9.0;
        double cgst_rate=11.0;
        double cgst=(cgst_rate/100)*bill_amount;
        double sgst=(sgst_rate/100)*bill_amount;
        double sum=bill_amount+cgst+sgst;
        System.out.println("cgst:"+cgst);
        System.out.println("sgst:"+sgst);
        System.out.println("total amount is"+sum);
        
        
    }
}