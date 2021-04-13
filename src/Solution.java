

import java.util.*;



class Result {

    /*
     * Complete the 'pthFactor' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. LONG_INTEGER n
     *  2. LONG_INTEGER p
     */
    //----- ORIGINAL
    /*
    public static long pthFactor(long n, long p) {
        // Write your code here
        ArrayList<Long> factors = new ArrayList<>();
        factors.add((long)0);

        for(long i = 1; i <= n; i++) {
            if(n % i == 0) {
                factors.add(i);
            }
        }

        if(factors.size() == 1 || p >= factors.size()) {
            return 0;
        } else {
            System.out.println(factors.get((int)p));
            return factors.get((int)p);
        }
    }

     */

    public static long pthFactor(long n, long p) {
        // Write your code here
        ArrayList<Long> factors = new ArrayList<>();
        long result = 1;

        while(result * result <= n) {
            if(n % result == 0) {
                factors.add(result);

                if(n / result != result) {
                    factors.add(n / result);
                }
            }
            result++;
        }

        Collections.sort(factors);
        System.out.println(factors);
        if(factors.size() < 1 || p > factors.size()) {
            return 0;
        }
        return factors.get((int) p - 1);
    }
}

public class Solution {
    public static void main(String[] args) {
        long result = Result.pthFactor(20, 3);
        long result1 = Result.pthFactor(10, 3); // 5
        long result2 = Result.pthFactor(1048576, 12); // 2048
        long result3 = Result.pthFactor(1, 1); // 1
        // long result4 = Result.pthFactor(22876792454961, 28);
        long result5 = Result.pthFactor(10, 5); // 0


        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        // System.out.println(result4);
        System.out.println(result5);


    }
}
