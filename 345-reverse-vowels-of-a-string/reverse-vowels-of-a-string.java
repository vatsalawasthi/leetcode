class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        
        int left = 0;
        int right = arr.length - 1;
        
        while (left < right) {
            
            // Move left pointer until vowel found
            while (left < right && !isVowel(arr[left])) {
                left++;
            }
            
            // Move right pointer until vowel found
            while (left < right && !isVowel(arr[right])) {
                right--;
            }
            
            // Swap vowels
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            
            left++;
            right--;
        }
        
        return new String(arr);
    }
    
    // Function to check vowel
    public boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        
        return ch == 'a' || ch == 'e' || ch == 'i' || 
               ch == 'o' || ch == 'u';
    }
}