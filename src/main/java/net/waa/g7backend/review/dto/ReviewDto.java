package net.waa.g7backend.review.dto;

import lombok.*;
import net.waa.g7backend.review.model.Rating;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ReviewDto {

    private long id;

    private Rating rating;

    private String comment;

    private boolean isApproved;

    private long productId;

}
