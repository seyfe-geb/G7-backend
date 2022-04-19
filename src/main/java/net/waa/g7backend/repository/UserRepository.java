package net.waa.g7backend.repository;

import net.waa.g7backend.model.Address;
import net.waa.g7backend.model.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    User findUserByUsername(String username);

    @Query(value = "SELECT u FROM User u join u.addresses a where u.id = :userId AND a.type = 2")
    User findUserShippingAddress(Long userId);
}
