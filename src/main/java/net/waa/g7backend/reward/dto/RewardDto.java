package net.waa.g7backend.reward.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.waa.g7backend.order.dto.OrderDto;
import net.waa.g7backend.user.dto.UserDto;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RewardDto {
    private long id;

    private OrderDto order;

    private UserDto user;
}
