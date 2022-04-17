package net.waa.g7backend.product.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;
import net.waa.g7backend.productimage.model.ProductImage;
import net.waa.g7backend.review.model.Review;
import net.waa.g7backend.user.model.User;

import javax.persistence.*;
import java.awt.*;
import java.io.Serializable;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
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

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "product")
    @JsonManagedReference
    private Set<ProductImage> images;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "product")
    @JsonManagedReference
    private Set<Review> reviews;
}
