package course1.task9;

public class Dormitory extends House{
    public Dormitory() {
        // 普通宿舍有一个卫生间和一个沐浴间
        addComponent(new Bathroom());
        addComponent(new Shower());
    }
}
