package net.waa.g7backend.repository;

import net.waa.g7backend.reward.model.Reward;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RewardRepository extends JpaRepository<Reward,Long> {
}
