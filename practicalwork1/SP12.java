//Задание 2
package sp12;
import java.util.Scanner;
public class SP12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите трехзначное число ");
        int a = in.nextInt();
        int sum = 0;
        while(a>0){
            sum+=a%10;
            a=a/10;
        }
        System.out.println("Сумма цифр трехзначного числа: " + sum);
    }
}
