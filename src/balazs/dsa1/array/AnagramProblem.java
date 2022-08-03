package balazs.dsa1.array;

import java.util.Arrays;

public class AnagramProblem {

    public boolean solve(char[] s1, char[] s2) {
        if (s1.length != s2.length) return false;

        Arrays.sort(s1);
        Arrays.sort(s2);//NlogN

        for (int i = 0; i < s1.length; ++i)
            if (s1[i] != s2[i])
                return false;
        return true;
    }
}
