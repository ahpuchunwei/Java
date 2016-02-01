package com.jxnu.app.util;

/**
 * Created by puchunwei on 16/2/1.
 */
public class StringValue {

    public static void main(String[] args) throws Exception {
        long runs = 10000000;
        for (int i=0; i<5; i++) {
            double perf1 = perfStringPlus(runs);
            Thread.sleep(100);
            double perf2 = perfStringValueOf(runs);
            Thread.sleep(100);
            double perf3 = perfLongToString(runs);
            Thread.sleep(100);

            System.out.println(String.format(
                    "\"\" + i: %.3f, String.valueOf: %.3f, Long.toString: %.3f",
                    perf1, perf2, perf3
            ));
        }
    }

    public static double perfStringPlus(long runs) {
        long start = System.nanoTime();
        String s;
        for (long i=0; i<runs; i++) {
            s = "" + i;
        }
        long time = System.nanoTime() - start;
        return time * 1.0 / runs;
    }

    public static double perfStringValueOf(long runs) {
        long start = System.nanoTime();
        String s;
        for (long i=0; i<runs; i++) {
            s = String.valueOf(i);
        }
        long time = System.nanoTime() - start;
        return time * 1.0 / runs;
    }

    public static double perfLongToString(long runs) {
        long start = System.nanoTime();
        String s;
        for (long i=0; i<runs; i++) {
            s = Long.toString(i);
        }
        long time = System.nanoTime() - start;
        return time * 1.0 / runs;
    }

}
