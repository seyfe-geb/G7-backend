package net.waa.g7backend.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name ="payment_methods")
@Data
@RequiredArgsConstructor
public class PaymentMethod {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private PaymentMethodType type;

    @Column(nullable = false, unique = true)
    private String number;

    @Column(nullable = false)
    private int csv;

    @Column(name ="is_default")
    private boolean isDefault;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id", nullable = false)
    @JsonBackReference
    private User user;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "billing_address.id", nullable = false)
    @JsonBackReference
    private Address billingAddress;
}
