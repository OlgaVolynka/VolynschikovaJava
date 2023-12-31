package org.example;

import org.example.algorithms.Array;
import org.example.algorithms.Hallo;
import org.example.algorithms.HalloSlava;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            printMenu();
            try {
                int userInput = scanner.nextInt();
                switch (userInput) {
                    case 1:
                        System.out.println("Введите число:");
                        double number = scanner.nextDouble();
                        Hallo.hallo(number);
                        break;
                    case 2:
                        System.out.println("Введите имя:");
                        scanner.nextLine();
                        String name = scanner.nextLine();
                        HalloSlava.hallo(name);
                        break;
                    case 3:
                        System.out.print("Введите размер массива: ");
                        int size = scanner.nextInt();
                        ArrayList<Double> numbers = new ArrayList<>();
                        System.out.println("Введите элементы массива:");
                        for (int i = 0; i < size; i++) {
                            System.out.print((i + 1) + ": ");
                            numbers.add(scanner.nextDouble());
                        }
                        System.out.println("Элементы массива, кратные 3:" + Array.checkNumbers(numbers));

                        break;
                    case 0:
                        System.out.println("Программа завершена.");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Неверный ввод команды");
                }
            } catch (InputMismatchException e) {
                System.out.println("Введите корректное значение.");
                scanner.nextLine();
            }

        }
    }

    public static void printMenu() {
        System.out.println("Введите номер задания: ");
        System.out.println("1. Составить алгоритм: если введенное число больше 7, то вывести “Привет”");
        System.out.println("2. Составить алгоритм: если введенное имя совпадает с Вячеслав, то вывести “Привет, " +
                "Вячеслав”, если нет, то вывести \"Нет такого имени\"");
        System.out.println("3. Составить алгоритм: на входе есть числовой массив, необходимо вывести элементы" +
                " массива кратные 3");
        System.out.println("0. Выход из программы");
    }
}
