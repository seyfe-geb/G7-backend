package net.waa.g7backend.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name ="payment_method")
@Data
@RequiredArgsConstructor
public class PaymentMethod {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "payment_type", nullable = false)
    private String paymentType;

    @Column(nullable = false, unique = true)
    private String card_number;

    @Column(name = "created_at")
    private LocalDate createdAt;

    @Column(name = "user_id")
    private String userId;

    @Column(name = "billing_address_id")
    private long billingAddressId;

    public PaymentMethod(String paymentType,
                         String card_number, LocalDate createdAt,
                         String userId, long billingAddressId) {
        this.paymentType = paymentType;
        this.card_number = card_number;
        this.createdAt = createdAt;
        this.userId = userId;
        this.billingAddressId = billingAddressId;
    }
}
