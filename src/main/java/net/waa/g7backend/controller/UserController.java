package net.waa.g7backend.controller;


import lombok.RequiredArgsConstructor;
import net.waa.g7backend.model.dto.UserDto;
import net.waa.g7backend.service.interfaces.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(path = "api/v1/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService service;

    @GetMapping()
    public List<User> getAll() {
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
        return null;
//        return service.updateById(id, dto);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void delete(@PathVariable long id){
        service.deleteById(id);
    }


}
