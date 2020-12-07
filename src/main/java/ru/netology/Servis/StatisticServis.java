package ru.netology.Servis;

public class StatisticServis {

    public int totalSales(int[] sales) {
        int total = 0;
        for (int sale : sales) {
            total += sale;
        }
        return total;
    }

    public int averageSalesPerMonth(int[] sales) {
        return  totalSales(sales) / sales.length;
    }

    public int monthInWhichSalesMax(int[] sales) {

        int maxSale = 0;
        int month = 0;
        int monthMaxSale = 0;
        for (int sale : sales) {
            ++month;
            if (sale > maxSale) {
                maxSale = sale;
                monthMaxSale = month;
            }
        }
        return monthMaxSale;// находим 1-ый из месяцев с максимумом продаж
    }

    public int monthInWhichSalesMin(int[] sales) {
        int month = 1;
        int monthMinSale = 1;
        int minSale = sales[0];
        for (int sale : sales) {
            if (sale < minSale) {
                minSale = sale;
                monthMinSale = month;
            }
            ++month;
        }
        return monthMinSale;// находим 1-ый из месяцев с минимумом продаж
    }

    public int numberOfMonthsBelowAverage(int[] sales) {
        int average = averageSalesPerMonth(sales);
        int number = 0;
        for (int sale : sales) {
            if (sale < average) {
                number++;
            }
        }
        return number;
    }

    public int numberOfMonthsAboveAverage(int[] sales) {
        int average = averageSalesPerMonth(sales);
        int number = 0;
        for (int sale : sales) {
            if (sale > average) {
                number++;
            }
        }
        return number;
    }

}
