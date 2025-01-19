class Solution {
    public int search(int[] nums, int target) {

        int top = nums.length-1;
        int bot = 0;
        // int mid = nums.length/2; /2

        int jungleDiff = -1;

        while(bot<=top){
            int mid = (bot+top)/2;
            if(nums[mid]==target){
                return mid;
            } else if(nums[mid]<target){
                bot = mid + 1; //3
            } else {
                top = mid -1;
            }
        }

        return jungleDiff;
        
    }
}