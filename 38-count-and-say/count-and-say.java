class Solution {
    public String countAndSay(int n) {
        String ans = "1";
        if(n == 1) return "1";
        for(int i = 1;i < n;i++){
            StringBuilder s = new StringBuilder();
            int count = 1;
            char prev = ans.charAt(0);
            for(int j = 1; j < ans.length();j++){
                if(ans.charAt(j) == prev) count++;
                else{
                    s.append(count).append(prev);
                    prev = ans.charAt(j);
                    count = 1;
                }
            }
            s.append(count).append(prev);
            ans = s.toString();
        }
        return ans;
    }
}