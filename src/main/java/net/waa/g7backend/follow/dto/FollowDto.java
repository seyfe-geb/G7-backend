package net.waa.g7backend.follow.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import net.waa.g7backend.user.model.User;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class FollowDto {

    private Long id;

    private String followerId;

    private String followeeId;
}