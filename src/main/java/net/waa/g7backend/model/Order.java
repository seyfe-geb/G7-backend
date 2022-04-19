package net.waa.g7backend.model;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.waa.g7backend.model.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "orders")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private OrderStatus status = OrderStatus.PENDING;

    @Column(name = "created_at")
    private LocalDate createdAt;

    @Column(name = "modified_at")
    private LocalDate modifiedAt;

    @Column(nullable = false)
    private double totalPrice;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JsonManagedReference
    @JoinColumn(name = "order_id")
    private Set<OrderItem> orderItems;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "shipping_address_id")//, nullable = false)
    private Address shippingAddress;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    public Order(LocalDate createdAt, LocalDate modifiedAt, double totalPrice, Set<OrderItem> orderItems, Address shippingAddress, User user) {
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
        this.totalPrice = totalPrice;
        this.orderItems = orderItems;
        this.shippingAddress = shippingAddress;
        this.user = user;
    }
}
