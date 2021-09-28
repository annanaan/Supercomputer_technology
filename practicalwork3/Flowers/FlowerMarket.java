package practicalwork3.pkg1;
public class FlowerMarket {
    public enum Flowers {
        ROSE("Роза", 144), ASTER("Астра", 119), CARNATION("Гвоздика", 46), TULIP("Тюльпан", 96);
        Flowers(String name, double price) {
            this.name = name;
            this.price = price;
        }
        private final double price;
        private final String name;
        public double getPrice() {
            return price;
        }
        public String getName() {
            return name;
        }
    }
    public Flower getFlower(Flowers flower) {
        switch (flower) {
            case ROSE:
                return new Rose();
            case ASTER:
                return new Aster();
            case TULIP:
                return new Tulip();
            case CARNATION:
                return new Carnation();
            default: return null;
        }
    }
    public Bouquet getBouquet(Flowers... flowers) {
        Flower[] flower = new Flower[flowers.length];
        for (int i = 0; i < flowers.length; i++) {
            flower[i] = getFlower(flowers[i]);
        }
        return new Bouquet(flower);
    }
}