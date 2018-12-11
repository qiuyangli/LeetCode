import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 4};
        int target = 6;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            map.put(numbers[i], i+1);
        }
        System.out.println(map);
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(target - numbers[i]) && i+1 != map.get(target - numbers[i])) {
                System.out.println(i + 1);
                System.out.println(map.get(target - numbers[i]));
            }
        }
    }
}
