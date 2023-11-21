package ru.gb.hw1.regular;
public class Decorator {
    public static String decorator (int a) {
        /**
         * Метод декорирует число, добывляя ему строку
         */
        return String.format("Result: %d.", a);
    }
}
