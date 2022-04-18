package net.waa.g7backend.model.dto;

import lombok.*;
import net.waa.g7backend.model.Rating;

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
