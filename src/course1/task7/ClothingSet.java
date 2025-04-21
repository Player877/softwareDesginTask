package course1.task7;

import java.util.ArrayList;
import java.util.List;

public class ClothingSet {
    private List<Cloth> clothingList = new ArrayList<>();

    public void add(Cloth clothing) {
        clothingList.add(clothing);
    }

    public void display() {
        double totalPrice = 0;
        System.out.println("服饰套装详情：");
        for (Cloth clothing : clothingList) {
            System.out.println("- " + clothing.getDescription() + "，价格：" + clothing.getValue());
            totalPrice += clothing.getValue();
        }
        System.out.println("总价：" + totalPrice);
    }
}
