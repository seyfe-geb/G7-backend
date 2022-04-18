package net.waa.g7backend.model.dto;


import lombok.*;
import net.waa.g7backend.model.Address;
import net.waa.g7backend.model.Role;


import java.util.Set;

@Data
@RequiredArgsConstructor
public class UserDto {

    private String firstName;

    private String lastName;

    private String email;

    private String username;

    private String password;

    private Set<Address> addresses;

    private Set<Role> authorities;

}