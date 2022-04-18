package net.waa.g7backend.model.dto;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@RequiredArgsConstructor
@Data
public class ShoppingCartDto {

   private long id;

   private long userId;

   @JsonManagedReference
   private Set<ShoppingCartItemDto> items = new HashSet();


}
