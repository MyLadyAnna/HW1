package ru.gb.hw1.sample;

import ru.gb.hw1.regular.OtherClass;
import ru.gb.hw1.regular.Decorator;

public class Main {
    public static void main(String[] args) {
        int result = OtherClass.sum(4, 2);
        System.out.println(Decorator.decorator(result));
        result = OtherClass.sub(4, 2);
        System.out.println(Decorator.decorator(result));
        result = OtherClass.mul(4, 2);
        System.out.println(Decorator.decorator(result));
        result = OtherClass.div(4, 2);
        System.out.println(Decorator.decorator(result));
    }
}
