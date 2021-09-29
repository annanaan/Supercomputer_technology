// Практическая работа 4. Задание 2
package practicalwork4.pkg2;
public class Building {
    private int floors;
    private boolean living;
    public Building (int floors,boolean living){
        this.floors=floors;
        this.living=living;
    }
    public int getFloors(){
        return floors;
    }
    public boolean getLiving(){
        return living;
    }
    public static void main(String[] args) {
        Building[] building = new Building[4];
        
        House house = new House (2,true);
        house.setAttic(true);
        building [0] = house;
        
        School school = new School (3,false);
        school.setPool(false);
        building [1] = school;
        
        Library library = new Library (1,false);
        library.setConfRoom(true);
        building [2] = library;
        
        Supermarket supermarket = new Supermarket (4,false);
        supermarket.setWarehouse(false);
        building [3] = supermarket;
        
        for (Building b:building)
            System.out.println(b.getFloors()+"-"+b.getLiving());
    }
}
class House extends Building {
    private boolean attic;
    public House (int floors,boolean living){
        super(floors,living);
        this.attic=attic;
    }
    public boolean setAttic (boolean a){
        attic = a;
        return attic;
    }
    public int getFloors(){
        int baseFloors = super.getFloors();
        int addFloors=0;
        if (attic=true){
             addFloors=1;
             }else{addFloors=0;
        }
        return addFloors+baseFloors; 
    }
}
class School extends Building {
    private boolean pool;
    public School (int floors,boolean living){
        super(floors,living);
        this.pool=pool;
    }
    public boolean setPool (boolean p){
        pool = p;
        return pool;
    }
    public int getFloors(){
        int baseFloors = super.getFloors();
        int addFloors=0;
        if (pool=true){
             addFloors=1;
        }else{addFloors=0;
        }
        return addFloors+baseFloors; 
    }
}
class Library extends Building {
    private boolean confRoom;
    public Library (int floors,boolean living){
        super(floors,living);
        this.confRoom=confRoom;
    }
    public boolean setConfRoom (boolean c){
        confRoom = c;
        return confRoom;
    }
    public int getFloors(){
        int baseFloors = super.getFloors();
        int addFloors=0;
        if (confRoom=true){
             addFloors=1;
             }else{addFloors=0;
        }
        return addFloors+baseFloors; 
    }
}
class Supermarket extends Building {
    private boolean warehouse;
    public Supermarket (int floors,boolean living){
        super(floors,living);
        this.warehouse=warehouse;
    }
    public boolean setWarehouse (boolean w){
        warehouse = w;
        return warehouse;
    }
    public int getFloors(){
        int baseFloors = super.getFloors();
        int addFloors=0;
        if (warehouse=true){
             addFloors=1;
             }else{addFloors=0;
        }
        return addFloors+baseFloors; 
    }
}