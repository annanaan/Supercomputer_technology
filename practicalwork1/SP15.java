//Задание 5
package sp15;
import java.util.Scanner;
public class SP15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите целое число ");
        int a = in.nextInt();
        System.out.print("Введите целое число ");
        int b = in.nextInt();
        System.out.print("Введите целое число ");
        int c = in.nextInt();
        int min = a;
        if (b<min){
            min=b;
        }else{
            min=c;
                }
        System.out.println("Наименьшее из этих чисел: " + min);
    }
}
