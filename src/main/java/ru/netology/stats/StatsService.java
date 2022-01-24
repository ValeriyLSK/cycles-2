package ru.netology.stats;

public class StatsService {
    public int calculateSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
//        System.out.println("Сумма продаж: " + sum);
        return sum;
    }

    public int calculateAverage(int[] sales) {
        int average = calculateSum(sales) / sales.length;
//        System.out.println("Средние продажи:" + average);
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
//        System.out.println("Последний месяц с максимальными продажами: " + (maxMonth + 1));
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
//        System.out.println("Последний месяц с минимальными продажами: " + (minMonth + 1));
        return minMonth + 1;
    }


    public int calculateMonthBelowAverage(int[] sales) {
        int count = 0;
        int average = calculateAverage(sales);
        for (int i : sales) {
            if (i < average) {
                count++;
            }
        }
//        System.out.println("Количество месяцев с продажами ниже среднего: " + count);
        return count;
    }

    public int calculateMonthAboveAverage(int[] sales) {
        int count = 0;
        int average = calculateAverage(sales);
        for (int i : sales) {
            if (i > average) {
                count++;
            }
        }
//        System.out.println("Количество месяцев с продажами выше среднего: " + count);
        return count;
    }
}
