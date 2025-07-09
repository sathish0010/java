class demo{
    public static void main(String args[]){
        int[] arr={2, 3, -8, 7, -1, 2, 3} ;
        int max_sum=arr[0];
        int current_sum=arr[0];
        for(int i=1;i<arr.length;i++){
            current_sum=Math.max(arr[i],current_sum+arr[i]);
            max_sum=Math.max(max_sum,current_sum);
        }
        System.out.println("Maximum array:"+max_sum);
    }
}