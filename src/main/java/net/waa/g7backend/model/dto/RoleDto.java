package net.waa.g7backend.model.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class RoleDto {

    public static final String BUYER = "BUYER";
    public static final String SELLER = "SELLER";
    public static final String ADMIN = "ADMIN";

    private Long id;
    private String authority;
}
