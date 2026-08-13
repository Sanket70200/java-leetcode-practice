class Solution {

    public String common(String s1,String s2){
String str="";
int len=Math.min(s1.length(),s2.length());

for(int i=0;i<len;i++){
    if(s1.charAt(i)==s2.charAt(i)){
        str+=s1.charAt(i);
    }else{
        break;
    }
}
return str;


    }

     public String longestCommonPrefix(String[] strs) {
String res=strs[0];
for(int i=0;i<strs.length;i++){
    res=common(res,strs[i]);
}
return res;
     
    
}}