public class TestClass {
    public static void main(String[] args){
        int[] input = {1,4,6,7,8,9};
        int k = 6;
        if (k > input[input.length - 1]) {
            System.out.println(input.length);
            // return input.length;
        }
        if (k < input[0]) {
            System.out.println(0);
            // return 0;
        }


        int mid = input[input.length / 2 -1];
        if (k > mid){
            for (int i = input.length / 2 -1;i < input.length; i++) {
                if (input[i] == k) {
                    System.out.println(i);
                    //return i;
                }
                else {
                    if (k>input[i] && k<input[i+1]) {
                        System.out.println(i+1);
                        // return i+1;
                    }
                }
            }
        } else {
            for (int i = 0; i < input.length / 2; i++) {
                if (input[i] == k) {
                    System.out.println(i);
                    //return i;
                } else {
                    if (k > input[i] && k < input[i + 1]) {
                        System.out.println(i+1);
                        // return i+1;
                    }
                }
            }
        }
    }
}
