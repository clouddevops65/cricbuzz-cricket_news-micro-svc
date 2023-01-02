package com.cloudtechmasters;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@RestController
public class CourseController {
    private static final Logger logger = LoggerFactory.getLogger(CourseController.class);
//create two endpoints getAllCricketNews and getLatestNews
    @GetMapping("/")
    public List<String> getAllCricketNews(){
        logger.info("added for failing sonar build");
        return Arrays.asList("All cricket news ");
    }

    @GetMapping("/latest-news")
    public List<String> getLatestNews(){
        return Arrays.asList("Latest cricket news");
    }

}
