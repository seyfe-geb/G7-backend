package net.waa.g7backend.controller;

import lombok.RequiredArgsConstructor;
import net.waa.g7backend.model.dto.RewardDto;
import net.waa.g7backend.model.dto.SaveRewardDto;
import net.waa.g7backend.service.interfaces.RewardService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/users-rewards")
@RequiredArgsConstructor
public class RewardController {
    private final RewardService rewardService;

    @GetMapping()
    public List<RewardDto> getAll() {
        return rewardService.findAll();
    }

    @GetMapping("/{id}")
    public RewardDto get(@PathVariable long id) {
        return rewardService.findById(id);
    }

    @PostMapping
    public RewardDto add(@RequestBody SaveRewardDto dto){
        return rewardService.add(dto);
    }

    @PutMapping("/{id}")
    public RewardDto update(@PathVariable long id, @RequestBody SaveRewardDto dto){
        return rewardService.updateById(id, dto);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void delete(@PathVariable long id){
        rewardService.deleteById(id);
    }
}
