package net.waa.g7backend.shoppingcart.repository;

import net.waa.g7backend.shoppingcart.model.ShoppingCart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShoppingCartRepository extends JpaRepository<ShoppingCart, Long> {
}