package course1.task6.proxy;

class RentingServiceProxy implements Rent {
    private RentImpl realService;
    private int transactionCount = 0;

    public RentingServiceProxy() {
        this.realService = new RentImpl();
    }

    @Override
    public void payDeposit() {
        logTransaction("支付押金");
        realService.payDeposit();
    }

    @Override
    public void signContract() {
        logTransaction("签订合同");
        realService.signContract();
    }

    @Override
    public void getKeys() {
        logTransaction("获取钥匙");
        realService.getKeys();
        transactionCount++;
        System.out.println("当前已完成 " + transactionCount + " 笔交易。\n");
    }

    // 添加交易日志
    private void logTransaction(String action) {
        System.out.println("【交易日志】正在执行操作：" + action);
    }
}
