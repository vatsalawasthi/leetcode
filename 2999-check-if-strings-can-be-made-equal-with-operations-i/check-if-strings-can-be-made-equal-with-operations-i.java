class Solution {
    public boolean canBeEqual(String s1, String s2) {
        for(int i = 0; i<2; i++){
            for(int j = 0; j<2; j++){
                char[] arr = s1.toCharArray();

                if(i==1){
                    char temp = arr[0];
                    arr[0] = arr[2];
                    arr[2] = temp;
                }
                if(j==1){
                    char temp = arr[1];
                    arr[1] = arr[3];
                    arr[3] = temp;
                }
                if(new String(arr).equals(s2)){
                    return true;
                }
            }
        }
        return false;
    }
}