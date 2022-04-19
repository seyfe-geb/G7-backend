package net.waa.g7backend.service.implementer;

import net.waa.g7backend.model.Role;
import net.waa.g7backend.model.dto.RoleDto;
import net.waa.g7backend.repository.RoleRepository;
import net.waa.g7backend.service.interfaces.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    RoleRepository roleRepository;

    @Override
    public List<RoleDto> findAll() {
        return null;
    }

    @Override
    public RoleDto findRoleById(long id) {
        return null;
    }

    @Override
    public Role save(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public RoleDto updateRoleById(long id, RoleDto dto) {
        return null;
    }

    @Override
    public void deleteRoleById(long id) {

    }
}
