package org.example;
public class Factorial {

    public static int cycleExecute(int count) {
        int prod = 1;
        for (int i = 1; i <= count; i++)
            prod*= i;
        return prod;
    }

    public static int recursionExecute(int count) {
        if (count == 1) return 1;

        return count * recursionExecute(count - 1);
    }

}
