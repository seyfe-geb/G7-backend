package net.waa.g7backend.controller;

import lombok.RequiredArgsConstructor;
import net.waa.g7backend.model.dto.FollowDto;
import net.waa.g7backend.service.interfaces.FollowService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping( "api/v1/follows")
@RequiredArgsConstructor
public class FollowController {

    private final FollowService service;

    @GetMapping()
    public List<FollowDto> getAll(){
        return service.findAll();
    }

    @GetMapping("/{id}")
    public FollowDto get(@PathVariable("id") long id){
        return service.findById(id);
    }

    @PostMapping
    public FollowDto add(@RequestBody FollowDto dto){
        return service.add(dto);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void delete(@PathVariable("id") long id){
        service.deleteById(id);
    }


}
