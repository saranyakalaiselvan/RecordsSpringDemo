package com.crackit.records.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@ConfigurationPropertiesScan
public class RecordsSpringDemoApplication {
    public static void main(String[] args) {
        Employee employee = new Employee(1, "crackit", 30);
        System.out.println(String.valueOf(employee.age()));
        SpringApplication.run(RecordsSpringDemoApplication.class, args);
    }
}
