package net.waa.g7backend.follow.service;

import net.waa.g7backend.follow.dto.FollowDto;

import javax.xml.bind.ValidationException;
import java.util.List;
import java.util.Optional;

public interface FollowService {

    List<FollowDto> findAll();

    FollowDto findById(long id);

    FollowDto add(FollowDto dto);

    void deleteById(long id);

//    void unfollow(long followerId, long followeeId);
}
