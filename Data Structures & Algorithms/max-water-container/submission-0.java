class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int maxArea = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                int lowerBound = Math.min(heights[i], heights[j]);
                int area = lowerBound * (j-i);

                if(area > maxArea){
                    maxArea = area;
                }
            }
        }
        return maxArea;
    }
}
