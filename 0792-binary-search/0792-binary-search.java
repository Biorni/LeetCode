class Solution {
    public int search(int[] nums, int target) {

        int top = nums.length-1;
        int bot = 0;

        while(bot<=top){
            int mid = (bot+top)/2;
            if(nums[mid]==target){
                return mid;
            } else if(nums[mid]<target){
                bot = mid + 1;
            } else {
                top = mid -1;
            }
            System.gc();
        }

        return -1;
        
    }
}