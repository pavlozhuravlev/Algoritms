package org.example;
public class RecursionSumDigits {

    public static int execute(int count) {

        if (count == 0)
            return 0;
        else
        return execute(count / 10) + count % 10;
    }

}
