class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;

        int[] temp = new int[n];
        int k = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr2[i] == arr1[j]) {
                    temp[k++] = arr1[j];
                }
            }
        }
        List<Integer> leftover = new ArrayList<>();
        for (int j = 0; j < n; j++) {
            boolean found = false;
            for (int i = 0; i < m; i++) {
                if (arr1[j] == arr2[i]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                leftover.add(arr1[j]);
            }
        }
        Collections.sort(leftover);
        for (int num : leftover) {
            temp[k++] = num;
        }

        return temp;
    }
}
