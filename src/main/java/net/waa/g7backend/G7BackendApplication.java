package net.waa.g7backend;

import net.waa.g7backend.product.model.Product;
import net.waa.g7backend.product.repository.ProductRepository;
import net.waa.g7backend.role.model.Role;
import net.waa.g7backend.role.repository.RoleRepository;
import net.waa.g7backend.user.model.User;
import net.waa.g7backend.user.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

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
                                 UserRepository userRepository){
                                 //ProductRepository productRepository){
        return (args -> {
            roleData(roleRepository);
            userData(userRepository);
//            productData(productRepository);
        });
    }


    public void roleData(RoleRepository roleRepository){
        roleRepository.save(new Role("ADMIN"));
        roleRepository.save(new Role("BUYER"));
        roleRepository.save(new Role("SELLER"));
    }

    public void userData(UserRepository userRepository){
        userRepository.save(new User("Fridom", "Araya",
                "fri@ar.com", "free",
                "123", true, false, LocalDate.now(), LocalDate.now()));
        userRepository.save(new User("Ermias", "Ghebre",
                "erm@gebr.com", "ermiji",
                "123", true, false, LocalDate.now(), LocalDate.now()));
        userRepository.save(new User("Star", "Tsegay",
                "star@tseg.com", "start",
                "123", true, false, LocalDate.now(), LocalDate.now()));
        userRepository.save(new User("Esei", "Kahsay",
                "ess@kah.com", "essk",
                "123", true, false, LocalDate.now(), LocalDate.now()));
        userRepository.save(new User("Seyfe", "Gebriel",
                "sey@geb.com", "seyg",
                "123", true, false, LocalDate.now(), LocalDate.now()));
    }

//    public void productData(ProductRepository productRepository){
//        productRepository.save(new Product());
//    }

}
