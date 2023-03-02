package com.example.strategydesignpattern.simple1;

public class FinanceManager {
    public enum Finance{
        ZHIFUBAO,
        MINZHONF
    }
    public float zhifubaoFinance(int month, int money) {
        if (month == 3) {
            return money + money * 0.047f * 12f / 12 * month;
        }
        if (month == 6) {
            return money + money * 0.05f * 12f / 12 * month;
        }
        if (month == 12) {
            return money + money * 0.06f * 12f / 12 * month;
        }
        throw new IllegalArgumentException("月份不对");
    }

    public float renzhongjinfu(int month, int money) {
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
    public float floatfinance (int month,int money,Finance finance){
        switch (finance){
            case ZHIFUBAO:
                return zhifubaoFinance(month,money);
            case MINZHONF:
                return renzhongjinfu(month,money);
            default:
                return 0f;

        }
    }
}
