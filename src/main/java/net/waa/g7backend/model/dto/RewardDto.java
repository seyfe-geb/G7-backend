package net.waa.g7backend.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RewardDto {
    private long id;

    private OrderDto order;

    private UserDto user;
}
