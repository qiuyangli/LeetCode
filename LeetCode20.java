class Solution {
    public boolean isValid(String s) {  
        Stack<Character> stack = new Stack<Character>();
        HashMap<Character,Character> map = new HashMap<Character,Character>();
        map.put(']','[');
        map.put('}','{');
        map.put(')','(');
        for(int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            if (map.containsKey(a)) {
                char node = stack.isEmpty() ? 'c' : stack.pop();
                if (node != map.get(a)) {
                    return false;
                }
            } else {
                stack.push(a);
            }
        }
        return stack.isEmpty();
    }
}