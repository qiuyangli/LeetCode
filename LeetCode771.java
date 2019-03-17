import java.util.HashSet;
import java.util.Set;

public class Test {

    public static void main(String[] args) {
        String J ="aA";
        String S = "aAAbbbb";
        int res = 0;
        Set set = new HashSet();
        for(char c:J.toCharArray())
            set.add(c);
        for(char s:S.toCharArray())
            if(set.contains(s))
                res++;
        System.out.println(res);
    }
}
