package ru.top.core;
import java.util.Scanner;

public class Task1 {
    /*
        Создать программу, которая позволяет ввести с клавиатуры n диапазонов целочисленных значений (например,
        3-10). Каждый диапазон имеет начальную и конечную точку.
        После ввода программа должна вывести длину каждого диапазона. Программа должна выводить сообщение об ошибке,
        если начало диапазона больше, чем конец. Протестировать с
        использованием JUnit.
        Пример:
        Входные данные: 3 9, -2 4, 11 15
        Выходные 3, 6, 4
     */
    public static void main(String[] args) {
        //int[] numberRange = new int[2];
        String stringNumber1 = "";
        String stringNumber2 = "";
        int number1 = 0;
        int number2 = 0;
        Scanner scanner = new Scanner(System.in);
        String lineNumberPairs = scanner.nextLine();
        System.out.println(lineNumberPairs);
        outputRange(lineNumberPairs, stringNumber1, stringNumber2, number1, number2);
        //number1 = Integer.valueOf(s);
    }

    public static void outputRange(String lineNumberPairs, String stringNumber1, String stringNumber2, Integer number1, Integer number2) {
        String[] split = lineNumberPairs.split(",");
        for (String s : split) {
            String range = s + ' ';
            String[] split2 = range.split(" ");
            for (String s2 : split2) {
                stringNumber1 = stringNumber2;
                stringNumber2 = s2;
            }
            number1 = Integer.valueOf(stringNumber1);
            number2 = Integer.valueOf(stringNumber2);
            Ranges ranges = new Ranges(number1, number2);
            System.out.println(ranges);
            System.out.printf("Длина диапазона - %s \n", ranges.getLengthRanges());
        }
    }

}
