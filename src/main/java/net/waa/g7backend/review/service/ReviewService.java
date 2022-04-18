package net.waa.g7backend.review.service;

import net.waa.g7backend.review.dto.ReviewDto;

import java.util.List;

public interface ReviewService {

    List<ReviewDto> findAll();

    ReviewDto findById(long id);

    ReviewDto add(ReviewDto dto);

    void deleteById(long id);

    ReviewDto updateById(long id,ReviewDto dto);
}
