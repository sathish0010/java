import java.util.Scanner;
class demo{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the rotation:");
        String str=sc.nextLine();
        System.out.print("No of rotation to be rotated:");
        int n=sc.nextInt();
        int[] arr=new int[5];
        int[] temp=new int[arr.length];
        
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(); 
        
        if(str.equals("left")){
            int k=0;
            for(int i=n;i<arr.length;i++){
                temp[k]=arr[i];
                k++;
            }
            for(int i=0;i<n;i++){
                temp[k]=arr[i];
                k++;
            }
        }
        
        else if(str.equals("right")){
            int k=0;
            for(int i=arr.length-n;i<arr.length;i++){
                temp[k]=arr[i];
                k++;
            }
            for(int i=0;i<arr.length-n;i++){
                temp[k]=arr[i];
                k++;
            }
        }
        
        else{
            System.out.println("Invalid rotation");
        }
        
        for(int i=0;i<arr.length;i++){
            System.out.print(temp[i]+" ");
        }
    }
}