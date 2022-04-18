package net.waa.g7backend.role.service;

import net.waa.g7backend.role.dto.RoleDto;
import org.springframework.stereotype.Service;

import java.util.List;


public interface RoleService {
    public List<RoleDto> findAll();

    public RoleDto findRoleById(long id);

    public RoleDto save(RoleDto dto);

    public RoleDto updateRoleById(long id, RoleDto dto);

    public void deleteRoleById(long id);
}
