package net.waa.g7backend.user.dto;

import lombok.*;

import java.util.Date;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserDto {//extends LightUserDto

    private Date createdAt;

    private Date modifiedAt;

    private boolean isApprovedSeller;

//    private Set<RoleDto> authorities;
}
