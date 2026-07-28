class Solution {
    public String smallestPalindrome(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);

        int n = arr.length;
        char[] ans = new char[n];
        
        int l = 0; int r = n-1;

        for(int i = 0; i<n;){
            int j = i;

            while(j<n && arr[j] == arr[i]){
                j++;
            }
            int freq = j-i;

            while(freq>=2){
                ans[l++] = arr[i];
                ans[r--] = arr[i];
                freq -= 2;
            }
            if (freq == 1) {
                ans[n / 2] = arr[i];
            }
            i=j;
        }
        return new String(ans);
    }
}