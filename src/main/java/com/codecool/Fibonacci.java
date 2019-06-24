package com.codecool;


class Fibonacci {

    static int calculateFibonacciNumbers(int n) {

        if (n < 2) {
            return n;
        }
        return calculateFibonacciNumbers(n - 1) + calculateFibonacciNumbers(n - 2);
    }

}
