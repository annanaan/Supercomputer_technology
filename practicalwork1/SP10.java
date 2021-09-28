//Задание 10
package sp10;
public class SP10 {
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