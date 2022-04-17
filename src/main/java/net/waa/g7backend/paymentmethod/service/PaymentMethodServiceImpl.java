package net.waa.g7backend.paymentmethod.service;


import net.waa.g7backend.paymentmethod.Repository.PaymentMethodRepository;
import net.waa.g7backend.paymentmethod.dto.PaymentMethodDto;
import net.waa.g7backend.paymentmethod.dto.SavePaymentMethodDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentMethodServiceImpl implements PaymentMethodService{

    @Autowired
    private PaymentMethodRepository paymentMethodRepository;
    @Autowired
    private  ModelMapper modelMapper;

    @Override
    public List<PaymentMethodDto> findAll() {
        return null;
    }

    @Override
    public PaymentMethodDto findById(long id) {
        return null;
    }

    @Override
    public PaymentMethodDto add(SavePaymentMethodDto dto) {
        return null;
    }

    @Override
    public PaymentMethodDto updateById(long id, SavePaymentMethodDto dto) {
        return null;
    }

    @Override
    public void deleteById(long id) {
      paymentMethodRepository.deleteById(id);
    }
}
