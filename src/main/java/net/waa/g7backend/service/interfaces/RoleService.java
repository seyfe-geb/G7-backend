package net.waa.g7backend.service.interfaces;


import net.waa.g7backend.model.Role;
import net.waa.g7backend.model.dto.RoleDto;
import org.springframework.stereotype.Service;

import java.util.List;


public interface RoleService {

    List<RoleDto> findAll();

     RoleDto findRoleById(long id);

    Role save(Role dto);

    RoleDto updateRoleById(long id, RoleDto dto);

     void deleteRoleById(long id);
}
