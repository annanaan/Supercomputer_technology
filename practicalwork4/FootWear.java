// Практическая работа 4. Задание 5
package practicalwork4.pkg5;
public class FootWear {
    int cost, size;
    int getCost(){
        return cost;
    }
    int getSize(){
        return size;
    }
    public static void main(String[] args) {
        Shoes shoes = new Shoes (2000,36,false);
        Trainers trainers = new Trainers (5000,40,"spring");
        Boots boots = new Boots(4000,35,"black");
        HighShoes highShoes = new HighShoes (3500,37,10);
        Sandals sandals = new Sandals (1000,34,true);
        Slippers slippers = new Slippers (500,39,100);
        FootWear [] footWear = {shoes,trainers,boots,highShoes,sandals,slippers};
        for (FootWear f:footWear) {
            System.out.println(f.getCost()+" "+f.getSize());
        }
    }
}
class Shoes extends FootWear {
    boolean heel;
    Shoes (int cost,int size,boolean heel){
        this.cost=cost;
        this.size=size;
        this.heel=heel;
    }
}
class Trainers extends FootWear {
    String season;
    Trainers (int cost,int size,String season){
        this.cost=cost;
        this.size=size;
        this.season=season;
    }
}
    class Boots extends FootWear {
    String color;
    Boots (int cost,int size,String color){
        this.cost=cost;
        this.size=size;
        this.color=color;
    }
    }
    class HighShoes extends FootWear {
    int highHeel;
    HighShoes (int cost,int size,int highHeel){
        this.cost=cost;
        this.size=size;
        this.highHeel=highHeel;
    }
    }
    class Sandals extends FootWear {
    boolean leather;
    Sandals (int cost,int size,boolean leather){
        this.cost=cost;
        this.size=size;
        this.leather=leather;
    }
    }
    class Slippers extends FootWear {
    int amount;
    Slippers (int cost,int size,int amount){
        this.cost=cost;
        this.size=size;
        this.amount=amount;
    }
    }