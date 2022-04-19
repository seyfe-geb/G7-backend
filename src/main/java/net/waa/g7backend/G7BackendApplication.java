package net.waa.g7backend;


import net.waa.g7backend.model.Role;
import net.waa.g7backend.model.dto.AddressDto;
import net.waa.g7backend.model.dto.UserDto;
import net.waa.g7backend.repository.RoleRepository;
import net.waa.g7backend.repository.UserRepository;
import net.waa.g7backend.service.interfaces.AddressService;
import net.waa.g7backend.service.interfaces.OrderService;
import net.waa.g7backend.service.interfaces.RoleService;
import net.waa.g7backend.service.interfaces.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.HashSet;
import java.util.Set;


@SpringBootApplication
public class G7BackendApplication {


    public static void main(String[] args) {
        SpringApplication.run(G7BackendApplication.class, args);
    }


    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }

    @Bean
    public CommandLineRunner run(AddressService userService,
                                 OrderService orderService){
        return (args -> {
            orderData(orderService);
            addressData(userService);
        });
    }

    private void orderData(OrderService orderService) {

    }

    private void addressData(AddressService userService) {
    }



}
