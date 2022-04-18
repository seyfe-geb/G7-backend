package net.waa.g7backend.reward.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SaveRewardDto {
    private long id;
    private long orderId;
    private long userId;
    private int points;
}
