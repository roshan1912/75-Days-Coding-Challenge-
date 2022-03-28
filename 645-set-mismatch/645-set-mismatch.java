class Solution {
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int n= nums.length;
        Set<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<n-1;i++){
            if(nums[i]==nums[i+1]){
                list.add(nums[i+1]);
            }
        }
        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }
        for(int i=1;i<=n;i++){
            if(!set.contains(i)){
                list.add(i);
            }
        }
        int[] ans = new int[list.size()];
        int id=0;
        for(int i=0;i<list.size();i++){
            ans[id++]=list.get(i);
        }
        return ans;
    }
}