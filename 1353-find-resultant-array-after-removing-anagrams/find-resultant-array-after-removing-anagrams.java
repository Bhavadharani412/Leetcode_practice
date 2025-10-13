class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> res = new ArrayList<>();
        String prev = "";
        for(String w : words){
            String temp = sortString(w);
            if(!temp.equals(prev)){
                res.add(w);
                prev = temp;
            }
        }
        return res;
    }
    private String sortString(String a){
        char[] arr = a.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
}