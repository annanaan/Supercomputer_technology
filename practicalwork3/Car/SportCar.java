package practicalwork3.pkg2;
public class SportCar extends Car {
    private String maxspeed;
    public SportCar(String brand, String clas, String weight, Engine engine, String maxspeed){
        this.brand = brand;
        this.clas = clas;
        this.weight = weight;
        this.engine = engine;
        this.maxspeed = maxspeed;
    }
    public String getMaxspeed() {
        return maxspeed;
    }
    public void setMaxspeed(String maxspeed) {
        this.maxspeed = maxspeed;
    }
    public void start(){
        System.out.println(brand +" поехал");
    }
    public void stop() {
        System.out.println(brand +" остановился");
    }
    public void printInfo(){
        System.out.println(brand+" класса"+clas+" весом"+weight+", оснащен"+engine+" и развивает предельную скорость"+maxspeed);
    }
}