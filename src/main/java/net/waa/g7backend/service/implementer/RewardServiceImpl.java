package net.waa.g7backend.service.implementer;

import lombok.RequiredArgsConstructor;
import net.waa.g7backend.reward.dto.RewardDto;
import net.waa.g7backend.reward.dto.SaveRewardDto;
import net.waa.g7backend.reward.model.Reward;
import net.waa.g7backend.repository.RewardRepository;
import net.waa.g7backend.service.interfaces.RewardService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class RewardServiceImpl implements RewardService {
    private final RewardRepository rewardRepository;
    private final ModelMapper modelMapper;
    @Override
    public List<RewardDto> findAll() {
        return rewardRepository.findAll().stream()
                .map(s -> modelMapper.map(s , RewardDto.class))
                .collect(Collectors.toList());

    }

    @Override
    public RewardDto findById(long id) {
        return modelMapper.map(rewardRepository.findById(id).orElse(null),RewardDto.class);
    }

    @Override
    public RewardDto add(SaveRewardDto dto) {
        Reward reward = modelMapper.map(dto, Reward.class);
        return modelMapper.map(rewardRepository.save(reward), RewardDto.class);
    }

    @Override
    public RewardDto updateById(long id, SaveRewardDto dto) {
        Reward reward = modelMapper.map(dto, Reward.class);
        reward.setId(id);

        return modelMapper.map(rewardRepository.save(reward), RewardDto.class);
    }

    @Override
    public void deleteById(long id) {
        rewardRepository.deleteById(id);
    }
}
