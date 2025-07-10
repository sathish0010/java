/*114.Split a string on hyphens 
Input: Emma-is-a-data-scientist 
Output: 
Emma 
Is 
A 
Data 
Scientist
*/ 

class demo{
    public static void main(String args[]){
        String str= "Emma-is-a-data-scientist";
        String[] words=str.split("-");
        for(int i=0;i<words.length;i++){
            System.out.println(words[i]);
        }
    }
}