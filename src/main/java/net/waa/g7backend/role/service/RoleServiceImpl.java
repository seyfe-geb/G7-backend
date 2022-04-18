package net.waa.g7backend.role.service;

import lombok.RequiredArgsConstructor;
import net.waa.g7backend.role.dto.RoleDto;
import net.waa.g7backend.role.model.Role;
import net.waa.g7backend.role.repository.RoleRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class RoleServiceImpl implements RoleService {

    private RoleRepository roleRepository;
    private final ModelMapper modelMapper;

    @Override
    public List<RoleDto> findAll() {
        return roleRepository.findAll().stream()
                .map(role -> modelMapper.map(role, RoleDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public RoleDto findRoleById(long id) {
        return modelMapper.map(roleRepository.findRoleById(id).orElse(null),
                RoleDto.class);
    }

    @Override
    public RoleDto save(RoleDto dto) {
        Role entity = modelMapper.map(dto, Role.class);
        return modelMapper.map(roleRepository.save(entity), RoleDto.class);
    }

    @Override
    public RoleDto updateRoleById(long id, RoleDto dto) {
        Role entity = modelMapper.map(dto, Role.class);
        entity.setId(id);
        return modelMapper.map(roleRepository.save(entity), RoleDto.class);
    }

    @Override
    public void deleteRoleById(long id) {
        roleRepository.deleteById(id);
    }
}
