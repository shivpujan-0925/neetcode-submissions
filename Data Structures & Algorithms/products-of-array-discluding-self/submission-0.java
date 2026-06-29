class Solution {
    public int[] productExceptSelf(int[] nums) {

        //bruteforce approach

        int n = nums.length;
        int result[] = new int[n];

        for(int i = 0; i < n; i++){
            int totalProduct = 1;
          
            for(int j = 0; j < n; j++){
             
                if(i != j){
                  totalProduct *= nums[j];
                }
            }
            result[i] = totalProduct;
    
            
        }
        return result;
    }
}  
