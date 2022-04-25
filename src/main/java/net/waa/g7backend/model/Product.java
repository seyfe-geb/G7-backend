package net.waa.g7backend.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@RequiredArgsConstructor
@Data
@Entity
@Table(name = "products")
public class Product implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(length = 50, nullable = false)
    private String name;

    @Column(nullable = false)
    private double price;

    @Column(nullable = false, length = 100000)
    private String description;

    @Column(nullable = false)
    private int quantity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

//    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "product")
//    @JsonManagedReference
//    private Set<ProductImage> images;

    public Product(String name, double price, String description, int quantity, User user) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.quantity = quantity;
        this.user = user;
    }

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "product")
    @JsonManagedReference
    private Set<Review> reviews;


}
