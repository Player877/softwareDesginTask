package course1.task9;

public class Client {
    public static void main(String[] args) {
        // 创建宿舍
        House dormitory = new Dormitory();
        System.out.println("普通宿舍每月租金：" + dormitory.getRent() + " 元");

        // 创建公寓
        House apartment = new Apartment();
        System.out.println("公寓每月租金：" + apartment.getRent() + " 元");
    }
}
