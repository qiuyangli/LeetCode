class Solution {
    public boolean checkRecord(String s) {
        if (s.contains("LLL")) {
            return false;
        }
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            if ("A".equals(String.valueOf(s.charAt(i)))) {
                j++;
            }
        }
        if (j >= 2) {
            return false;
        } else {
            return true;
        }
    }
}