import java.util.Scanner;
class demo{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number of elements:");
        int n=scan.nextInt();
        
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Number:");
            a[i]=scan.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        int temp=0;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                   temp=a[i];
                   a[i]=a[j];
                   a[j]=temp;
                }
            }
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        if(a[1]>a[0]){
            System.out.println(+a[1]+ "is smallest");
        }
    }
}