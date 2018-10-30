class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<String,Integer> map1 = new HashMap<String, Integer>();
        HashMap<String,Integer> map2 = new HashMap<String, Integer>();
        for (int i = 0;i < s.length(); i++) {
            String temp1 = String.valueOf(s.charAt(i));
            if (map1.containsKey(temp1)) {
                map1.put(temp1, map1.get(temp1) + 1);
            } else {
                map1.put(temp1, 1);
            }
        }
        for (int j = 0;j < t.length(); j++) {
            String temp2 = String.valueOf(t.charAt(j));
            if (map2.containsKey(temp2)) {
                map2.put(temp2, map2.get(temp2) + 1);
            } else {
                map2.put(temp2, 1);
            }
        }
        return (map1.equals(map2));
    }
}