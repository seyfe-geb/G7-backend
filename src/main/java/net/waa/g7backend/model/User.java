package net.waa.g7backend.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.sun.istack.NotNull;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import net.waa.g7backend.model.Address;
import net.waa.g7backend.role.model.Role;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "users")
@RequiredArgsConstructor
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name="first_name")
    private String firstName;

    @NotNull
    @Column(name = "last_name")
    private String lastName;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false, unique = true)
    private String username;

    private String password;


    private boolean enabled = true;

    @Column(name = "is_approved_seller")
    private boolean isApprovedSeller = false;

    @Column(name = "created_at")
    private LocalDate createdAt;

    @Column(name = "modified_at")
    private LocalDate modifiedAt;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user", cascade = CascadeType.ALL)
    @JsonManagedReference
    private Set<Address> addresses;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(	name = "user_roles",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"),
            uniqueConstraints = @UniqueConstraint(columnNames = {"user_id", "role_id"}))
    private Set<Role> authorities = new HashSet<>();

    public User(String firstName, String lastName,
                String email, String username, String password,
                boolean enabled, boolean isApprovedSeller,
                LocalDate createdAt, LocalDate modifiedAt) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.username = username;
        this.password = password;
        this.enabled = enabled;
        this.isApprovedSeller = isApprovedSeller;
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.enabled = true;
    }
}
