class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Set seen = new HashSet(), rep = new HashSet();
        for(int i = 0; i < s.length() - 9; i++){
            String ten = s.substring(i, i + 10);
            if(!seen.add(ten)) rep.add(ten);
        }
        return new ArrayList(rep);
    }
}