// Практическая работа 3. Задание 1
package practicalwork3.pkg1;
public class FlowerDemo {
    public static void main(String[] args) {
        Rose[] roses = new Rose[100];
        for (int i = 0; i < roses.length; i++) {
            roses[i] = new Rose();
        }
        Bouquet bouquet = new Bouquet(roses);
        printInfo(bouquet);
        bouquet = new Bouquet(new Tulip(), new Tulip(), new Tulip(), new Aster(), new Aster());
        printInfo(bouquet);
        bouquet = new Bouquet(new Carnation(), new Tulip(), new Carnation(), new Rose(), new Rose());
        printInfo(bouquet);
    }
    private static void printInfo(Bouquet bouquet) {
        System.out.print(bouquet);
        System.out.printf("Стоимость букета: %.1f руб\n\n", bouquet.getBouquetCost());
    }
}
