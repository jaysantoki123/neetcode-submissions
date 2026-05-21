class Solution {
    public int maxArea(int[] heights) {
        int l = 0;
        int r = heights.length - 1;
        int maxarea = Math.min(heights[l],heights[r]) * (r-l);
     
        while(l < r){
            if(heights[l] <= heights[r]){
                l++;
                maxarea = Math.max(maxarea , (Math.min(heights[l],heights[r]) * (r-l)));
            }else if(heights[r] < heights[l]){
                r--;
                 maxarea = Math.max(maxarea , (Math.min(heights[l],heights[r]) * (r-l)));
            }
        }

         return maxarea;
    }
}
