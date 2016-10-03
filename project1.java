package com.javarush.test.level04.lesson02.task05;

/**
 * Created by апаив on 22.09.2016.
 */
import java.util.Scanner;

public class project1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите x: ");
        int x = sc.nextInt();
        System.out.print("Введите y: ");
        int y = sc.nextInt();
        System.out.print("Введите оператор: ");
        String op = sc.next();


        Calculator one = new Calculator();
        one.calculator(op, x, y);
    }
}
/**
 * Такая реализация вполне допустима, код чистый и легко читается, однако:
 * Это пример использования ООП в стиле процедурного программирования.
 * Переиспользование и расширение этого кода не возможно без внесения изменений в сам код
 * Попробуйте использовать подход который мы разбирали на практике
 */
class Calculator
{

    void calculator(String op, int a, int b)
    {
        switch (op)
        {
            case ("+"):
            {
                System.out.println("Сумма: " + (a + b));
                break;
            }
            case ("-"):
            {
                System.out.println("Разность: " + (a - b));
                break;
            }
            case ("*"):
            {
                System.out.println("Произведение: " + (a * b));
                break;
            }
            case ("/"):
            {
                System.out.println("Частное: " + (a / b));
                break;
            }
        }
    }
}
