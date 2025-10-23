class Solution {
    public double average(int[] salary) {
        double min = salary[0], max = salary[0];
        for(int i:salary){
            max=Math.max(max,i);
            min=Math.min(min,i);
        }
        double sum=0;
        for(int i:salary){
            if(i != max && i != min)sum += i;
        }
        sum /= salary.length-2;
        return sum;
    }
}