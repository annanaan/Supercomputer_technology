// Практическая работа 4. Задание 3
package practicalwork4.pkg3;
public class Horse {
    private String isReal;
    public Horse (String isReal){
        this.isReal=isReal;
    }
    public String getIsReal(){
        return isReal;
    }
    public static void main(String[] args) {
        Horse[] horse = new Horse[3];
        
        Zebra zebra = new Zebra ("Real");
        zebra.setStriped(true);
        horse [0] = zebra;
        
        Donkey donkey = new Donkey ("Real");
        donkey.setBigEars(false);
        horse [1] = donkey;
        
        Pegasus pegasus = new Pegasus ("Not real");
        pegasus.setWings(true);
        horse [2] = pegasus;
        
        for (Horse h:horse)
            System.out.println(h.getIsReal());
    }
}
class Zebra extends Horse{
    private boolean striped;
    public Zebra (String isReal){
        super (isReal);
        this.striped=striped;
    }
    public boolean setStriped(boolean s){
        striped = s;
        return striped;
    }
    public String getIsReal(){
        String baseIsReal = super.getIsReal();
        if (striped=true){
            return "Zebra in Africa"; 
        }
        return "Zebra in Africa";
    }
}
class Donkey extends Horse{
    private boolean bigEars;
    public Donkey (String isReal){
        super (isReal);
        this.bigEars=bigEars;
    }
    public boolean setBigEars(boolean b){
        bigEars = b;
        return bigEars;
    }
    public String getIsReal(){
        String baseIsReal = super.getIsReal();
        if (bigEars=true){
            return "Donkey in Asia"; 
        }
        return "Donkey in Asia";
    }
}
class Pegasus extends Horse{
    private boolean wings;
    public Pegasus (String isReal){
        super (isReal);
        this.wings=wings;
    }
    public boolean setWings(boolean w){
        wings = w;
        return wings;
    }
    public String getIsReal(){
        String baseIsReal = super.getIsReal();
        if (wings=true){
            return "The Pegasus"; 
        }
        return "The Pegasus";
    }
}