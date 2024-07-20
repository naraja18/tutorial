package com.example.date;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@RestController;

public class MyController {

    @GetMapping("/")

    public String getString(){
    LocalDate date = LocalDate.now();
    DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    String todaydate = date.format(format1);
    return todaydate;

    } 
}