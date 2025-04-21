package course1.task8;

public class UuidManager {
    // 模拟生成唯一身份证号码
    public static String generateUniqueID() {
        return "No" + (int) (Math.random() * 1000000000); // 生成9位随机数字
    }
}
