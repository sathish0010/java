//120. 
//Given a string s of lowercase English letters, the task is to find the first nn
//repeating character. If there is no such character, return '$'. 
//Input:"aabcdd" 
//Output:'b'

class demo{
    public static void main(String args[]){
        String str="aabcdd";
        boolean[] visit=new boolean[str.length()];
        for(int i=0;i<str.length();i++){
            if(visit[i]==true){
                continue;
            }
            int count=1;
            for(int j=i+1;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    count=count+1;
                    visit[j]=true;
                }
            }
            if(count==1){
                System.out.println(str.charAt(i));
                return;
            }
        }
    }
}