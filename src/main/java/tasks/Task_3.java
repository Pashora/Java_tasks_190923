package tasks;

import java.util.Scanner;

//Написать код Число вводится с клавиатуры и выводится в консоль ответ
//Дано двузначное число. Определить:
//а) какая из его цифр больше: первая или вторая;
//б) одинаковы ли его цифры.
public class Task_3 {
    public static void main(String[] args) {
        System.out.println("Введи двухзначное число");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int num_1 = num / 10; //целая часть от деления - цифра_1
        int num_2 = num % 10; //остаток от деления - цифра_2
        if (num > 99)
            System.out.println("Число не двухзначное");
        else if (num_1 == num_2)
            System.out.println("Цифры одинаковые");
        else if (num_1 > num_2) {
            System.out.println("Первая цифра больше чем вторая");
        } else
            System.out.println("вторая цифра больше чем первая");

    }
}
