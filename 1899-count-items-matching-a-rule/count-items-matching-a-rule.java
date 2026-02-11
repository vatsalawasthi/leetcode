class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {

        int i;
        switch (ruleKey) {
            case "type":
                i = 0;
                break;
            case "color":
                i = 1;
                break;
            default: 
                i = 2;
        }

        int count = 0;
        for (List<String> item : items) {
            if (item.get(i).equals(ruleValue)) {
                count++;
            }
        }
        return count;
    }
}

