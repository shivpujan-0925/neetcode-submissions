class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int maxWater = 0;

        int start = 0;
        int end = n - 1;

        while(start < end){
            int currWater = Math.min(heights[start], heights[end]) * (end - start);

            maxWater = Math.max(currWater , maxWater);

            if(heights[start] < heights[end]){
                start++;
            }else {
                end--;
            }
        }
        return maxWater;
    }
}
