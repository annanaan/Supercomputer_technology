//Задание 9
package sp19;
public class SP19 {
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
