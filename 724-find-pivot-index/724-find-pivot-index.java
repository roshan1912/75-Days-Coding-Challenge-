class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0;
        int half=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            sum =sum-nums[i];
            if(half==sum)
                return i;
            half+=nums[i];
        }
        return -1;
    }
}