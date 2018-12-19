import java.util.HashSet;

public class Test {

    public static void main(String[] args) {
        int[] nums1 = {2, 3, 4, 5};
        int[] nums2 = {3, 4, 6, 7, 8};
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    set.add(nums1[i]);
                }
            }
        }
        int res[] = new int[set.size()];
        int i = 0;
        for (int num : set) {
            res[i++] = num;
            System.out.println(num);
        }
    }

}
