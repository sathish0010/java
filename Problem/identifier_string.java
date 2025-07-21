//  Validation of an Identifier

import java.util.Scanner;
class demo{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the identifier:");
        String a=sc.nextLine();
        if(isValid(a)){
            System.out.println("Valid identifier");
        }
        else{
            System.out.println("Invalid identifier");
        }
    }
    static boolean isValid(String a){
        if(a.length()==0){
            return false;
        }
        char ch=a.charAt(0);
        if(!(Character.isLetter(ch)) || ch == '_' || ch == '$'){
            return false;
        }
        for(int i=1;i<a.length();i++){
            ch=a.charAt(i);
            if(!(Character.isLetterOrDigit(ch)) || ch == '_' || ch == '$'){
                return false;
            }
        }
        return true;
    }
}