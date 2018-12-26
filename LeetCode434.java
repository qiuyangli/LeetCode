class Solution {
    public int countSegments(String s) {
        String str = s.trim();
        if (!str.equals("")) {
            return str.split("\\s+").length;
        }
        return 0;
    }
}