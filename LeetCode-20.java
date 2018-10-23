class Solution {
    public boolean isValid(String s) {
        int a = s.length();
        for(int i = 0;i< a/2; i++) {
            s = s.replace("()","").replace("{}","").replace("[]","");
        }
        if (s.length() == 0) 
            return true;
        else 
            return false;
    }
}