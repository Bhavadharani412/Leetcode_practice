class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> s = new Stack<>();
        for(String n : operations){
            if(n.equals("+")){
                int n1 = s.pop();
                int n2 = s.pop();
                s.push(n2);
                s.push(n1);
                s.push(n1 + n2);
            }
            else if(n.equals("D")){
                s.push(s.peek()*2);
            }
            else if(n.equals("C")){
                s.pop();
            }
            else{
                s.push(Integer.parseInt(n));
            }
        }
        int sum = 0;
        for(int m : s){
            sum += m;
        }
        return sum;
    }
}