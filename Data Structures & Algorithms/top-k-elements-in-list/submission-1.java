class Solution { 
public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> list = new  HashMap<>();
        for(int num : nums){
            list.put(num,list.getOrDefault(num,0)+1);
        }

        PriorityQueue<Map.Entry<Integer,Integer>> store = new PriorityQueue<>(
            (a,b) -> b.getValue()-a.getValue()
        );
        //PriorityQueue<Map.Entry<Integer, Integer>> store = new PriorityQueue<>(
          //  (a, b) -> b.getValue() - a.getValue()
        //);
        store.addAll(list.entrySet());
        int[] res = new int[k];
        for(int i=0;i<k;i++){
            res[i] = store.poll().getKey();
        }
        return res; 
    }
}
