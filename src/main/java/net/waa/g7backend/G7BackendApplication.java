package net.waa.g7backend;


import net.waa.g7backend.model.Role;
import net.waa.g7backend.model.dto.UserDto;
import net.waa.g7backend.repository.RoleRepository;
import net.waa.g7backend.repository.UserRepository;
import net.waa.g7backend.service.interfaces.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
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
    public CommandLineRunner run(RoleRepository roleRepository,
                                 UserService userService){
                                 //ProductRepository productRepository){
        return (args -> {
            roleData(roleRepository);
            userData(userService);
//            productData(productRepository);
        });
    }


    public void roleData(RoleRepository roleRepository){
        roleRepository.save(new Role("ADMIN"));
        roleRepository.save(new Role("BUYER"));
        roleRepository.save(new Role("SELLER"));
    }
//
    public void userData(UserService userService){
        Set<String> authorities = new HashSet<>();
        authorities.add("BUYER");
        UserDto user1 = new UserDto("Fridom", "Araya", "fri@ar.com", "free", "123", authorities);
        userService.add(user1);
//        userRepository.save(new User("Fridom", "Araya",
//                "fri@ar.com", "free",
//                "123", true, false, LocalDate.now(), LocalDate.now()));
//        userRepository.save(new User("Ermias", "Ghebre",
//                "erm@gebr.com", "ermiji",
//                "123", true, false, LocalDate.now(), LocalDate.now()));
//        userRepository.save(new User("Star", "Tsegay",
//                "star@tseg.com", "start",
//                "123", true, false, LocalDate.now(), LocalDate.now()));
//        userRepository.save(new User("Esei", "Kahsay",
//                "ess@kah.com", "essk",
//                "123", true, false, LocalDate.now(), LocalDate.now()));
//        userRepository.save(new User("Seyfe", "Gebriel",
//                "sey@geb.com", "seyg",
//                "123", true, false, LocalDate.now(), LocalDate.now()));
    }

//    public void productData(ProductRepository productRepository){
//        productRepository.save(new Product());
//    }

}
