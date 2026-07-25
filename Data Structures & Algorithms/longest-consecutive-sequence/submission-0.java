class Solution {
    public int longestConsecutive(int[] nums) {
        int res=0;
        Set<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }

        for(int num:nums){
            int count=0;
            int curr=num;
            while(set.contains(curr)){
                count++;
                curr++;
            }
            res=Math.max(res,count);
        }
        return res;
    }
}
