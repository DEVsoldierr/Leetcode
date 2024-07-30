class Solution {
    public int maxSubArray(int[] nums) {
         int i=0;
        int curr=0;
        int max=Integer.MIN_VALUE;
        int n=nums.length;
        for(i=0;i<n;i++)
        {
            curr=curr+nums[i];
            if(curr>max)
            {
                max=curr;
            }
            if(curr<0)
            {
                curr=0;
            }
        }
        return max;
    }
    
}
//used kadane algorithm to solve-> this https://www.geeksforgeeks.org/largest-sum-contiguous-subarray/
/*we will be having current sum and maximum sum , we will be calculating curr sum by iterating thorugh the array with the prvious current sum , then we compare the current um with max sum , if it is 
  greater than previous max sum then it will change the max .
