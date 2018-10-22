public class TestClass {
    public static void main(String[] args){
        String str = "hello world";
        String tempStr = str.trim();
        if (tempStr.length() != 0) {
            String [] t = str.split(" ");
            String temp = t[t.length -1];
            int length = temp.length();
            System.out.println(length);
        } else {
            System.out.println("error");
        }
    }
}