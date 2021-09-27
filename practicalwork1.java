//Задание 1
package st1;
import java.util.Scanner;
public class ST1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите целое число ");
        String a = in.nextLine();
        int b = a.length();
        char c = a.charAt(b-1);
        System.out.println("Последняя цифра введенного числа: " + c);
    }
}

//Задание 2
package st2;
import java.util.Scanner;
public class ST2 {
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

//Задание 3
package st3;
import java.util.Scanner;
public class ST3 {
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

//Задание 4
package st4;
import java.util.Scanner;
public class ST4 {
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

//Задание 5
package st5;
import java.util.Scanner;
public class ST5 {
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

//Задание 6
package st6;
import java.util.Scanner;
public class ST6 {
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

//Задание 7
package st7;
import java.util.Scanner;
public class ST7 {
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

//Задание 8
package st8;
public class ST8 {
    public static void main(String[] args) {
        int[] a = {1, -10, 5, 6, 45, 23, 45, -34, 0, 32, 56, -1, 2, -2};
        int max = 0; //максимальный элемент
        int sumPlus = 0; //сумма положительных элементов
        int sumEvenMinus = 0; //сумма четных отрицательных элементов
        int amtPlus = 0; //количество положительных элементов
        int sumMinus = 0; // сумма отрицательных элементов
        int amtMinus = 0; // количество отрицательных элементов
        for (int i=0; i<a.length; i++){
            if (a[i]>0){
                sumPlus=sumPlus+a[i];
                amtPlus = amtPlus+1;
                if (a[i]>max){
                    max = a [i];
                }
            }else  if (a[i]<0){
                sumMinus = sumMinus + a[i];
                amtMinus = amtMinus + 1;
                if (a[i]%2==0){
                    sumEvenMinus = sumEvenMinus + a[i];
                }
        }
        }
        double avgMinus = -sumMinus/amtMinus;
        System.out.println("Mаксимальное значение: " + max);
        System.out.println("Cумма положительных элементов: " + sumPlus);
        System.out.println("Cумма четных отрицательных элементов: " + sumEvenMinus);
        System.out.println("Количество положительных элементов: " + amtPlus);
        System.out.println("Среднее арифметическое отрицательных элементов: " + avgMinus);
    }
}

//Задание 9
package st9;
public class ST9 {
    public static void main(String[] args) {
        int[] a = {15, 10, 51, 6, 5, 3, 10, -34, 0, 32, 56, 12, 24, 52};
        int n = a.length;
        int b;
        for (int i=0; i < n/2; i++){
            b = a[n-i-1];
            a[n-i-1]=a[i];
            a[i]=b;
        }
        for (int i=0; i<a.length; i++){
            System.out.println(a[i]);
        }
    }
}

//Задание 10
package st10;
public class ST10 {
    public static void main(String[] args) {
        int[] a = {15, 10, 0, -6, 5, 3, 0, -34, 0, 32, 56, 0, 24, 52};
        int aNew[] = new int[a.length];
        int index = 0;
        for (int i=0; i<a.length;i++){
            if (a[i]!=0){
                aNew[index]=a[i];
                index ++;
            }
        }
        for (int i=0; i<a.length; i++){
            System.out.println(aNew[i]);
        }
    } 
}
