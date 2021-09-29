package practicalwork3.pkg2;
public class Lorry extends Car {
    private String lifting;
    public Lorry(String brand, String clas, String weight, Engine engine, String lifting){
        this.brand = brand;
        this.clas = clas;
        this.weight = weight;
        this.engine = engine;
        this.lifting = lifting;
    }
    public String getLifting() {
        return lifting;
    }
    public void setLifting(String lifting) {
        this.lifting = lifting;
    }
    public void start(){
        System.out.println(brand + " поехал");
    }
    public void stop() {
        System.out.println(brand + " остановился");
    }
    public void printInfo(){
        System.out.println(brand+" класса"+clas+" весом"+weight+", оснащен"+engine+" и обладает грузоподъемностью"+lifting);
    }
}