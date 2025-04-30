//class and object_another_ex

public class demo{
    void greeting(){
        System.out.println("Good Morning");
        dummy();
    }
    void dummy(){
        System.out.println("i am dummy");
    }
    public static void main(String args[]){
        demo obj1=new demo();
        obj1.greeting();
    }
}