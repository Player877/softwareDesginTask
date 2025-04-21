package course1.task6.proxy;

public class Client {
    public static void main(String[] args) {
        // 创建租房服务代理对象
        Rent rentingService = new RentingServiceProxy();
        rentingService.payDeposit();
        rentingService.signContract();
        rentingService.getKeys();
    }


}
