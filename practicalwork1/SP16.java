//Задание 6
package sp16;
import java.util.Scanner;
public class SP16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите целое число ");
        int a = in.nextInt();
        String str1 = "отрицательное ";
        String str2 = "положительное ";
        String str3 = "нулевое число ";
        String str4 = "четное число ";
        String str5 = "нечетное число ";
        if (a>0){
            System.out.print(str2);
        }else if (a<0){
            System.out.print(str1);
        }else{
            System.out.print(str3);
        }
        if (((a%2)==0)&&(a!=0)){
            System.out.print(str4);
        }else if(a!=0){
            System.out.print(str5);
        }
    }
}