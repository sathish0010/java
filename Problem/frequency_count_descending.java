// Frequency count with descending order printing 
//int a[] = { 50, 20, 150, 20, 50, 10, 30, 10, 10 }; 
class demo{
    public static void main(String args[]){
        int[] arr= { 50, 20, 150, 20, 50, 10, 30, 10, 10 };
        //int count=0;
        boolean[] res=new boolean[arr.length];
        int[] uniq=new int[arr.length];
        int[] freq=new int[arr.length];
        int k=0;
        for(int i=0;i<arr.length;i++){
            if(res[i]==true){
                continue;
            }
            int count=1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count=count+1;
                    res[j]=true;
                }
            }
            //System.out.println(arr[i]+"--"+count);
            uniq[k]=arr[i];
            freq[k]=count;
            k=k+1;
        }
        for(int i=0;i<k-1;i++){
            for(int j=i+1;j<k;j++){
                if(uniq[i]<uniq[j]){
                    int temp1=uniq[i];
                    uniq[i]=uniq[j];
                    uniq[j]=temp1;
                    
                    int temp2=freq[i];
                    freq[i]=freq[j];
                    freq[j]=temp2;
                }
            }
        }
        for(int i=0;i<k;i++){
            System.out.println(uniq[i]+"--"+freq[i]);
        }
    }
}