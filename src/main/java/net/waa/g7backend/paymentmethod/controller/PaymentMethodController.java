package net.waa.g7backend.paymentmethod.controller;


import lombok.Data;
import lombok.RequiredArgsConstructor;
import net.waa.g7backend.paymentmethod.dto.PaymentMethodDto;
import net.waa.g7backend.paymentmethod.dto.SavePaymentMethodDto;
import net.waa.g7backend.service.interfaces.PaymentMethodService;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RequiredArgsConstructor
@RestController
@Data
@RequestMapping("/api/v1/payments")
public class PaymentMethodController {

    private PaymentMethodService paymentMethodService;
    private ModelMapper modelMapper;

    @GetMapping()
    public List<PaymentMethodDto> getAll() {
        return paymentMethodService.findAll();}

    @GetMapping("/{id}")
    public PaymentMethodDto get(@PathVariable("id") long id){
        return paymentMethodService.findById(id);
    }

    @PostMapping
    public PaymentMethodDto add(@RequestBody SavePaymentMethodDto dto){
        return paymentMethodService.add(dto);
    }

    @PutMapping("/{id}")
    public PaymentMethodDto update(@PathVariable("id") long id, @RequestBody SavePaymentMethodDto dto){
        return paymentMethodService.updateById(id, dto);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void delete(@PathVariable("id") long id){
        paymentMethodService.deleteById(id);
    }




}
