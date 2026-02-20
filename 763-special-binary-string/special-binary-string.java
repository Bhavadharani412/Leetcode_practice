class Solution {
    public String makeLargestSpecial(String s) {
        int count = 0, j = 0;
        List<String> l = new LinkedList<>();
        for(int i = 0; i < s.length();i++){
            if(s.charAt(i) == '1') count++;
            else count--;
            if(count == 0){
                l.add('1' + makeLargestSpecial(s.substring(j+1,i))+'0');
                j = i + 1;
            }
        }
        Collections.sort(l,Collections.reverseOrder());
        return String.join("",l);
    }
}