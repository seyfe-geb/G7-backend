package net.waa.g7backend.shoppingcart.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.waa.g7backend.product.model.Product;

import javax.persistence.*;

@Entity
@Table(name = "shopping_cart_items")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ShoppingCartItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int quantity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "shopping_cart_id", nullable = false)
    @JsonBackReference
    private ShoppingCart cart;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;
}
