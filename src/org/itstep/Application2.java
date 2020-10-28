package org.itstep;

/*
Написать программу проверки умения складывать и вычитать
числа в пределах 100. Программа должна вывести 10 примеров,
причем в каждом примере уменьшаемое должно быть больше или
равно вычитаемому, т. е. не допускается предлагать испытуемому
примеры с отрицательным результатом. Оценка выставляется по
следующему правилу: за 10 правильных ответов — "отлично",
за 9 и 8 — "хорошо", за 7 и 6 — "удовлетворительно", за 6 и ме-
нее — "плохо". Ниже приведен рекомендуемый вид экрана про-
граммы.

Проверка умения складывать и вычитать числа.
После примера введите ответ и нажмите <Enter>
75-4=71
35-9=29
Вы ошиблись! 35-9=26
14-1=13
6-5=1
37-19=28
Вы ошиблись! 37-19=18
53-14=39
94-87=7
90-16=74
4-2=2
89-41=48
Правильных ответов: 8
Оценка: Хорошо
 */

import java.util.Random;
import java.util.Scanner;

public class Application2 {

    public static int addSub(Scanner scanner) {
        Random rnd = new Random();
        int addSub = rnd.nextInt(2);
        int first = rnd.nextInt(100) + 1;
        int second;

        if (addSub == 0){
            second = rnd.nextInt(first) + 1;
            System.out.print(first + "-" + second + "=");
        }
        else{
            second = rnd.nextInt(100);
            System.out.println(first + "+" + second + "=");
        }
        int answer = scanner.nextInt();
        if (addSub == 0 && answer != first - second){
            System.out.println("Вы ошиблись! " + first + "-" + second + "=" + (first-second));
            return(0);
        }
        else if(addSub == 0 && answer == first - second){
            return(1);
        }

        if(answer != first+second){
            System.out.println("Вы ошиблись! " + first + "+" + second + "=" + (first+second));
            return(0);
        }
        else{
            return(1);
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int correctAnswers = 0;
        for(int i=0; i<10; i++){
            correctAnswers += addSub(scanner);
        }
        System.out.println("Правильных ответов: " + correctAnswers);
        System.out.print("Оценка:");
        if (correctAnswers == 10){
            System.out.println("Отлично");
        }
        else if (correctAnswers > 7){
            System.out.println("Хорошо");
        }
        else if (correctAnswers > 5){
            System.out.println("Удовлетворительно");
        }
        else{
            System.out.println("Неудовлетворительно");
        }
    }
}
