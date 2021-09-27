//Практическая работа 2. Задание 2
package practicalwork2.pkg2;
public class Animal {
    String kind, food, location;
    void makeNoise () { // метод выводит в консоль звук, который издает животное
        System.out.println("Животное издает звук");
    }
    void eat () {
        System.out.println("Животное ест еду"); // метод выводит в консоль еду, которую ест животное
    }
    void sleep () {
        System.out.println("Животное "+kind+ " спит "); // метод выводит в консоль, какое животное спит
    }
    String getKind() {
        return kind;
    }
    void treatAnimal (Animal animal) { // метод выводит в консоль food и location животного
        animal.eat();
        System.out.println(animal.location);
    }
    public static void main(String[] args) {
        Dog dog = new Dog ("Собака","Кость","Москва","Овчарка");
        Cat cat = new Cat ("Кошка","Рыба","Химки","5 лет");
        Horse horse = new Horse ("Лошадь","Овес","Балашиха","Пегая");
        Animal[] animals = {dog, cat, horse};
        for (Animal i:animals) { // в цикле отправляем животных на прием к ветеренару
            System.out.println("Пациент с животным " +i.getKind()+ " пройдите в кабинет ветеринара");
        }
        dog.treatAnimal(dog);
        cat.treatAnimal(cat);
        horse.treatAnimal(horse);
    }
}
class Dog extends Animal {
    String breed;
    Dog (String kind, String food, String location, String breed) {
        this.kind=kind;
        this.food = food;
        this.location = location;
        this.breed = breed;
    }
    void makeNoise () { // переопределение метода makeNoise
        System.out.println("Собака гавкает");
    }
    void eat () {
        System.out.println("Еда для собаки:" + food); // переопределение метода eat
    }
}
class Cat extends Animal {
    String age;
    Cat (String kind, String food, String location, String age) {
        this.kind=kind;
        this.food = food;
        this.location = location;
        this.age = age;
    }
    void makeNoise () {
        System.out.println("Кошка мяукает");
    }
    void eat () {
        System.out.println("Еда для кошки: " + food); 
    }
}
class Horse extends Animal {
    String color;
    Horse (String kind, String food, String location, String color) {
        this.kind=kind;
        this.food = food;
        this.location = location;
        this.color = color;
    }
    void makeNoise () { 
        System.out.println("Лошадь ржет");
    }
    void eat () {
        System.out.println("Еда для лошади: "+ food); 
    }
}
class vet {
    void treatAnimal (Animal animal) { // метод выводит в консоль food и location животного
        animal.eat();
        System.out.println(animal.location);
    }
}
