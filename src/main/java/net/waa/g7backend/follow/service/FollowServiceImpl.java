package net.waa.g7backend.follow.service;

import lombok.RequiredArgsConstructor;
import net.waa.g7backend.follow.dto.FollowDto;
import net.waa.g7backend.follow.repository.FollowRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class FollowServiceImpl implements FollowService{

    private FollowRepository repository;
    private final ModelMapper modelMapper;

    @Override
    public List<FollowDto> findAll() {
        return repository.findAll().stream()
                .map(f -> modelMapper.map(f, FollowDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public FollowDto findById(long id) {
        return modelMapper.map(repository.findById(id).orElse(null), FollowDto.class);
    }


    @Override
    public FollowDto add(FollowDto dto) {
        return null;
    }

    @Override
    public void deleteById(long id) {
        repository.deleteById(id);
    }

//    @Override
//    public void unfollow(long followerId, long followeeId) {
//
//    }
}
