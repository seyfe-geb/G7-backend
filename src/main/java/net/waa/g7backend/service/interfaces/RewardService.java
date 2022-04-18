package net.waa.g7backend.service.interfaces;



import net.waa.g7backend.model.dto.RewardDto;
import net.waa.g7backend.model.dto.SaveRewardDto;

import java.util.List;

public interface RewardService {
    List<RewardDto> findAll();
    RewardDto findById(long id);

    RewardDto add(SaveRewardDto dto);
    RewardDto updateById(long id, SaveRewardDto dto);

    void deleteById(long id);
}
