package com.example.strategydesignpattern.simple2;

/**
 * 策略上下文
 * 可以获取一些额外的基本信息
 */
public class FinanceContext {
    IFinance finance;

    public FinanceContext(IFinance iFinance) {
        this.finance = iFinance;
    }

    public float finance(int month, int money) {
        return finance.finance(month, money);
    }
    public IFinance getFinance(){
        return finance;
    }
}
