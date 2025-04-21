package course1.task9;

public class Apartment extends House{
    public Apartment() {
        // 公寓有一个卫生间和一个沐浴间
        addComponent(new Bathroom());
        addComponent(new Bathroom());
        addComponent(new Shower());
        addComponent(new Shower());
        addComponent(new Kitchen());
    }
}
