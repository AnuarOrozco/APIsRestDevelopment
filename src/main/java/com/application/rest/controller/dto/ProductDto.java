package com.application.rest.controller.dto;

import com.application.rest.entities.Maker;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor @NoArgsConstructor
public class ProductDto {


    private Long id;
    private String name;
    private BigDecimal price;
    private Maker maker;

}
