class Solution {
    public void nextPermutation(int[] nums) {
        int i = nums.length-2;
        while(i >= 0 && nums[i] >= nums[i+1])i--;
        if(i == -1) {
            Arrays.sort(nums);
        }
        else {
            for(int j = nums.length-1; j > i; j--) {
                if (nums[j] > nums[i]){
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                    break;
                }
            }
            for (int k = i+1, l = nums.length-1; l > k; k++,l--) {
                int temp = nums[k];
                nums[k] = nums[l];
                nums[l] = temp;
            }
        }
    }
}