package net.waa.g7backend.reward.service;

import net.waa.g7backend.reward.dto.RewardDto;
import net.waa.g7backend.reward.dto.SaveRewardDto;

import java.util.List;

public interface RewardService {
    List<RewardDto> findAll();
    RewardDto findById(long id);

    RewardDto add(SaveRewardDto dto);
    RewardDto updateById(long id, SaveRewardDto dto);

    void deleteById(long id);
}