class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int arr[]=new int[2];
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        
        for(int i=0;i<nums.length;i++){
            int result= target-nums[i];
             if(map.containsKey(result) && map.get(result) != i){
                arr[1]=map.get(result);
                arr[0]=i;
                return arr;
             }
        }
         return new int[]{};
    }
}
