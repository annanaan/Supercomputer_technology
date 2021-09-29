package practicalwork3.pkg2;
public class Engine {
    private String power, producer;
    public Engine (String power, String producer) {
        this.power = power;
        this.producer = producer;
    }
    public String getPower() {
        return power;
    }
    public void setPower (String power) {
        this.power = power;
    }
    public String getProduser() {
        return producer;
    }
    public void setProduser (String producer) {
        this.producer = producer;
    }
    public void printInfo() {
        System.out.println ("мотор [мощностью "+power+", произведен "+producer+"]");
    }
}