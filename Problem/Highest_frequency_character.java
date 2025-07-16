//Highest frequency character in aString  
//Input: engineering 
//Output: e 3


class demo{
    public static void main(String args[]){
        String str="engineering";
        int max_count=0;
        char max_char=' ';
        
        for(int i=0;i<str.length();i++){
            int count=1;
            for(int j=i+1;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    count=count+1;
                }
            }
            if(count>max_count){
            max_count=count;
            max_char=str.charAt(i);
            }
        }
        String result=max_char+""+max_count;
        System.out.println(result);
    }
}