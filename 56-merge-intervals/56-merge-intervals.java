class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
        
        List<int[]> l = new ArrayList<>();
        
        for(int[] i: intervals)
            l.add(i);
        
        for(int i=1; i<l.size(); i++){
            if(l.get(i)[0] <= l.get(i-1)[1]){
                if(l.get(i)[1] > l.get(i-1)[1])
                    l.get(i-1)[1] = l.get(i)[1];
                
                l.remove(i);
                
                i--;
            }
        }
        
        int[][] res = new int[l.size()][2];
        
        for(int i=0; i<l.size(); i++)
            res[i] = l.get(i);
        
        return res;
    }
}