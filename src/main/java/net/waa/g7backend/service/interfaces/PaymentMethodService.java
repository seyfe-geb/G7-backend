package net.waa.g7backend.service.interfaces;


import net.waa.g7backend.model.dto.PaymentMethodDto;
import net.waa.g7backend.model.dto.SavePaymentMethodDto;

import java.util.List;

public interface PaymentMethodService {

    List<PaymentMethodDto> findAll();
    PaymentMethodDto findById(long id);
    PaymentMethodDto add(SavePaymentMethodDto dto);
    PaymentMethodDto updateById(long id, SavePaymentMethodDto dto);
    void deleteById(long id);
}
