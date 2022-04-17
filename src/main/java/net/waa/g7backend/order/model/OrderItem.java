package net.waa.g7backend.order.model;


import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.waa.g7backend.product.model.Product;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "order_items",
        uniqueConstraints={@UniqueConstraint(columnNames = {"product_id", "order_id"})})
@Data
@NoArgsConstructor
public class OrderItem implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private int quantity;

    @Column(nullable = false)
    private double price;
    
    @OneToOne
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "order_id", nullable = false)
    @JsonBackReference
    private Order order;
}
