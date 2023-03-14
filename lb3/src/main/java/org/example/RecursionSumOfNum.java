package org.example;
public class RecursionSumOfNum {

    public static int execute(int x, int y) {
        if (x==0 && y==0) return 0;
        if (x==0) return y;
        if (y==0) return x;

        return execute(x+1,y-1);
    }
}
