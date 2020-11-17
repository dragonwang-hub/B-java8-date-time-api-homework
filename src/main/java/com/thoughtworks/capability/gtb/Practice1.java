package com.thoughtworks.capability.gtb;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * 计算任意日期与下一个劳动节相差多少天
 *
 * @author itutry
 * @create 2020-05-15_16:33
 */
public class Practice1 {

    public static long getDaysBetweenNextLaborDay(LocalDate date) {
        LocalDate theNextLaborDay = LocalDate.of(2020, 5, 1)
                .withYear(date.getMonth().getValue() < 5 ? date.getYear() : date.plusYears(1).getYear());
        return  ChronoUnit.DAYS.between(date, theNextLaborDay);
    }
}
