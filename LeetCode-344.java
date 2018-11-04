class Solution {
    public String reverseString(String s) {
        int i = s.length();
        char[] ch = new char[i];
        int a = 0;
        int b = i - 1;
        for (; a < i; a++, b--) {
            ch[a] = s.charAt(b);
        }
        String str = new String(ch);
        return str;
    }
}