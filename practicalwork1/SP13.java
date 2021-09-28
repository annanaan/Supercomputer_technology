//Задание 3
package sp13;
import java.util.Scanner;
public class SP13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите целое число ");
        int a = in.nextInt();
        if (a>0){
            a=a+1;
        }
        System.out.println("Полученное число: " + a);
    }
}