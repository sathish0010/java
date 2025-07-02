// Frequency count with descending order printing 
//nt a[] = { 50, 20, 150, 20, 50, 10, 30, 10, 10 }; 

class demo{
    public static void main(String args[]){
        int arr[]={50, 20, 150, 20, 50, 10, 30, 10, 10};
        int n=arr.length;
        boolean[] visit=new boolean[n];
        for(int i=0;i<n;i++){
            if(visit[i]){
                continue;
            }
            int count=1;
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    count=count+1;
                    visit[j]=true; // mark duplicate as visited
                }
            }
            System.out.println(arr[i]+"--"+count);
        }
    }
}