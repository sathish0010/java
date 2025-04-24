// another method with even number 

class demo{
    public static void main(String args[]){
        int count=0;
        for(int i=1;i<=10;i=i+1){
            if(i%2==0){
                System.out.println("Even number:"+i);
            }
            else{
                System.out.println("odd number:"+i);
                count=count+1;
                System.out.println(count);
            }
        }
     System.out.println(count);   
    }
}