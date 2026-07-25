class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        int res[]=new int[k];
        int max=0;
        int secondMax=0;
        for(int num:nums){
            int freq=map.getOrDefault(num,0)+1;
            map.put(num,freq);

        }
        ArrayList<int[]> arr=new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            arr.add(new int[]{entry.getValue(),entry.getKey()});
        }
            arr.sort((a,b)->b[0]-a[0]);
            for(int i=0;i<k;i++){
                res[i]=arr.get(i)[1];
            }
        return res;
        
    }
}
