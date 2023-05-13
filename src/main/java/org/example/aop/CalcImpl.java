package org.example.aop;

import org.springframework.stereotype.Component;

@Component
public class CalcImpl implements Calc {
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int device(int a, int b) {
        return a - b;
    }

    @Override
    public int cheng(int a, int b) {
        return a * b;
    }
}
