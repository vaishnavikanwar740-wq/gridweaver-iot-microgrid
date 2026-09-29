package com.gridweaver;

import com.gridweaver.model.MicrogridState;
import com.gridweaver.service.MicrogridStateService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GridWeaverApplication {

    public static void main(String[] args) {
        SpringApplication.run(GridWeaverApplication.class, args);
    }

    @Bean
    CommandLineRunner run(MicrogridStateService service) {
        return args -> {
            MicrogridState state = new MicrogridState(
                230.0,
                50.0,
                1200.0,
                85.0,
                true
            );

            service.processState(state);
        };
    }
}