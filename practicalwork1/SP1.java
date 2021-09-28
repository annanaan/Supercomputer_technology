//Задание 1
package sp1;
import java.util.Scanner;
public class SP1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите целое число ");
        String a = in.nextLine();
        int b = a.length();
        char c = a.charAt(b-1);
        System.out.println("Последняя цифра введенного числа: " + c);
    }
}
