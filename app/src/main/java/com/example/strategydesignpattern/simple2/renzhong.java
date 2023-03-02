package com.example.strategydesignpattern.simple2;

public class renzhong implements IFinance {
    @Override
    public float finance(int month, int money) {
        if (month == 3) {
            return money + money * 0.009f * 12f / 12 * month;
        }
        if (month == 6) {
            return money + money * 0.112f * 12f / 12 * month;
        }
        if (month == 12) {
            return money + money * 0.12f * 12f / 12 * month;
        }
        throw new IllegalArgumentException("月份不对");
    }
}
