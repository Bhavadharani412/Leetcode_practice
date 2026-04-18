class Solution {
    public int[] sortArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int size = nums.length;
        int[] output = new int[size];
        int[] count = new int[10];
        // find max and min
        for(int iter = 0; iter < size; iter++){
            if(nums[iter] > max) max = nums[iter];
            if(nums[iter] < min) min = nums[iter]; 
        }
        boolean hasNegative = min < 0;
        // handle negative numbers by converting them to positive
        if(min < 0){
            for(int iter = 0; iter < size; iter++){
                nums[iter] += -min;
            }
            max += -min;
        }
        
        // perform counting sort for every digit
        int power = 1;
        // reset to zero for count array after every once an operation is begins
        // count array count updation
        // in count array fill the start position
        while(max != 0){ // largest element /= 10;
            // reset count array to zero
            Arrays.fill(count, 0);
            for(int iter = 0; iter < size; iter++){
                int digit = (nums[iter] / power) % 10; // get least significant digit
                count[digit]++;
            }
            
            // Start index updation in count array
            int sum = 0;
            for(int i = 0; i < 10; i++){
                int temp = count[i];
                count[i] = sum;
                sum += temp;
            }
            // build the output array
            for(int res_iter = 0; res_iter < size; res_iter++){
                int digit = (nums[res_iter] / power) % 10;
                output[count[digit]] = nums[res_iter];
                count[digit]++;
            }
            power *= 10;
            max /= 10;
            // copy the output array back to data array for the next iteration
            for(int iter = 0; iter < size; iter++){
                nums[iter] = output[iter];
            }
        }
        // convert back to original values by subtracting min from each element
        if(hasNegative){
            for(int iter = 0; iter < size; iter++){
                output[iter] -= -min;
            }
        }
        return output;
    }
}
