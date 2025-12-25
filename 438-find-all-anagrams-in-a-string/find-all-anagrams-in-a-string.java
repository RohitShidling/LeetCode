class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> lst=new ArrayList<>();
        int sarr[]=new int[26];
        int parr[]=new int[26];
        for(char c:p.toCharArray()){
            parr[c-'a']++;
        }

        for(int i=0;i<s.length();i++){
            sarr[s.charAt(i)-'a']++;

            if(i>=p.length()){
                sarr[s.charAt(i-p.length())-'a']--;
            }


            if(Arrays.equals(sarr,parr)){
                lst.add(i-p.length()+1);
            }
        }

        return lst;
    }
}