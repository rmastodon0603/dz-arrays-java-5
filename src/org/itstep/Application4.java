/*
Написать программу, которая определяет минимальное чис-
ло во введенной с клавиатуры последовательности положитель-
ных чисел (длина последовательности не ограничена). Ниже при-
веден рекомендуемый вид экрана программы


Определение минимального числа в последовательности положитель-
ных чисел.
Вводите после стрелки числа. Для завершения ввода введите ноль.
>12
>75
>10
>9
>23
>0
Минимальное число: 9
 */

package org.itstep;

import java.util.Scanner;

public class Application4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min, findNum;
        System.out.println("Определение минимального числа в последовательности положитель-\n" +
                "ных чисел.");
        System.out.println("Вводите после стрелки числа. Для завершения ввода введите ноль.");
        System.out.println(">");
        min = scanner.nextInt();
        do{
            System.out.println(">");
            findNum = scanner.nextInt();
            if(findNum != 0 && findNum < min){
                min = findNum;
            }
        } while (findNum != 0);
        System.out.println("Минимальное число: " + min);
    }
}
