package org.example;

public class Main {

    public static void main(String[] args) {

        RecursionSumDigits sumDigits = new RecursionSumDigits();
        RecursionSumOfNum sumOfNum = new RecursionSumOfNum();
        Factorial fact = new Factorial();
        Fibonacci fib = new Fibonacci();

        int n1 = 9;
        int n2 = 7;

        int n = 2;

        int a = fact.cycleExecute(n);
        int b = fact.recursionExecute(n);

        System.out.println(n + "!");

        assert a == b : "Different values";

        System.out.println(a);
        System.out.println(b);

        System.out.println();

        int c = fib.cycleExecute(n);
        int d = fib.recursionExecute(n);

        System.out.println("Fibonacci: " + n);

        assert c == d : "Different values";

        System.out.println(c);
        System.out.println(d);

        System.out.println();

        int sd = sumDigits.execute(n);

        System.out.println("Sum of digits of number: " + n);
        System.out.println(sd);

        System.out.println();

        int sn = sumOfNum.execute(n1, n2);

        System.out.println(n1 + " + " + n2 + " = " + sn);

    }
}