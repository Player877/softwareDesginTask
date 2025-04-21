package course1.task6.proxy;

public class RentImpl implements Rent {
    @Override
    public void payDeposit() {
        System.out.println("Deposit paid");
    }

    @Override
    public void signContract() {
        System.out.println("Contract signed");
    }

    @Override
    public void getKeys() {
        System.out.println("Keys received");
    }

}
