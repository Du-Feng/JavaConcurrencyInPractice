package org.example;

public class Account { //账户类
    public Account(Integer banalce) {
        this.banalce = banalce;
    }

    private Integer banalce;

    public void transactionToTarget(Integer money, Account target) {//转账方法
        Allocator.getInstance().apply(this, target);
        this.banalce -= money;
        target.setBanalce(target.getBanalce() + money);
        Allocator.getInstance().release(this, target);
    }

    public Integer getBanalce() {
        return banalce;
    }

    public void setBanalce(Integer banalce) {
        this.banalce = banalce;
    }
}
