// Практическая работа 4. Задание 4
package practicalwork4.pkg4;
public class FoodDemo {
    public static void main(String[] args) {
        Food[] food = new Food[4];
        
        Starter starter = new Starter (200);
        starter.setKcal(200);
        food [0] = starter;
        
        Soup soup = new Soup (300);
        soup.setProteins(50);
        food [1] = soup;
        
        Salad salad = new Salad (150);
        salad.setFats(5);
        food [2] = salad;
        
        MainDish mainDish = new MainDish (100);
        mainDish.setCarbohydrates(300);
        food [3] = mainDish;
        
        for (Food f:food)
            System.out.println(f.getGrams());
    }
class Food {
        private int grams;
    public Food (int grams){
        this.grams=grams;
    }
    public int getGrams(){
        return grams;
    }
}
class Starter extends Food {
    private int kcal;
    public Starter (int grams){
        super(grams);
        this.kcal=kcal;
    }
    public int setKcal(int k){
        kcal = k;
        return kcal;
    }
    public int getGrams(){
        int baseGrams = super.getGrams();
        return (baseGrams*kcal)/100;
    }
}
class Soup extends Food {
    private int proteins;
    public Soup (int grams){
        super(grams);
        this.proteins=proteins;
    }
    public int setProteins(int p){
        proteins = p;
        return proteins;
    }
    public int getGrams(){
        int baseGrams = super.getGrams();
        return (baseGrams*proteins)/100;
    }
}
class Salad extends Food {
    private int fats;
    public Salad (int grams){
        super(grams);
        this.fats=fats;
    }
    public int setFats(int f){
        fats = f;
        return fats;
    }
    public int getGrams(){
        int baseGrams = super.getGrams();
        return (baseGrams*fats)/100;
    }
}
class MainDish extends Food {
    private int carbohydrates;
    public MainDish (int grams){
        super(grams);
        this.carbohydrates=carbohydrates;
    }
    public int setCarbohydrates(int c){
        carbohydrates = c;
        return carbohydrates;
    }
    public int getGrams(){
        int baseGrams = super.getGrams();
        return (baseGrams*carbohydrates)/100;
    }
}
}