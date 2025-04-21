package course1.task6.decorator;

public class Client {
    public static void main(String[] args) {
        Rent rent = new RentImpl();
        RentingDecorator rentingDecorator = new RentingDecorator(rent);
        rentingDecorator.payDeposit();
        rentingDecorator.signContract();
        rentingDecorator.getKeys();
    }
}
