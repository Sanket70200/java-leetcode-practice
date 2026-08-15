class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        



// Map<String,List<String>> map=new HashMap<>();

// for(String word:strs){
//     char[] chars=word.toCharArray();
//     Arrays.sort(chars);

//     String key=new String(chars);

//     map.computeIfAbsent(key,k-> new ArrayList<>()).add(word);
// }

// return new ArrayList<>(map.values());


Map<String,List<String>>map=new HashMap<>();
for(String word:strs){
    char[] charSet=word.toCharArray();
    Arrays.sort(charSet);
    String key=new String(charSet);

    map.computeIfAbsent(key,k-> new ArrayList<>()).add(word);
}
return new ArrayList<>(map.values());
}
}