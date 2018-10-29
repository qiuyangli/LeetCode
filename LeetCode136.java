import java.util.HashMap;

public class TestClass {
    public static void main(String[] args){
        int a[] = {2,2,3,4,4,7,7};
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0 ;i < a.length;i++) {
            if (map.containsKey(a[i])) {
                map.put(a[i],2);
            } else {
                map.put(a[i],1);
            }
        }
        for (int j = 0;j < a.length;j++) {
            if (map.get(a[j]) == 1) {
                System.out.println(a[j]);
            }
        }
    }
}
