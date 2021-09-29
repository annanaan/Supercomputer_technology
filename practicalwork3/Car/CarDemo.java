// Практическая работа 3. Задание2
package practicalwork3.pkg2;
public class CarDemo {
    public static void main(String[] args) {
        Engine lorryEngine = new Engine("150", "мотор грузовика");
        Lorry lorry = new Lorry("Грузовик", "D", "8000", lorryEngine, "70");
        
        Engine sportEngine = new Engine("200", "мотор спорткара");
        SportCar sportCar = new SportCar("SportCar", "C", "4000", sportEngine, "300");
        
        System.out.println(lorry);
        System.out.println(sportCar);
    }
}