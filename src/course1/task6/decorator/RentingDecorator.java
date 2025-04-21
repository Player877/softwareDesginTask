package course1.task6.decorator;

public class RentingDecorator extends BaseDecorator {
    private int transactionCount = 0;
    public RentingDecorator(Rent wrappedService) {
        super(wrappedService);
    }

    @Override
    public void payDeposit() {
        System.out.println("【日志】正在执行操作：支付押金");
        super.payDeposit();
    }

    @Override
    public void signContract() {
        System.out.println("【日志】正在执行操作：签订合同");
        super.signContract();
    }

    @Override
    public void getKeys() {
        System.out.println("【日志】正在执行操作：获取钥匙");
        transactionCount++;
        System.out.println("当前已完成 " + transactionCount + " 笔交易。\n");
        super.getKeys();
    }
}
