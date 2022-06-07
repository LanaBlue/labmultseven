package com.company;

public class Main {

    public static void main(String[] args) {
        /**
         * Лаб_раб4 Используя цикл for необходимо вывести на экран таблицу умножения на 7.
         *
         * @author Frolova SI
         */
        int mult;
        System.out.println("Таблица умножения на 7:");
        for (int i = 1; i < 11; i++) {
            mult = 7 * i;
            System.out.println("7 * " + i + " = " + mult);
        }
    }
}
