//Практическая работа 2. Задание 1
package practicalwork2.pkg1;
public class Student { // родительский класс
    String firstName, lastName, group;
    double avgMark;
	public Student (String firstName, String lastName, String group, double avgMark) { // конструктор
		this.firstName = firstName;
		this.lastName = lastName;
		this.group = group;
		this.avgMark = avgMark;
	}
	public Student(){ //пустой конструктор без параметров
	}
	public double getScholarship() { // метод возвращает сумму стипендии
		return avgMark == 5 ? 100 : 80;
	}
    public static void main(String[] args) {
		Student student = new Student("Анна","Сидорова","БАП1851",5);
		Aspirant aspirant1 = new Aspirant("Иван","Иванов","Группа 2",4.9,"Научная работа");
		Aspirant aspirant2 = new Aspirant("Петр","Петров","Группа 3",5,"Научная работа 2"); // переменная типа Student, ссылающаяся на объект типа Aspirant
		Student[] students = {student, aspirant1, aspirant2}; // массив типа Student, содержащий объекты класса Student и Aspirant
		for(Student s:students) {
			System.out.println(s.getScholarship()); // вызов метода getScholarship() для каждого элемента массива
		}
	}
}
 class Aspirant extends Student { // наследуемый от Student класс
	String work;
	public Aspirant (String firstName, String lastName, String group, double avgMark, String work) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.group = group;
                this.avgMark = avgMark;
		this.work = work;
	}
	public double getScholarship() {
		return avgMark == 5 ? 200 : 180; // переопределение метода getScholarship() в классе Aspirant
	}
}
