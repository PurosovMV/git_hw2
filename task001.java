import java.util.*;

/* Заполните массив случайным числами и выведите максимальное, минимальное и среднее значение.
Для генерации случайного числа используйте метод Math.random(). */

public class task001 {
    public static void main(String[] args) {

        double[] arr = array();
        System.out.println(arr);

    }

    static double[] array() {
        double[] arr = new double[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = randomNumbers();
        }
        System.out.println(Arrays.toString(arr));
        return arr;

    }

    static int randomNumbers() {
        return (int) (Math.random() * 6) + 1;
    }

}