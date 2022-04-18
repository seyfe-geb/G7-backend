package net.waa.g7backend.role.repository;

import net.waa.g7backend.role.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByAuthority(String authority);
    boolean existsByAuthority(String name);
}
