package net.waa.g7backend.model;


import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
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

    public Address(String street, String city, String state, String zipCode, AddressType type) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.type = type;
    }
}
