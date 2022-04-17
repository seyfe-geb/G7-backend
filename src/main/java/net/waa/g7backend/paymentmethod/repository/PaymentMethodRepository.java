package net.waa.g7backend.paymentmethod.repository;

import net.waa.g7backend.paymentmethod.model.PaymentMethod;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentMethodRepository extends JpaRepository<PaymentMethod, Long> {



}
