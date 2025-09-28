class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int arr[] = new int[k];
        Map<Integer,Integer> map= new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int num : map.keySet()){
            list.add(map.get(num));
        }
        Collections.sort(list, Collections.reverseOrder());
        
        for(int i =0;i<k;i++){
            int value = list.get(i);
            for(int num : map.keySet()){
                if(map.get(num) == value){
                    arr[i]=num;
                    map.remove(num);
                    break;
                }
            }
        }
        return arr;
    }
}