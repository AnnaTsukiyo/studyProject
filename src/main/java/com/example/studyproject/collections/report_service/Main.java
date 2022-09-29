package com.example.studyproject.collections.report_service;
/**
 * First level:
 * Imagine we have some service (ReportService) that returns statistical financial reports about branches of the form (parameter - country)
 * <p>
 * report
 * branch country,
 * Amount of sales per year
 * Amount of profit for the year
 * <p>
 * But it turned out that building this report takes a very long time and the customer asked you to implement a caching service (CacheService) using HashMap,
 * which either requests data from the ReportService according to the country of the branch (if there is no data in the cache yet,
 * and then saves them to the cache), or takes the data from the cache immediately (if they are already stored there).
 * <p>
 * The report service itself (ReportService) does not need to be fully implemented,
 * you can simply return some random data each time (for example, using Math.random).
 * It is important to implement the caching service (CacheService)
 * <p>
 * Second level:
 * The same as in level 1,
 * but add the city and department to the report (they will also be parameters when requesting from CacheService and ReportService),
 * so you need to do caching using an additional class (do not forget about equals and hashcod) or nested hashmap.
 */

import java.math.BigDecimal;

public class Main {
    public static String[] countries = {"Austria", "Czech Republic", "Finland", "France", "Germany", "Ireland",
            "Italy", "Norway", "Singapore", "Switzerland", "United Kingdom"};

    public static CacheService cacheService = new CacheService();

    public static void main(String[] args) throws InterruptedException {

        for (String country : countries) prints(country);
    }

    public static void prints(String country) throws InterruptedException {
        BigDecimal[] a = cacheService.getSalesAndProfit(country);
        System.out.printf("%s %8.2f %8.2f %n", country, a[0], a[1]);
    }
}
