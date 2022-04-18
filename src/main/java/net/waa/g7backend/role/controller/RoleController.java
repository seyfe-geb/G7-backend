package net.waa.g7backend.role.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/roles")
@RequiredArgsConstructor
public class RoleController {

//    private final RoleService roleService;
//
//    @GetMapping()
//    public List<RoleDto> getAll() {
//        return roleService.findAll();
//    }
//
//    @GetMapping("/{id}")
//    public RoleDto getRoleById(@PathVariable("id") long id){
//        return roleService.findRoleById(id);
//    }
//
//    @PostMapping()
//    public RoleDto add(@RequestBody RoleDto dto){
//        return roleService.save(dto);
//    }
//
//    @PutMapping("/{id}")
//    public RoleDto update(@PathVariable("id") long id, @RequestBody RoleDto dto){
//        return roleService.updateRoleById(id, dto);
//    }
//
//    @DeleteMapping("/{id}")
//    public void delete(@PathVariable("id") long id){
//        roleService.deleteRoleById(id);
//    }
}
