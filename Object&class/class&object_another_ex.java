// class and object_another_ex

class laptop{
    String name="";
    String proc="";
    int ram=0;
    int price=0;
    public static void main(String args[]){
        laptop lap1=new laptop();
        lap1.name="hp";
        lap1.proc="i3";
        lap1.ram=4;
        lap1.price=30000;
        
        laptop lap2=new laptop();
        lap2.name="dell";
        lap2.proc="i3";
        lap2.ram=4;
        lap2.price=40000;
        System.out.println(lap2.name);
        System.out.println(lap2.price);
        System.out.println(lap1.name);
        System.out.println(lap1.price);
        
        laptop lap3=new laptop();
        System.out.println(lap3.name);
        System.out.println(lap3.price);
        


    }
}