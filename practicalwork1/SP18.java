//Задание 8
package sp18;
public class SP18 {
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
