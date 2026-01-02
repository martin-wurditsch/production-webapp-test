package de.company.optimizer.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main entry point for Optimizer API.
 * Spring Boot application for energy management system on edge devices.
 */
@SpringBootApplication
public class OptimizerApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(OptimizerApiApplication.class, args);
    }
}
