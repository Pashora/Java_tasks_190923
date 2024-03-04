package tasks;

import java.util.Scanner;

//Написать код Число вводится с клавиатуры и выводится в консоль ответ
//Если целое число m делится нацело на целое число n,
// то вывести на экран ча-стное от деления,
// в противном случае вывести сообщение "m на n нацело не делится".
public class Task_2 {
    public static void main(String[] args) {
        System.out.println("Введи два целых числа");
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();

        if (m % n == 0) {
            int d = m / n;
            System.out.println(d);
        } else
            System.out.println("число_1 на число_2 нацело не делится");

    }
}
