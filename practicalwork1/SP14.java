//Задание 4
package sp14;
import java.util.Scanner;
public class SP14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите целое число ");
        int a = in.nextInt();
        if (a>0){
            a=a+1;
        }else if(a<0){
            a=a-2;
        }else{
            a=10;
        }
        System.out.println("Полученное число: " + a);
    }
}
