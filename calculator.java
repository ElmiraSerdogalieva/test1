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

        Calculator one = new Calculator();
        one.Sum(x,y);
        one.Diff(x,y);
        one.Com(x,y);
        one.Quot(x,y);

    }
}

class Calculator
{
    void Sum(int a, int b)
    {
        System.out.println("Сумма: " + (a + b));
    }

    void Diff(int a, int b)
    {
        System.out.println("Разность: " + (a - b));
    }

    void Com(int a, int b)
    {
        System.out.println("Произведение: " + (a * b));
    }

    void Quot(int a, int b)
    {
        System.out.println("Частное: " + (a / b));
    }
}


