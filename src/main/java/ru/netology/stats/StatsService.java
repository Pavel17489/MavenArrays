package ru.netology.stats;

public class StatsService {

    public long calculateTotalSale(long[] sales) {
        long totalSale = 0;
        for (long sale : sales) {
            totalSale += sale;
        }
        return totalSale;
    }

    public long calculateAverageSale(long[] sales) {
        return calculateTotalSale(sales) / sales.length;
    }

    public int getMonthMaximumSale(long[] sales) {
        int monthMaximum = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[monthMaximum] <= sales[i]) {
                monthMaximum = i;
            }
        }
        return monthMaximum + 1;
    }

    public int getMonthMinimumSale(long[] sales) {
        int monthMinimum = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[monthMinimum] >= sales[i]) {
                monthMinimum = i;
            }
        }
        return monthMinimum + 1;
    }

    public int countMonthsBelowAverage(long[] sales) {
        int counter = 0;
        long averageSales = calculateAverageSale(sales);
        for (long sale : sales) {
            if (sale < averageSales) {
                counter++;
            }

        }
        return counter;
    }

    public int countMonthsAboveAverage(long[] sales) {
        int counter = 0;
        long averageSales = calculateAverageSale(sales);
        for (long sale : sales) {
            if (sale > averageSales) {
                counter++;
            }

        }
        return counter;
    }

}