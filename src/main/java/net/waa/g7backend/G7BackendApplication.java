package net.waa.g7backend;


import net.waa.g7backend.model.Role;
import net.waa.g7backend.model.dto.UserDto;
import net.waa.g7backend.repository.RoleRepository;
import net.waa.g7backend.repository.UserRepository;
import net.waa.g7backend.service.interfaces.RoleService;
import net.waa.g7backend.service.interfaces.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


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
    public CommandLineRunner run(RoleService roleService){
        return (args -> {
            roleData(roleService);
        });
    }


    public void roleData(RoleService roleService){
        roleService.save(new Role("ADMIN"));
        roleService.save(new Role("BUYER"));
        roleService.save(new Role("SELLER"));
    }


}
