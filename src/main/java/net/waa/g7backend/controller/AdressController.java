package net.waa.g7backend.controller;

import lombok.RequiredArgsConstructor;
import net.waa.g7backend.model.dto.AddressDto;
import net.waa.g7backend.model.dto.SaveAddressDto;
import net.waa.g7backend.service.interfaces.AddressService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/user-addresses")
@RequiredArgsConstructor
public class AdressController {

    private final AddressService service;

    @GetMapping()
    public List<AddressDto> getAll(){return service.findAll();}

    @GetMapping("/{id}")
    public AddressDto get(@PathVariable("id") long id){return service.findById(id);}

    @PostMapping
    public AddressDto add(@RequestBody AddressDto dto){
        return service.add(dto);
    }

    @PutMapping("/{id}")
    public AddressDto update(@PathVariable("id") long id, @RequestBody SaveAddressDto dto){
        return service.updateById(id, dto);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void delete(@PathVariable("id") long id){
        service.deleteById(id);
    }

}
