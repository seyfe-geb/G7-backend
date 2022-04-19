package net.waa.g7backend.model;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;


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
    @JsonIgnoreProperties(value = {"hibernateLazyInitializer","handler"})
    private Product product;

    public OrderItem(int quantity, double price, Product product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }

    //    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "order_id", nullable = false)
//    @JsonBackReference
//    private Order order;
}
