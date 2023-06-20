import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        task1();
        task2();
    }



    public static void task1() {
        System.out.println("Задача 1");

//    Напишите код, с помощью которого можно напечатать только нечетные числа в консоль. Код должен работать с любой
//    последовательностью и объемом списка чисел.
//    В качестве отладочной информации можете использовать список чисел:
//    List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7))

        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (Integer num : nums) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }
    }
//    public static void printOddNumbers(List<Integer> nums) {
//        for (Integer num : nums) {
//            if (num % 2 != 0) {
//            } System.out.println(num);
//        }
//        return printOddNumbers(List<Integer> nums);
//    }

    public static void task2() {
        System.out.println("Задача 2");

//   Напишите код, с помощью которого можно напечатать только четные числа без повторений в порядке возрастания.
//   Код должен работать с любой последовательностью и объемом списка чисел.
//
//   В качестве отладочной информации можете использовать список чисел:
//   List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7))

        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        Collections.sort(nums);

        int previousNumber = Integer.MIN_VALUE;
        for (Integer num : nums) {
            if (num % 2 == 0 && num != previousNumber) {
                System.out.println(num);
                previousNumber = num;
            }
        }
    }
}