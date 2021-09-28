package practicalwork3.pkg1;
public abstract class Flower { // родительский класс
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public abstract double getCost();
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flower)) return false;
        Flower flower = (Flower) o;
        return name.equals(flower.name);
    }
    public int hashCode() {
        return name.hashCode();
    }
    public String toString() {
        return "Flower{" + "name='" + name + '\'' +'}';
    }
}
    class Aster extends Flower {
    private static int count;
    public Aster() {
        super.setName("Астра");
        count++;
    }
    public static int getCount() {
        return count;
    }
    public static void printSoldFlowerInfo() {
        System.out.printf("На текущий момент продано астр - %d шт\n\n", getCount());
    }
    public double getCost() {
        return FlowerMarket.Flowers.ASTER.getPrice();
    }
}
    class Tulip extends Flower {
    private static int count;
    public Tulip() {
        super.setName("Тюльпан");
        count++;
    }
    public static int getCount() {
        return count;
    }
    public static void printSoldFlowerInfo() {
        System.out.printf("На текущий момент продано тюльпанов - %d шт\n\n", getCount());
    }
    public double getCost() {
        return FlowerMarket.Flowers.TULIP.getPrice();
    }
}
    class Carnation extends Flower {
    private static int count;
    public Carnation() {
        super.setName("Гвоздика");
        count++;
    }
    public static int getCount() {
        return count;
    }
    public static void printSoldFlowerInfo() {
        System.out.printf("На текущий момент продано гвоздик - %d шт\n\n", getCount());
    }
    public double getCost() {
        return FlowerMarket.Flowers.CARNATION.getPrice();
    }
}
    class Rose extends Flower{
    private static int count;
    public Rose() {
        super.setName("Роза");
        count++;
    }
    public static int getCount() {
        return count;
    }
    public static void printSoldFlowerInfo() {
        System.out.printf("На текущий момент продано роз - %d шт\n\n", getCount());
    }
    public double getCost() {
        return FlowerMarket.Flowers.ROSE.getPrice();
    }
}