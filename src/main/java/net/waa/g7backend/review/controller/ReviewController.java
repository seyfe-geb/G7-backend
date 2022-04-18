package net.waa.g7backend.review.controller;

import lombok.RequiredArgsConstructor;
import net.waa.g7backend.review.dto.ReviewDto;
import net.waa.g7backend.service.interfaces.ReviewService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/reviews")
@RequiredArgsConstructor
public class ReviewController {

    private final ReviewService reviewService;

    @GetMapping
    public List<ReviewDto> getAll(){
        return reviewService.findAll();
    }


    @GetMapping("/{id}")
    public ReviewDto get(@PathVariable("id") long id){
        return reviewService.findById(id);
    }

    @PostMapping
    public ReviewDto add(@RequestBody ReviewDto dto){
        return reviewService.add(dto);
    }

    @PutMapping("/{id}")
    public ReviewDto update(@PathVariable("id") long id, @RequestBody ReviewDto dto){
        return reviewService.updateById(id, dto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") long id){
        reviewService.deleteById(id);
    }
}
