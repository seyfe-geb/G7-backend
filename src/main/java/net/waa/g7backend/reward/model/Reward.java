package net.waa.g7backend.reward.model;


import lombok.*;
import net.waa.g7backend.order.model.Order;
import net.waa.g7backend.user.model.User;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "rewards")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Reward implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne()
    @JoinColumn(name = "order_id", nullable = false)
    private Order order;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    private int points;
}
