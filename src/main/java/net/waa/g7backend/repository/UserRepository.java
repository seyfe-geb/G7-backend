package net.waa.g7backend.repository;

import net.waa.g7backend.model.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    User findUserByUsername(String username);
}
