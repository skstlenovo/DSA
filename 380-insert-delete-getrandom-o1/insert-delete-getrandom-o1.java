class RandomizedSet {

    List<Integer> randomSet;
    Random random;

    public RandomizedSet() {
        randomSet = new ArrayList<>();
        random = new Random();
    }
    
    public boolean insert(int val) {
        if(!randomSet.contains(val)){
            randomSet.add(val);
            return true;
        }
        return false;
    }
    
    public boolean remove(int val) {
        if(randomSet.contains(val)){
            int i =randomSet.size()-1;
            if(i>1){
                randomSet.set(randomSet.indexOf(val), randomSet.get(i));
                randomSet.remove(i);
            }else{
                randomSet.remove((Integer)val);
            }
            return true;
        }
        return false;
    }
    
    public int getRandom() {        
        return randomSet.get(random.nextInt(randomSet.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */