package lesson2;

import java.util.Scanner;

public class LoopingStatements {
    public static void main(String[] args) {
        // инкремент - увеличивает значение переменной на 1
        // постфиксный x++ (возвращает значение, потом увеличивает)
        // префиксный ++x (увеличивает значение, потом возвращает)
        // декремент - уменьшает значение переменной на 1
        // постфиксный x-- (возвращает значение, потом уменьшает)
        // префиксный --x (уменьшает значение, потом возвращает)

        int a = 2;
        int res = a++ - ++a + a++ + a++ + a;
        // 2 - 4 + 4 + 5 + 6 = 13
        // 13 8 5 9
        System.out.println(res);

        // цикл while
        /*
        while(условие) { условие - true/false
            инструкции в теле цикла
            инструкции в теле цикла
            инструкции в теле цикла
        }
        */

        // вывести на экран числа из отрезка [55;78]
        int n = 55;
        while (n <= 78) {
            // либо:
            System.out.println("n = " + n++);
            // n++;
            // либо:
            System.out.println("n = " + n);
             n++;
        }

        /*пользователь вводит с клавиатуры целое число
        * необходимо вывести число увеличенное на 2
        * цикл прерывает свою работу, если пользователь ввел 0 */

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите целое число");
            int num = scanner.nextInt();
            if (num == 0) {
                System.out.println("Завершение программы");
                break;
            }
            System.out.println(num + 2);
        }

        /*do {
            инструкции в теле цикла;
        } while (условие);*/
        int num;
        do {
            System.out.println("Введите целое число. 0 для завершения");
            num = scanner.nextInt();
            if (num != 0) System.out.println(num + 2);
        } while (num != 0);

        // fori
        for (int i = 0; i < 9; i++) {
            if (i % 2 == 0) System.out.println(i);
        }

        // Math.random() для дз




    }
}
