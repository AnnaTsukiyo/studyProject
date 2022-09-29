package com.example.studyproject.collections.report_service;

import java.math.BigDecimal;

public class ReportService {
    public static BigDecimal[] salesAndProfit(String country) {
        try {
            Thread.sleep(1000);
        } finally {
            return new BigDecimal[]{BigDecimal.valueOf((1. + Math.random() * 0.3) * 56765478.), BigDecimal.valueOf((1. + Math.random() * 0.3) * 159878.)};
        }
    }
}
