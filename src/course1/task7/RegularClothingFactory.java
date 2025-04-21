package course1.task7;

public class RegularClothingFactory implements ClothingFactory
{
    @Override
    public Cloth createTopcoat() {
        return new Topcoat(100, "普通上装");
    }

    @Override
    public Cloth createLowerGarment() {
        return new LowerGarment(50, "普通下装");
    }

    @Override
    public Cloth createSocks() {
        return new Socks(10, "普通袜子");
    }

    @Override
    public Cloth createShoes() {
        return new Shoes(80, "普通鞋子");
    }
}
