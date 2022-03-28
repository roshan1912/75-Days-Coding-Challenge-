class RandomizedSet {
    HashMap<Integer,Integer> map;
    ArrayList<Integer> list;

    public RandomizedSet() {
         map = new HashMap<>();
        list = new ArrayList<>(); 
    }
    
    public boolean insert(int val) {
        if(map.containsKey(val)) return false;
        list.add(val);
        map.put(val,list.size()-1);
        return true;
    }
    
    public boolean remove(int val) {
        if(map.containsKey(val)==false )
            return false;
        int id = map.get(val);
        Collections.swap(list,id,list.size()-1);
        int swapedwith = list.get(id);
        map.put(swapedwith,id);
        list.remove(list.size()-1);
        map.remove(val);
        return true;
        
    }
    
    public int getRandom() {
        Random rand = new Random();
        int idx = rand.nextInt(list.size());
        return list.get(idx);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */