package net.waa.g7backend.user.repository;

import net.waa.g7backend.user.dto.UserDto;
import net.waa.g7backend.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    List<UserDto> findAll();
    Optional<User> findByUsername(String username);
    UserDto update(long id, UserDto userDto);
    boolean existsByUsername(String username);

    boolean existsByEmail(String email);


}
