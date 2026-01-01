class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map=new HashMap<>();
        // for(String s:strs){
        //     char c[]=s.toCharArray();
        //     Arrays.sort(c);
        //     String newstr=new String(c);
        //     if(!map.containsKey(newstr)){
        //         map.put(newstr,new ArrayList<>());
        //     }
        //     map.get(newstr).add(s);
        // }


        for(String s:strs){
            int f[]=new int[26];
            for(int i=0;i<s.length();i++){
                char c=s.charAt(i);
                f[c-'a']++;
            }
            StringBuilder builder=new StringBuilder();
            for(int i=0;i<26;i++){
                builder.append('#').append(f[i]);
            }
            String key=builder.toString();
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());


    }
}