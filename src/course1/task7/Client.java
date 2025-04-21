package course1.task7;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        // 用户选择服饰等级
        System.out.println("请选择服饰等级（1: 高档, 2: 普通）：");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        // 创建对应的工厂
        ClothingFactory factory;
        if (choice == 1) {
            factory = new HighEndClothingFactory();
            System.out.println("您选择了高档服饰。\n");
        } else {
            factory = new RegularClothingFactory();
            System.out.println("您选择了普通服饰。\n");
        }

        // 创建服饰套装
        ClothingSet clothingSet = new ClothingSet();
        clothingSet.add(factory.createTopcoat());
        clothingSet.add(factory.createLowerGarment());
        clothingSet.add(factory.createSocks());
        clothingSet.add(factory.createShoes());

        // 显示服饰信息
        clothingSet.display();
    }
}
