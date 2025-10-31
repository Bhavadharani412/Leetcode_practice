class RandomizedSet {
    private List<Integer> value;
    private Map<Integer, Integer> index;
    public RandomizedSet() {
        this.value = new ArrayList<>();
        this.index = new HashMap<>();
    }
    public boolean insert(int val) {
        if(index.containsKey(val)) return false;
        index.put(val,value.size());
        value.add(val);
        return true;
    }
    public boolean remove(int val) {
        if(!index.containsKey(val)) return false;
        int idx = index.get(val);
        index.put(value.get(value.size() - 1), idx);
        index.remove(val);
        value.set(idx, value.get(value.size() - 1));
        value.remove(value.size() - 1);
        return true;
    }
    public int getRandom() {
        int idx = (int) (Math.random() * value.size());
        return value.get(idx);
    }
} 