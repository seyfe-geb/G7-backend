package net.waa.g7backend.service.implementer;

import lombok.RequiredArgsConstructor;
import net.waa.g7backend.model.Review;
import net.waa.g7backend.model.dto.ReviewDto;
import net.waa.g7backend.repository.ReviewRepository;
import net.waa.g7backend.service.interfaces.ReviewService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ReviewServiceImpl implements ReviewService {

    private ReviewRepository repository;
    private final ModelMapper modelMapper;

    @Override
    public List<ReviewDto> findAll() {
        return repository.findAll().stream()
                .map(r -> modelMapper.map(r, ReviewDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public ReviewDto findById(long id) {
        return modelMapper.map(repository.findById(id).orElse(null), ReviewDto.class);
    }


    @Override
    public ReviewDto add(ReviewDto dto) {
        return null;
    }

    @Override
    public ReviewDto updateById(long id, ReviewDto dto) {
        Review review = repository.getById(id);
//        review.setComment(dto.getComment());
//        review.setRating(dto.getRating());

        return modelMapper.map(repository.save(review), ReviewDto.class);
    }

    @Override
    public void deleteById(long id) {
        repository.deleteById(id);
    }
}
