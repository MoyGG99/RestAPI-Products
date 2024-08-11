package com.aplication.rest.controller.dto;

import com.aplication.rest.entities.Maker;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;


@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProductDTO {


    private Long id;

    private String name;

    private BigDecimal price;

    private Maker maker;

}
