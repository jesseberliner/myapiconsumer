package com.example.myapi;


import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;

@RestController
public class MainController {



    ArrayList<Trivia> allData = new ArrayList<>();

    @RequestMapping("/showdata")
    ArrayList<Trivia> showAllData()
    {
        System.out.println("This");
        return allData;
    }
}
