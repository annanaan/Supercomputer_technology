// Практическая работа 4. Задание 1
package practicalwork4.pkg1;
public class Animal {
    private boolean vegetarian;
    private String eats;
    private int noOfLegs;
    public Animal (boolean vegetarian,String eats,int noOfLegs){
        this.vegetarian=vegetarian;
        this.eats=eats;
        this.noOfLegs=noOfLegs;
    }
    public boolean getVegetarian(){
        return vegetarian;
    }
    public String getEats(){
        return eats;
    }
    public int getNoOfLegs(){
        return noOfLegs;
    }
    public static void main(String[] args) {
        Animal[] animal = new Animal[3];
        Cat cat = new Cat (false,"fish",1);
        cat.setColor("black");
        
        animal [0] = cat;
        animal [1] = new Animal (true,"flowers",0);
        animal [2] = new Animal (false,"meat",2);
        
        for (Animal a:animal)
            System.out.println(a.getVegetarian()+"-"+a.getEats()+"-"+a.getNoOfLegs());
    } 
}
    class Cat extends Animal{
    private String color;
    public Cat (boolean vegetarian, String eats, int noOfLegs) {
        super(vegetarian, eats, noOfLegs);
        this.color = color;
    }  
    public String setColor (String c){
        color = c;
        return color;
    } 
    public String getEats() {
        String baseEats = super.getEats();
        return baseEats +" "+ color;
    }
}
