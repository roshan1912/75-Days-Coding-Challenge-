class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> q = new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int i = 0; i < stones.length; i++){
            q.add(stones[i]);
        }
        System.out.println(q);
        int i = q.peek();
        int j = i;
        while(!q.isEmpty()){
            i = q.poll();
            if(q.isEmpty()){
                break;
            }else{
                j = q.poll();
            }
            if(i != j){
                i = i-j;
                q.add(i);
            }else if(i == j && q.isEmpty()){
                return 0;
            }
        }
        return i;
    }
}