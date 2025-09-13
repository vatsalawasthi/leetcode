class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
            int left = 0;
        int right = mountainArr.length() - 1;
        while(left<right){
            int mid = left + (right-left)/2;
            if(mountainArr.get(mid)<mountainArr.get(mid+1)){
                left = mid+1;
            }else{
                right = mid;
            }
        }
           int peak = left;
           int index = binarySearch(mountainArr, target, 0, peak, true);
        if (index != -1) return index;

        // Step 3: Binary search on the right (descending)
        return binarySearch(mountainArr, target, peak + 1, mountainArr.length() - 1, false);
    }

    private int binarySearch(MountainArray mountainArr, int target, int left, int right, boolean asc) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int val = mountainArr.get(mid);

            if (val == target) return mid;

            if (asc) {
                if (val < target) left = mid + 1;
                else right = mid - 1;
            } else {
                if (val > target) left = mid + 1;
                else right = mid - 1;
            }
        }
        return -1;
    }
}