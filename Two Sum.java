class Solution {
    public int[] twoSum(int[] nums, int target) {
       

    int i,j;
    int flag = 0;
    int []a = new int[2];
    for(i = 0; i <=nums.length-2; i++)
        for(j = i+1; j <= nums.length - 1; j++)
        {
            if(nums[i]+nums[j] == target)
            {
                a[0] = i;
                a[1] = j;
                flag = 1;
                break;
            }
            if(flag == 1)
                break;
}
    return a;

    }
} 
