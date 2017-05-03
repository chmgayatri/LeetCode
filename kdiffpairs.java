public class Solution {
    public int findPairs(int[] nums, int k) {
        if(nums==null || nums.length==0 || k<0)return 0;
        int count=0;
        Map<Integer, Integer> hmap = new HashMap();
        for(int i: nums){
            hmap.put(i, hmap.getOrDefault(i,0)+1);
        }
       for(Map.Entry<Integer, Integer> entry : hmap.entrySet()){
           if(k==0){
               if(entry.getValue()>=2){
                   count++;
               }
           }else{
               if(hmap.containsKey(entry.getKey()+k))
               count++;
           }
       }
        return count;
        
    }
}
