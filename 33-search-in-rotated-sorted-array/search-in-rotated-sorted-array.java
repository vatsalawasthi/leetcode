class Solution {
   public int search(int[] nums, int target) {
        int pivot = findpivot(nums);
        if(pivot==-1){
     return search(nums, target, 0, nums.length-1 );
        }
        if(nums[pivot]==target){
            return pivot;
        }if(target>=nums[0]){
            return search(nums, target, 0, pivot-1);
        }else{
            return search(nums, target, pivot+1, nums.length-1);
        }
   }
   public int search(int[] nums, int target, int start, int end) {
       
        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid]==target){
               return mid;
            }else if(nums[mid]<target){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
   }
       public int findpivot(int[] arr){
          int left = 0;
        int right = arr.length-1;
        while(left<right){
            int mid = left + (right-left)/2;
            if(mid < right && arr[mid]>arr[mid+1]){
               return mid;
            }else if(mid>left && arr[mid]<arr[mid-1]){
                return mid-1;
            }else if(arr[mid]<=arr[left]){
                right = mid-1;
            }else{
                left = mid + 1;
            }
        }
        return -1;
    }
}