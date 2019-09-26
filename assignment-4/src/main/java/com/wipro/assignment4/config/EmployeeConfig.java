package com.wipro.assignment4.config;

import com.wipro.assignment4.entity.Employee;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmployeeConfig {

    @Bean
    public Employee employee(){
        return new Employee();
    }
}
