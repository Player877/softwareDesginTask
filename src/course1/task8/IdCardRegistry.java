package course1.task8;

import java.util.HashMap;
import java.util.Map;

public class IdCardRegistry {
    private static IdCardRegistry instance; // 单例实例
    private Map<String, IDCard> registry; // 居民与身份证号码的映射

    // 私有构造函数，防止外部实例化
    private IdCardRegistry() {
        this.registry = new HashMap<>();
    }

    // 获取单例实例
    public static IdCardRegistry getInstance() {
        if (instance == null) {
            synchronized (IdCardRegistry.class) {
                if (instance == null) {
                    instance = new IdCardRegistry();
                }
            }
        }
        return instance;
    }


    // 分配身份证号码
    public IDCard assignID(String residentName) {
        if (!registry.containsKey(residentName)) {
            // 生成唯一身份证号码（这里简单使用随机数模拟）
            String id = UuidManager.generateUniqueID();
            IDCard card = new IDCard(id);
            registry.put(residentName, card);
            System.out.println("第一次办理身份证，分配新号码！");
            System.out.println("身份证号码为：" + id);
            return card;
        } else {
            IDCard existingCard = registry.get(residentName);
            System.out.println("重复办理身份证，获取旧号码！");
            return existingCard;
        }
    }

    // 查询身份证号码
    public IDCard getID(String residentName) {
        if (registry.containsKey(residentName)) {
            return registry.get(residentName);
        } else {
            System.out.println("居民 " + residentName + " 尚未分配身份证号码！");
            return null;
        }
    }


}
