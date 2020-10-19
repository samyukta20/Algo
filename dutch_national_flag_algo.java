class Solution{
  public void SortColors(int[] nums){
  int l = 0;
  int m = 0;
  int h = nums.length - 1;
  int temp;
  
  while(m<h){
     if(nums[m]==0)
         temp = nums[l];
         nums[l] = nums[m];
         nums[m] = temp;
         l++;
         m++;
     else if(nums[m] == 1)
           m++;
     else(nums[m] == 2)
        temp = nums[m];
        nums = nums[h];
        nums[h] = temp;
        h--;
      }
   }
 }
     
