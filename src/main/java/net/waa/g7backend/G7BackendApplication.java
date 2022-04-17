package net.waa.g7backend;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class G7BackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(G7BackendApplication.class, args);
    }

// <<<<<<< sub-project2
//     @Bean
//     public ModelMapper modelMapper() {
// =======

    @Bean
    public ModelMapper modelMapper(){
//>>>>>>> master
        return new ModelMapper();
    }

}
