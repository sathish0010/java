class reverse_num{
    public static void main(String args[]){
        int num=145;
        int rev=0;
        while(num>0){
            int a=num%10;
            rev=rev*10+a;
            num=num/10;
        }
        System.out.println(rev);
    }

}