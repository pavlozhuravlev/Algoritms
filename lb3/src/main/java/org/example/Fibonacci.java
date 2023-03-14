package org.example;
public class Fibonacci {
    public static int cycleExecute(int count) {
        int x = 0;
        int y = 1;
        int summ = 0;

        if (count == 1) return 1;

        for (int i = 2; i <= count; i++) {
            summ = x + y;
            x = y;
            y = summ;
        }
        return summ;
    }

    public static int recursionExecute(int count) {
        if (count == 1)
            return 1;
        if (count == 0)
            return 0;

        return recursionExecute(count - 1) + recursionExecute(count - 2);
    }

}
