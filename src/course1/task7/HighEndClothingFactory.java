package course1.task7;

public class HighEndClothingFactory implements ClothingFactory{
    @Override
    public Cloth createTopcoat() {
        return new Topcoat(1000, "高档上装");
    }

    @Override
    public Cloth createLowerGarment() {
        return new LowerGarment(1000, "高档下装");
    }

    @Override
    public Cloth createSocks() {
        return new Shoes(500, "高档袜子");
    }

    @Override
    public Cloth createShoes() {
        return new Shoes(1000, "高档鞋子");
    }

}
