package net.waa.g7backend.role.model;


import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "roles")
@RequiredArgsConstructor
@Data
public class Role {

    public static final String BUYER = "BUYER";
    public static final String SELLER = "SELLER";
    public static final String ADMIN = "ADMIN";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String authority;

    public Role(String authority) {
        this.authority = authority;
    }
}
