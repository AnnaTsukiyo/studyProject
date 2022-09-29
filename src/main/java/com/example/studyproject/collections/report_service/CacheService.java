package com.example.studyproject.collections.report_service;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import static com.example.studyproject.collections.report_service.ReportService.salesAndProfit;

public class CacheService {
    Map<String, BigDecimal[]> salesAndProfitCache = new HashMap<>();

    public BigDecimal[] getSalesAndProfit(String country) throws InterruptedException {
        if (salesAndProfitCache.containsKey(country)) {
            return salesAndProfitCache.get(country);
        }
        BigDecimal[] sap = salesAndProfit(country);
        salesAndProfitCache.put(country, sap);
        return sap;
    }
}
