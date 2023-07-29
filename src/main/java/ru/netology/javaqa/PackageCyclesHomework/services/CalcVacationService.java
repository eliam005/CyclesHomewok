package ru.netology.javaqa.PackageCyclesHomework.services;

public class CalcVacationService {

    public int calcVacation(int income, int expenses, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету

        for (int i = 0; i < 12; i++) {
            if (money >= threshold) { // отдыхаем
                money -= expenses;
                money /= 3;
                count++;
            } else { // работаем
                money += income;
                money -= expenses;
            }
        }
        return count;
    }

}

// income - доход
// expense - траты месяц
