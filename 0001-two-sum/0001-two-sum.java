class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0; i < nums.length; i++) {
           int remeinder = target - nums[i]; //2
           if(map.containsKey(remeinder)) {
            return new int[] {map.get(remeinder), i};
           } 
           map.put(nums[i],i); //2,1
        }
        return new int[] {-1,-1};
    }
}