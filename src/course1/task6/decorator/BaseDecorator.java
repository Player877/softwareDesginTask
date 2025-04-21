package course1.task6.decorator;

abstract class BaseDecorator implements Rent {
    protected Rent wrappedService;

    public BaseDecorator(Rent wrappedService) {
        this.wrappedService = wrappedService;
    }

    @Override
    public void payDeposit() {
        wrappedService.payDeposit();
    }

    @Override
    public void signContract() {
        wrappedService.signContract();
    }

    @Override
    public void getKeys() {
        wrappedService.getKeys();
    }
}

