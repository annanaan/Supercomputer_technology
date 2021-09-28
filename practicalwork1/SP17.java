//Задание 7
package sp17;
import java.util.Scanner;
public class SP17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите код города ");
        double a = in.nextDouble();
        double[][] price = {{4.15, 1.98, 2.69, 5},{905, 194, 491, 800}};
        if (a==price[1][0]){
            System.out.println("Москва. Стоимость разговора: " + price[0][0]*10);
        }else if (a==price[1][1]){
            System.out.println("Ростов. Стоимость разговора: " + price[0][1]*10);
        }else if (a==price[1][2]){
            System.out.println("Краснодар. Стоимость разговора: " + price[0][2]*10);
        }else if (a==price[1][3]){
            System.out.println("Киров. Стоимость разговора: " + price[0][3]*10);
        }
    }
}
