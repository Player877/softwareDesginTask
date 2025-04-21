package course1.task8;

public class Client {
    public static void main(String[] args) {
        // 获取身份证注册表实例
        IdCardRegistry registry = IdCardRegistry.getInstance();

        // 创建居民
        String residentName = "张三";

        // 第一次申请身份证
        IDCard firstID = registry.assignID(residentName);

        // 第二次申请身份证（补办）
        IDCard secondID = registry.assignID(residentName);

        // 输出结果
        System.out.println("\n重复办理身份证，获取旧号码！");
        System.out.println("身份证号码为：" + secondID.getId());

        // 比较两次获取的身份证号码
        System.out.println("\n身份证号码是否一致 ?");
        System.out.println("第一次号码：" + firstID.getId());
        System.out.println("第二次号码：" + secondID.getId());
        System.out.println("内容是否相等：" + firstID.equals(secondID));
        System.out.println("是否是相同对象：" + (firstID == secondID));
    }
}
