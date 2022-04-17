package net.waa.g7backend.user.controller;


import lombok.RequiredArgsConstructor;
import net.waa.g7backend.user.dto.UserDto;
import net.waa.g7backend.user.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "users")
@RequiredArgsConstructor
public class UserController {

    private final UserService service;

    @GetMapping()
    public List<UserDto> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public UserDto get(@PathVariable long id) {
        return service.findById(id);
    }

    @PostMapping
    public UserDto add(@RequestBody UserDto dto){
        return service.add(dto);
    }

    @PutMapping("/{id}")
    public UserDto update(@PathVariable long id, @RequestBody UserDto dto){
        return service.updateById(id, dto);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void delete(@PathVariable long id){
        service.deleteById(id);
    }


}
