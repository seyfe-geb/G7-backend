package net.waa.g7backend.service.implementer;


import lombok.Data;
import lombok.RequiredArgsConstructor;
import net.waa.g7backend.model.dto.PaymentMethodDto;
import net.waa.g7backend.model.dto.SavePaymentMethodDto;
import net.waa.g7backend.repository.PaymentMethodRepository;

import net.waa.g7backend.paymentmethod.model.PaymentMethod;
import net.waa.g7backend.service.interfaces.PaymentMethodService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Data
public class PaymentMethodServiceImpl implements PaymentMethodService {


    private PaymentMethodRepository paymentMethodRepository;

    private  ModelMapper modelMapper;

    @Override
    public List<PaymentMethodDto> findAll() {
        return paymentMethodRepository.findAll().stream()
                .map(p -> modelMapper.map(p, PaymentMethodDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public PaymentMethodDto findById(long id) {
        return modelMapper.map(paymentMethodRepository.findById(id).orElse(null), PaymentMethodDto.class);
    }

    @Override
    public PaymentMethodDto add(SavePaymentMethodDto dto) {
        PaymentMethod entity = modelMapper.map(dto, PaymentMethod.class);
        return modelMapper.map(paymentMethodRepository.save(entity), PaymentMethodDto.class);
    }

    @Override
    public PaymentMethodDto updateById(long id, SavePaymentMethodDto dto) {
        PaymentMethod entity = modelMapper.map(dto, PaymentMethod.class);
        entity.setId(id);

        return modelMapper.map(paymentMethodRepository.save(entity), PaymentMethodDto.class);
    }

    @Override
    public void deleteById(long id) {
      paymentMethodRepository.deleteById(id);
    }
}
