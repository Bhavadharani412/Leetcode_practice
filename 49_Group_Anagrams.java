class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> group = new HashMap<>();
        for(String s : strs){
            char ch[] = s.toCharArray();
            Arrays.sort(ch);
            String str = String.valueOf(ch);
            if(!group.containsKey(str)){
                group.put(str,new ArrayList<>());
            }
            group.get(str).add(s);
        }
        return new ArrayList<>(group.values());
    }
} 
