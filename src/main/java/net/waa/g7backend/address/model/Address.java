package net.waa.g7backend.address.model;


import lombok.*;
import net.waa.g7backend.user.model.User;

import javax.persistence.*;

@RequiredArgsConstructor
@Entity
@Table(name = "addresses")
@Data
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String street;

    @Column(nullable = false)
    private String city;

    private String state;

    private String zipCode;

    private AddressType type = AddressType.NONE;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    public Address(String street, String city, String state, String zipCode, AddressType type) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.type = type;
    }
}
