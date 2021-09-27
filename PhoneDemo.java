//Практическая работа 2. Задание 3
package practicalwork2.pkg3;
class Phone {
    String number;
    String model;
    double weight;
    Phone (String n, String m, double w) { // конструктор принимает на вход параметры n, m, w для инициализации переменных класса
        this (n, m); // вызов из конструктора с тремя параметрами конструктор с двумя (n и m)
        weight = w;
    }
    Phone (String n, String m) { // конструктор принимает на вход параметры n, m для инициализации переменных класса
        number = n;
        model = m;
    }
    Phone () { // конструктор без параметров
    }
    void receiveCall (String name) { // метод выводит на консоль имя звонящего
        System.out.println("Звонит "+name);
    }
    void receiveCall (String name, String number) { // перегруженный метод receiveCall выводит на консоль имя звонящего и его номер телефона
        System.out.println("Звонит "+name+ " с номера "+number);
    }
    String getNumber() { // метод возвращает номер телефона
        return number;
    }
    void sendMessage (String...numbers) { // метод с аргументами переменной длины, выводит на консоль номера, которым будет отправлено сообщение
        System.out.println("Номера, на которые будет отправлено сообщение: ");
        for (int i=0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }
}
public class PhoneDemo {
    public static void main(String[] args) {
        Phone phone1 = new Phone("89031301079","Apple",7.8); // экземпляр класса Phone, созданный конструктором с 3-мя параметрами
        Phone phone2 = new Phone("89031234567","Samsung"); // экземпляр класса Phone, созданный конструктором с 2-мя параметрами
        Phone phone3 = new Phone(); // экземпляр класса Phone, созданный конструктором по-умолчанию

        phone2.weight=8.8;
        
        phone3.number="89031111111";
        phone3.model="Phone";
        phone3.weight=10;
        
        System.out.println(phone1.getNumber());
        System.out.println(phone1.model);
        System.out.println(phone1.weight);
        System.out.println(phone2.getNumber());
        System.out.println(phone2.model);
        System.out.println(phone2.weight);
        System.out.println(phone3.getNumber());
        System.out.println(phone3.model);
        System.out.println(phone3.weight);
        
        phone1.receiveCall("Аня");
        phone2.receiveCall("Вася");
        phone3.receiveCall("Мама", "89030000000");
        phone1.sendMessage("89033333333","89034444444","89035555555");
    }
}
