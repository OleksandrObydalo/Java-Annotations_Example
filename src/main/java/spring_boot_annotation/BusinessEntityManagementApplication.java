package spring_boot_annotation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

@EnableAutoConfiguration
public class BusinessEntityManagementApplication {
    public static void main(String[] args) {
        SpringApplication.run(BusinessEntityManagementApplication.class, args);
    }
}
