//ex_3

public class addition{
    int apple_price=20;
    int apple_count=5;
    void total_money(){
        int c =apple_price*apple_count;
        System.out.println("Total amount:"+c);
    }
    public static void main(String args[]){
        addition obj1=new addition();
        obj1.total_money();
    }
}