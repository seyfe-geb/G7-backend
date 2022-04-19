package net.waa.g7backend.model.dto;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@RequiredArgsConstructor
@Data
public class ShoppingCartDto {

   private long userId;

   private Map<Long, Integer> items = new HashMap<>();


}
