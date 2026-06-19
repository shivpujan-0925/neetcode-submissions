class Solution {
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        if(nums.length == 1 || nums.length == 0){
            return false;
        }
        
        for(int i = 1; i < n; i++){
            if(nums[i-1] == nums[i] ){
                return true;
            }
        }
        return false;
    }
}