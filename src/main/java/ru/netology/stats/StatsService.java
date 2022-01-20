package ru.netology.stats;

public class StatsService {
    public int calculateSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        System.out.println("Сумма продаж: " + sum);
        return sum;
    }

    public int calculateAverage(int[] sales) {
        int average = 0;
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
            average = sum / 12;
        }
        System.out.println("Средняя сумма продаж: " + average);
        return average;
    }

    public int calculateLastMonthWithMaxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        System.out.println("Последний месяц с максимальными продажами: " + (maxMonth + 1));
        return maxMonth + 1;
    }

    public int calculateLastMonthWithMinSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        System.out.println("Последний месяц с минимальными продажами: " + (minMonth + 1));
        return minMonth + 1;
    }


    public int calculateMonthBelowAverage(int[] sales) {
        int average = 0;
        int sum = 0;
        int count = 0;
        for (int sale : sales) {
            sum += sale;
            average = sum / 12;
        }
        for (int i : sales) {
            if (i < average) {
                count++;
            }
        }
        System.out.println("Количество месяцев с продажами ниже среднего: " + count);
        return count;
    }

    public int calculateMonthAboveAverage(int[] sales) {
        int average = 0;
        int sum = 0;
        int count = 0;
        for (int sale : sales) {
            sum += sale;
            average = sum / 12;
        }
        for (int i : sales) {
            if (i > average) {
                count++;
            }
        }
        System.out.println("Количество месяцев с продажами выше среднего: " + count);
        return count;
    }
}
