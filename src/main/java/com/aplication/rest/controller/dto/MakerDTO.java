package com.aplication.rest.controller.dto;

import com.aplication.rest.entities.Product;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class MakerDTO {

    private Long id;

    private String name;

    private List<Product> productList = new ArrayList<>();


}
