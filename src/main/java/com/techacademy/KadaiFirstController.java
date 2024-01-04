package com.techacademy;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

@RestController
public class KadaiFirstController {

    //仕様1
    @GetMapping("/dayofweek/{date}")
    public String dispDayOfWeek(@PathVariable String date){
        LocalDate day1 = LocalDate.parse(date,DateTimeFormatter.ofPattern("yyyyMMdd"));

        DayOfWeek dayOfWeek = day1.getDayOfWeek();
        String full_name = dayOfWeek.getDisplayName(TextStyle.FULL, Locale.getDefault());

        return full_name;


            }



    //仕様2　足し算
    @GetMapping("/plus/{val1}/{val2}")
    public String calcPlus(@PathVariable int val1, @PathVariable int val2) {
        int res = 0;
        res = val1 + val2;
        return "計算結果：" + res;
    }

    //仕様2　引き算
    @GetMapping("/minus/{val1}/{val2}")
    public String calcMinus(@PathVariable int val1, @PathVariable int val2) {
        int res = 0;
        res = val1 - val2;
        return "計算結果：" + res;
    }

    //仕様2　掛け算
    @GetMapping("/times/{val1}/{val2}")
    public String calcTimes(@PathVariable int val1, @PathVariable int val2) {
        int res = 0;
        res = val1 * val2;
        return "計算結果：" + res;
    }

    //仕様2　割り算
    @GetMapping("/divide/{val1}/{val2}")
    public String calcDivide(@PathVariable int val1, @PathVariable int val2) {
        int res = 0;
        res = val1 / val2;
        return "計算結果：" + res;
    }

}
