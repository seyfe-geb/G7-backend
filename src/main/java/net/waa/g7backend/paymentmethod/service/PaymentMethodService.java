package net.waa.g7backend.paymentmethod.service;

import net.waa.g7backend.paymentmethod.dto.PaymentMethodDto;
import net.waa.g7backend.paymentmethod.dto.SavePaymentMethodDto;

import java.util.List;

public interface PaymentMethodService {

    List<PaymentMethodDto> findAll();
    PaymentMethodDto findById(long id);
    PaymentMethodDto add(SavePaymentMethodDto dto);
    PaymentMethodDto updateById(long id, SavePaymentMethodDto dto);
    void deleteById(long id);
}
