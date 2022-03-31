class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int count=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<time.length;i++)
        {
            int div=time[i]%60;
            if(hm.containsKey(60-div))
            {
                count=count+hm.get(60-div);
            }
            if(div==0)
                hm.put(60,hm.getOrDefault(60,0)+1);
            else
                hm.put(div,hm.getOrDefault(div,0)+1);
        }
        return count;
    }
}