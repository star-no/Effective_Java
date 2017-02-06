package chapter02.규칙05_unused_object;

import java.util.Date;

/**
 * Created by star.no
 * on 2017. 2. 6..
 */
public class AutoBoxing {
    public static void main(String[] args) {
        long before = System.currentTimeMillis();
        Long sumLong = 0L;
        for (long i = 0 ; i < Integer.MAX_VALUE ; i++) {
            sumLong += i;
        }
        long end = System.currentTimeMillis();

        System.out.println("Long sum, total time > " + (end - before));

        before = System.currentTimeMillis();
        long sumlong = 0L;
        for (long i = 0 ; i < Integer.MAX_VALUE ; i++) {
            sumlong += i;
        }
        end = System.currentTimeMillis();

        System.out.println("long sum, total time > " + (end - before));
    }
}
