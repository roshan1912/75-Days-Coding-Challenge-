class Solution {
    public int threeSumMulti(int[] arr, int target) {
        int n = arr.length;
        int x = 0;
        int y = 0;
        long ans = 0;
        int mod = 1000000007;
        for(int i = 0;i < n;i++)
        {
            x = arr[i];
            int[] count = new int[101];
            for(int j = i + 1;j < n;j++)
            {
                y = arr[j];
                int z = target - x - y;
                if(z >= 0 && z <= 100)
                {
                    ans += count[z];
                    ans = ans % mod;
                }
                count[y]++;
            }
        }
        return (int)ans;
    }
}