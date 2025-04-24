//_ex_4

class demo{
    public static void main(String args[]){
        int oddcount=0;
        int evencount=0;
        for(int i=1;i<=10;i=i+1){
            if(i%2==0){
                System.out.println("even number:"+i);
                evencount=evencount+1;
            }
            else{
                System.out.println("odd number:"+i);
                oddcount=oddcount+1;
            }
        }
    System.out.println("total even number:"+evencount);
    System.out.println("total odd number:"+oddcount);
    }
}