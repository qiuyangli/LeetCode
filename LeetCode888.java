public class Test {
    public static void main(String[] args) {
        int[] a = {1, 1};
        int[] b = {2, 2};
        int aSum = 0;
        int bSum = 0;
        int[] res = {};
        for (int i = 0; i < a.length; i++) {
            aSum = aSum + a[i];
        }
        for (int j = 0; j < b.length; j++) {
            bSum = bSum + b[j];
        }
        int sum = (aSum + bSum) / 2;
        int aSubtract = sum - aSum;
        int bSubtract = sum - bSum;
        if (aSubtract > 0) {
            for (int i = 0; i < b.length; i++) {
                for (int j = 0; j < a.length; j++) {
                    if (b[i] - a[j] == aSubtract) {
                        System.out.println(b[j]);
                        System.out.println(a[i]);

                    }
                }
            }
        }
        if (bSubtract > 0) {
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < b.length; j++) {
                    if (a[i] - b[j] == bSubtract) {
                        System.out.println(b[j]);
                        System.out.println(a[i]);
                    }
                }
            }
        }
    }
}
