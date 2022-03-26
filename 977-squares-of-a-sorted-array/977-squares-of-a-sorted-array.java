class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int sqr[]=new int[n];
        for(int i=0;i<nums.length;i++){
            sqr[i]=nums[i]*nums[i];
        }
        
        Arrays.sort(sqr);
        return sqr;
    }
}